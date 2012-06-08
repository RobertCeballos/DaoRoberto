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
    
    public Programa consultarPrograma(String codigo){
        Programa p= new Programa();
        ResultSet result;
        System.out.println("aaaaa"+codigo);
        String sql="SELECT codigo, nombre,nivel,creditos FROM programa WHERE codigo ='"+codigo+"'";
        System.out.println("bbbbb"+codigo);
        
        try{
            Connection con= fachada.conectar();
            Statement sentencia= con.createStatement();
            result= sentencia.executeQuery(sql);
            
            while(result.next()){
                System.out.println("cccc"+codigo);
                p.setCodigo(result.getString(1));
                p.setNombre(result.getString(2));
                p.setNivel(result.getString(3));
                p.setCreditos(result.getString(4));
                System.out.println("ddddd"+codigo);
                System.out.println("ggggg"+result.getString(2));
                
            }
            
        }catch(Exception ex){
            System.out.println("SQLException: " + ex);        
        }       
        
        return p;
    }
    
}

