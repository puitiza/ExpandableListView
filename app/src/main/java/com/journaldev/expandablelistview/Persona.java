package com.journaldev.expandablelistview;

public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private  String ex;

    public Persona(String nombre, String apellido, int edad, String ex) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.ex = ex;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEx() {
        return ex;
    }

    public void setEx(String ex) {
        this.ex = ex;
    }
}
