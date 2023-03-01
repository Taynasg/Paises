import java.util.*;

public class Continente {

    private String nome;
    private List<Pais> listaDePaises = new ArrayList<Pais>();

    Continente(String nome) {
        this.nome = nome;
    }

    public List<Pais> getPaises (Continente continente) {
        System.out.println("Paises da " + continente.nome);
        return continente.listaDePaises;
    }

    public void adicionarPais(Pais pais) {
        listaDePaises.add(pais);
    }

    public double getAreaTotal() {
        double areaTotalDoContinente = 0;
        for (Pais pais : listaDePaises) {
            areaTotalDoContinente = areaTotalDoContinente + pais.getDimensao();
        }
        return areaTotalDoContinente;
    }

    public double getPopulacaoTotal() {
        double populacaoTotalDoContinente = 0;
        for (Pais pais : listaDePaises) {
            populacaoTotalDoContinente = populacaoTotalDoContinente + pais.getPopulacao();
        }
        return populacaoTotalDoContinente;
    }

    public Pais getPaisMaiorPopulacao() {
        listaDePaises.sort(Comparator.comparing(Pais::getPopulacao));
        Collections.reverse(listaDePaises);
        List<Pais> paisComMaiorPopulacao = Collections.singletonList(listaDePaises.get(0));

        return listaDePaises.get(0);
    }

    public List<Pais> getPaisMenorPopulacao() {
        listaDePaises.sort(Comparator.comparing(Pais::getPopulacao));
        List<Pais> paisComMenorPopulacao = Collections.singletonList(listaDePaises.get(0));

        return paisComMenorPopulacao;
    }

    public Pais getPaisMaiorDimensaoTerritorial() {
        listaDePaises.sort(Comparator.comparing(Pais::getPopulacao));
        Collections.reverse(listaDePaises);
        return listaDePaises.get(0);
    }

    public Pais getPaisMenorDimensaoTerritorial() {
        listaDePaises.sort(Comparator.comparing(Pais::getPopulacao));
        return listaDePaises.get(0);
    }
}