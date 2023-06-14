package DB.Servicios.Memoria;
import org.apache.log4j.Logger;
import DB.Interfaces.IDao;
import Modelos.Odontologo;

import java.util.*;

public class OdontologoDao_Memoria implements IDao<Odontologo> {
    private static final Logger logger = Logger.getLogger(OdontologoDao_Memoria.class);
    private List<Odontologo> odontologoList;

    public OdontologoDao_Memoria() {
        this.odontologoList = new ArrayList<Odontologo>();
    }
        @Override
    public List<Odontologo> listar() {
        logger.info("Listado de odontologos solicitado");
        return this.odontologoList;
    }

    @Override
    public Boolean agregar(Odontologo odontologo) {
        try{
            odontologoList.add(odontologo);
            logger.info("Odontologo agregado");
            return true;
        }catch(Exception ex){
            logger.error(ex.getMessage());
        }
        return false;
    }

    @Override
    public Boolean modificar(Odontologo odontologo) {
        try {
            odontologoList.remove(odontologo);
            odontologoList.add(odontologo);
            logger.info("Odontologo modificado");
            return true;
        }catch (Exception ex)
        {
            logger.error(ex.getMessage());
        }
        return false;
    }
    @Override
    public Boolean eliminar(Odontologo odontologo) {
        try {
            odontologoList.remove(odontologo);
            logger.info("Odontologo eliminado");
            return true;
        }catch (Exception ex)
        {
            logger.error(ex.getMessage());
        }
        return false;
    }
}
