package com.example.demo54;

import javafx.collections.FXCollections;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.ArrayList;

public class Available_Visa_Types_Controller
{
    @javafx.fxml.FXML
    private TableView<Visa_Type_Count> visaTypesTV;
    @javafx.fxml.FXML
    private TableColumn<Visa_Type_Count, String> visaTypesTC;
    @javafx.fxml.FXML
    private TableColumn<Visa_Type_Count, Integer> visaAvailableInCountruesTC;

    @javafx.fxml.FXML
    public void initialize() {
        visaTypesTC.setCellValueFactory(new PropertyValueFactory<>("visaType"));
        visaAvailableInCountruesTC.setCellValueFactory(new PropertyValueFactory<>("countryCount"));

        String[] types = {"Student", "Tourist", "Work", "Business"};

        for (String type : types) {

            int count = 0;

            for (Visa_Services v : add_Visa_Service_Controller.serviceList) {

                if (v.getVisaType().equals(type) && v.getIsVisaAvailable()) {
                    count++;
                }
            }

            visaTypesTV.getItems().add(new Visa_Type_Count(count, type));
        }
    }
}