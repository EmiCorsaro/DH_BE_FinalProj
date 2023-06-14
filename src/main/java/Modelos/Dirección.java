package Modelos;

public class Dirección implements Comparable<Dirección> {
    private String Calle;
    private String Altura;
    private String Localidad;
    private String Provincia;
    public Dirección(String calle, String altura, String localidad, String provincia) {
        Calle = calle;
        Altura = altura;
        Localidad = localidad;
        Provincia = provincia;
    }

    public String getCalle() {
        return Calle;
    }

    public void setCalle(String calle) {
        Calle = calle;
    }
    public String getAltura() {
        return Altura;
    }

    public void setAltura(String altura) {
        Altura = altura;
    }

    public String getLocalidad() {
        return Localidad;
    }

    public void setLocalidad(String localidad) {
        Localidad = localidad;
    }

    public String getProvincia() {
        return Provincia;
    }

    public void setProvincia(String provincia) {
        Provincia = provincia;
    }

    @Override
    public int compareTo(Dirección o) {
        if(this.Calle == o.Calle && this.Altura == o.Altura && this.Localidad == o.Localidad && this.Provincia == o.Provincia){
            return 0;
        }
        return 1;
    }
}
