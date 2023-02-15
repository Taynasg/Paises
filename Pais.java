public class Pais {

    private String codigoIso;
    private String nome;
    private double populacao;
    private Long dimensao;


    Pais (String codigoIso, String nome, double populacao, Long dimensao) {
        this.codigoIso = codigoIso;
        this.nome = nome;
        this.populacao = populacao;
        this.dimensao = dimensao;
    }

    public String getCodigoIso() {
        return codigoIso;
    }

    public void setCodigoIso(String codigoIso) {
        this.codigoIso = codigoIso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPopulacao() {
        return populacao;
    }

    public void setPopulacao(double populacao) {
        this.populacao = populacao;
    }

    public  float  getDimensao() {
        return dimensao;
    }

    public void setDimensao(Long dimensao) {
        this.dimensao = dimensao;
    }
}
