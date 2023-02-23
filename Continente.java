import java.util.*;

public class Continente {

    private String nome;
    private List<Pais> listaDePaises = new ArrayList<Pais>();

    Continente() {

    }

    Continente(String nome) {
        this.nome = nome;
    }

    public List<Pais> retornarListrarListaDePaisesPorContinentes(Continente continente) {
        System.out.println("Paises da " + continente.nome);
        return continente.listaDePaises;
    }

    public void adicionarPaises(Pais pais) {
        listaDePaises.add(pais);
    }

    public double retornarAreaTotalDoContiente() {
        double areaTotalDoContinente = 0;
        for (Pais pais : listaDePaises) {
            areaTotalDoContinente = areaTotalDoContinente + pais.getDimensao();
        }
        return areaTotalDoContinente;
    }

    public double retornarPopulacaoTotalDoContiente() {
        double populacaoTotalDoContinente = 0;
        for (Pais pais : listaDePaises) {
            populacaoTotalDoContinente = populacaoTotalDoContinente + pais.getPopulacao();
        }
        return populacaoTotalDoContinente;
    }

    public List<Pais> retornarPaisComMaiorPopulacao() {
        listaDePaises.sort(Comparator.comparing(Pais::getPopulacao));
        Collections.reverse(listaDePaises);
        List<Pais> paisComMaiorPopulacao = Collections.singletonList(listaDePaises.get(0));

        return paisComMaiorPopulacao;
    }


}
