package com.backend.digitalhouse;

import java.util.ArrayList;
import java.util.List;

public class Grupo {



    private String nombre;
    private List<Persona> personas;


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public List<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(List<Persona> personas) {
        this.personas = personas;
    }



    public Grupo(String nombre) {
        this.nombre = nombre;
        this.personas = new ArrayList<>();
    }


    public boolean esMayor(int edad) {

        return edad>18;
    }

    public boolean cantidadLetras(String nombre){

        return nombre.length()>4;
    }

//crear metodo de agregar persona
    public void agregarPersona(Persona persona){
//el metodo es mayor se usa con el get de edad de persona
        if(esMayor(persona.getEdad())){
//añado las personas
            personas.add(persona);
            //respuesta del sistema
            System.out.println("se agrego a "+persona.getNombre()+" al grupo");
        } else {
            System.out.println("no se pudo agregar al grupo a" + persona.getNombre());
        }
    }
}






