/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.util.Scanner;

/**
 *
 * @author Dhimaz Nur Ramadhan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Kalkulasi a = new Kalkulasi();
    Scanner in = new Scanner(System.in);
    boolean running = true;
    int counter = 0;
    a.Menu(); 
    for(String b = "y"; b.equals("y") || b.equals("Y");){
           a.Hitung();
           System.out.print("APA ADA TAMBAHAN? (Y/T): ");    
           b = in.next();
           System.out.println("------------------------------------------");
       }  
    a.Total();
    a.Pembayaran();
    }   
}
