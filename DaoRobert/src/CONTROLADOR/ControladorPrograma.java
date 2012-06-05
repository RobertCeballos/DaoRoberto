/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLADOR;

import DAO.daoPrograma;
import ENTIDADES.Programa;

/**
 *
 * @author roberacc
 */
public class ControladorPrograma {
    
    Programa programa;
    daoPrograma daoPro;
    
    
    
    public ControladorPrograma(){
        
    }
    
    public void registrarPrograma(String codigo, String nombre, String nivel, String creditos){
        
        daoPro = new daoPrograma();
        programa= new Programa();
        
        programa.setCodigo(codigo);
        programa.setNombre(nombre);
        programa.setNivel(nivel);
        programa.setCreditos(creditos);
        
        daoPro.registrarPrograma(programa);
        
        
    }
    
}
