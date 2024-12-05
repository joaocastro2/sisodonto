package DEV.JV.TEST_FUNCTIONS.UPDATES;

import DEV.JV.DAO.agendaDAO;
import DEV.JV.DAO.consultaDAO;
import DEV.JV.MODEL.agendaMODEL;
import DEV.JV.MODEL.consultaMODEL;

import java.util.Optional;

public class UPDATES_CONSULTAS {

    public static void main(String[] args) {


        consultaDAO dao = new consultaDAO();
        Optional<consultaMODEL> consultaMODELOptional = dao.findById(1L);

        consultaMODEL consulta = consultaMODELOptional.get();
            System.out.println("ID DA CONSULTA: " + consulta.getIdConsulta());
            System.out.println("CPF DO PACIENTE: " + consulta.getFk_cpfPaciente());
            System.out.println("CPF DO FUNCIONARIO: " + consulta.getFk_cpfFuncionario());
            System.out.println("DATA MARCADA: " + consulta.getDataConsulta());
            System.out.println("HORA MARCADA" + consulta.getHoraConsulta());
            System.out.println("TIPO DE TRATAMENTO: " + consulta.getFk_idTratamento());
            System.out.println("SITUAÇÃO: " + consulta.getSituacao());

            //consulta.setSituacao(true);

            //dao.update(consulta);

    }
}
