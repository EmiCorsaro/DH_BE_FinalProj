package Test;

import Modelos.Dirección;
import Modelos.Paciente;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class PacienteTest {

    private static Date getDate(int year, int month, int day) {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, year);
        cal.set(Calendar.MONTH, month);
        cal.set(Calendar.DAY_OF_MONTH, day);
        return cal.getTime();
    }
    @Test
    void getDomicilio() {
        Paciente paciente = new Paciente("Lopez","Martin", new Dirección("Av. del Libertador","1234", "CABA", "Buenos Aires"), "12456789", getDate(2022,6,10));
        Boolean resultadoComparacion = paciente.getDomicilio().compareTo(new Dirección("Av. del Libertador","1234", "CABA", "Buenos Aires")) == 0;
        assertEquals(true,resultadoComparacion);
    }

    @Test
    void setDomicilio() {
        Paciente paciente = new Paciente("Lopez","Martin", new Dirección("Av. del Libertador","1234", "CABA", "Buenos Aires"), "12456789", getDate(2022,6,10));
        paciente.setDomicilio(new Dirección("Av. del Libertador","2312", "CABA", "Buenos Aires"));
        Boolean resultadoComparacion = paciente.getDomicilio().compareTo(new Dirección("Av. del Libertador","2312", "CABA", "Buenos Aires")) == 0;
        assertEquals(true,resultadoComparacion);
    }

    @Test
    void getDNI() {
        Paciente paciente = new Paciente("Lopez","Martin", new Dirección("Av. del Libertador","1234", "CABA", "Buenos Aires"), "12456789", getDate(2022,6,10));
        assertEquals("12456789", paciente.getDNI());
    }

    @Test
    void setDNI() {
        Paciente paciente = new Paciente("Lopez","Martin", new Dirección("Av. del Libertador","1234", "CABA", "Buenos Aires"), "12456789", getDate(2022,6,10));
        paciente.setDNI("987654321");
        assertEquals("987654321", paciente.getDNI());
    }

    @Test
    void getFechaAlta() {
        Paciente paciente = new Paciente("Lopez","Martin", new Dirección("Av. del Libertador","1234", "CABA", "Buenos Aires"), "12456789", getDate(2022,6,10));
        assertEquals(getDate(2022,6,10), paciente.getFechaAlta());
    }

    @Test
    void setFechaAlta() {
        Paciente paciente = new Paciente("Lopez","Martin", new Dirección("Av. del Libertador","1234", "CABA", "Buenos Aires"), "12456789", getDate(2022,6,10));
        paciente.setFechaAlta(getDate(2022,7,15));
        assertEquals(getDate(2022,7,15), paciente.getFechaAlta());
    }
}