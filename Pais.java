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

    public void setCodigoIso(String codigoIso) {
        this.codigoIso = codigoIso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPopulacao() {
        return populacao;
    }

    public void setPopulacao(int populacao) {
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
//    public double mostrarPaisComMaiorPopulacaoTeste() {

//        double maior = 0.0;
//        for (Pais pais : listaDePaises) {
//            if (pais.getPopulacao() > maior) {
//                maior = pais.getPopulacao();
//            }
//            return maior;
//        }
//        return maior;

//        Iterator<Pais> iterator = listaDePaises.iterator();
//        iterator.forEachRemaining(pais -> {
//            double populacao = pais.getPopulacao();
//        });

//        return (Iterator) listaDePaises;

//Collection
// listaDePaises.stream().filter(pais -> )).map(filtered -> filtered.limit);

//        listaDePaises.stream().filter(populacao -> getPopulacao()).max((a,b)-> a. ;
//
//        return 1;
//   }
}

