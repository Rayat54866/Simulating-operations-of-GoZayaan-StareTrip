package com.example.demo54;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Login_Controller
{
    @javafx.fxml.FXML
    private TextField userIDTF;
    @javafx.fxml.FXML
    private PasswordField passwordTF;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void loginButtonOA(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Visa_Service_Provider_dashboard.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage stage = (Stage)((Node)(actionEvent.getSource())).getScene().getWindow();
            stage.setTitle("GoZayaan");
            stage.setScene(scene);
            Visa_Service_Provider_dashboard_Controller visaServiceProviderDashboardController = fxmlLoader.getController();
            visaServiceProviderDashboardController.receiveIdFromLoginController(userIDTF.getText());
            stage.show();
        } catch (Exception e) {
            //
        }
    }
}