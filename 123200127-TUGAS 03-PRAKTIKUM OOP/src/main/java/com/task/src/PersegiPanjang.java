/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.task.src;

/**
 *
 * @author WINDOWS 10
 */
public class PersegiPanjang {
    
    int panjang;
    int lebar;
    int tinggi;
    
    PersegiPanjang(int panjang, int lebar, int tinggi){
        
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }
    
    public int LuasPersegiPanjang(){
        return (this.panjang*this.lebar);
    }
    
    public int KelilingPersegiPanjang(){
        return(2*this.panjang+2*this.lebar);
    }
}
