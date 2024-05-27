package org.example.university_secondsemester_workshop_pinterestfront;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Pinterest extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Pinterest.class.getResource("Pinterest-View.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Pinterest");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}