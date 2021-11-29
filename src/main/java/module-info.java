module com.example.lab7savchuk {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.lab7savchuk to javafx.fxml;
    exports com.example.lab7savchuk;
}