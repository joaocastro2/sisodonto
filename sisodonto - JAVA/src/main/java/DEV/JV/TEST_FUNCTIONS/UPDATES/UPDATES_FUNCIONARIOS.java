package DEV.JV.TEST_FUNCTIONS.UPDATES;

import DEV.JV.CLASSES_ENUM.setores;
import DEV.JV.DAO.funcionariosDAO;
import DEV.JV.MODEL.funcionariosMODEL;

import java.time.LocalDate;

public class UPDATES_FUNCIONARIOS {

    public static void main(String[] args) {

        funcionariosDAO dao = new funcionariosDAO();
        funcionariosMODEL funcionarios = new funcionariosMODEL(null, "66666666666", "josé pinto", setores.OUTROS,
                                                               "0000000000", "teste@gmail.com", "88888888", "qd 8 lt 12 - aguas lindas",
                                                               /* NASCIMENTO: */LocalDate.of(2024, 12, 01),
                                                               /* ADIMISSÃO: */LocalDate.of(2024, 12, 01));

        dao.save(funcionarios);

    }

}
