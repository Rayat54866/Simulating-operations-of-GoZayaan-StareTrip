package com.example.demo54;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.ArrayList;

public class Filter_Visa_Services_Controller
{

    @javafx.fxml.FXML
    private TableView<Visa_Services> FiltervisaServicesTV;
    @javafx.fxml.FXML
    private TableColumn<Visa_Services, String> countryNameFilterTC;
    @javafx.fxml.FXML
    private TableColumn<Visa_Services, String> visaTypeFilterTC;
    @javafx.fxml.FXML
    private TableColumn<Visa_Services, Float> serviceFeeFilterTC;
    @javafx.fxml.FXML
    private TableColumn<Visa_Services, Boolean> isVisaAvailableFilterTC;
    @javafx.fxml.FXML
    private ComboBox<String> FilterVisaTypeCB;
    @javafx.fxml.FXML
    private TableColumn<Visa_Services, String> processingTimeFilterTC;
    @javafx.fxml.FXML
    private TextField FilterCountryNameTF;

    @javafx.fxml.FXML
    public void initialize() {

        FilterVisaTypeCB.getItems().addAll("Student", "Tourist", "Work", "Business");

        countryNameFilterTC.setCellValueFactory(new PropertyValueFactory<>("countryName"));
        visaTypeFilterTC.setCellValueFactory(new PropertyValueFactory<>("visaType"));
        serviceFeeFilterTC.setCellValueFactory(new PropertyValueFactory<>("serviceFee"));
        isVisaAvailableFilterTC.setCellValueFactory(new PropertyValueFactory<>("isVisaAvailable"));
        processingTimeFilterTC.setCellValueFactory(new PropertyValueFactory<>("processingTime"));

        FiltervisaServicesTV.getItems().addAll(
                add_Visa_Service_Controller.serviceList
        );

    }

    @javafx.fxml.FXML
    public void filterButtonOA(ActionEvent actionEvent) {

        String country = FilterCountryNameTF.getText().toLowerCase();
        String visaType = FilterVisaTypeCB.getValue();

        ArrayList<Visa_Services> filteredList = new ArrayList<>();

        for (Visa_Services v : add_Visa_Service_Controller.serviceList) {

            if (v.getCountryName().toLowerCase().contains(country) && (visaType == null || v.getVisaType().equalsIgnoreCase(visaType))) {
                filteredList.add(v);
            }
        }

        FiltervisaServicesTV.setItems(FXCollections.observableArrayList(filteredList)
        );
    }

}