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
public class Lingkaran implements MenghitungBidang{
   
    @Override
    public double Luas(double pi, double jari){
        return pi*jari*jari;
    };
    
    public double Luas(double pi, double jari, double tinggi){
    return this.Luas(pi,jari) + 2*pi*jari*tinggi;
    }
    
    public double Keliling(double pi, double jari){
        return 2*pi*jari;
    }
    
}
