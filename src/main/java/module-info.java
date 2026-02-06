module com.mycompany.javabank {

    requires javafx.controls;
    requires javafx.fxml;

    exports com.mycompany.javabank;
    exports com.mycompany.javabank.controller;

    opens com.mycompany.javabank.controller to javafx.fxml;
}
