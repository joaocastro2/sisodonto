package DEV.JV.MODEL;

import java.time.LocalDate;

public class pacientesMODEL {

    private String cpfPaciente, nomePaciente, sexo, cep, endereco, telefone, email;
    private LocalDate nascimento;

    public pacientesMODEL() {
    }

    public pacientesMODEL(String cpfPaciente, String nomePaciente, LocalDate nascimento, String sexo, String cep, String endereco, String telefone, String email) {
        this.cpfPaciente = cpfPaciente;
        this.nomePaciente = nomePaciente;
        this.sexo = sexo;
        this.cep = cep;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.nascimento = nascimento;
    }

    public String getCpfPaciente() {
        return cpfPaciente;
    }

    public void setCpfPaciente(String cpfPaciente) {
        this.cpfPaciente = cpfPaciente;
    }

    public String getNomePaciente() {
        return nomePaciente;
    }

    public void setNomePaciente(String nomePaciente) {
        this.nomePaciente = nomePaciente;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }
}
