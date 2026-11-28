package com.example.demo54;

import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class View_Visa_Service_Controller
{
    @javafx.fxml.FXML
    private TableView<Visa_Services> visaServicesTV;
    @javafx.fxml.FXML
    private TableColumn<Visa_Services, Boolean> isVisaAvailableTC;
    @javafx.fxml.FXML
    private TableColumn<Visa_Services, String> countryNameTC;
    @javafx.fxml.FXML
    private TableColumn<Visa_Services, String> visaTypeTC;
    @javafx.fxml.FXML
    private TableColumn<Visa_Services, String> processingTimeTC;
    @javafx.fxml.FXML
    private TableColumn<Visa_Services, Float> serviceFeeTC;

    @javafx.fxml.FXML
    public void initialize() {

        countryNameTC.setCellValueFactory(new PropertyValueFactory<Visa_Services, String>("countryName"));
        visaTypeTC.setCellValueFactory(new PropertyValueFactory<Visa_Services, String>("visaType"));
        processingTimeTC.setCellValueFactory(new PropertyValueFactory<Visa_Services, String>("processingTime"));
        serviceFeeTC.setCellValueFactory(new PropertyValueFactory<Visa_Services, Float>("serviceFee"));
        isVisaAvailableTC.setCellValueFactory(new PropertyValueFactory<Visa_Services, Boolean>("isVisaAvailable"));

        visaServicesTV.getItems().addAll(add_Visa_Service_Controller.serviceList);

    }
}