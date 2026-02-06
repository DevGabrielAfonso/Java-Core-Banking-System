/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.mycompany.javabank.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Gabriel
 */
public class LoginController implements Initializable {
    @FXML
    private TextField inputEmail;
    
    @FXML
    private PasswordField inputPassword;
    
    @FXML
    private boolean inputVerifier(){
        if(inputEmail.getText().trim().isEmpty() || inputPassword.getText().trim().isEmpty()){
            return false;
        } else {
            accessGranted();
            return true;
        }
    }
    
    private void accessGranted(){
        System.out.println("Acesso garantido!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
