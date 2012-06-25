/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import ENTIDADES.Programa;
import java.sql.*;
import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author roberacc
 */
public class daoPrograma {
    
    Fachada fachada;
    
    public daoPrograma(){
        fachada= new Fachada();
        
    }
    
    public int registrarProgramaDao(Programa prog){
        
        String sql;
        int filas=0;
        
        sql="INSERT INTO programa VALUES('"+ prog.getCodigo()+"','"+ prog.getNombre()+"','"+
            prog.getNivel()+"',"+ prog.getCreditos()+")";
        System.out.println("codigo"+prog.getCodigo());
        
        try{
            Connection con= fachada.conectar();
            Statement sentencia= con.createStatement();
            
            filas=sentencia.executeUpdate(sql);
            con.close();
            return filas;
            
            
        }catch(SQLException e){ System.out.println(e); }
        catch(Exception e){ System.out.println(e); }
        return filas;
    }
    
    
//    public Programa consultarPrograma(String codigo){
//        System.out.println("Consul");
//        Programa p= new Programa();
//        ResultSet result;
//        String sql="SELECT codigo, nombre,nivel,creditos FROM programa WHERE codigo ='"+codigo+"'";
//        
//        try{
//            Connection con= fachada.conectar();
//            Statement sentencia= con.createStatement();
//            result= sentencia.executeQuery(sql);
//            
//            while(result.next()){
//                p.setCodigo(result.getString(1));
//                p.setNombre(result.getString(2));
//                p.setNivel(result.getString(3));
//                p.setCreditos(result.getString(4));
//                
//            }
//            
//        }catch(Exception ex){
//            System.out.println("SQLException: " + ex);        
//        }       
//        
//        return p;
//    }
    
    public ArrayList<Programa> consultarPrograma(String codigo, String nombre, String nivel, String creditos){
        System.out.println("ListConsul");
            ArrayList<Programa> lista = new ArrayList<Programa>();
            Programa p = new Programa();
            
            String sql = "SELECT * FROM programa     ";
            
            if(!codigo.isEmpty() || !nombre.isEmpty() || !nivel.isEmpty() || !creditos.isEmpty())
                sql += "WHERE "; 
            
            if(!codigo.isEmpty()){
                sql += "codigo = '"+codigo+"' AND ";
            }
            if (!nombre.isEmpty()) {
            sql += "nombre LIKE '%" + nombre + "%' AND ";
            }
            if (!nivel.isEmpty()) {
            sql += "nivel LIKE '%" + nivel + "%' AND ";
            }
            if (!creditos.isEmpty()) {
            sql += "creditos = " + creditos + " AND ";
            }
            sql = sql.substring(0, sql.length() - 5);
            
            try{
                Connection con = fachada.conectar();
                Statement sentencia = con.createStatement();
                ResultSet result = sentencia.executeQuery(sql);
                
                while(result.next()){
                    p.setCodigo(result.getString(1));
                    p.setNombre(result.getString(2));
                    p.setNivel(result.getString(3));
                    p.setCreditos(result.getString(4));
                    
                    lista.add(p);
                    
                }
                
            }catch(Exception e){
                System.out.println("SQLException: " + e);
            }                      
    
    return lista;
    }
    
}

