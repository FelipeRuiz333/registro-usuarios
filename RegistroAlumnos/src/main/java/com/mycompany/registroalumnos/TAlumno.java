package com.mycompany.registroalumnos;


public class TAlumno {
    
    private String nombre;
    private String apellido;
    private String dni;
    private String materia;
    private int nota;
    private String lnota;

    

    public TAlumno(String nombre, String apellido, String dni, String materia, int nota, String lnota) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.materia = materia;
        this.nota = nota;
        this.lnota = lnota;
    }
    
    public TAlumno(){
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }
    
    public String getLnota() {
        return lnota;
    }

    public void setLnota(String lnota) {
        this.lnota = lnota;
    }
    
    
}
