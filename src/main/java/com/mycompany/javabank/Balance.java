/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javabank;

public class Balance {
    private static double balance = 0;
    
    public static double getBalance(){
        return balance;
    }
    
    public static void deposit(double value){
        balance = balance + value;
    }
    
    public static void withdraw(double value){
        if (balance < value){
        } else {
            balance = balance - value;
        }
        
    }
}
