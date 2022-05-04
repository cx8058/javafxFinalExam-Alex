package com.example.alex;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        TextField textField1 = new TextField("Enter a number ");
        TextField textField2 = new TextField(" ");

        Label label1 = new Label("Number: ");
        Label label2 = new Label("Result: ");


        HBox box = new HBox(5);
        box.setPadding(new Insets(25, 5 , 5, 50));
        box.getChildren().addAll(label1, textField1, label2, textField2);
        //Setting the stage
        Scene scene = new Scene(box, 595, 150, Color.BEIGE);
        stage.setTitle("Calculating number- Javafx");


        stage.setScene(scene);
        stage.show();


    }

    public static void main(String[] args) {
        launch();
    }
}