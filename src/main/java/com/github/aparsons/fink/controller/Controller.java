package com.github.aparsons.fink.controller;

import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.stage.Stage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.URL;
import java.util.ResourceBundle;

public abstract class Controller implements Initializable {

    private static final Logger LOG = LoggerFactory.getLogger(MainWindow.class);

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // Optional
    }

}
