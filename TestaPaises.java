import java.util.Locale;

public class TestaPaises {
    public static void main(String[] args) {

        Locale.setDefault(new Locale("pt", "BR"));

        System.out.println("====================");
        System.out.println("      Paises");
        System.out.println("=====================");

        Continente europa = new Continente("Europa");

        europa.adicionarPaises(new Pais("Itália", "IT", 200, 2000l));
        europa.adicionarPaises(new Pais("Reino Unido", "RU", 300, 3000l));
        europa.adicionarPaises(new Pais("Espanha", "ES", 400, 4000l));
        europa.adicionarPaises(new Pais("França", "FR", 600, 6000l));
        System.out.println(europa.retornarListrarListaDePaisesPorContinentes(europa));

        System.out.println();

        Continente americaDoSul = new Continente("América Do Sul");
        americaDoSul.adicionarPaises(new Pais("Brasil", "BR", 500, 5000l));
        americaDoSul.adicionarPaises(new Pais("Argentina", "AG", 700, 7000l));
        americaDoSul.adicionarPaises(new Pais("Uruguai", "UG", 700, 7000l));
        System.out.println(americaDoSul.retornarListrarListaDePaisesPorContinentes(americaDoSul));

        System.out.println();

        Continente asia = new Continente("Ásia");
        asia.adicionarPaises(new Pais("Japão", "JP", 100, 1000l));
        asia.adicionarPaises(new Pais("China", "CH", 200, 2000l));
        asia.adicionarPaises(new Pais("Coreia do Norte", "CO", 700, 1000l));
        asia.adicionarPaises(new Pais("Rússia", "RS", 300, 3000l));


        System.out.println(asia.retornarListrarListaDePaisesPorContinentes(asia));

        System.out.println();

        Continente americaDoNorte = new Continente("América Do Norte");
        americaDoNorte.adicionarPaises(new Pais("Estados Unidos", "US", 700, 7000l));
        americaDoNorte.adicionarPaises(new Pais("Canadá", "CA", 500, 5000l));
        americaDoNorte.adicionarPaises(new Pais("México", "ME", 600, 6000l));

        System.out.println();

        System.out.println("Area total do continente");
        System.out.println(americaDoSul.retornarAreaTotalDoContiente());
        System.out.println(americaDoNorte.retornarAreaTotalDoContiente());

        System.out.println();
        System.out.println("População total com continente ");
        System.out.println(americaDoSul.retornarPopulacaoTotalDoContiente());

        System.out.println();
        System.out.println("Retornar país com maior população");
        System.out.println(asia.retornarPaisComMaiorPopulacao());

        System.out.println();
        System.out.println("Retornar país com menor população");
        System.out.println(asia.retornarPaisComMenorPopulacao());


    }
}
