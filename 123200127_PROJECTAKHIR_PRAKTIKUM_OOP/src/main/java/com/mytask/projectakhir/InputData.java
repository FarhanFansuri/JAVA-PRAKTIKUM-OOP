/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mytask.projectakhir;
import java.sql.*;
import javax.swing.JLabel;
/**
 *
 * @author WINDOWS 10
 */
public class InputData{

        String url = "jdbc:mysql://localhost/peserta";
        String user = "root";
        String pass = "";
        Connection conn;
        Statement st; 
        String query1;
        String query2;
        
 
    InputData() throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        this.conn = DriverManager.getConnection(this.url,this.user,this.pass);
        this.st = conn.createStatement();
    }
    
    
    public void inputData(
            String nama,
            String kotaAsal,
            String sekolahAsal,
            String tempatTest,
            String kampusTujuan,
            String jurusanTujuan,
            int tahunLahir,
            String bulanLahir,
            int tanggalLahir,
            int nisn){
         try{
            this.query1 = "insert into data values('"+
                nama+"','"+ 
                kotaAsal+"','"+ 
                sekolahAsal+"','"+ 
                tempatTest+"','"+ 
                kampusTujuan+"','"+ 
                jurusanTujuan+"',"+
                tahunLahir+",'"+
                bulanLahir+"',"+
                tanggalLahir+","+
                nisn
                +",'Belum Mengikuti Test','Menunggu Hasil Test')";
             System.out.println(query1);
             
            this.st.executeUpdate(this.query1);
        }catch(Exception e){
             System.err.println(e);
        }
    }
    
    public void getData(int nisn, JLabel a,JLabel b,JLabel c,JLabel d, JLabel e, JLabel f, JLabel g){
         try{
            ResultSet rs = this.st.executeQuery("SELECT * FROM data WHERE nisn="+nisn);
            rs.next();
            a.setText(rs.getString("nama"));
            b.setText(String.valueOf(rs.getInt("nisn")));
            c.setText(rs.getString("tempat_test"));
            d.setText(rs.getString("kampus_tujuan"));
            e.setText(rs.getString("jurusan_tujuan"));
            f.setText(rs.getString("status_test"));
            g.setText(rs.getString("status_kelulusan"));
        }catch(SQLException err){
             System.err.println(err);
        }
    }
    
    public void closeData() throws SQLException{
        this.st.close();
        this.conn.close();
    }
        
}
