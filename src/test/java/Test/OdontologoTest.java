package Test;

import Modelos.Odontologo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OdontologoTest {

    @Test
    void getMatricula() {
        Odontologo odontologo = new Odontologo("Perez","Juan","123456");
        assertEquals("123456", odontologo.getMatricula());
    }

    @Test
    void setMatricula() {
        Odontologo odontologo = new Odontologo("Perez","Juan","123456");
        odontologo.setMatricula("654321");
        assertEquals("654321", odontologo.getMatricula());
    }
}