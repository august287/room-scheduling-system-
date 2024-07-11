package com.example.dashboard_test;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class class_scheduleController {

    @FXML
    private HBox contentHBox;

    @FXML
    private Button adsched;

    @FXML
    private Label someLabel;
    @FXML
    private void showDialog() {
        Dialog<Void> dialog = new Dialog<>();
        dialog.setTitle("Room Booking");
        dialog.setHeaderText("Do you want to book a room?");

        ButtonType yesButtonType = new ButtonType("Yes", ButtonBar.ButtonData.YES);
        ButtonType noButtonType = new ButtonType("No", ButtonBar.ButtonData.NO);
        dialog.getDialogPane().getButtonTypes().addAll(yesButtonType, noButtonType);

        Button yesButton = (Button) dialog.getDialogPane().lookupButton(yesButtonType);
        yesButton.addEventFilter(ActionEvent.ACTION, event -> {
            dialog.close();
            showBookingDialog();
            event.consume(); // Prevent the dialog from closing
        });

        dialog.getDialogPane().lookupButton(noButtonType).addEventFilter(ActionEvent.ACTION, event -> dialog.close());

        dialog.showAndWait();
    }

    private void showBookingDialog() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("BookingDialog.fxml"));
            Parent parent = fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("Course and Subject Booking");
            stage.setScene(new Scene(parent));
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    private TableView<?> tableView1; // Add fx:id="tableView1" in FXML if you need this
    @FXML
    private TableView<?> tableView2; // Add fx:id="tableView2" in FXML if you need this

    @FXML
    private TableColumn<?, ?> column1; // Example, add fx:id="column1" in FXML if you need this
    @FXML
    private TableColumn<?, ?> column2; // Example, add fx:id="column2" in FXML if you need this

    @FXML
    private void initialize() {
        // Initialization code, e.g., setting up the TableView
        // Example: setting up columns, adding data to the table
    }
}
