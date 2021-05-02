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
public class Kalkulasi extends Main {
    Scanner in = new Scanner(System.in);  
    Sembako a = new Sembako(); 
    float total1,total2,total3,total4,total5,totalharga;
    void Menu(){
        System.out.println("------------------KASIR-------------------");
        System.out.println("1.BERAS       : 9K/KG");
        System.out.println("2.GULA        : 13K/KG");
        System.out.println("3.MINYAK      : 7K/PCS");
        System.out.println("4.MI INSTAN   : 3K/PCS");
        System.out.println("5.SABUN CUCI  : 6K/PCS");
        System.out.println("------------------------------------------");
    }
    void Hitung(){
        System.out.print("INPUT BARANG : ");
        int barang = in.nextInt();
        System.out.print("INPUT JUMLAH : ");
        float jumlah = in.nextInt();
        System.out.println("------------------------------------------");
        switch (barang) {
            case 1:
                a.setBeras(jumlah*9000);               
                System.out.println("TOTAL HARGA : Rp"+a.getBeras());
                total1 = a.getBeras();
                break;
            case 2:
                a.setGula(jumlah*13000);
                System.out.println("TOTAL HARGA : Rp"+a.getGula());
                total2 = a.getGula();
                break;
            case 3:
                a.setMinyak(jumlah*7000);
                System.out.println("TOTAL HARGA : Rp"+a.getMinyak());
                total3 = a.getMinyak();
                break;
            case 4:
                a.setMie(jumlah*3000);
                System.out.println("TOTAL HARGA : Rp"+a.getMie());
                total4 =a.getMie();
                break; 
            case 5:
                a.setSabuncuci(jumlah*6000);
                System.out.println("TOTAL HARGA : Rp"+a.getSabuncuci());
                total5 =a.getSabuncuci();
                break;
            default:
                System.out.println("!! ITEM HANYA ADA 5 MACAM !!");
                break;                   
        }
    }
    void Total(){
        totalharga = total1+total2+total3+total4;
        System.out.println("TOTAL SELURUH HARGA : Rp"+totalharga);
    }
    void Pembayaran(){
        System.out.println("------------------------------------------");
        System.out.print("TUNAI PEMBELI : Rp");
        float tunai = in.nextFloat();
        float kembali = tunai-totalharga;
        if(kembali>totalharga){
            System.out.println("KEMBALI       : Rp"+kembali);
            System.out.println("-----TERIMAKASIH SUDAH BELANJA DISINI-----");
        }
        else if(kembali==0){
            System.out.println("KEMBALI       : TUNAI PAS");
            System.out.println("-----TERIMAKASIH SUDAH BELANJA DISINI-----");
        }
        else{
            System.out.println("KEMBALI       : TUNAI KURANG Rp"+kembali);
            System.out.println("-----TERIMAKASIH SUDAH BELANJA DISINI-----");
        }
        
    }
}
    
    