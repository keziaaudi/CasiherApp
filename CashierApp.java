/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cashierapp;

import java.util.Scanner;

/**
 *
 * @author keziaaudi
 */
public class CashierApp {

    public static void main(String[] args) {
             System.out.println("""
                           
                           ================ CASHIER APP ================""");
        
        Scanner usr = new Scanner(System.in);
        System.out.print(" Input Items name:");
        String a = usr.nextLine();
        
        Scanner pcy = new Scanner(System.in);
        System.out.print("Input Items price[use decimal numbers]: $");
        Double d = pcy.nextDouble();
        
        Scanner qn = new Scanner(System.in);
        System.out.print("Input Items quantity[1..20]:");
        Integer q = qn.nextInt();
        
        Scanner ds = new Scanner(System.in);
        System.out.print("Input Items discount[0..50]:");
        Integer dt = ds.nextInt();  
        
        double totalPrice = d * q * (100 - dt) / 100;
        double roundedNumber = Math.round(totalPrice * 100.0) / 100.0;
        
        System.out.println("\nES Companies Portal - Invoice");
        System.out.println("==============================");
        System.out.println("Item's name     : " + a);
        System.out.println("Item's price    : " + d);
        System.out.println("Item's quantity : " + q);
        System.out.println("Item's discount : " + dt + "%");
        System.out.println("\nYou have to pay $" + roundedNumber);

        System.out.print("\nInput your money [use decimal numbers]: $");
        

        System.out.println("\nThanks for purchasing!");
        double change = totalPrice;
        double roundedNumber2 = Math.round(change * 100.0) / 100.0;
        System.out.println("Your change: $" + roundedNumber2);

    }       
}