package Atividade3;

public class TesteControleProd {
    public static void main(String[] args) {
        ControleProd controleProd = new ControleProd();
        controleProd.adicionar(3);
        System.out.println(controleProd.maquina1.toString());
        System.out.println("--------------------");
        controleProd.processar();
        System.out.println(controleProd.maquina1.toString());
    }
}
