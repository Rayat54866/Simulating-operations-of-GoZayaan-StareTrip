package com.example.demo54;

import javafx.event.ActionEvent;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

import java.util.ArrayList;

public class add_Visa_Service_Controller
{
    @javafx.fxml.FXML
    private TextField visaProcessingTimeTF;
    @javafx.fxml.FXML
    private TextField countryNameTF;
    @javafx.fxml.FXML
    private ComboBox<String> visaTypeCB;
    @javafx.fxml.FXML
    private TextField serviceFeeTF;
    @javafx.fxml.FXML
    private CheckBox isVisaAvailableCB;

    public static ArrayList<Visa_Services> serviceList = new ArrayList<>();




    @javafx.fxml.FXML
    public void initialize() {
        visaTypeCB.getItems().addAll("Student", "Tourist", "Work", "Business" );
    }

    @javafx.fxml.FXML
    public void addServiceButtonOA(ActionEvent actionEvent) {

        Visa_Services v = new Visa_Services(
                countryNameTF.getText(),
                visaTypeCB.getValue(),
                visaProcessingTimeTF.getText(),
                Float.parseFloat(serviceFeeTF.getText()),
                isVisaAvailableCB.isSelected()
        );

        serviceList.add(v);

        System.out.println("Service Added!");

        countryNameTF.clear();
        visaProcessingTimeTF.clear();
        serviceFeeTF.clear();
        visaTypeCB.setValue(null);
        isVisaAvailableCB.setSelected(false);

    }

    @javafx.fxml.FXML
    public void addServiceToBinButtonOA(ActionEvent actionEvent) {
    }

}