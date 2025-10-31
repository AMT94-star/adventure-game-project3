package se.sprinto.hakan.adventuregame;

import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class AppInfo {
    private static AppInfo instance;

    private Properties properties;

    private AppInfo() {
        properties = new Properties();
        try(InputStream input = getClass().getClassLoader().
                getResourceAsStream("app.properties")) {
            if(input == null) {
                System.out.println("Properties file not found");
                return;
            }
            properties.load(input);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static AppInfo getInstance() {
        if(instance == null) {
            instance = new AppInfo();
        }
        return instance;
    }

    public String getAuthor() {
        return properties.getProperty("app.author","Hittar ingen author i property filen");
    }
    public String getVersion(){
        return properties.getProperty("app.version","1.0");
    }
}
