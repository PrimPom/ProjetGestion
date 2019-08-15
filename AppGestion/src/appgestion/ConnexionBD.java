/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appgestion;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Primous POMALEGNI
 */
public class ConnexionBD {
    private  String url = "";
    //private  String username = "";
  // private  String password = "";
    private  java.sql.Connection conn = null;
    private  java.sql.Statement Requete = null;
    private PreparedStatement RequetePreparee = null;

    public ConnexionBD() {
        //this.url="jdbc:mysql://localhost:3306/ProjetJava";
        
        //this.username="root";
        this.url="jdbc:sqlite:projetjava.sqlite";
    }

    /**
     *
     * @return 
     */
    public  Connection se_connecterBD(){
        try{
           /* Class.forName("com.mysql.jdbc.Driver");
           
            this.conn= DriverManager.getConnection(this.url, this.username, this.password);
            //this.Requete = conn.createStatement();*/
             System.out.println("Tag1");
             Class.forName("org.sqlite.JDBC");
             System.out.println("Tag2");
             this.conn= DriverManager.getConnection(this.url);
             this.Requete = conn.createStatement();
            
            System.out.println("Connexion etablie");
            return conn;
        }catch(ClassNotFoundException | SQLException e){
            return null;
        }
             
    }
    
    public ResultSet exec(String sql) {
        try {
            ResultSet rs;
          // this.RequetePreparee=this.conn.prepareStatement(sql);
            rs = this.Requete.executeQuery(sql);
            
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(ConnexionBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
      public void close() {
        try {
            this.Requete.close();
            this.conn.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(ConnexionBD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
