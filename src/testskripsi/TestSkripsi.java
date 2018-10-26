/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testskripsi;

import appConfig.ConfigApp;
import appFrm.MainView;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import twitter4j.GeoLocation;
import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Status;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

/**
 *
 * @author sayam
 */
public class TestSkripsi {
    
    public static Connection conn;
    public static Statement stmt;

    /**
     * @param args the command line arguments
     * @throws twitter4j.TwitterException
     */
    public static void main(String[] args) throws TwitterException {
        // Configuration
        ConfigurationBuilder cb =  new ConfigurationBuilder();

        
        try {
            String url = "jdbc:mysql://localhost/skripskuy";
            String user = "root";
            String pass = "";
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(url, user, pass);
            stmt = (Statement) conn.createStatement();
            System.out.println("Success");      
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println("Fail Connection "+e.getMessage());
        }
        
        new MainView().setVisible(true);
        
    }
}
