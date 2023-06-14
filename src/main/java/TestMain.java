import API.Interfaces.IOdontologoServ;
import API.Servicios.OdontologoService;
import Modelos.Odontologo;
import org.apache.log4j.PropertyConfigurator;

import java.io.File;
import java.util.List;

public class TestMain {
    public static void main(String[] args) {
        File log4jfile = new File("config/log4j.properties");
        PropertyConfigurator.configure(log4jfile.getAbsolutePath());

        IOdontologoServ odontologoServ = new OdontologoService();
        List<Odontologo> odontologos = odontologoServ.listarOdontologos();
        for (Odontologo odontologo : odontologos) {
            System.out.println(odontologo.getApellido()+ ", " + odontologo.getNombre()+". Matrícula N°"+odontologo.getMatricula());
        }
    }
}
