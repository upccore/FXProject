package com.example.fxproject;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class FXProjectController {

    Person person = new Person();

    @FXML
    private Label mainText;

    @FXML
    private Button nextButton;

    @FXML
    private TextArea textArea;

    @FXML
    void onNextButtonClick() throws InterruptedException {
        person.setName(textArea.getText());
        textArea.clear();
    }
}

