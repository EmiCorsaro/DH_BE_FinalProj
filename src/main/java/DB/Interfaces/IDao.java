package DB.Interfaces;

import java.util.List;

public interface IDao<T> {
    List<T> listar();
    Boolean agregar(T elemento);
    Boolean modificar(T elemento);
    Boolean eliminar(T elemento);

}
