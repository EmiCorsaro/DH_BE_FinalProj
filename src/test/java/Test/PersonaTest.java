package Test;

import Modelos.Persona;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonaTest {

    @Test
    void getApellido() {
        Persona persona = new Persona("Martinez","Marcos");
        assertEquals("Martinez", persona.getApellido());
    }

    @Test
    void setApellido() {
        Persona persona = new Persona("Martinez","Marcos");
        persona.setApellido("Gonzalez");
        assertEquals("Gonzalez", persona.getApellido());
    }

    @Test
    void getNombre() {
        Persona persona = new Persona("Martinez","Marcos");
        assertEquals("Marcos", persona.getNombre());
    }

    @Test
    void setNombre() {
        Persona persona = new Persona("Martinez","Marcos");
        persona.setNombre("Lucas");
        assertEquals("Lucas", persona.getNombre());
    }
}