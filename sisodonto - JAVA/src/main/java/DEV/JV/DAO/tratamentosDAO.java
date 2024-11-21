package DEV.JV.DAO;

import DEV.JV.MODEL.tratamentosMODEL;

import java.util.List;
import java.util.Optional;

public class tratamentosDAO implements ItratamentosDAO{


    @Override
    public tratamentosMODEL save(tratamentosMODEL tratamentos) {
        return null;
    }

    @Override
    public tratamentosMODEL update(tratamentosMODEL tratamentos) {
        return null;
    }

    @Override
    public void delete(int idTratamento) {

    }

    @Override
    public List<tratamentosMODEL> findALL() {
        return List.of();
    }

    @Override
    public Optional<tratamentosMODEL> findById(int idTratamento) {
        return Optional.empty();
    }
}
