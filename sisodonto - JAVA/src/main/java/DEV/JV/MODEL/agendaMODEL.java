package DEV.JV.MODEL;

import java.time.LocalDate;
import java.util.Date;

public class agendaMODEL {

    private Long idAgenda;
    private String fk_idFuncionario;
    private LocalDate inicioAgenda;

    public agendaMODEL(Long idAgenda, String fk_idFuncionario, LocalDate inicioAgenda) {
        this.idAgenda = idAgenda;
        this.fk_idFuncionario = fk_idFuncionario;
        this.inicioAgenda = inicioAgenda;
    }

    public Long getIdAgenda() {
        return idAgenda;
    }

    public void setIdAgenda(Long idAgenda) {
        this.idAgenda = idAgenda;
    }

    public String getFk_idFuncionario() {
        return fk_idFuncionario;
    }

    public void setFk_idFuncionario(String fk_idFuncionario) {
        this.fk_idFuncionario = fk_idFuncionario;
    }

    public LocalDate getInicioAgenda() {
        return inicioAgenda;
    }

    public void setInicioAgenda(LocalDate inicioAgenda) {
        this.inicioAgenda = inicioAgenda;
    }
}
