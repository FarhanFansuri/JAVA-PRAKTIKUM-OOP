/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mytask.responsi.prakoop;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.*;
/**
 *
 * @author WINDOWS 10
 */
public class ModelApp{
        String url = "jdbc:mysql://localhost/movie_db";
        String user = "root";
        String pass = "";
        Connection conn;
        String judul[];
        Double alur[];
        Double penokohan[];
        Double akting[];
        Double nilai[];
        
    ModelApp()throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        this.conn = DriverManager.getConnection(this.url,this.user,this.pass);
    }
    
    public void getData(DefaultTableModel tbl, JTable tab)throws Exception{
        String get = "SELECT * FROM movie"; 
        Statement st = this.conn.createStatement();
        ResultSet rs = st.executeQuery(get);
        while(rs.next()){
            if(tab.getSelectedRowCount() >= 1){
                tbl.removeRow(tab.getSelectedRow());
            }else{
                tbl.insertRow(tbl.getRowCount(),new Object[]{rs.getString("judul"),rs.getDouble("alur"),rs.getDouble("penokohan"),rs.getDouble("akting"),rs.getDouble("nilai")});
            }
        }
    }
    
    public void insertData(String judul, double alur, double penokohan, double akting, double nilai)throws Exception{
        String insert = "INSERT INTO movie VALUES('"+judul+"','"+alur+"','"+penokohan+"','"+akting+"','"+nilai+"')"; 
        Statement st = this.conn.createStatement();
        int rs = st.executeUpdate(insert);
    }
    
     public void updateData(String judul, double alur, double penokohan, double akting, double nilai)throws Exception{
        String insert = "UPDATE movie SET alur='"+alur+"',penokohan='"+penokohan+"',akting='"+akting+"',nilai='"+nilai+"' WHERE movie.judul='"+judul+"'"; 
        Statement st = this.conn.createStatement();
        int rs = st.executeUpdate(insert);
    }
     
      public void deleteData(String judul)throws Exception{
        String insert = "DELETE FROM movie WHERE judul='"+judul+"'"; 
        Statement st = this.conn.createStatement();
        int rs = st.executeUpdate(insert);
    }
    
    
}
