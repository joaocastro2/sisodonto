package DEV.JV.MODEL;

import DEV.JV.CLASSES_ENUM.setores;

import java.time.LocalDate;

public class funcionariosMODEL {

    private String cpfFuncionario, nomeFuncionario, telefone, email, cep, endereco;
    private Long idFuncionario;
    private LocalDate dataNascimento, dataAdimissao;
    private setores setor;

    public funcionariosMODEL(Long idFuncionario, String cpfFuncionario, String nomeFuncionario, setores setor,
                             String telefone, String email, String cep, String endereco, LocalDate dataNascimento, LocalDate dataAdimissao) {

        this.idFuncionario = idFuncionario;
        this.cpfFuncionario = cpfFuncionario;
        this.nomeFuncionario = nomeFuncionario;
        this.setor = setor;
        this.telefone = telefone;
        this.email = email;
        this.cep = cep;
        this.endereco = endereco;
        this.dataNascimento = dataNascimento;
        this.dataAdimissao = dataAdimissao;
    }

    public String getCpfFuncionario() {
        return cpfFuncionario;
    }

    public void setCpfFuncionario(String cpfFuncionario) {
        this.cpfFuncionario = cpfFuncionario;
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
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

    public Long getIdFuncionario() {
        return idFuncionario;
    }

    public LocalDate getDataAdimissao() {
        return dataAdimissao;
    }

    public void setDataAdimissao(LocalDate dataAdimissao) {
        this.dataAdimissao = dataAdimissao;
    }

    public setores getSetor() {
        return setor;
    }

    public void setSetor(setores setor) {
        this.setor = setor;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}
