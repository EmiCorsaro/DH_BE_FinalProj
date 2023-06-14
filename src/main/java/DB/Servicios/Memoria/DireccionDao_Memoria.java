package DB.Servicios.Memoria;

import DB.Interfaces.IDao;
import Modelos.Dirección;
import Modelos.Odontologo;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class DireccionDao_Memoria implements IDao<Dirección> {
    private static final Logger logger = Logger.getLogger(DireccionDao_Memoria.class);
    private List<Dirección> direccionList;

    public DireccionDao_Memoria() {
        this.direccionList = new ArrayList<Dirección>();
    }

    @Override
    public List<Dirección> listar() {
        return this.direccionList;
    }

    @Override
    public Boolean agregar(Dirección dirección) {
        try{
            direccionList.add(dirección);
            logger.info("Dirección agregada");
            return true;
        }catch(Exception ex){
            logger.error(ex.getMessage());
        }
        return false;
    }

    @Override
    public Boolean modificar(Dirección dirección) {
        try {
            direccionList.remove(dirección);
            direccionList.add(dirección);
            logger.info("Dirección modificada");
            return true;
        }catch (Exception ex)
        {
            logger.error(ex.getMessage());
        }
        return false;
    }

    @Override
    public Boolean eliminar(Dirección dirección) {
        try {
            direccionList.remove(dirección);
            logger.info("Dirección eliminada");
            return true;
        }catch (Exception ex)
        {
            logger.error(ex.getMessage());
        }
        return false;
    }
}
