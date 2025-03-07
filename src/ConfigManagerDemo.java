public class ConfigManagerDemo {
    public static void main(String[] args) {
        ConfigurationManager configManager = ConfigurationManager.getExample();
        System.out.println("maxPlayers: " + configManager.getConfig("maxPlayers"));
        configManager.printAllConfigs();
    }
}
