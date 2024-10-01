package DEV.JV;

import DEV.JV.DAO.pacientesDAO;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class LISTS {
    public static void main(String[] args) {
        pacientesDAO dao = new pacientesDAO();


//######################################################################################################################
/**
 * LISTA TODOS OS PACIENTES PRESENTES NO BANCO DE DADOS!!!
 * (Para rodar este blobo de código, apague os "//"  das linhas 23 á 30 e execute o programa, logo após coloque todos os
 *  "//" no lugar e rode o próximo bloco de código que desejar...).
 */
//        List<pacientesMODEL> pacientes = dao.findAll();
//
//        for (pacientesMODEL paciente : pacientes) {
//            System.out.println("CPF: "+ paciente.getCpfPaciente());
//            System.out.println("NOME: "+ paciente.getNomePaciente());
//            System.out.println("NUMERO: "+ paciente.getTelefone());
//            System.out.println("==================================================");
//        }
//######################################################################################################################

//######################################################################################################################
/**
 *  LISTA O PACIENTE POR CPF!!!
 *  (Para rodar este bloco de código, apague os "//" das linhas 40 á 45, entre as aspas duplas digite o cpf do paciente
 *   no campo "findByCpf" e execute o programa, logo após coloque todas as "//" no lugar e rode o próximo bloco de
 *   código que desejar...).
 */
//          Optional<pacientesMODEL> pacientesMODELOptional = dao.findByCpf("09769734136");
//          pacientesMODELOptional.ifPresent(pacientesMODEL -> {
//              System.out.println("CPF: " + pacientesMODEL.getCpfPaciente());
//              System.out.println("NOME: "+ pacientesMODEL.getNomePaciente());
//              System.out.println("NUMERO: "+ pacientesMODEL.getTelefone());
//          });
//######################################################################################################################
    }
}