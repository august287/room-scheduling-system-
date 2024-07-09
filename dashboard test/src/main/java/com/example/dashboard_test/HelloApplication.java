package com.example.dashboard_test;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.SceneAntialiasing;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.stage.Stage;


import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Font.loadFont(HelloApplication.class.getResource("/com/example/dashboard_test/media/fonts/MerriweatherSans-Regular.ttf").toExternalForm(), 14);
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240, true, SceneAntialiasing.BALANCED);
        scene.getStylesheets().add(getClass().getResource("dashboard.css").toExternalForm());
        stage.setTitle("PUP SRC ROOM SCHEDULER");
        stage.setScene(scene);
        stage.show();
    }


    public static void main(String[] args) {
        launch();
    }
}