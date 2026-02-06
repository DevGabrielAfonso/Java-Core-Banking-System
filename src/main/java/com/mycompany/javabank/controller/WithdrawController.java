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

public class WithdrawController implements Initializable {

    @FXML
    private Label errorFeedback;
    
    @FXML
    private TextField withdrawValue;
    
    public void withdrawNext() throws IOException{
        try {
            double value = Double.parseDouble(withdrawValue.getText().trim());
            Balance.withdraw(value);
            App.changeScreen("Menu");
        } catch (NumberFormatException e) {
            errorFeedback.setText("Invalid input");
        }
    }
    
    public void withdrawCancel() throws IOException{
        App.changeScreen("Menu");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
    
}
