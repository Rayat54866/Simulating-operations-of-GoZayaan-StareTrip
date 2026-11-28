package com.example.demo54;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;

public class Visa_Services_Count_Controller
{
    @javafx.fxml.FXML
    private Label countOutputLabel;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void countVisaServiceButtonOA(ActionEvent actionEvent) {

        int count = add_Visa_Service_Controller.serviceList.size();
        countOutputLabel.setText(String.valueOf(count));

    }
}