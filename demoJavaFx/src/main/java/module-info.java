module com.example.javafx.demojavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javafx.demojavafx to javafx.fxml;
    exports com.example.javafx.demojavafx;
    exports com.example.javafx.samplejavafx;
    opens com.example.javafx.samplejavafx to javafx.fxml;
}