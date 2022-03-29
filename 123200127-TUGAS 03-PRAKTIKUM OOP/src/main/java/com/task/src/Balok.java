/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.task.src;

/**
 *
 * @author WINDOWS 10
 */
public class Balok {
    
    int panjang;
    int lebar;
    int tinggi;
    
    Balok(int panjang, int lebar, int tinggi){
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }
    
    public int LuasPermukaanBalok(){
        return (2*this.panjang*this.lebar + 2*this.panjang*this.tinggi + 2*this.lebar*this.tinggi);
    }
    
    public int Volume(){
        return(this.panjang+this.lebar*this.tinggi);
    }
    
}
