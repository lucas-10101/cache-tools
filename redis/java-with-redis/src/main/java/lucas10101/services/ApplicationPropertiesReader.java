package lucas10101.services;

import java.io.InputStream;
import java.io.Reader;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class ApplicationPropertiesReader {

    private static final Map<String, Map<String, String>> mappedProperties = new HashMap<>();

    public static Map<String, String> get(String propertiesName) throws Exception {

        if (mappedProperties.containsKey(propertiesName)) {
            return mappedProperties.get(propertiesName);
        }

        Properties properties = new Properties();
        InputStream inputStream = null;
        Reader reader = null;

        try {

            inputStream = ApplicationPropertiesReader.class.getClassLoader()
                    .getResourceAsStream("%s.properties".formatted(propertiesName));

            properties.load(inputStream);

            mappedProperties.put(propertiesName, new HashMap<>());
            properties.forEach((k, v) -> mappedProperties.get(propertiesName).put((String) k, (String) v));

        } finally {
            if (inputStream != null) {
                inputStream.close();
            }

            if (reader != null) {
                reader.close();
            }
        }

        return null;
    }
}
