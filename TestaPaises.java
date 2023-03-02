import java.util.Locale;

public class TestaPaises {
    public static void main(String[] args) {

        System.out.println("====================");
        System.out.println("      Paises");
        System.out.println("=====================");

        Continente europa = new Continente("Europa");
        europa.adicionarPais(new Pais("Itália", "IT", 60641009, 302073l));
        europa.adicionarPais(new Pais("Reino Unido", "RU", 69056336, 243610l));
        europa.adicionarPais(new Pais("Espanha", "ES", 46442019, 505990l));
        europa.adicionarPais(new Pais("França", "FR", 66129878, 551695l));
        System.out.println(europa.getPaises(europa));

        System.out.println();

        Continente americaDoSul = new Continente("América Do Sul");
        americaDoSul.adicionarPais(new Pais("Brasil", "BR", 217934582, 8516000l));
        americaDoSul.adicionarPais(new Pais("Argentina", "AG", 46474208, 2780000l));
        americaDoSul.adicionarPais(new Pais("Uruguai", "UY", 3504563, 176215l));
        System.out.println(americaDoSul.getPaises(americaDoSul));

        System.out.println();

        Continente asia = new Continente("Ásia");
        asia.adicionarPais(new Pais("Japão", "JP", 126197594, 377973l));
        asia.adicionarPais(new Pais("China", "CN", 1460026992, 9597000l));
        asia.adicionarPais(new Pais("Coreia do Norte", "KP", 26152652, 120540l));
        asia.adicionarPais(new Pais("Índia", "IN", 1428407744, 3287000l));
        System.out.println(asia.getPaises(asia));

        System.out.println();

        Continente americaDoNorte = new Continente("América Do Norte");
        americaDoNorte.adicionarPais(new Pais("Estados Unidos", "US", 337924239, 9834000l));
        americaDoNorte.adicionarPais(new Pais("Canadá", "CA", 38815313, 5000l));
        americaDoNorte.adicionarPais(new Pais("México", "MX", 133862292, 6000l));
        System.out.println(americaDoNorte.getPaises(americaDoNorte));
        System.out.println();

        System.out.println("Retornar área total dos continentes\n");
        System.out.println(americaDoSul.getAreaTotal(americaDoSul));
        System.out.println();
        System.out.println(americaDoNorte.getAreaTotal(americaDoNorte));
        System.out.println();
        System.out.println(europa.getAreaTotal(europa));
        System.out.println();
        System.out.println(asia.getAreaTotal(asia));

        System.out.println();
        System.out.println("População total dos continentes\n");
        System.out.println(americaDoSul.getPopulacaoTotal(americaDoSul));
        System.out.println();
        System.out.println(americaDoNorte.getPopulacaoTotal(americaDoNorte));
        System.out.println();
        System.out.println(europa.getPopulacaoTotal(europa));
        System.out.println();
        System.out.println(asia.getPopulacaoTotal(asia));


        System.out.println();

        System.out.println("Retornar país com maior população dos continentes\n");
        System.out.println();
        System.out.println(europa.getPaisMaiorPopulacao(americaDoSul));
        System.out.println(asia.getPaisMaiorPopulacao(americaDoNorte));
        System.out.println(asia.getPaisMaiorPopulacao(europa));
        System.out.println(asia.getPaisMaiorPopulacao(asia));

        System.out.println();
        System.out.println("Retornar país com menor população\n");
        System.out.println();
        System.out.println(europa.getPaisMenorPopulacao(americaDoSul));
        System.out.println(asia.getPaisMenorPopulacao(americaDoNorte));
        System.out.println(asia.getPaisMenorPopulacao(europa));
        System.out.println(asia.getPaisMenorPopulacao(asia));

        System.out.println();
        System.out.println("Retornar país com maior dimensão territorial\n");
        System.out.println();
        System.out.println(europa.getPaisMaiorDimensaoTerritorial(americaDoSul));
        System.out.println(asia.getPaisMaiorDimensaoTerritorial(americaDoNorte));
        System.out.println(asia.getPaisMaiorDimensaoTerritorial(europa));
        System.out.println(asia.getPaisMaiorPopulacao(asia));

        System.out.println();
        System.out.println("Retornar país com menor dimensão territorial\n");
        System.out.println(europa.getPaisMenorDimensaoTerritorial(americaDoSul));
        System.out.println(asia.getPaisMenorDimensaoTerritorial(americaDoNorte));
        System.out.println(asia.getPaisMenorDimensaoTerritorial(europa));
        System.out.println(asia.getPaisMenorPopulacao(asia));

    }
}
