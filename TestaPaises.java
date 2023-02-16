import java.util.Locale;

public class TestaPaises {
    public static void main(String[] args) {

        Locale.setDefault(new Locale("pt", "BR"));

        System.out.println("====================");
        System.out.println("      Paises");
        System.out.println("=====================");

        Continente continente = new Continente();
        Continente europa = new Continente("Europa");

        europa.adicionarPaises(new Pais("Itália", "IT", 200, 2000l));
        europa.adicionarPaises(new Pais("Estados Unidos", "US", 300, 3000l));
        europa.adicionarPaises(new Pais("Espanha", "ES", 400, 4000l));
        europa.adicionarPaises(new Pais("França", "FR", 600, 6000l));
        System.out.println(europa.mostrarListrarListaDePaisesPorContinentes(europa));

        System.out.println();

        Continente americaDoSul = new Continente("América Do Sul");

        americaDoSul.adicionarPaises(new Pais("Brasil", "BR", 500, 5000l));
        americaDoSul.adicionarPaises(new Pais("Argentina", "AG", 700, 7000l));
        americaDoSul.adicionarPaises(new Pais("Uruguai", "UG", 700, 7000l));
        System.out.println(americaDoSul.mostrarListrarListaDePaisesPorContinentes(americaDoSul));

        System.out.println();

        Continente asia = new Continente("Ásia");

        asia.adicionarPaises(new Pais("Japão", "JP", 100, 1000l));
        asia.adicionarPaises(new Pais("China", "CH", 200, 2000l));
        asia.adicionarPaises(new Pais("Rússia", "RS", 300, 3000l));
        System.out.println(asia.mostrarListrarListaDePaisesPorContinentes(asia));

        System.out.println();

        continente.adicionarPaises(new Pais("Islândia", "IS", 500, 5000l));
        continente.adicionarPaises(new Pais("Paraguai", "PG", 600, 6000l));
        continente.adicionarPaises(new Pais("Coréia", "CO", 700, 7000l));
        continente.adicionarPaises(new Pais("Reino Unido", "RU", 800, 8000l));
        System.out.println(continente.mostrarListrarListaDePaises());

    }
}
