package DEV.JV.MODEL;

import DEV.JV.CLASSES_ENUM.tiposTratamento;

public class tratamentosMODEL {

    private int idTratamento;
    private tiposTratamento tiposTratamento;
    private String descricao;
    private float custo;

    public tratamentosMODEL(int idTratamento, tiposTratamento tratamento, String descricao, float custo) {
        this.idTratamento = idTratamento;
        this.tiposTratamento = tratamento;
        this.descricao = descricao;
        this.custo = custo;
    }

    public int getIdTratamento() {
        return idTratamento;
    }

    public tiposTratamento getTiposTratamento() {
        return tiposTratamento;
    }

    public void setTiposTratamento(tiposTratamento tiposTratamento) {
        this.tiposTratamento = tiposTratamento;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getCusto() {
        return custo;
    }

    public void setCusto(float custo) {
        this.custo = custo;
    }

    public void setIdTratamento(int idTratamento) {
        this.idTratamento = idTratamento;
    }
}
