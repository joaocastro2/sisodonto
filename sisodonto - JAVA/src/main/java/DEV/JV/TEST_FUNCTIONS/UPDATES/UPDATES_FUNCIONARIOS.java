package DEV.JV.TEST_FUNCTIONS.UPDATES;

import DEV.JV.DAO.funcionariosDAO;
import DEV.JV.MODEL.funcionariosMODEL;

import java.util.Optional;

public class UPDATES_FUNCIONARIOS {

    public static void main(String[] args) {

        funcionariosDAO funcionarios = new funcionariosDAO();
        Optional<funcionariosMODEL> funcionariosMODELOptional = funcionarios.findByCpf("33333333333");

        funcionariosMODEL funcionario = funcionariosMODELOptional.get();
        System.out.println("CPF: " + funcionario.getCpfFuncionario());
        System.out.println("NOME: " + funcionario.getNomeFuncionario());
        System.out.println("SETOR: " + funcionario.getSetor().toString());
        System.out.println("TELEFONE: " + funcionario.getTelefone());
        System.out.println("EMAIL: " + funcionario.getEmail());
        System.out.println("CEP: " + funcionario.getCep());
        System.out.println("ENDEREÇO" + funcionario.getEndereco());
        System.out.println("NASC: " + funcionario.getDataNascimento());
        System.out.println("ADIMISSÃO: " + funcionario.getDataAdimissao());

        //funcionario.setNomeFuncionario("kg");
        //funcionarios.update(funcionario);

    }

}
