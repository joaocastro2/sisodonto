package DEV.JV.TEST_FUNCTIONS.INSERTS;

import DEV.JV.DAO.pacientesDAO;
import DEV.JV.MODEL.pacientesMODEL;

import java.time.LocalDate;

public class INSERTS_PACIENTES {

    public static void main(String[] args) {
        //INSERE UM PACIENTE
        pacientesDAO insertPac = new pacientesDAO();
        pacientesMODEL pacientes = new pacientesMODEL("", "" ,
                                                       LocalDate.of(2006, 04, 21), "", "",
                                                       "", "", "");

        insertPac.save(pacientes);

    }
}

