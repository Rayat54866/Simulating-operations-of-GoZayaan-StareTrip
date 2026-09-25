module com.example.demo54 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.demo54 to javafx.fxml;
    exports com.example.demo54;
}