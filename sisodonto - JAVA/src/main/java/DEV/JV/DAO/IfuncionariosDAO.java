package DEV.JV.DAO;

import DEV.JV.MODEL.funcionariosMODEL;

import java.util.List;
import java.util.Optional;

public interface IfuncionariosDAO {

    funcionariosMODEL save (funcionariosMODEL funcionarios);
    funcionariosMODEL update (funcionariosMODEL funcionarios);
    void delete (String cpfFuncionario);
    List<funcionariosMODEL> findAll();
    Optional<funcionariosMODEL> findByCpf (String cpfFuncionario);

}
