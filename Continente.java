import java.util.ArrayList;
import java.util.List;

public class Continente {

    private String nome;
    private List<Pais> listaDePaises = new ArrayList<Pais>();

    Continente(String nome) {
        this.nome = nome;
    }

}
