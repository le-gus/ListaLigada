package fila;

public class TesteFilas {
    public static void main(String[] args) {
        Fila fila = new Fila();

        fila.adicionar("Fernando");
        fila.adicionar("Maria");
        fila.adicionar("José");

        System.out.println(fila);

        fila.remover();

        System.out.println(fila);

        Object x1 = fila.poll();
        System.out.println(fila);
        System.out.println(x1);
    }
}
