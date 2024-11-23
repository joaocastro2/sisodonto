package DEV.JV.MODEL;

import DEV.JV.CLASSES_ENUM.tiposTratamento;

public class tratamentosMODEL {

    private int idTratamento;
    private tiposTratamento categoriaTratamento;
    private String descricao;
    private Double custo;

    public tratamentosMODEL(tiposTratamento tratamento, String descricao, Double custo) {
        this.categoriaTratamento = tratamento;
        this.descricao = descricao;
        this.custo = custo;
    }

    public int getIdTratamento() {
        return idTratamento;
    }

    public void setIdTratamento(int idTratamento) {
        this.idTratamento = idTratamento;
    }

    public tiposTratamento getCategoriaTratamento() {
        return categoriaTratamento;
    }

    public void setCategoriaTratamento(tiposTratamento categoriaTratamento) {
        this.categoriaTratamento = categoriaTratamento;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getCusto() {
        return custo;
    }

    public void setCusto(Double custo) {
        this.custo = custo;
    }
}
