/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.task.src;

import java.util.Scanner;

/**
 *
 * @author WINDOWS 10
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nama;
        int nik,tesTulis,tesCoding,tesWawancara;
        int inpt;
        boolean condition = true, condition2 = true;
        Perhitungan peserta;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Form Pendaftara Karyawan");
        System.out.println("1. Android Development");
        System.out.println("2. Web Development");
        System.out.println("Masukan Pilihan Form : ");
        inpt = input.nextInt();        
                System.out.println("---------- FORM -----------");
                input.nextLine();
                System.out.println("1. Input Nama : ")
                        ;nama = input.nextLine();
                System.out.println("2. Input NIK : ")
                        ;nik = input.nextInt();
        while(condition){
                System.out.println("3. Input Test Tulis : ")
                        ;tesTulis = input.nextInt();
                System.out.println("4. Input Test Coding : ")
                        ;tesCoding = input.nextInt();
                System.out.println("5. Input Test Wawancara : ")
                        ;tesWawancara = input.nextInt();
                condition2 = true;
                while(condition2){
                System.out.printf("\n");
                System.out.println("Menu");
                System.out.println("1. Edit");
                System.out.println("2. Check");
                System.out.println("3. Exit");
                System.out.println("Pilih : ");
                inpt = input.nextInt();
                peserta = new Perhitungan(nama,nik,tesTulis,tesCoding,tesWawancara);          
               switch(inpt){
                   case 1:
                       condition2 = false;
                       System.err.println("");
                       break;
                   case 2:
                       peserta.tampil(peserta.hitung( tesTulis, tesCoding, tesWawancara));
                       break;
                   case 3:
                       condition2 = false;
                       condition = false;
                       break;
                   default:
                       break;       
                    }
                }
        }
                
    }
    
}
