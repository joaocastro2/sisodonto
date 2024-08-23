package DEV.JV;

import DEV.JV.DAO.pacientesDAO;
import DEV.JV.MODEL.pacientesMODEL;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        pacientesDAO dao = new pacientesDAO();

        pacientesMODEL pacientes = new pacientesMODEL();
        pacientes.setCpfPaciente("21279636059");
        pacientes.setNomePaciente("Carlos Almeida Brandão");
        pacientes.setNascimento(LocalDate.of(2000, 7, 12));
        pacientes.setSexo("M");
        pacientes.setCep("72318105");
        pacientes.setEndereco("RUA ALGODÃO MOLHADO N 57");
        pacientes.setTelefone("44912345678");
        pacientes.setEmail("Carlos.lindo@gmail.com");

        dao.save(pacientes);

    }
}