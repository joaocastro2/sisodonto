package DEV.JV.TEST_FUNCTIONS.LISTS;

import DEV.JV.DAO.agendaDAO;
import DEV.JV.DAO.consultaDAO;
import DEV.JV.MODEL.agendaMODEL;
import DEV.JV.MODEL.consultaMODEL;

import java.util.List;
import java.util.Optional;

public class LISTS_CONSULTAS {

    public static void main(String[] args) {
        consultaDAO dao = new consultaDAO();
        //List<consultaMODEL> consultas = dao.findAll();
        //for(consultaMODEL consulta : consultas) {
        //    System.out.println("ID DA CONSULTA: " + consulta.getIdConsulta());
        //    System.out.println("CPF DO PACIENTE: " + consulta.getFk_cpfPaciente());
        //    System.out.println("CPF DO FUNCIONARIO: " + consulta.getFk_cpfFuncionario());
        //    System.out.println("DATA MARCADA: " + consulta.getDataConsulta());
        //    System.out.println("HORA MARCADA" + consulta.getHoraConsulta());
        //    System.out.println("TIPO DE TRATAMENTO: " + consulta.getFk_idTratamento());
        //    System.out.println("SITUAÇÃO: " + consulta.getSituacao());
        //    System.out.println("==================================================");

        //}

        Optional<consultaMODEL> consultaMODELOptional = dao.findById(1L);

        consultaMODELOptional.ifPresent(consultaMODEL -> {
                System.out.println("ID DA CONSULTA: " + consultaMODEL.getIdConsulta());
                System.out.println("CPF DO PACIENTE: " + consultaMODEL.getFk_cpfPaciente());
                System.out.println("CPF DO FUNCIONARIO: " + consultaMODEL.getFk_cpfFuncionario());
                System.out.println("DATA MARCADA: " + consultaMODEL.getDataConsulta());
                System.out.println("HORA MARCADA" + consultaMODEL.getHoraConsulta());
                System.out.println("TIPO DE TRATAMENTO: " + consultaMODEL.getFk_idTratamento());
                System.out.println("SITUAÇÃO: " + consultaMODEL.getSituacao());
        });
    }
}

