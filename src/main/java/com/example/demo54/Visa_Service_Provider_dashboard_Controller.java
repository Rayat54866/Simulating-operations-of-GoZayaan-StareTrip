package com.example.demo54;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Visa_Service_Provider_dashboard_Controller
{
    @javafx.fxml.FXML
    private BorderPane visaSPDashboardBorderpane;
    @javafx.fxml.FXML
    private Label loggedInUserIDLabel;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void viewVisaServiceButtonOA(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("View_Visa_Services_View.fxml"));
            visaSPDashboardBorderpane.setCenter(fxmlLoader.load());
        }
        catch (IOException e) {
            //
        }
    }


    @javafx.fxml.FXML
    public void logoutButtonOA(ActionEvent actionEvent) {
       try {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Login.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage)((Node)(actionEvent.getSource())).getScene().getWindow();
        stage.setTitle("GoZayaan");
        stage.setScene(scene);
        stage.show();
       } catch (Exception e) {
           //
       }

    }

    @javafx.fxml.FXML
    public void addVisaServiceButtonOA(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Add_Visa_Service.fxml"));
            visaSPDashboardBorderpane.setCenter(fxmlLoader.load());
        }
        catch (IOException e) {
            //
        }
    }

    @javafx.fxml.FXML
    public void viewVisaTypesButtonOA(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Visa_Types_View.fxml"));
            visaSPDashboardBorderpane.setCenter(fxmlLoader.load());
        }
        catch (IOException e) {
            //
        }
    }

    @javafx.fxml.FXML
    public void filterVisaServicesButtonOA(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Filter_Visa_Services_View.fxml"));
            visaSPDashboardBorderpane.setCenter(fxmlLoader.load());
        }
        catch (IOException e) {
            //
        }
    }

    @javafx.fxml.FXML
    public void countAvailableServicesButtonOA(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Available_Service_Count_View.fxml"));
            visaSPDashboardBorderpane.setCenter(fxmlLoader.load());
        }
        catch (IOException e) {
            //
        }
    }

    @javafx.fxml.FXML
    public void countVisaServiceButtonOA(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Visa_Service_Count_View.fxml"));
            visaSPDashboardBorderpane.setCenter(fxmlLoader.load());
        }
        catch (IOException e) {
            //
        }
    }

    @javafx.fxml.FXML
    public void viewCountryListButtonOA(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Country_List_View.fxml"));
            visaSPDashboardBorderpane.setCenter(fxmlLoader.load());
        }
        catch (IOException e) {
            //
        }
    }

    @javafx.fxml.FXML
    public void showAvailableServicesButtonOA(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Available_Services_View.fxml"));
            visaSPDashboardBorderpane.setCenter(fxmlLoader.load());
        }
        catch (IOException e) {
            //
        }
    }

    public void receiveIdFromLoginController(String Id){
        loggedInUserIDLabel.setText(Id);

    }
}