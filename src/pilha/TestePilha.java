package pilha;

public class TestePilha {
    public static void main(String[] args) {
        Pilha pilha = new Pilha();

        pilha.push("Fernando");
        pilha.push("Maria");
        pilha.push("Rose");

        System.out.println(pilha);

        pilha.pop();
        pilha.pop();

        System.out.println(pilha);
    }
}
