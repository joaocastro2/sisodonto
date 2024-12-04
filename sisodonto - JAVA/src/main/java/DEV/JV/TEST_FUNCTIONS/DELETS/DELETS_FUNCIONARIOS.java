package DEV.JV.TEST_FUNCTIONS.DELETS;

import DEV.JV.DAO.funcionariosDAO;
import com.sun.jdi.PathSearchingVirtualMachine;

public class DELETS_FUNCIONARIOS {

    public static void main(String[] args) {
        funcionariosDAO funcionariosDEL= new funcionariosDAO();
        funcionariosDEL.delete("33333333333");

    }
}
