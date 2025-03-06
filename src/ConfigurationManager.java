import java.util.HashMap;
import java.util.Map;

public class ConfigurationManager {
    private static ConfigurationManager example;
    private Map<String, String> config = new HashMap<>();

    private ConfigurationManager() {
        config.put("maxPlayers", "100");
        config.put("defaultLanguage", "en");
        config.put("gameDifficulty", "easy");
    }

    public static ConfigurationManager getExample() {
        if (example == null) {
            example = new ConfigurationManager();
        }
        return example;
    }

    public String getConfig(String key) {
        return config.getOrDefault(key, "Not Found");
    }

    public void printAllConfigs() {
        for (String key : config.keySet()) {
            System.out.println(key + " -> " + config.get(key));
        }
    }
}
