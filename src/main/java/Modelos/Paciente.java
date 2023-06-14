package Modelos;

import java.util.Date;

public class Paciente extends Persona{
    private Dirección domicilio;
    private String DNI;
    private Date fechaAlta;
    public Paciente(String apellido, String nombre, Dirección domicilio, String DNI, Date fechaAlta) {
        super(apellido, nombre);
        this.domicilio = domicilio;
        this.DNI = DNI;
        this.fechaAlta = fechaAlta;
    }
    public Dirección getDomicilio() {
        return domicilio;
    }
    public void setDomicilio(Dirección domicilio) {
        this.domicilio = domicilio;
    }
    public String getDNI() {
        return DNI;
    }
    public void setDNI(String DNI) {
        this.DNI = DNI;
    }
    public Date getFechaAlta() {
        return fechaAlta;
    }
    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }
}
