public class Pais {
    private String nome;
    private String codigoIso;
    private double populacao;
    private Long dimensao;

    Pais() {

    }

    Pais(String nome, String codigoIso, double populacao, Long dimensao) {
        this.nome = nome;
        this.codigoIso = codigoIso;
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

    public Long getDimensao() {
        return dimensao;
    }

    public void setDimensao(Long dimensao) {
        this.dimensao = dimensao;
    }

    @Override
    public String toString() {
        return "\n Nome: " + getNome()
                + "\n Código Iso: " + getCodigoIso()
                + "\n População: " + getPopulacao()
                + "\n Dimensao: " + getDimensao()
                + "\n ";
    }
}

