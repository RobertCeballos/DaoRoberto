/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ENTIDADES;

/**
 *
 * @author roberacc
 */
public class Programa {
    String codigo;
    String nombre;
    String nivel;
    String creditos;
    
    public void setCodigo(String cod){
        codigo= cod;        
    }
    
    public void setNombre(String nom){
        nombre= nom;        
    }
    
    public void setNivel(String niv){
        nivel= niv;
    }
    
    public void setCreditos(String cred){
        creditos= cred;
    }
    
    public String getCodigo(){
        
        return codigo;
    }
    
    public String getNombre(){
            
        return nombre;    
    }
    
    public String getNivel(){
        
        return nivel;
    }
    
    public String getCreditos(){
        
        return creditos;
    }
    
    
}
