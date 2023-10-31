module com.example.regexandjavadoclab {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.regexandjavadoclab to javafx.fxml;
    exports com.example.regexandjavadoclab;
}