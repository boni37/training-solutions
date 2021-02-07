package properties;

import java.io.*;
import java.util.Properties;

public class DatabaseConfiguration {

    private Properties config;


    public DatabaseConfiguration(File file) {
        config = new Properties();
        try (InputStreamReader reader = new FileReader(file)){
            config.load(reader);
        } catch (IOException e) {
           throw new IllegalArgumentException("Cannot read file",e);
        }
    }

    public DatabaseConfiguration() {
        config = new Properties();
        try (InputStreamReader inputStreamReader = new InputStreamReader(DatabaseConfiguration.class.getResourceAsStream("db.properties"))) {
            config.load(inputStreamReader);
            }  catch (IOException ioe) {
                throw new IllegalStateException("Cannot read file",ioe);
            }


    }

    public String getHost(){
        return config.getProperty("db.host");
    }

    public int getPort(){
        return Integer.parseInt(config.getProperty("db.port"));
    }

    public String getSchema(){
        return config.getProperty("db.schema");
    }
}
