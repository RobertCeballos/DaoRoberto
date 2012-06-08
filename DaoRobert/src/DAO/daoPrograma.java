/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import ENTIDADES.Programa;
import java.sql.*;

/**
 *
 * @author roberacc
 */
public class daoPrograma {
    
    Fachada fachada;
    
    public daoPrograma(){
        fachada= new Fachada();
        
    }
    
    public int registrarPrograma(Programa prog){
        
        String sql;
        int filas=0;
        
        sql="INSERT INTO programa VALUES('"+ prog.getCodigo()+"','"+ prog.getNombre()+"','"+
            prog.getNivel()+"',"+ prog.getCreditos()+")";
        System.out.println("codigo"+prog.getCodigo());
        
        try{
            System.out.println("sii");
            Connection con= fachada.conectar();
            Statement sentencia= con.createStatement();
            
            filas=sentencia.executeUpdate(sql);
            con.close();
            return filas;
            
            
        }catch(SQLException e){ System.out.println(e); }
        catch(Exception e){ System.out.println(e); }
        return -1;
    }
    
    public int consultarPrograma(){
        
        return 0;
    }
    
}

