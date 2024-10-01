package DEV.JV.MODEL;

import DEV.JV.DAO.IpacientesDAO;
import DEV.JV.DAO.pacientesDAO;
import DEV.JV.MODEL.pacientesMODEL;

import java.util.Optional;

public class UPDATES {

    public static void main(String[] args) {
        pacientesDAO pacientes = new pacientesDAO();
        Optional<pacientesMODEL> pacientesMODELOptional = pacientes.findByCpf("09769734136");

        pacientesMODEL paciente = pacientesMODELOptional.get();
        System.out.println(paciente.getCpfPaciente());
        System.out.println(paciente.getNomePaciente());
        System.out.println(paciente.getNascimento());
        System.out.println(paciente.getSexo());
        System.out.println(paciente.getCep());
        System.out.println(paciente.getEndereco());
        System.out.println(paciente.getTelefone());
        System.out.println(paciente.getEmail());

         //paciente.setEndereco("rua da abóbora");

        pacientes.update(paciente);

    }

}
