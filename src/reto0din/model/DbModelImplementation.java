/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto0din.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author iorit
 */
public class DbModelImplementation implements Model{
    private Connection conex;
    private PreparedStatement stmt;
    private ResourceBundle configFile;
    private String url;
    private String user;
    private String password;
    private final String SEARCHgreeting = "SELECT * FROM greeting";
    
    public DbModelImplementation(){
        this.configFile = ResourceBundle.getBundle("reto0din.model.dbconfig");
        this.url = configFile.getString("Conn");
        this.user = configFile.getString("DBUser");
        this.password = configFile.getString("DBPass");
        
    }
    
    public void openConnection(){
        try {
            conex = DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void closeConnection() throws SQLException{
        if (conex != null) {
            conex.close();
        }
        if(stmt != null){
            conex.close();
        }
    }
    
    @Override
    public String getGreeting() {
        ResultSet rs = null;
        String greeting = null;
        
        this.openConnection();
        try {
            stmt = conex.prepareStatement(SEARCHgreeting);
            rs = stmt.executeQuery();
            
            if (rs.next()) {
                greeting = rs.getString(1);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally{
            try {
                closeConnection();
                if(rs != null){
                    rs.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        
        
        return greeting;
    }
    
}
