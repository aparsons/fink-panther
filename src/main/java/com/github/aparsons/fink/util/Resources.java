package com.github.aparsons.fink.util;

import java.util.ResourceBundle;

public class Resources {

    private static ResourceBundle instance = null;

    public enum Keys {
        WINDOW_TITLE("window.title"),

        ALERT_EXIT_TITLE("alert.exit.title"),
        ALERT_EXIT_HEADER("alert.exit.header"),
        ALERT_EXIT_CONTENT("alert.exit.content"),
        ALERT_EXIT_EXIT_BUTTON_TEXT("alert.exit.exit.button.text");

        private final String value;

        private Keys(final String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return value;
        }

    }

    private Resources() {
    }

    public static ResourceBundle getInstance() {
        if (instance == null) {
            instance = ResourceBundle.getBundle("MessageBundle");
        }
        return instance;
    }

    public static String getWindowTitle() {
        return getInstance().getString(Keys.WINDOW_TITLE.toString());
    }

    public static String getAlertExitTitle() {
        return getInstance().getString(Keys.ALERT_EXIT_TITLE.toString());
    }

    public static String getAlertExitHeader() {
        return getInstance().getString(Keys.ALERT_EXIT_HEADER.toString());
    }

    public static String getAlertExitContent() {
        return getInstance().getString(Keys.ALERT_EXIT_CONTENT.toString());
    }

    public static String getAlertExitExitButtonText() {
        return getInstance().getString(Keys.ALERT_EXIT_EXIT_BUTTON_TEXT.toString());
    }
}
