package covid;

import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.*;
import java.util.List;

public class CovidDao {

    private MariaDbDataSource dataSource = new MariaDbDataSource();

    public CovidDao() {
    }

    public CovidDao(MariaDbDataSource dataSource) {
        this.dataSource = dataSource;
    }

    public String existZipCode(String zipcode){
        try {
            MariaDbDataSource dataSource = initializeDataSource();
            Connection conn = dataSource.getConnection();
            PreparedStatement stmt = conn.prepareStatement("select city from cities where zip = ?");
            stmt.setString(1,zipcode);
            ResultSet rs = stmt.executeQuery();
            if(rs.next()){
                String city = rs.getString("city");
                return city;
            }
            else return "ZIP does not exist.";
        }
        catch (SQLException sqlException) {
            throw new IllegalStateException("Can not connect",sqlException);
        }
    }

    public void writeListToDatabase(List<PersonForVacination> personForVacinationList){
        try {
            MariaDbDataSource dataSource = initializeDataSource();
            Connection conn = dataSource.getConnection();
            PreparedStatement stmt = conn.prepareStatement("insert into citizen(citizen_name,zip,age,email,taj) values (?,?,?,?,?)" );
            for(PersonForVacination person: personForVacinationList){
                stmt.setString(1,person.getName());
                stmt.setString(2,person.getZipCode());
                stmt.setInt(3,person.getAge());
                stmt.setString(4,person.getEmailAddress());
                stmt.setString(5,person.getTajCode());
                stmt.executeUpdate();
            }
        }
            catch (SQLException sqlException) {
            throw new IllegalStateException("Can not connect",sqlException);
        }
    }

    private MariaDbDataSource initializeDataSource() throws SQLException {
        MariaDbDataSource dataSource= new MariaDbDataSource();
        dataSource.setUrl("jdbc:mariadb://localhost:3306/covid?useUnicode=true");
        dataSource.setUser("covid");
        dataSource.setPassword("covid");
        return dataSource;
    }
}
