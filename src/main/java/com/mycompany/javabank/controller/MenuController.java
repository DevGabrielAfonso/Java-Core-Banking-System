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
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author Gabriel
 */
public class MenuController implements Initializable {

    @FXML
    private Button deposit;
    
    @FXML
    private Button withdraw;
    
    @FXML
    private Button exit;
    
    @FXML
    private Button toggleBalanceView;
    
    @FXML
    private Label labelBalance;
    
    boolean toggleView = false;
    
    public void toggleBalance(){
        toggleView = !toggleView;
        if (toggleView){
            labelBalance.setText("USD$ *.**");
            return;
        }
        updateBalance();
    }
    
    public void depositMenu() throws IOException{
        App.changeScreen("Deposit");
    }
    
    public void withdrawMenu() throws IOException{
        App.changeScreen("Withdraw");
    }
    
    private void updateBalance(){
        labelBalance.setText("USD$ " + String.format("%.2f", Balance.getBalance()));
    }
    
    public void exitApp(){
        Platform.exit();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        updateBalance();
    }    
    
}
