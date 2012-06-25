/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
/**
 *
 * @author roberacc
 */
public class Fachada {
    
    Connection con;
    Statement sentencia;
    ResultSet salida;
    String url,user,pass;

    
    Fachada(){
        
        url="jdbc:postgresql://pgsql:5432/roberacc";
        user="roberacc";
        pass="roberacc";
        
        //url="jdbc:postgresql://localhost:5432/robert";       
        //user="postgres";       
        //pass="robert";
       
    }
    
    public Connection conectar(){

        try{
            Class.forName("org.postgresql.Driver");
            
        }catch(Exception e){
            System.out.println("error en el driver");
        }
            System.out.println("Driver cargado correctamente");
        try{
            
            con=DriverManager.getConnection(url, user, pass);
                System.out.println("Conexion realizada");
            return con;
        }catch(Exception ex){
                System.out.println("error al conectar");
            return null;
        }       
        
    }
    
    public void cerrarConexion(Connection c){
            try{
                 c.close();
            } catch( Exception e ) {
                System.out.println( "No se pudo cerrar." );
            }
        }
    
}

