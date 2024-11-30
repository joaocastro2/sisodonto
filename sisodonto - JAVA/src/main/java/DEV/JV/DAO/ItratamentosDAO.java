package DEV.JV.DAO;

import DEV.JV.CLASSES_ENUM.tiposTratamento;
import DEV.JV.MODEL.tratamentosMODEL;

import java.util.List;
import java.util.Optional;

public interface ItratamentosDAO {

    tratamentosMODEL save (tratamentosMODEL tratamentos);
    tratamentosMODEL update (tratamentosMODEL tratamentos);
    void delete (Long idTratamento);
    List<tratamentosMODEL> findAll();
    Optional<tratamentosMODEL> findById (Long idTratamento);
    List<tratamentosMODEL> findByCategoria(tiposTratamento categoria);

}
