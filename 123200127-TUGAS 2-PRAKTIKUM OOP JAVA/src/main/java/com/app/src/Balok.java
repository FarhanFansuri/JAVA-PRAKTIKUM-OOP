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
public class Balok extends PersegiPanjang implements MenghitungRuang {
    
    private double panjang,lebar,tinggi;
    

    private void setValue(double panjang, double lebar, double tinggi){
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }
    
    Balok(double panjang, double lebar, double tinggi){
    setValue(panjang,lebar,tinggi);
    };
    
    @Override
    public double getVolume(){
        return Luas(this.panjang,this.lebar)*this.tinggi;
    }
    
    public void getResult(){
        
        System.out.println("Luas persegi panjang     : " + Luas(this.panjang,this.lebar));
        System.out.println("Keliling persegi panjang : " + Keliling(this.panjang,this.lebar));
        System.out.println("Volume balok             : " + getVolume());
        System.out.println("Luas permukaan balok     : " + Luas(this.panjang,this.lebar,this.tinggi));
        
        
    }

}
