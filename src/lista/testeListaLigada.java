package lista;

public class testeListaLigada {
    public static void main(String[] args) {

        ListaLigada lista = new ListaLigada();

        lista.adicionaNoComeco("Fernanda");
        System.out.println(lista);
        lista.adicionaNoComeco("Roberto");
        System.out.println(lista);
        lista.adicionaNoComeco("Carlos");
        System.out.println(lista);

        lista.adicionarNoFinal("Bruna");
        System.out.println(lista);

        lista.adiciona(2, "Higor");
        System.out.println(lista);

        lista.removeDoComeco();
        System.out.println(lista);

        System.out.println(lista.pega(2));
        System.out.println(lista.tamanho());

    }
}
