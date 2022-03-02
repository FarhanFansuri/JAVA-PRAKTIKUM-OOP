/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.src;

/**
 *
 * @author mfarh
 */
public class Tabung extends Lingkaran implements MenghitungRuang {
     private double pi,jari,tinggi;
    

    private void setValue(double pi, double jari, double tinggi){
        this.pi = pi;
        this.jari = jari;
        this.tinggi = tinggi;
    }
    
    Tabung(double pi, double jari, double tinggi){
    setValue(pi,jari,tinggi);
    };
    
    @Override
    public double getVolume(){
        return Luas(this.pi,this.jari)*this.tinggi;
    }
    
    public void getResult(){
        
        System.out.println("Luas Lingkaran     : " + Luas(this.pi,this.jari));
        System.out.println("Keliling Lingkaran : " + Keliling(this.pi,this.jari));
        System.out.println("Volume balok             : " + getVolume());
        System.out.println("Luas permukaan balok     : " + Luas(this.pi,this.jari,this.tinggi));
        
        
    }
    
}
