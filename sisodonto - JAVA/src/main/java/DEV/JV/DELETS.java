package DEV.JV;

import DEV.JV.DAO.pacientesDAO;

public class DELETS {

    public static void main(String[] args) {
        pacientesDAO pacientesDel = new pacientesDAO();
        pacientesDel.delete("21279636059");
    }

}
