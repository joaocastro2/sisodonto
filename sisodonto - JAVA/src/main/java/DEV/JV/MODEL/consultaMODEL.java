package DEV.JV.MODEL;

import java.time.LocalDate;
import java.time.LocalTime;

public class consultaMODEL {

    private Long idConsulta, fk_idTratamento;
    private String fk_cpfPaciente, fk_cpfFuncionario;
    private LocalDate dataConsulta;
    private LocalTime horaConsulta;

    public consultaMODEL(Long idConsulta, String fk_cpfPaciente, String fk_cpfFuncionario, LocalDate dataConsulta, LocalTime horaConsulta, Long fk_idTratamento) {
        this.idConsulta = idConsulta;
        this.fk_cpfPaciente = fk_cpfPaciente;
        this.fk_cpfFuncionario = fk_cpfFuncionario;
        this.dataConsulta = dataConsulta;
        this.horaConsulta = horaConsulta;
        this.fk_idTratamento = fk_idTratamento;
    }

    public Long getIdConsulta() {
        return idConsulta;
    }

    public void setIdConsulta(Long idConsulta) {
        this.idConsulta = idConsulta;
    }

    public Long getFk_idTratamento() {
        return fk_idTratamento;
    }

    public void setFk_idTratamento(Long fk_idTratamento) {
        this.fk_idTratamento = fk_idTratamento;
    }

    public String getFk_cpfPaciente() {
        return fk_cpfPaciente;
    }

    public void setFk_cpfPaciente(String fk_cpfPaciente) {
        this.fk_cpfPaciente = fk_cpfPaciente;
    }

    public String getFk_cpfFuncionario() {
        return fk_cpfFuncionario;
    }

    public void setFk_cpfFuncionario(String fk_cpfFuncionario) {
        this.fk_cpfFuncionario = fk_cpfFuncionario;
    }

    public LocalDate getDataConsulta() {
        return dataConsulta;
    }

    public void setDataConsulta(LocalDate dataConsulta) {
        this.dataConsulta = dataConsulta;
    }

    public LocalTime getHoraConsulta() {
        return horaConsulta;
    }

    public void setHoraConsulta(LocalTime horaConsulta) {
        this.horaConsulta = horaConsulta;
    }
}
