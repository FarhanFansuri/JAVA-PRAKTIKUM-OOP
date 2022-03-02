/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.src;
import java.util.Scanner;
/**
 *
 * @author mfarh
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        Balok balok;
        Tabung tabung;
        int opsi,x,y,z;
        boolean kondisi = true;
     
       
        do{
            System.out.println("==========================");
            System.out.println("         Menu Utama       ");
            System.out.println("==========================");
            System.out.println(" 1. Hitung Balok");
            System.out.println(" 2. Hitung Tabung");
            System.out.println(" 0. Exit");
            System.out.println(" =========================");
            System.out.print("  Masukan Pilihan : ");
            opsi = input.nextInt();
            System.out.printf("\n");
            switch(opsi){
                case 1:
                    System.out.print("Masukan panjang : ");
                    x = input.nextInt();
                    System.out.print("Masukan lebar   : ");
                    y = input.nextInt();
                    System.out.print("Masukan tinggi  : ");
                    z = input.nextInt();
                    balok = new Balok(x,y,z);
                    balok.getResult();
                    break;
                case 2:
                    System.out.print("Masukan Jari-jari : ");
                    x = input.nextInt();
                    System.out.print("Masukan tinggi    : ");
                    y = input.nextInt();
                    tabung = new Tabung(3.14,x,y);
                    tabung.getResult();
                    break;
                case 0:
                    kondisi = false;
                    break;
                   
            }
            System.out.print("Ingin Mengulang (ya : 1 || tidak : 0): ");
            x = input.nextInt();
            if (x == 1){
                continue;
            }else if(x == 0){
                break;
            }else{
                System.out.println("Tidak ada pilihan tersebut!!!");
            }
        }while(kondisi);
        
        System.out.println("============= Program selesai ============");
    }
    
}
