package com.mycompany.registroalumnos.metodos;

import com.mycompany.registroalumnos.TAlumno;
import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.table.*;

/**
 *
 * @author Felipe
 */
public class Metodos {
    
    Vector vPrincipal = new Vector();
    
    //guardar alumno en el vector
    
    public void guardar(TAlumno unAlumno){
        vPrincipal.addElement(unAlumno);
    }
    
    public void guardarArchivo(TAlumno alumno){
        
        //Creamos un archivo escribiendo en el buffer y luego escribiendo en el archivo 
        try{
            FileWriter fw = new FileWriter("Alumnos.txt",true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            pw.print(alumno.getNombre());
            pw.print("|"+alumno.getApellido());
            pw.print("|"+alumno.getDni());
            pw.print("|"+alumno.getMateria());
            pw.println("|"+alumno.getLnota());
            pw.close();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }
    
    public DefaultTableModel listaAlumnos(){
        Vector cabeceras = new Vector();
        cabeceras.addElement("Nombre");
        cabeceras.addElement("Apellido");
        cabeceras.addElement("Dni");
        cabeceras.addElement("Materia");
        cabeceras.addElement("Nota");
        
        DefaultTableModel mdlTabla = new DefaultTableModel(cabeceras,0);
        
        //leer datos de el archivo que guardamos
        
        try{
            FileReader fr = new FileReader("Alumnos.txt");
            BufferedReader br = new BufferedReader (fr);
            String d;
            //leer archivo (que si tenga datos el buffer - le ponemos datos simbolo "|"
            while((d=br.readLine())!=null){
                StringTokenizer dato = new StringTokenizer(d,"|");
                Vector x = new Vector();
                while(dato.hasMoreTokens()){
                    x.addElement(dato.nextToken());
                }
                mdlTabla.addRow(x);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }        
        return mdlTabla;
    }
    
    
}
    
