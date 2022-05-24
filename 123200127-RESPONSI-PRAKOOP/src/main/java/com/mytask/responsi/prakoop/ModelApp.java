/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mytask.responsi.prakoop;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
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
    
    public void getData(DefaultTableModel tbl)throws Exception{
        String get = "SELECT * FROM movie"; 
        Statement st = this.conn.createStatement();
        ResultSet rs = st.executeQuery(get);
        while(rs.next()){
            tbl.insertRow(tbl.getRowCount(),new Object[]{rs.getString("judul"),rs.getDouble("alur"),rs.getDouble("penokohan"),rs.getDouble("akting"),rs.getDouble("nilai")});
        }
    }
    
    public void inserData(String judul, double alur, double penokohan, double akting, double nilai)throws Exception{
        String insert = "INSERT INTO movie VALUES('"+judul+"',"+
                alur+","+
                akting+","+
                nilai+")"; 
        Statement st = this.conn.createStatement();
        int rs = st.executeUpdate(insert);
    }
    
    
}
