package DEV.JV.TEST_FUNCTIONS.DELETS;

import DEV.JV.DAO.pacientesDAO;

public class DELETS_PACIENTES {

    public static void main(String[] args) {
        //DELETA UM PACIENTE
        pacientesDAO pacientesDel = new pacientesDAO();
        pacientesDel.delete("");
    }
}
