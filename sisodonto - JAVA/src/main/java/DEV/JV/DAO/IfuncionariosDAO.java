package DEV.JV.DAO;

import DEV.JV.CLASSES_ENUM.tiposTratamento;
import DEV.JV.MODEL.funcionariosMODEL;
import DEV.JV.MODEL.tratamentosMODEL;

import java.util.List;
import java.util.Optional;

public interface IfuncionariosDAO {

    funcionariosMODEL save (funcionariosMODEL funcionarios);
    funcionariosMODEL update (funcionariosMODEL funcionarios);
    void delete (String cpfFuncionario);
    List<tratamentosMODEL> findAll();
    Optional<funcionariosMODEL> findByCpf (String cpfFuncionario);

}
