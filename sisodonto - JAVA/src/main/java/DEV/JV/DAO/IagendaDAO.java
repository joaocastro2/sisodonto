package DEV.JV.DAO;

import DEV.JV.MODEL.agendaMODEL;

import java.util.List;
import java.util.Optional;

public interface IagendaDAO {

    agendaMODEL save(agendaMODEL agenda);
    agendaMODEL update(agendaMODEL agenda);
    agendaMODEL delete(Long idAgenda);
    List<agendaMODEL> findAll();
    Optional<agendaMODEL> findById(Long idAgenda);
}
