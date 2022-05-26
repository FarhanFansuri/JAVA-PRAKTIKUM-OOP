/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mytask.projectakhir;
import java.sql.*;
/**
 *
 * @author WINDOWS 10
 */
public class main {

    public static void main(String[] args) throws Exception{
       String hostname = "jdbc:mysql://localhost/mahasiswa";
       String user = "root";
       String password = "";
       Class.forName("com.mysql.cj.jdbc.Driver");
       Connection conn = DriverManager.getConnection(hostname,user,password);
       Statement st = conn.createStatement();
       try{
            int rs = st.executeUpdate("insert into data values(12322112,'Gagam','Teknik Fisika')");
       }catch(Exception e){
            System.err.println("Gagal dikirim");
       }
       
    }
}
