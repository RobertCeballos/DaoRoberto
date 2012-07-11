/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLADOR;

import DAO.daoPrograma;
import ENTIDADES.Programa;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

/**
 *
 * @author roberacc
 */
public class ControladorPrograma {
    
    ArrayList<Programa> programa;
    daoPrograma daoPro;
    
    
    
    
    public ControladorPrograma(){
        daoPro = new daoPrograma();
        //programa= new Programa();
        
    }
    
    public int registrarProgramaControl(String codigo, String nombre, String nivel, String creditos){
        int out;
        Programa prog = new Programa();
        
        prog.setCodigo(codigo);
        prog.setNombre(nombre);
        prog.setNivel(nivel);
        prog.setCreditos(creditos);
        
        out=daoPro.registrarProgramaDao(prog);
        
        return out;
    }
    
    public int registrarPrograma(){
        
        return 0;
    }
    
    public Object[][] consultarPrograma(String codigo, String nombre, String nivel, String creditos){
        if (!creditos.isEmpty()) {
            try {
                Integer.parseInt(creditos);
            } catch (NumberFormatException numberFormatException) {
                return null;
            }
        }
        Programa get = new Programa();
        programa=daoPro.consultarPrograma(codigo, nombre, nivel, creditos);
        Object[][] o= new Object[programa.size()][4];
        
        for (int i = 0; i < programa.size(); i++) {
        get = (Programa) programa.get(i);
            o[i][0] = get.getCodigo();
            o[i][1] = get.getNombre();
            o[i][2] = get.getNivel();
            o[i][3] = get.getCreditos();
        }
        System.out.println("salida="+o.length);
        return o;
    }
    
    public int eliminarPrograma(String codigo){
        int out=0;
        
        out=daoPro.eliminarPrograma(codigo);
        System.out.println("salida1="+out);
        return out;
    }
    
    public int EditarPrograma(String codigo){
        
        return 0;
    }
    
    
    
    
}
