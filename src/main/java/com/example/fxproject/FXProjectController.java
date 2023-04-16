package com.example.fxproject;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

import java.io.File;
import java.io.FileWriter;

public class FXProjectController {

    Person person = new Person();
    StringBuilder result = new StringBuilder();

    @FXML
    private ComboBox<String> comboList;

    @FXML
    private TextField ageTextArea;

    @FXML
    private TextField nameTextArea;

    @FXML
    void onSaveButton() {
        person.setName(nameTextArea.getText());
        person.setAge(ageTextArea.getText());
        person.setGender(comboList.getValue());

        result.append("Имя и фамилия: ").append(person.getName()).append("\n");
        result.append("Возраст: ").append(person.getAge()).append("\n");
        result.append("Пол: ").append(person.getGender()).append("\n");

        File file = new File("C:\\Users\\upcco\\OneDrive\\Рабочий стол\\" + person.getName() + ".txt");
        try (FileWriter fileWriter = new FileWriter(file)) {
            fileWriter.write(result.toString());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void initialize() {
        ObservableList<String> list = FXCollections.observableArrayList("мужской", "женский");
        comboList.setItems(list);
    }
}

