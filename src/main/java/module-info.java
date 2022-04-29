module com.example.olamideproject {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.olamideproject to javafx.fxml;
    exports com.example.olamideproject;
}