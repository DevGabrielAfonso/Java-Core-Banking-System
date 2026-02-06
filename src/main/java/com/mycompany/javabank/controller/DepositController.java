    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.mycompany.javabank.controller;

import com.mycompany.javabank.App;
import com.mycompany.javabank.Balance;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author Gabriel
 */
public class DepositController implements Initializable {

    @FXML
    private TextField depositValue;
    
    @FXML
    private Label errorFeedback;
    
    public void depositCancel() throws IOException{
        App.changeScreen("Menu");
    }
    
    public void depositNext() throws IOException{
        try {
            double value = Double.parseDouble(depositValue.getText().trim());
            Balance.deposit(value);
            App.changeScreen("Menu");
        } catch (NumberFormatException e) {
            errorFeedback.setText("Invalid input");
        }
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
