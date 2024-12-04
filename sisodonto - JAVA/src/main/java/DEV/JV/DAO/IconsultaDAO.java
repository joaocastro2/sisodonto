package DEV.JV.DAO;

import DEV.JV.MODEL.consultaMODEL;

import java.util.List;
import java.util.Optional;

public interface IconsultaDAO {

    consultaMODEL save(consultaMODEL consulta);
    consultaMODEL update(consultaMODEL consulta);
    void delete(Long idConsulta);
    List<consultaMODEL> findAll();
    Optional<consultaMODEL> findById(Long idConsulta);

}
