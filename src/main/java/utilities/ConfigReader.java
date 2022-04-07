package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    File file = new File("src/main/resources/Config.properties");
    FileInputStream fs = new FileInputStream(file);
    public Properties property;

    public ConfigReader() throws IOException {
        property = new Properties();
        property.load(fs);
    }

    public String GetUKBA_Url(){
        return property.getProperty("UKBA_URL");
    }
    public String GetMortgageCalc_Url(){
        return property.getProperty("MortgageCal_URL");
    }
    public String GetBlazeDemo_Url(){
        return property.getProperty("BlazeDemo_URL");
    }
}
