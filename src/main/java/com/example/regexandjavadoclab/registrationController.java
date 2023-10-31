package com.example.regexandjavadoclab;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import java.util.regex.*;


public class registrationController {
    @FXML
    private TextField fNameTF;
    @FXML
    private TextField lNameTF;
    @FXML
    private TextField emailTF;
    @FXML
    private TextField DOBTF;
    @FXML
    private TextField zipTF;
    @FXML
    private Button btnCon;

    Pattern p = Pattern.compile("[a-z]+");


}