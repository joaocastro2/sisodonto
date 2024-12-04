package DEV.JV.TEST_FUNCTIONS.INSERTS;

import DEV.JV.DAO.consultaDAO;
import DEV.JV.MODEL.consultaMODEL;

import java.time.LocalDate;
import java.time.LocalTime;

public class INSERTS_CONSULTA {

    public static void main(String[] args) {
        consultaDAO dao = new consultaDAO();
        consultaMODEL consulta = new consultaMODEL(null, "22222222222", "66666666666",
                LocalDate.of(2024, 12, 05), LocalTime.of(14, 30, 00),
                4L, false);

        dao.save(consulta);
    }

}
