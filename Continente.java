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

    public double getAreaTotal(Continente continente) {
        System.out.println("Área total do continente " + continente.nome);
        double areaTotalDoContinente = 0;
        for (Pais pais : listaDePaises) {
            areaTotalDoContinente = areaTotalDoContinente + pais.getDimensao();
        }
        return areaTotalDoContinente;
    }

    public double getPopulacaoTotal(Continente continente) {
        System.out.println("População total do continente " + continente.nome);
        double populacaoTotalDoContinente = 0;
        for (Pais pais : listaDePaises) {
            populacaoTotalDoContinente = populacaoTotalDoContinente + pais.getPopulacao();
        }
        return populacaoTotalDoContinente;
    }

    public Pais getPaisMaiorPopulacao(Continente continente) {
        System.out.println("País com maior população da " + continente.nome);
        listaDePaises.sort(Comparator.comparing(Pais::getPopulacao));
        Collections.reverse(listaDePaises);
        return listaDePaises.get(0);
    }

    public Pais getPaisMenorPopulacao(Continente continente) {
        System.out.println("País com menor população da " + continente.nome);
        listaDePaises.sort(Comparator.comparing(Pais::getPopulacao));
        return listaDePaises.get(0);
    }

    public Pais getPaisMaiorDimensaoTerritorial(Continente continente) {
        System.out.println("País com maior dimensão Territoria da " + continente.nome);
        listaDePaises.sort(Comparator.comparing(Pais::getPopulacao));
        Collections.reverse(listaDePaises);
        return listaDePaises.get(0);
    }

    public Pais getPaisMenorDimensaoTerritorial(Continente continente) {
        System.out.println("País com menor menor dimensão da " + continente.nome);
        listaDePaises.sort(Comparator.comparing(Pais::getPopulacao));
        return listaDePaises.get(0);
    }
}
