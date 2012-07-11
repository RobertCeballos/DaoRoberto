package CONTROLADOR;

import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.*;

public class SimpleTable1 extends JFrame {
public SimpleTable1() {
super("Ejemplo 1");
//array bidimencional de objetos con los datos de la tabla
Object[][] data = {
{"Mary", "Campione", "Esquiar", new Integer(5), new Boolean(false)},
{"Lhucas", "Huml", "Patinar", new Integer(3), new Boolean(true)},
{"Kathya", "Walrath", "Escalar", new Integer(2), new Boolean(false)},
{"Marcus", "Andrews", "Correr", new Integer(7), new Boolean(true)},
{"Angela", "Lalth", "Nadar", new Integer(4), new Boolean(false)}
};
//array de String's con los títulos de las columnas
String[] columnNames = {"Nombre", "Apellido", "Pasatiempo",
"Años de Practica", "Soltero(a)"};
//se crea la Tabla
final JTable table = new JTable(data, columnNames);
table.setPreferredScrollableViewportSize(new Dimension(500, 70));
//Creamos un JscrollPane y le agregamos la JTable
JScrollPane scrollPane = new JScrollPane(table);
//Agregamos el JScrollPane al contenedor
getContentPane().add(scrollPane, BorderLayout.CENTER);
//manejamos la salida


addWindowListener(new WindowAdapter() {
public void windowClosing(WindowEvent e) {
System.exit(0);
}
});
}
public static void main(String[] args) {
SimpleTable1 frame = new SimpleTable1();
frame.pack();
frame.setVisible(true);
}
}