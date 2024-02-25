package bestpracticeprogramming;

import lombok.Getter;
import lombok.Setter;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Properties;

@Getter
@Setter
public class Configuration {

    private String provider;
    private String name;
    private List<String> menus;

    public void init() {

        Path path = Paths.get("application.properties");
        Properties properties = new Properties();

        try {

            properties.load(Files.newBufferedReader(path));
            this.provider = properties.getProperty("application.provider");
            this.name = properties.getProperty("application.name");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
