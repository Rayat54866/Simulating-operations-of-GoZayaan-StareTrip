package com.example.demo54;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class Filter_Visa_Services_Controller
{

    @javafx.fxml.FXML
    private TableView FiltervisaServicesTV;
    @javafx.fxml.FXML
    private TableColumn countryNameFilterTC;
    @javafx.fxml.FXML
    private TableColumn visaTypeFilterTC;
    @javafx.fxml.FXML
    private TableColumn serviceFeeFilterTC;
    @javafx.fxml.FXML
    private TableColumn isVisaAvailableFilterTC;
    @javafx.fxml.FXML
    private ComboBox FilterVisaTypeCB;
    @javafx.fxml.FXML
    private TableColumn processingTimeFilterTC;
    @javafx.fxml.FXML
    private TextField FilterCountryNameTF;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void filterButtonOA(ActionEvent actionEvent) {
    }
}