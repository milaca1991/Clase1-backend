package com.backend.digitalhouse;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GrupoTest {

    //crear el nuevo grupo para probar test
    private final Grupo grupo= new Grupo("camada4");

    @Test

    //agregar el metodo con un nombre que describa lo que se va hacer
    void alIntentarAgregar5PersonaS_debeAgregar2() {


        //arrange
//creamos las 5 personas que vamos a agregar
        Persona persona1 = new Persona("cami",20);
        Persona persona2 = new Persona("diego",21);
        Persona persona3 = new Persona("vale",10);
        Persona persona4 = new Persona("emi",15);
        Persona persona5 = new Persona("pipe",12);
        //act
//agregamos las 5 personas

        grupo.agregarPersona(persona1);
        grupo.agregarPersona(persona2);
        grupo.agregarPersona(persona3);
        grupo.agregarPersona(persona4);
        grupo.agregarPersona(persona5);
        //assert
//usamos metodo assertequals para vaidar si pasa la prueba o no, este metodo usa como primer parametro el numero esperado, y el numero actual
        //por eso el 2 parametro traemos total de personas y con size tomamos su tamaño
        assertEquals(2,grupo.getPersonas().size());

    }
}