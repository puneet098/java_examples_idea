package com.example.javafx.samplejavafx;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.event.WeakEventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class SampleController {
    @FXML
    private Button clickMeButton;

    public void initialize() {

 /*       clickMeButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.println("You clicked me");
            }
        });*/
        clickMeButton.setOnAction(actionEvent -> System.out.println("you clicked me"));
    }




}
