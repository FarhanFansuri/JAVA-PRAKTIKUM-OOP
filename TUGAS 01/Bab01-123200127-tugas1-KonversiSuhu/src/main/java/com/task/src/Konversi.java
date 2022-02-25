package com.task.src;

public class Konversi {
    public double r,f,k;
    Konversi(){
        this.r = 0;
        this.f = 0;
        this.k = 0;
    }
    public void convert(double number){
//        RUMUS KONVERSI:
//        R = (4 * C)/5
//        F = (9 * C)/5 + 32
//        K = C + 273.15
         this.r = (4 * number)/5;
         this.f = (9 * number)/5 + 32;
         this.k = number + 273.15;
        System.out.println();
        System.out.println("Suhu dalam ");
        System.out.println(" Celcius    :  " + number + " C");
        System.out.println(" Reamur     :  " + this.r + " R");
        System.out.println(" Fahrenheit :  " + this.f + " F");
        System.out.println(" Kelvin     :  " + this.k + " K");
    }
}
