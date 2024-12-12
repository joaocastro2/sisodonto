package DEV.JV.MODEL;

import DEV.JV.CLASSES_ENUM.formasPagamento;

import java.time.LocalDate;

public class pagamentosMODEL {

    private Long idPagamento;
    private String fk_idConsulta;
    private LocalDate dataPagamento;
    private double valor;
    formasPagamento formaPagamento;
    private boolean situacao;

    public pagamentosMODEL(Long idPagamento, String fk_idConsulta, LocalDate dataPagamento, double valor, formasPagamento formaPagamento, boolean situacao) {
        this.idPagamento = idPagamento;
        this.fk_idConsulta = fk_idConsulta;
        this.dataPagamento = dataPagamento;
        this.valor = valor;
        this.formaPagamento = formaPagamento;
        this.situacao = situacao;
    }

    public Long getIdPagamento() {
        return idPagamento;
    }

    public String getFk_idConsulta() {
        return fk_idConsulta;
    }

    public void setFk_idConsulta(String fk_idConsulta) {
        this.fk_idConsulta = fk_idConsulta;
    }

    public LocalDate getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(LocalDate dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public formasPagamento getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(formasPagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public boolean isSituacao() {
        return situacao;
    }

    public void setSituacao(boolean situacao) {
        this.situacao = situacao;
    }
}
