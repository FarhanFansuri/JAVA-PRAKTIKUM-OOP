/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mytask.tugas_04;

/**
 *
 * @author WINDOWS 10
 */

import java.sql.*;
        
public class Login {
    
    String URL = "jdbc:mysql://localhost/tugasjdbc";
    String username = "root";
    String password = "";
    String driver = "com.mysql.jdbc.Driver";
    Connection conn;
    Statement st;
    ResultSet result;
    
    Login(){
        try{
            Class.forName(driver);
            this.conn = DriverManager.getConnection(this.URL,this.username,this.password);
            System.out.println("Konesksi Berhasil");
        }catch(Exception er){
            System.err.println("Koneksi Error");
        }
    
    }
    
    public int checkLogin(String username, String password){
    
            try{
             this.st = conn.createStatement();
             this.result = this.st.executeQuery("SELECT * FROM user");
             while(this.result.next()){
                String un =  this.result.getString("username");
                String ps = this.result.getString("password");
                
                //0 = username dan password benar, 1 =  password salah, 2 = password dan username tidak ada
                
                if(un.equals(username)){
                    if(ps.equals(password)){
                        return 0;
                    }else{
                        return 1;
                    }
                }
        }
            }catch(Exception  er){
                System.err.println("error");
            }
        return 10;
    }
    
}
