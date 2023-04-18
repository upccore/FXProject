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
    private CheckBox mppShodstvo;
    @FXML
    private CheckBox mppRazlichie;
    @FXML
    private CheckBox mppSam;
    @FXML
    private CheckBox mppDrugie;
    @FXML
    private CheckBox mppVneshRef;
    @FXML
    private CheckBox mppVnutRef;
    @FXML
    private CheckBox mppActiv;
    @FXML
    private CheckBox mppRefleks;
    @FXML
    private CheckBox mppProshloe;
    @FXML
    private CheckBox mppNast;
    @FXML
    private CheckBox mppBudushee;
    @FXML
    private CheckBox mppK;
    @FXML
    private CheckBox mppOt;
    @FXML
    private CheckBox mppObshee;
    @FXML
    private CheckBox mppDetails;
    @FXML
    private CheckBox mppProced;
    @FXML
    private CheckBox mppVozmojn;

    @FXML
    void onSaveButton() {

        person.setName(nameTextArea.getText());
        person.setAge(ageTextArea.getText());
        person.setCity(cityTextArea.getText());
        person.setEducation(comboEducation.getValue());

        if (visualV.isSelected()) {
            person.setRepresentSystemVisual("Визуальная");
        }
        if (audioV.isSelected()) {
            person.setRepresentSystemAudio("Аудиальная");
        }
        if (kinesteticV.isSelected()) {
            person.setRepresentSystemKinestetic("Кинестетика");
        }
        if (audiodigitV.isSelected()) {
            person.setRepresentSystemAudiodigit("Аудиодигитальная");
        }

        if (mppShodstvo.isSelected()) {
            person.setMppShodstvo("Сходство");
        }
        if (mppRazlichie.isSelected()) {
            person.setMppRazlichie("Различие");
        }
        if (mppSam.isSelected()) {
            person.setMppSam("Сам (для себя)");
        }
        if (mppDrugie.isSelected()) {
            person.setMppDrugie("Другие (для других)");
        }
        if (mppVneshRef.isSelected()) {
            person.setMppVneshRef("Внешняя референция");
        }
        if (mppVnutRef.isSelected()) {
            person.setMppVnutRef("Внутренняя референция");
        }
        if (mppActiv.isSelected()) {
            person.setMppActiv("Активный");
        }
        if (mppRefleks.isSelected()) {
            person.setMppRefleks("Рефлексия");
        }
        if (mppProshloe.isSelected()) {
            person.setMppProshloe("Предпочтение к ПРОШЛОМУ");
        }
        if (mppNast.isSelected()) {
            person.setMppNast("предпочтения к НАСТОЯЩЕМУ");
        }
        if (mppBudushee.isSelected()) {
            person.setMppBudushee("предпочтение к БУДУЩЕМУ");
        }
        if (mppK.isSelected()) {
            person.setMppK("Мотивация |К|");
        }
        if (mppOt.isSelected()) {
            person.setMppOt("Мотивация |ОТ|");
        }
        if (mppObshee.isSelected()) {
            person.setMppObshee("Общее (глобальное)");
        }
        if (mppDetails.isSelected()) {
            person.setMppDetails("Детали (специфичное)");
        }
        if (mppProced.isSelected()) {
            person.setMppProced("Процедура");
        }
        if (mppVozmojn.isSelected()) {
            person.setMppVozmojn("Возможности");
        }

        result.append("Имя и фамилия: ").append(person.getName()).append("\n");
        result.append("\n");
        result.append("Возраст: ").append(person.getAge()).append("\n");
        result.append("\n");
        result.append("Образование: ").append(person.getEducation()).append("\n");
        result.append("\n");

        result.append("Ведущая репрезентативная система:").append("\n");
        if (person.getRepresentSystemVisual() != null) {
            result.append("\t").append(person.getRepresentSystemVisual()).append("\n");
        }
        if (person.getRepresentSystemAudio() != null) {
            result.append("\t").append(person.getRepresentSystemAudio()).append("\n");
        }
        if (person.getRepresentSystemKinestetic() != null) {
            result.append("\t").append(person.getRepresentSystemKinestetic()).append("\n");
        }
        if (person.getRepresentSystemAudiodigit() != null) {
            result.append("\t").append(person.getRepresentSystemAudiodigit()).append("\n");
        }
        result.append("\n");

        result.append("Метапрограмный профиль:").append("\n");
        if (person.getMppShodstvo() != null) {
            result.append("\t").append(person.getMppShodstvo()).append("\n");
        }
        if (person.getMppRazlichie() != null) {
            result.append("\t").append(person.getMppRazlichie()).append("\n");
        }
        result.append("\n");
        if (person.getMppSam() != null) {
            result.append("\t").append(person.getMppSam()).append("\n");
        }
        if (person.getMppDrugie() != null) {
            result.append("\t").append(person.getMppDrugie()).append("\n");
        }
        result.append("\n");
        if (person.getMppVneshRef() != null) {
            result.append("\t").append(person.getMppVneshRef()).append("\n");
        }
        if (person.getMppVnutRef() != null) {
            result.append("\t").append(person.getMppVnutRef()).append("\n");
        }
        result.append("\n");
        if (person.getMppActiv() != null) {
            result.append("\t").append(person.getMppActiv()).append("\n");
        }
        if (person.getMppRefleks() != null) {
            result.append("\t").append(person.getMppRefleks()).append("\n");
        }
        result.append("\n");
        if (person.getMppProshloe() != null) {
            result.append("\t").append(person.getMppProshloe()).append("\n");
        }
        if (person.getMppNast() != null) {
            result.append("\t").append(person.getMppNast()).append("\n");
        }
        if (person.getMppBudushee() != null) {
            result.append("\t").append(person.getMppBudushee()).append("\n");
        }
        result.append("\n");
        if (person.getMppK() != null) {
            result.append("\t").append(person.getMppK()).append("\n");
        }
        if (person.getMppOt() != null) {
            result.append("\t").append(person.getMppOt()).append("\n");
        }
        result.append("\n");
        if (person.getMppObshee() != null) {
            result.append("\t").append(person.getMppObshee()).append("\n");
        }
        if (person.getMppDetails() != null) {
            result.append("\t").append(person.getMppDetails()).append("\n");
        }
        result.append("\n");
        if (person.getMppProced() != null) {
            result.append("\t").append(person.getMppProced()).append("\n");
        }
        if (person.getMppVozmojn() != null) {
            result.append("\t").append(person.getMppVozmojn()).append("\n");
        }
        result.append("\n");

        File file = new File("C:\\Users\\upcco\\OneDrive\\Рабочий стол\\" + person.getName() + ".txt");
        try (FileWriter fileWriter = new FileWriter(file)) {
            fileWriter.write(result.toString());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void initialize() {
        ObservableList<String> list = FXCollections.observableArrayList
                ("дошкольное образование", "начальное общее образование", "основное общее образование"
                        , "среднее общее образование", "среднее профессиональное образование", "высшее образование - бакалавриат"
                        , "высшее образование - специалитет, магистратура", "высшее образование - подготовка кадров высшей квалификации");
        comboEducation.setItems(list);
    }
}

