package com.example.alex;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;

public class HelloController extends CalculateNumber {
    @FXML
    private Label welcomeText;


    @FXML
    protected void onHelloButtonClick() {
        Button b = new Button("Start");
        StackPane r = new StackPane();
        r.getChildren().add(b);


    }

}