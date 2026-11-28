package com.example.demo54;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;

public class Available_Service_Count_Controller
{
    @javafx.fxml.FXML
    private Label availableServiceCountOutputLabel;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void availableServiceRefreshCountButtonOA(ActionEvent actionEvent) {
        int count = 0;
        for (int i = 0; i < add_Visa_Service_Controller.serviceList.size(); i++) {
            if (add_Visa_Service_Controller.serviceList.get(i).getIsVisaAvailable()) {
                count++;
            }
        }

        availableServiceCountOutputLabel.setText("" + count);
    }
}