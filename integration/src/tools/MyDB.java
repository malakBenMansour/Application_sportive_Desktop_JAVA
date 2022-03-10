/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Aziz
 */
public class MyDB {
    final String url ="jdbc:mysql://localhost:3306/sport";
    final String login ="root";
    final String pwd="";
    private static MyDB instance;
    Connection connexion;
    
    
    private MyDB(){
        
        try {
            connexion = (Connection) DriverManager.getConnection(url, login, pwd);
            System.out.println("connexion etabli");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

    }
    
    public static MyDB getInstance(){
    if (instance == null)
        instance = new MyDB();
    return instance;
    }

    public Connection getConnexion() {
        return connexion;
    }
}
