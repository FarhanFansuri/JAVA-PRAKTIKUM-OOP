/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.task.src;

/**
 *
 * @author WINDOWS 10
 */

//Pembobotan nilai akhir :
//
//- android development:
//
//Tulis = 20%
//Coding = 50%
//Wawancara = 30%

public class Perhitungan extends DataPeserta{
    Perhitungan(String nama, int nik, int tesTulis, int tesCoding, int tesWawancara){
        super(nama, nik, tesTulis, tesCoding, tesWawancara);
    }
    public int hitung(int tesTulis, int tesCoding, int tesWawancara){
       int hasil = tesTulis + tesCoding + tesWawancara;
        return hasil/3;
    }
    
    
    public void tampil(int inpt){
        
        if(inpt >= 85){
                System.out.println("Nilai akhir : " + inpt);
                System.out.println("Keterangan : LOLOS" );        
        }else{
            System.out.println("Nilai akhir : " + inpt);
            System.out.println("Keterangan : GAGAL" );     
        }
    }
    
    
    
}
