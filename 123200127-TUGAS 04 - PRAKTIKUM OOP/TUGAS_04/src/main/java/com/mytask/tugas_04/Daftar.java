/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mytask.tugas_04;

import java.sql.*;

/**
 *
 * @author WINDOWS 10
 */
public class Daftar extends Login{
    
    Daftar(){
        super();
    }
    
    public int inputDB(String username, String password){
        int check = super.checkLogin(username, password);
        if(check == 10){
        try{
             this.st = conn.createStatement();
             this.st.execute("INSERT INTO user VALUES(null,'" + username + "','" + password + "')");
            }catch(Exception  er){
                System.err.println(er);
                return 44;
            }
        }
        return check;
    }
}
