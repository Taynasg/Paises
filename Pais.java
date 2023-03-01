import java.util.List;

public class Pais  {
    private String nome;
    private String codigoIso;
    private int populacao;
    private Long dimensao;

    Pais() {

    }

    Pais(String nome, String codigoIso, int populacao, Long dimensao) {
        this.nome = nome;
        this.codigoIso = codigoIso;
        this.populacao = populacao;
        this.dimensao = dimensao;
    }

    public String getCodigoIso() {
        return codigoIso;
    }

    public String getNome() {
        return nome;
    }

    public int getPopulacao() {
        return populacao;
    }

    public Long getDimensao() {
        return dimensao;
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

