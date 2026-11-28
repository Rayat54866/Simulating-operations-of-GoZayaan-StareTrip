package com.example.demo54;

import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.ArrayList;

public class Available_Countries_Controller
{
    @javafx.fxml.FXML
    private TableView<Country_Visa_Count> availableCountriesTV;
    @javafx.fxml.FXML
    private TableColumn<Country_Visa_Count, String> availableCountriesTC;
    @javafx.fxml.FXML
    private TableColumn<Country_Visa_Count, Integer> visaServicesTC;

    @javafx.fxml.FXML
    public void initialize() {
        availableCountriesTC.setCellValueFactory(new PropertyValueFactory<>("countryName"));
        visaServicesTC.setCellValueFactory(new PropertyValueFactory<>("visaCount"));

        ArrayList<String> countryList = new ArrayList<>();

        for (int i = 0; i < add_Visa_Service_Controller.serviceList.size(); i++) {
            Visa_Services v = add_Visa_Service_Controller.serviceList.get(i);

            if (!countryList.contains(v.getCountryName())) {
                countryList.add(v.getCountryName());
            }
        }

        for (int i = 0; i < countryList.size(); i++) {
            String country = countryList.get(i);
            int count = 0;
            for (int j = 0; j < add_Visa_Service_Controller.serviceList.size(); j++) {

                Visa_Services v = add_Visa_Service_Controller.serviceList.get(j);

                if (v.getCountryName().equalsIgnoreCase(country)
                        && v.getIsVisaAvailable()) {
                    count++;
                }
            }

            availableCountriesTV.getItems().add(new Country_Visa_Count(country, count));
        }
    }
}