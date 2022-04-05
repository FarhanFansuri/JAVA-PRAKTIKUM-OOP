/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.task.src;

/**
 *
 * @author WINDOWS 10
 * 
 */

//pertama, kalian diminta untuk input pilihan divisi Android development atau Web development
//
//kedua, input kan data NIK, nama, tes tulis, tes coding, dan tes wawancara
//
//ketiga, akan ada pilihan untuk edit data atau cek hasil
//
//edit data digunakan untuk meg-edit nilai tes yang ada
//cek hasil digunakan untuk melihat kelulusan

public class DataPeserta {
    String nama;
    int nik,tesTulis,tesCoding,tesWawancara;
    
    DataPeserta(String nama, int nik, int tesTulis, int tesCoding, int tesWawancara){
        this.nama = nama;
        this.nik = nik;
        this.tesCoding = tesCoding;
        this.tesTulis = tesTulis;
        this.tesWawancara = tesWawancara;
    }
    
}
