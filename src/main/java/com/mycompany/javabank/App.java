package com.mycompany.javabank;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;

/**
 * JavaFX App
 */
public class App extends Application {
    
    private static Stage stage;
    
    @Override
    public void start(Stage firstStage) throws IOException {
        stage = firstStage;
        stage.setTitle("JavaBank - Login");
        changeScreen("Login");
        stage.show();
    }

    public static void changeScreen(String fxml) throws IOException{
        Parent root = FXMLLoader.load(App.class.getResource("/com/mycompany/javabank/view/" + fxml + ".fxml"));
        stage.setScene(new Scene(root));
    }
    
    public static void main(String[] args) {
        launch();
    }

}