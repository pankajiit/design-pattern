package DesignPatterns.singletonPattern;

import java.util.HashMap;
import java.util.Map;

public class Q2 {

    public static class GlobalSettingManager {
        private static GlobalSettingManager globalSettingManager;
        private Map<String, String> globalSetting;

        private GlobalSettingManager() {
            this.globalSetting = new HashMap<>();
        }

        public static synchronized GlobalSettingManager getInstance() {
            if (globalSettingManager == null) {
                globalSettingManager = new GlobalSettingManager();
            }
            return globalSettingManager;
        }

        public synchronized void setSetting(String key, String value) {
            globalSetting.put(key, value);
            System.out.println("Setting " + key + " set to " + value);
        }

        public synchronized String getSetting(String key) {
            return globalSetting.get(key);
        }

        public synchronized void viewSettings() {
            System.out.println("Current settings: " + globalSetting);
        }
    }

    public static void main(String[] args) {
        GlobalSettingManager settingsManager = GlobalSettingManager.getInstance();

        // Set some initial settings
        settingsManager.setSetting("theme", "dark");
        settingsManager.setSetting("language", "en");
        settingsManager.setSetting("fontSize", "14");

        // Retrieve settings
        System.out.println("Current theme: " + settingsManager.getSetting("theme"));
        System.out.println("Current language: " + settingsManager.getSetting("language"));
        System.out.println("Current font size: " + settingsManager.getSetting("fontSize"));

        // Change some settings
        settingsManager.setSetting("theme", "light");
        settingsManager.setSetting("fontSize", "16");

        // View all settings
        settingsManager.viewSettings();
    }
}
