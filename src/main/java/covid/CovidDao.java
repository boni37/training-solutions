package covid;

import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CovidDao {

    private MariaDbDataSource dataSource = new MariaDbDataSource();

    public CovidDao() {
    }

    public CovidDao(MariaDbDataSource dataSource) {
        this.dataSource = dataSource;
    }

    public List<String> generateListFromData(String zipcode){
        List<String> generatedList = new ArrayList<>();
        try {
            Connection conn = initializeDataSource().getConnection();
            PreparedStatement stmt = conn.prepareStatement("select citizen_name, zip, age, email, taj from citizen where zip = ? order by age, citizen_name limit 16");
            stmt.setString(1, zipcode);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                String genName = rs.getString("citizen_name");
                String genZip = rs.getString("zip");
                String genAge = rs.getString("age");
                String genEmail = rs.getString("email");
                String genTaj = rs.getString("taj");
                String genLine = genName + ";" + genZip + ";" + genAge + ";" + genEmail + ";" + genTaj;
                generatedList.add(genLine);
            }

        }
        catch (SQLException sqlException) {
            throw new IllegalStateException("Can not connect",sqlException);
        }return generatedList;
    }

    public void zipListToDatabase(List<GenerateCitiesFromFile.City> cityList){
        try {
            Connection conn = initializeDataSource().getConnection();
            PreparedStatement stmt = conn.prepareStatement("insert into cities(zip,city) values (?,?)");
            for (GenerateCitiesFromFile.City city : cityList) {
                stmt.setInt(1, city.getZip());
                stmt.setString(2, city.getCityName());
                stmt.executeUpdate();
            }
        }
        catch (SQLException sqlException) {
            throw new IllegalStateException("Can not connect",sqlException);
        }

    }

    public String existZipCode(String zipcode){
        try {
            Connection conn = initializeDataSource().getConnection();
            PreparedStatement stmt = conn.prepareStatement("select city from cities where zip = ?");
            stmt.setString(1, zipcode);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                String city = rs.getString("city");
                return city;
            } else return "ZIP does not exist.";
        } catch (SQLException sqlException) {
            throw new IllegalStateException("Can not connect", sqlException);
        }
    }

    public String existTajCode(String taj) {
        try {
            Connection conn = initializeDataSource().getConnection();
            PreparedStatement stmt = conn.prepareStatement("select citizen_id from citizen where taj = ?");
            stmt.setString(1, taj);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                String citizen_id = rs.getString("citizen_id");
                return citizen_id;
            } else return "TAJ does not exist.";
        } catch (SQLException sqlException) {
            throw new IllegalStateException("Can not connect", sqlException);
        }
    }

    public void writeListToDatabase(List<PersonForVacination> personForVacinationList) {
        try {
            Connection conn = initializeDataSource().getConnection();
            PreparedStatement stmt = conn.prepareStatement("insert into citizen(citizen_name,zip,age,email,taj) values (?,?,?,?,?)");
            for (PersonForVacination person : personForVacinationList) {
                stmt.setString(1, person.getName());
                stmt.setString(2, person.getZipCode());
                stmt.setInt(3, person.getAge());
                stmt.setString(4, person.getEmailAddress());
                stmt.setString(5, person.getTajCode());
                stmt.executeUpdate();
            }
        } catch (SQLException sqlException) {
            throw new IllegalStateException("Can not connect", sqlException);
        }
    }

    public void writeVaccinationToDatabase(String citizen_id, String vaccinationDate, String status, String note, String vaccination_type) {
        try {
            Connection conn = initializeDataSource().getConnection();
            PreparedStatement stmt = conn.prepareStatement("insert into vaccinations(citizen_id,vaccination_date,status,note,vaccination_type) values (?,?,?,?,?)");
            stmt.setString(1, citizen_id);
            stmt.setDate(2, Date.valueOf(vaccinationDate));
            stmt.setString(3, status);
            stmt.setString(4, note);
            stmt.setString(5, vaccination_type);
            stmt.executeUpdate();
        } catch (SQLException sqlException) {
            throw new IllegalStateException("Can not connect", sqlException);
        }
    }

    private MariaDbDataSource initializeDataSource() throws SQLException {
        MariaDbDataSource dataSource = new MariaDbDataSource();
        dataSource.setUrl("jdbc:mariadb://localhost:3306/covid?useUnicode=true");
        dataSource.setUser("covid");
        dataSource.setPassword("covid");
        return dataSource;
    }
}
