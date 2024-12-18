package DEV.JV.TEST_FUNCTIONS.UPDATES;

import DEV.JV.DAO.pacientesDAO;
import DEV.JV.MODEL.pacientesMODEL;

import java.util.Optional;

/**
 * Classe de teste para atualizar um paciente.
 */
public class UPDATES_PACIENTES {

    /**
     * Método principal para execução do teste de atualização do paciente.
     *
     * @param args Argumentos da linha de comando.
     */
    public static void main(String[] args) {
        // Cria uma instância de pacientesDAO para realizar operações no banco de dados.
        pacientesDAO pacientes = new pacientesDAO();

        // Recupera um paciente específico pelo CPF.
        Optional<pacientesMODEL> pacientesMODELOptional = pacientes.findByCpf("-----");

        // Verifica se o paciente está presente e imprime os detalhes.
        if (pacientesMODELOptional.isPresent()) {
            pacientesMODEL paciente = pacientesMODELOptional.get();
            System.out.println("CPF: " + paciente.getCpfPaciente());
            System.out.println("NOME: " + paciente.getNomePaciente());
            System.out.println("NASCIMENTO: " + paciente.getNascimento());
            System.out.println("SEXO: " + paciente.getSexo());
            System.out.println("CEP: " + paciente.getCep());
            System.out.println("ENDEREÇO: " + paciente.getEndereco());
            System.out.println("TELEFONE: " + paciente.getTelefone());
            System.out.println("EMAIL: " + paciente.getEmail());

            // Código comentado para alterar o endereço e CPF do paciente.
            // paciente.setEndereco("rua da abóbora");
            // paciente.setCpfPaciente("11111111111");
            // pacientes.update(paciente);
        } else {
            System.out.println("Paciente não encontrado.");
        }
    }
}
