package com.example.fxproject;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

import java.io.File;
import java.io.FileWriter;

public class FXProjectController {

    Person person = new Person();
    StringBuilder result = new StringBuilder();

    @FXML
    private TextField nameTextArea;

    @FXML
    private TextField ageTextArea;

    @FXML
    private TextField cityTextArea;

    @FXML
    private ComboBox<String> comboEducation;

    @FXML
    private CheckBox visualV;

    @FXML
    private CheckBox audioV;

    @FXML
    private CheckBox kinesteticV;

    @FXML
    private CheckBox audiodigitV;

    @FXML
    void onSaveButton() {
        person.setName(nameTextArea.getText());
        person.setAge(ageTextArea.getText());
        person.setCity(cityTextArea.getText());
        person.setEducation(comboEducation.getValue());

        result.append("Имя и фамилия: ").append(person.getName()).append("\n");
        result.append("Возраст: ").append(person.getAge()).append("\n");

        File file = new File("C:\\Users\\upcco\\OneDrive\\Рабочий стол\\" + person.getName() + ".txt");
        try (FileWriter fileWriter = new FileWriter(file)) {
            fileWriter.write(result.toString());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void initialize() {
        ObservableList<String> list = FXCollections.observableArrayList
                ("дошкольное образование", "начальное общее образование","основное общее образование"
                ,"среднее общее образование", "среднее профессиональное образование", "высшее образование - бакалавриат"
                , "высшее образование - специалитет, магистратура", "высшее образование - подготовка кадров высшей квалификации");
        comboEducation.setItems(list);
    }
}

