package covid;

import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class CovidDao {

    private MariaDbDataSource dataSource = new MariaDbDataSource();

    public CovidDao() {
    }

    public CovidDao(MariaDbDataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void writeListToDatabase(List<PersonForVacination> personForVacinationList){
        try {
            MariaDbDataSource dataSource= new MariaDbDataSource();
            dataSource.setUrl("jdbc:mariadb://localhost:3306/covid?useUnicode=true");
            dataSource.setUser("covid");
            dataSource.setPassword("covid");
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
}
