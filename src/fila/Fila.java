package fila;

import lista.Celula;
import lista.ListaLigada;

public class Fila {

    private ListaLigada nome = new ListaLigada();

    public void adicionar(Object elemento){
        nome.adicionarNoFinal(elemento);
    }

    public void remover(){
        nome.removeDoComeco();
    }

    public Object poll(){
        if(nome.tamanho()==0){
            return null;
        }
        Object primeiro = nome.pegaPrimeira();
        nome.removeDoComeco();
        return primeiro;
    }
    public boolean vazio(){
        return nome.tamanho() ==0;
    }

    @Override
    public String toString() {
        return nome.toString();
    }
}


