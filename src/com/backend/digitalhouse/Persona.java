package com.backend.digitalhouse;

public class Persona {

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = (edad);
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(String edad) {
        this.edad = Integer.parseInt(edad);
    }

    //se crean atributos


    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private String apellido;
    private String email;
    private int edad;
    private String nombre;
//atajo = alt+insert


}
