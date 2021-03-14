package covid;

import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class CovidDao {

    private MariaDbDataSource dataSource = new MariaDbDataSource();

    public static final String noVaccinated = "Not vaccinated";
    public static final String oneVaccinated = "Got one vaccine";
    public static final String twoVaccinated = "Got two vaccines";

    public CovidDao() {
    }

    public CovidDao(MariaDbDataSource dataSource) {
        this.dataSource = dataSource;
    }

    public List<String> generateListFromData(String zipcode) {
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

        } catch (SQLException sqlException) {
            throw new IllegalStateException("Can not connect", sqlException);
        }
        return generatedList;
    }

    public Map<String, List<EntryForList>> generateMapFromData() {
        Map<String, List<EntryForList>> vaccinationReport = new TreeMap<>();
        List<EntryForList> entryForList = new ArrayList<>();
        int numOfNull = 0;
        int numOfOne = 0;
        int numOfTwo = 0;
        try {
            Connection conn = initializeDataSource().getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT zip, COUNT(vaccinations.citizen_id) numberOfVaccination FROM citizen left JOIN vaccinations ON citizen.citizen_id = vaccinations.citizen_id GROUP BY citizen.citizen_id ORDER BY zip,numberOfVaccination");
            while (rs.next()) {
                String zip = rs.getString("zip");
                Integer count = rs.getInt("numberOfVaccination");
                if (!vaccinationReport.containsKey(zip)) {
                    vaccinationReport.put(zip, new ArrayList<>());
                    vaccinationReport.get(zip).add(0, new EntryForList(noVaccinated, 1));
                    vaccinationReport.get(zip).add(1, new EntryForList(oneVaccinated, 0));
                    vaccinationReport.get(zip).add(2, new EntryForList(twoVaccinated, 0));
                } else {
                    if (count == 0) {
                        int sum0 = vaccinationReport.get(zip).get(0).getNumberOfRecord();
                        vaccinationReport.get(zip).get(0).setNumberOfRecord(sum0 + 1);
                    } else if (count == 1) {
                        int sum1 = vaccinationReport.get(zip).get(1).getNumberOfRecord();
                        vaccinationReport.get(zip).get(1).setNumberOfRecord(sum1 + 1);
                    } else if (count == 2) {
                        int sum2 = vaccinationReport.get(zip).get(2).getNumberOfRecord();
                        vaccinationReport.get(zip).get(2).setNumberOfRecord(sum2 + 1);
                    }

                }


            }
        } catch (SQLException sqlException) {
            throw new IllegalStateException("Can not connect", sqlException);
        }
        return vaccinationReport;
    }

    public void zipListToDatabase(List<GenerateCitiesFromFile.City> cityList) {
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
