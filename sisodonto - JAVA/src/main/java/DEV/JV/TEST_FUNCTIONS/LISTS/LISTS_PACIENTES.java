package DEV.JV.TEST_FUNCTIONS.LISTS;

import DEV.JV.DAO.pacientesDAO;
import DEV.JV.MODEL.pacientesMODEL;

import java.util.List;
import java.util.Optional;

/**
 * Classe de teste para listar pacientes.
 */
public class LISTS_PACIENTES {

    /**
     * Método principal para execução do teste de listagem dos pacientes.
     *
     * @param args Argumentos da linha de comando.
     */
    public static void main(String[] args) {
        // Cria uma instância de pacientesDAO para realizar operações no banco de dados.
        pacientesDAO dao = new pacientesDAO();

        // Código comentado para listar todos os pacientes.
        //List<pacientesMODEL> pacientes = dao.findAll();
        //for (pacientesMODEL paciente : pacientes) {
        //    System.out.println("CPF: "+ paciente.getCpfPaciente());
        //    System.out.println("NOME: "+ paciente.getNomePaciente());
        //    System.out.println("NUMERO: "+ paciente.getTelefone());
        //    System.out.println("==================================================");
        //}

        // Recupera um paciente específico pelo CPF e o imprime se presente.
        Optional<pacientesMODEL> pacientesMODELOptional = dao.findByCpf("09769734136");
        pacientesMODELOptional.ifPresent(pacientesMODEL -> {
            System.out.println("CPF: " + pacientesMODEL.getCpfPaciente());
            System.out.println("NOME: "+ pacientesMODEL.getNomePaciente());
            System.out.println("NUMERO: "+ pacientesMODEL.getTelefone());
        });
    }
}
