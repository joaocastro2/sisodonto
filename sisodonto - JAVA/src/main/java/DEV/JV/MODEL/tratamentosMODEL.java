package DEV.JV.MODEL;

import DEV.JV.CLASSES_ENUM.tiposTratamento;

public class tratamentosMODEL {

    private Long idTratamento;
    private tiposTratamento categoriaTratamento;
    private String descricao;
    private Double custo;

    public tratamentosMODEL(Long idTratamento, tiposTratamento categoriaTratamento, String descricao, Double custo) {
    }

    public Long getIdTratamento() {
        return idTratamento;
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
