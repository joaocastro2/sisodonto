package DEV.JV;

import DEV.JV.DAO.pacientesDAO;
import DEV.JV.MODEL.pacientesMODEL;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        pacientesDAO dao = new pacientesDAO();

//        List<pacientesMODEL> pacientes = dao.findAll();
//
//        for (pacientesMODEL paciente : pacientes) {
//            System.out.println("CPF: "+ paciente.getCpfPaciente());
//            System.out.println("NOME: "+ paciente.getNomePaciente());
//            System.out.println("NUMERO: "+ paciente.getTelefone());
//            System.out.println("==================================================");
//        }


//          Optional<pacientesMODEL> pacientesMODELOptional = dao.findByCpf("09769734136");
//          pacientesMODELOptional.ifPresent(pacientesMODEL -> {
//              System.out.println("CPF: " + pacientesMODEL.getCpfPaciente());
//              System.out.println("NOME: "+ pacientesMODEL.getNomePaciente());
//              System.out.println("NUMERO: "+ pacientesMODEL.getTelefone());
//          });
    }
}