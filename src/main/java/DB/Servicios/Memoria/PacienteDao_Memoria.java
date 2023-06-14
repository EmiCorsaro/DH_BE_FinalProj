package DB.Servicios.Memoria;

import DB.Interfaces.IDao;
import Modelos.Odontologo;
import Modelos.Paciente;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class PacienteDao_Memoria implements IDao<Paciente> {
    private static final Logger logger = Logger.getLogger(PacienteDao_Memoria.class);
    private List<Paciente> pacienteListList;

    public PacienteDao_Memoria() {
        this.pacienteListList = new ArrayList<Paciente>();
    }

    @Override
    public List<Paciente> listar() {
        logger.info("Listado de pacientes solicitado");
        return this.pacienteListList;
    }

    @Override
    public Boolean agregar(Paciente paciente) {
        try{
            pacienteListList.add(paciente);
            logger.info("Paciente agregado");
            return true;
        }catch(Exception ex){
            logger.error(ex.getMessage());
        }
        return false;
    }

    @Override
    public Boolean modificar(Paciente paciente) {
        try {
            pacienteListList.remove(paciente);
            pacienteListList.add(paciente);
            logger.info("Paciente modificado");
            return true;
        }catch (Exception ex)
        {
            logger.error(ex.getMessage());
        }
        return false;
    }

    @Override
    public Boolean eliminar(Paciente paciente) {
        try {
            pacienteListList.remove(paciente);
            logger.info("Paciente eliminado");
            return true;
        }catch (Exception ex)
        {
            logger.error(ex.getMessage());
        }
        return false;
    }
}
