module com.example.fxattempt3 {
    requires javafx.graphics;
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires mysql.connector.java;
            
                            
    opens sample to javafx.fxml;
    exports sample;
}