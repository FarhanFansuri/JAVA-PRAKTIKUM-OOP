package com.task.src;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
//            System.out.print("Masukan data  ");
//            int data = input.nextInt();
//            System.out.print(data);
        
        //Deklarasi
            Konversi task = new Konversi();
            double  data;
            int opsi;
            boolean kondisi = true;


            //Penugasan
                System.out.println("Input Data");
                System.out.println("------------------");
                System.out.print("Masukan data dalam celcius : ");
                data = input.nextDouble();
            while (kondisi){
                System.out.println();
                System.out.println("Opsi");
                System.out.println("1. Lihat data konversi");
                System.out.println("2. Edit data konversi");
                System.out.println("3. Exit");
                System.out.println("-------------------");
                System.out.print("Input Pilihan : ");
                opsi = input.nextInt();
                switch (opsi){
                    case 1:
                        task.convert(data);
                        break;
                    case 2:
                        System.out.println();
                        System.out.println("Input Data");
                        System.out.println("------------------");
                        System.out.print("Masukan data dalam celcius : ");
                        data = input.nextDouble();
                        break;
                    case 3:
                        kondisi = false;
                        break;
                    default:
                        System.out.println("Pilihan tidak ada!!!");
                        break;
                }
            }
        System.out.println("---------- Program Selesai ----------");
    }
    
}
