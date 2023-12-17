package pilha;

import lista.ListaLigada;

public class Pilha {
    private ListaLigada nome = new ListaLigada();

    public void push(Object elemento){
        nome.adicionarNoFinal(elemento);
    }

    public void pop(){
        nome.removerNoFinal();
    }

    public void peek(){
        nome.pega(nome.tamanho());
    }

    public boolean vazio(){

        return nome.tamanho() == 0;
    }

    @Override
    public String toString() {

        return nome.toString();
    }
}
