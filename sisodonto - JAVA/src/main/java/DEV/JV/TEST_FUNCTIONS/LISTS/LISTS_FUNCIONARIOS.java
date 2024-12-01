package DEV.JV.TEST_FUNCTIONS.LISTS;

import DEV.JV.DAO.funcionariosDAO;
import DEV.JV.MODEL.funcionariosMODEL;

import java.util.Optional;

public class LISTS_FUNCIONARIOS {

    public static void main(String[] args) {
        funcionariosDAO dao = new funcionariosDAO();
        Optional<funcionariosMODEL> funcionariosMODELOptional = dao.findByCpf("77777777777");

        funcionariosMODELOptional.ifPresent(funcionariosMODEL -> {
              System.out.println("ID: " + funcionariosMODEL.getIdFuncionario());
              System.out.println("CPF: " + funcionariosMODEL.getCpfFuncionario());
              System.out.println("NOME: " + funcionariosMODEL.getNomeFuncionario());
              System.out.println("SETOR: " + funcionariosMODEL.getSetor());
        });
    }
}
