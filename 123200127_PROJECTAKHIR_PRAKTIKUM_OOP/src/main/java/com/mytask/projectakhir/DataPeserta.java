/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mytask.projectakhir;

import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author WINDOWS 10
 */
public class DataPeserta {
    
    String nama;
    String kotaAsal;
    String sekolahAsal;
    String tempatTest;
    String univTujuan;
    String jurusanTujuan;
    int thnKelahiran;
    String blnKelahiran;
    int tanggalLahir;
    int nisn;
    
    void inputData(
            String nama,
            String kotaAsal, 
            String sekolahAsal, 
            String tempatTest,
            String univTujuan,
            String  jurusanTujuan,
            int thnKelahiran,
            String blnKelahiran,
            int tanggalLahir,
            int nisn
    )throws Exception{
        InputData id = new InputData();
        id.inputData(nama,kotaAsal,sekolahAsal,tempatTest,univTujuan,jurusanTujuan,
        thnKelahiran,blnKelahiran,tanggalLahir, nisn);
        id.closeData();
    
    }
    
    public void cariData(int nisn, JLabel a,JLabel b,JLabel c,JLabel d, JLabel e, JLabel f, JLabel g) throws Exception{
        InputData id = new InputData();
        id.getData(nisn, a, b, c, d, e, f, g);
        id.closeData();
    }

    void cariData(JTextField carinisn, JLabel jLabel1, JLabel jLabel10, JLabel jLabel11, JLabel jLabel12, JLabel jLabel13, JLabel jLabel14, JLabel jLabel15) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    

}
