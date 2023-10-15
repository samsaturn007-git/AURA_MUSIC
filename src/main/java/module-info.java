module com.example.finalapp {
    requires javafx.graphics;
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires java.sql.rowset;
    requires mysql.connector.j;

    opens com.example.finalapp to javafx.fxml;
    exports com.example.finalapp;
}