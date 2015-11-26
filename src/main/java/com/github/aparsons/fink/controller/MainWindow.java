package com.github.aparsons.fink.controller;

import com.github.aparsons.fink.util.Resources;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TreeView;
import javafx.scene.layout.BorderPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

public class MainWindow extends Controller {

    private static final Logger LOG = LoggerFactory.getLogger(MainWindow.class);

    @FXML
    private BorderPane root;

    @FXML
    private TreeView treeView;

    @FXML
    protected void handleExitMenuItemAction(ActionEvent event) {
        LOG.debug("handleExitMenuItemAction");
        Platform.exit();
    }

    @FXML
    protected void handleImportButtonAction(ActionEvent event) {
        LOG.debug("handleImportButtonAction");

        /*
        FileChooser fileChooser = new FileChooser();
        File file = fileChooser.showOpenDialog(stage);
        if (file != null) {

        }
        */
        /*

        TextImportDialog dialog = new TextImportDialog(new Stage());
        dialog.getStage().initModality(Modality.APPLICATION_MODAL);
        dialog.getStage().initOwner(stage);
        //dialog.show();
        */
    }

    @FXML
    protected void handleNewDataTableMenuItemAction(ActionEvent event) {
        LOG.debug("handleNewDataTableMenuItemAction");
    }

    protected void handleOnCloseRequest(WindowEvent event) {
        LOG.debug("handleOnCloseRequest");

        /*
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle(Resources.getAlertExitTitle());
        alert.setHeaderText(Resources.getAlertExitHeader());
        alert.setContentText(Resources.getAlertExitContent());
        alert.initModality(Modality.APPLICATION_MODAL);
        alert.initOwner(stage);

        Button exitButton = (Button) alert.getDialogPane().lookupButton(ButtonType.OK);
        exitButton.setText(Resources.getAlertExitExitButtonText());

        Optional<ButtonType> response = alert.showAndWait();
        if (!ButtonType.OK.equals(response.get())) {
            event.consume();
        }
        */
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        LOG.debug("initialize");
    }
}
