package com.github.aparsons.fink;

import com.github.aparsons.fink.controller.MainWindow;
import com.github.aparsons.fink.controller.TextImportDialog;
import com.github.aparsons.fink.util.Resources;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ListView;
import javafx.stage.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Locale;
import java.util.Optional;

public final class FinkPanther extends Application {

    private static final Logger LOG = LoggerFactory.getLogger(FinkPanther.class);

    public static void main(String[] args) {
        //Locale.setDefault(Locale.GERMANY);
        launch(args);
    }

    @Override
    public void init() throws Exception {
        LOG.debug("init");
    }

    @Override
    public void start(final Stage primaryStage) throws Exception {
        LOG.debug("start");

        Parent root = FXMLLoader.load(getClass().getResource("/view/MainWindow.fxml"), Resources.getInstance());
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
        /*
        stage.setTitle(Resources.getWindowTitle());

        Parent root = FXMLLoader.load(getClass().getResource("/view/MainWindow.fxml"), Resources.getInstance());
        stage.setScene(new Scene(root));
        stage.setOnCloseRequest(this::handleOnCloseRequest);
        stage.show();
        */
    }

    @Override
    public void stop() throws Exception {
        LOG.debug("stop");
    }

}
