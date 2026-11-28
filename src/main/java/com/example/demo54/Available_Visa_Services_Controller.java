package com.example.demo54;

import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.ArrayList;

public class Available_Visa_Services_Controller
{
    @javafx.fxml.FXML
    private TableColumn<Boolean, Visa_Services> AvailablevisaTypeTC;
    @javafx.fxml.FXML
    private TableView<Visa_Services> AvailablevisaServicesTV;
    @javafx.fxml.FXML
    private TableColumn<String, Visa_Services> AvailablecountryNameTC;
    @javafx.fxml.FXML
    private TableColumn<Float, Visa_Services> AvailableserviceFeeTC;
    @javafx.fxml.FXML
    private TableColumn<String, Visa_Services> AvailableprocessingTimeTC;

    @javafx.fxml.FXML
    public void initialize() {

        AvailablecountryNameTC.setCellValueFactory(new PropertyValueFactory<>("countryName"));
        AvailablevisaTypeTC.setCellValueFactory(new PropertyValueFactory<>("visaType"));
        AvailableserviceFeeTC.setCellValueFactory(new PropertyValueFactory<>("serviceFee"));
        AvailableprocessingTimeTC.setCellValueFactory(new PropertyValueFactory<>("processingTime"));

        ArrayList<Visa_Services> availableList = new ArrayList<>();

        for (Visa_Services v : add_Visa_Service_Controller.serviceList) {

            if (v.getIsVisaAvailable()) {
                availableList.add(v);

            }
        }

        AvailablevisaServicesTV.getItems().addAll(availableList);

    }
}