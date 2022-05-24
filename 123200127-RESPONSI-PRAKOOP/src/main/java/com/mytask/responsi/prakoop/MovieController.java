/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mytask.responsi.prakoop;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author WINDOWS 10
 */
public class MovieController {
    
    MovieView mv; 
    ModelApp ma;

    public MovieController()throws Exception{
        this.mv = new MovieView();
        this.ma = new ModelApp();
        
        mv.btnTambah.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                double nilai;
                double alur = Double.valueOf(mv.getAlur()); 
                double penokohan = Double.valueOf(mv.getPenokohan()); 
                double akting = Double.valueOf(mv.getAkting()); 
                nilai = (alur +  penokohan+ akting)/3;
                try {
                    ma.insertData(mv.getJudul(), alur ,penokohan, akting ,nilai);
                } catch (Exception ex) {
                    Logger.getLogger(MovieController.class.getName()).log(Level.SEVERE, null, ex);
                }
                        
            }
            
        });
        mv.btnReset.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    mv.clearData();
                } catch (Exception ex) {
                    Logger.getLogger(MovieController.class.getName()).log(Level.SEVERE, null, ex);
                }
                        
            }
            
        });
        mv.btnDelete.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                double nilai;
                double alur = Double.valueOf(mv.getAlur()); 
                double penokohan = Double.valueOf(mv.getPenokohan()); 
                double akting = Double.valueOf(mv.getAkting()); 
                nilai = (alur +  penokohan+ akting)/3;
                try {
                    ma.deleteData(mv.getJudul());
                } catch (Exception ex) {
                    Logger.getLogger(MovieController.class.getName()).log(Level.SEVERE, null, ex);
                }                        
            }
            
        });
        mv.btnUpdate.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                double nilai;
                double alur = Double.valueOf(mv.getAlur()); 
                double penokohan = Double.valueOf(mv.getPenokohan()); 
                double akting = Double.valueOf(mv.getAkting()); 
                nilai = (alur +  penokohan+ akting)/3;
                try {
                    ma.updateData(mv.getJudul(), alur ,penokohan, akting ,nilai);
                } catch (Exception ex) {
                    Logger.getLogger(MovieController.class.getName()).log(Level.SEVERE, null, ex);
                }
                        
            }
            
        });
    }
    
}
