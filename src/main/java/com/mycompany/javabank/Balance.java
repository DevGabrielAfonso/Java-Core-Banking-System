/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javabank;

public class Balance {
    private static double balance = 100.00;
    
    public static double getBalance(){
        return balance;
    }
    
    public static void deposit(double value){
        if(value > 0){
            balance = balance + value;
        }
    }
    
    public static void withdraw(double value){
        if (value > 0 && balance >= value){
            balance = balance - value;
        }
        
    }
}
