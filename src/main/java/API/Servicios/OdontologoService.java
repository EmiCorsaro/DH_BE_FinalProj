package API.Servicios;

import API.Interfaces.IOdontologoServ;
import DB.Interfaces.IDao;
import DB.Servicios.Memoria.OdontologoDao_Memoria;
import Modelos.Odontologo;
import org.apache.log4j.Logger;

import java.util.List;

public class OdontologoService implements IOdontologoServ {
    IDao<Odontologo> odontologoDao;
    private static final Logger logger = Logger.getLogger(OdontologoService.class);
    public OdontologoService() {
        this.odontologoDao = new OdontologoDao_Memoria();
    }

    @Override
    public List<Odontologo> listarOdontologos() {
        logger.info("Servicio para listar los odontologos registrados");
        return odontologoDao.listar();
    }
}
