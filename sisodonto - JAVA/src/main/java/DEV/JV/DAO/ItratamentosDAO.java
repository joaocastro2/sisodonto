package DEV.JV.DAO;

import DEV.JV.MODEL.tratamentosMODEL;

import java.util.List;
import java.util.Optional;

public interface ItratamentosDAO {

    tratamentosMODEL save (tratamentosMODEL tratamentos);
    tratamentosMODEL update (tratamentosMODEL tratamentos);
    void delete (int idTratamento);
    List<tratamentosMODEL> findALL();
    Optional<tratamentosMODEL> findById (int idTratamento);

}
