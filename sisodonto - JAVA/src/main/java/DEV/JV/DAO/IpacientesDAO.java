package DEV.JV.DAO;

import DEV.JV.MODEL.pacientesMODEL;
import java.util.List;
import java.util.Optional;


public interface IpacientesDAO {

    pacientesMODEL save(pacientesMODEL pacientes);
    pacientesMODEL update(pacientesMODEL pacientes);
    void delete(Long id);
    List<pacientesMODEL> findAll();
    Optional<pacientesMODEL> findByCpf(String cpfPaciente);

}
