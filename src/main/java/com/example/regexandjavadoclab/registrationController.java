package com.example.regexandjavadoclab;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
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
    @FXML
    private Label errors;
    @FXML


    boolean flag=false;


    public void initialize()
    {
        fNameTF.setOnKeyPressed(event -> {

            if (event.getCode() != KeyCode.TAB && flag){
                fNameTF.setStyle("-fx-border-color: black ; -fx-border-width: 1px ;");
                errors.setText("");

                flag=false;
            }

        });
        fNameTF.focusedProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue) {
                System.out.println("Welcome text is focused");
            } else {
                if(fNameTF.getText().matches("^(.+)@(.+)$*"))
                {
                    fNameTF.setEditable(false);
                    fNameTF.setBorder(null);
                }
                else
                {

                    fNameTF.setStyle("-fx-border-color: red ; -fx-border-width: 4px ;");
                    fNameTF.setVisible(true);
                    fNameTF.requestFocus();
                    errors.setText(fNameTF.getText()+ " is not valid email");
                    flag=true;
                }

            }
        });
        fNameTF .focusedProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue) {
                System.out.println("Welcome text is focused");
            } else {
                if(fNameTF.getText().matches("[a-zA-Z]{2,4}"))
                {
                    fNameTF.setEditable(false);
                    fNameTF.setBorder(null);
                }
                else
                {
                    fNameTF.setText("Invalid Email");
                    fNameTF.setVisible(true);

                }
            }
        });


    }


}