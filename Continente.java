import java.util.ArrayList;
import java.util.List;

public class Continente {

    private String nome;
    private List<Pais> listaDePaises = new ArrayList<Pais>();

    Continente() {

    }

    Continente(String nome) {
        this.nome = nome;
    }

    public List<Pais> mostrarListrarListaDePaisesPorContinentes(Continente continente) {
        System.out.println("Paises da " + continente.nome);
        return continente.listaDePaises;
    }

    public List<Pais> mostrarListrarListaDePaises() {
        return listaDePaises;
    }

    public void adicionarPaises(Pais pais) {
        listaDePaises.add(pais);
    }

    public double retornarAreaTotalDoContiente() {
        double soma = 0;
        for (Pais pais : listaDePaises) {
            soma = soma + pais.getDimensao();
        }
        return soma;
    }


}


