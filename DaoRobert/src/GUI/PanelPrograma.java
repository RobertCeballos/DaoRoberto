/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import CONTROLADOR.ControladorPrograma;
import ENTIDADES.Programa;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.util.LinkedList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.*;

/**
 *
 * @author roberacc
 */
public class PanelPrograma extends JPanel {

    JPanel panel;
    JScrollPane scroll;
    JTable tabla;
    DefaultTableModel modelo;
    ControladorPrograma program;
    Programa get;
    
    
    Object[] colum = {"Codigo", "Nombre", "Nivel", "Creditos"};
    // MainFrame ventana= new MainFrame();

    /**
     * Creates new form PanelPrograma
     */
    public PanelPrograma() {
        initComponents();
        jButtonEditar.setEnabled(false);

        get = new Programa();
        program = new ControladorPrograma();

        panel = new JPanel();
        tabla = new JTable();
        scroll = new JScrollPane(tabla);
        panel.add(scroll);
        //scroll.setBounds(20, 250, 540, 140);

        modelo = new DefaultTableModel(colum, 0);


        Object[] fila = new Object[3];
        modelo.addRow(fila);
        tabla.setModel(modelo);

        add(panel);
        panel.setBounds(20, 250, 455, 150);
        panel.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextCodigo = new javax.swing.JTextField();
        jTextNombre = new javax.swing.JTextField();
        jTextNivel = new javax.swing.JTextField();
        jTextCreditos = new javax.swing.JTextField();
        jButtonRegistrar = new javax.swing.JButton();
        jButtonLimpiar = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jButtonConsultar = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(800, 500));
        setLayout(null);

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel1.setText("GESTION DE PROGRAMAS");
        add(jLabel1);
        jLabel1.setBounds(120, 20, 230, 21);

        jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel2.setText("Codigo");
        add(jLabel2);
        jLabel2.setBounds(40, 90, 70, 18);

        jLabel3.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel3.setText("Nombre");
        add(jLabel3);
        jLabel3.setBounds(40, 130, 56, 18);

        jLabel4.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel4.setText("Nivel");
        add(jLabel4);
        jLabel4.setBounds(40, 170, 50, 18);

        jLabel5.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel5.setText("Creditos");
        add(jLabel5);
        jLabel5.setBounds(40, 210, 80, 18);
        add(jTextCodigo);
        jTextCodigo.setBounds(150, 85, 90, 25);
        add(jTextNombre);
        jTextNombre.setBounds(150, 125, 120, 25);
        add(jTextNivel);
        jTextNivel.setBounds(150, 165, 90, 25);
        add(jTextCreditos);
        jTextCreditos.setBounds(150, 205, 90, 25);

        jButtonRegistrar.setFont(new java.awt.Font("Ubuntu", 1, 12)); // NOI18N
        jButtonRegistrar.setText("GUARDAR");
        jButtonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistrarActionPerformed(evt);
            }
        });
        add(jButtonRegistrar);
        jButtonRegistrar.setBounds(320, 80, 110, 30);

        jButtonLimpiar.setFont(new java.awt.Font("Ubuntu", 1, 12)); // NOI18N
        jButtonLimpiar.setText("LIMPIAR");
        jButtonLimpiar.setMaximumSize(new java.awt.Dimension(87, 30));
        jButtonLimpiar.setMinimumSize(new java.awt.Dimension(87, 30));
        jButtonLimpiar.setPreferredSize(new java.awt.Dimension(87, 30));
        jButtonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimpiarActionPerformed(evt);
            }
        });
        add(jButtonLimpiar);
        jButtonLimpiar.setBounds(320, 200, 110, 30);

        jButtonEditar.setFont(new java.awt.Font("Ubuntu", 1, 12)); // NOI18N
        jButtonEditar.setText("EDITAR");
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });
        add(jButtonEditar);
        jButtonEditar.setBounds(320, 160, 110, 27);

        jButtonConsultar.setFont(new java.awt.Font("Ubuntu", 1, 12)); // NOI18N
        jButtonConsultar.setText("CONSULTAR");
        jButtonConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsultarActionPerformed(evt);
            }
        });
        add(jButtonConsultar);
        jButtonConsultar.setBounds(320, 120, 110, 30);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrarActionPerformed

        int salida;
        jTextCodigo.setEnabled(true);
        salida = program.registrarProgramaControl(jTextCodigo.getText(),
                jTextNombre.getText(),
                jTextNivel.getText(),
                jTextCreditos.getText());
        
        if (salida == 1) {
            Object[][] o = new Object[1][4];
            o[0][0] = jTextCodigo.getText();
            o[0][1] = jTextNombre.getText();
            o[0][2] = jTextNivel.getText();
            o[0][3] = jTextCreditos.getText();
            
            modelo = new DefaultTableModel(o, colum);
            tabla.setModel(modelo);
            
            
            JOptionPane.showMessageDialog(null, "El Programa se Registro Correctamente!!");
        } else {
            JOptionPane.showMessageDialog(null, "Datos incorrectos");
        }
        jButtonEditar.setEnabled(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonRegistrarActionPerformed

    private void jButtonConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultarActionPerformed

        LinkedList list = new LinkedList();
        Object[][] o;
        String codigo = jTextCodigo.getText();
        String nombre = jTextNombre.getText();
        String nivel = jTextNivel.getText();
        String creditos = jTextCreditos.getText();

        o = program.consultarPrograma(codigo, nombre, nivel, creditos);       
            
        modelo = new DefaultTableModel(o, colum);
        tabla.setModel(modelo);
        tabla.setPreferredScrollableViewportSize(new Dimension(500, 70));
        //JScrollPane scroller= new JScrollPane(tabla);
        //getContentPane().add(scroller, BorderLayout.CENTER);
        tabla.setRowSorter(new TableRowSorter(modelo));

        //jTextCodigo.setEditable(false);
        jTextNombre.setEditable(false);
        jTextNivel.setEditable(false);
        jTextCreditos.setEditable(false);
        jButtonEditar.setEnabled(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonConsultarActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        // TODO add your handling code here:

        jTextCodigo.setEnabled(false);
        jTextNombre.setEditable(true);
        jTextNivel.setEditable(true);
        jTextCreditos.setEditable(true);
        jTextCodigo.setText(get.getCodigo());
        jTextNombre.setText(get.getNombre());
        jTextNivel.setText(get.getNivel());
        jTextCreditos.setText(get.getCreditos());

    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jButtonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpiarActionPerformed

        jTextCodigo.setEditable(true);
        jTextNombre.setEditable(true);
        jTextNivel.setEditable(true);
        jTextCreditos.setEditable(true);
        limpiarCampos();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonLimpiarActionPerformed

    public void limpiarCampos() {
        
        Object[][] empty= new Object[1][1];

        jTextCodigo.setText("");
        jTextNombre.setText("");
        jTextNivel.setText("");
        jTextCreditos.setText("");
        
        modelo = new DefaultTableModel(empty, colum);
            tabla.setModel(modelo);

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonConsultar;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonLimpiar;
    private javax.swing.JButton jButtonRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextCodigo;
    private javax.swing.JTextField jTextCreditos;
    private javax.swing.JTextField jTextNivel;
    private javax.swing.JTextField jTextNombre;
    // End of variables declaration//GEN-END:variables
}
