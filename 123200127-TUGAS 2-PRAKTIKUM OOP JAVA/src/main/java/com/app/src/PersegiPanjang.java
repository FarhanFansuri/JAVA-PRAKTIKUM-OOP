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
public class PersegiPanjang implements MenghitungBidang{
    
    double panjang,lebar,tinggi;
    
    
    @Override
    public double Luas(double panjang, double lebar){
        return panjang * lebar;
    }

    @Override
    public double Luas(double panjang, double lebar, double tinggi) {
        return 2*(panjang*lebar + panjang*tinggi + tinggi*lebar);
    }
    
    public double Keliling(double panjang, double lebar){
        return 2*(panjang + lebar);
    }
    
}
