package Test;

import Modelos.Dirección;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DirecciónTest {
    @Test
    void getCalle() {
        Dirección dirección = new Dirección("Av. Santa Fe", "4500", "CABA", "Buenos Aires");
        assertEquals("Av. Santa Fe", dirección.getCalle());
    }

    @Test
    void setCalle() {
        Dirección dirección = new Dirección("Av. Santa Fe", "4500", "CABA", "Buenos Aires");
        dirección.setCalle("Av. Monroe");
        assertEquals("Av. Monroe", dirección.getCalle());
    }

    @Test
    void getAltura() {
        Dirección dirección = new Dirección("Av. Santa Fe", "4500", "CABA", "Buenos Aires");
        assertEquals("4500", dirección.getAltura());
    }

    @Test
    void setAltura() {
        Dirección dirección = new Dirección("Av. Santa Fe", "4500", "CABA", "Buenos Aires");
        dirección.setAltura("4501");
        assertEquals("4501", dirección.getAltura());
    }

    @Test
    void getLocalidad() {
        Dirección dirección = new Dirección("Av. Santa Fe", "4500", "CABA", "Buenos Aires");
        assertEquals("CABA", dirección.getLocalidad());
    }

    @Test
    void setLocalidad() {
        Dirección dirección = new Dirección("Av. Santa Fe", "4500", "CABA", "Buenos Aires");
        dirección.setLocalidad("GBA");
        assertEquals("GBA", dirección.getLocalidad());
    }

    @Test
    void getProvincia() {
        Dirección dirección = new Dirección("Av. Santa Fe", "4500", "CABA", "Buenos Aires");
        assertEquals("Buenos Aires", dirección.getProvincia());
    }

    @Test
    void setProvincia() {
        Dirección dirección = new Dirección("Av. Santa Fe", "4500", "CABA", "Buenos Aires");
        dirección.setProvincia("Cordoba");
        assertEquals("Cordoba", dirección.getProvincia());
    }
}