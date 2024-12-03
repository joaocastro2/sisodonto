package DEV.JV.TEST_FUNCTIONS.LISTS;

import DEV.JV.DAO.funcionariosDAO;
import DEV.JV.MODEL.funcionariosMODEL;

import java.util.List;
import java.util.Optional;

public class LISTS_FUNCIONARIOS {

    public static void main(String[] args) {

        funcionariosDAO dao = new funcionariosDAO();

        //Optional<funcionariosMODEL> funcionariosMODELOptional = dao.findByCpf("33333333333");

        //funcionariosMODELOptional.ifPresent(funcionariosMODEL -> {
        //      System.out.println("ID: " + funcionariosMODEL.getIdFuncionario());
        //      System.out.println("CPF: " + funcionariosMODEL.getCpfFuncionario());
        //      System.out.println("NOME: " + funcionariosMODEL.getNomeFuncionario());
        //      System.out.println("SETOR: " + funcionariosMODEL.getSetor());
        //});

        List<funcionariosMODEL> funcionarios = dao.findAll();
        for (funcionariosMODEL funcionario : funcionarios) {
            System.out.println("ID: " + funcionario.getIdFuncionario());
            System.out.println("CPF: " + funcionario.getCpfFuncionario());
            System.out.println("NOME: " + funcionario.getNomeFuncionario());
            System.out.println("SETOR: " + funcionario.getSetor());
            System.out.println("==================================================");

        }
    }
}
