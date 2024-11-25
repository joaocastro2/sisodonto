package DEV.JV.TEST_FUNCTIONS.LISTS;

import DEV.JV.DAO.pacientesDAO;
import DEV.JV.MODEL.pacientesMODEL;

import java.util.List;
import java.util.Optional;

public class LISTS_PACIENTES {
    public static void main(String[] args) {
        pacientesDAO dao = new pacientesDAO();
        //LISTA TODOS OS PACIENTES
        List<pacientesMODEL> pacientes = dao.findAll();
        for (pacientesMODEL paciente : pacientes) {
            System.out.println("CPF: "+ paciente.getCpfPaciente());System.out.println("NOME: "+ paciente.getNomePaciente());

            System.out.println("NUMERO: "+ paciente.getTelefone());
            System.out.println("==================================================");
        }
        //LISTA PACIENTES POR CPF

        //Optional<pacientesMODEL> pacientesMODELOptional = dao.findByCpf("09769734136");

        //pacientesMODELOptional.ifPresent(pacientesMODEL -> {
        //      System.out.println("CPF: " + pacientesMODEL.getCpfPaciente());
        //      System.out.println("NOME: "+ pacientesMODEL.getNomePaciente());
       //       System.out.println("NUMERO: "+ pacientesMODEL.getTelefone());
        //});
    }
}