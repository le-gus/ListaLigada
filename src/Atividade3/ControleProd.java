package Atividade3;

import fila.Fila;
import lista.Celula;
import pilha.Pilha;


public class ControleProd {

    int contIdentificador = 0;
    Fila maquina1 = new Fila();
    Fila maquina2 = new Fila();
    Fila maquina3 = new Fila();

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder()
        return "ControleProd{" +
                "maquina1=" + maquina1 +
                '}';
    }

    public void imprimirFila(){
        System.out.println(maquina1.toString());
        System.out.println(maquina2.toString());
        System.out.println(maquina3.toString());
    }



    public void adicionar(int numDePecas){
        for (int i=0;i<numDePecas;i++){
            Celula peca = new Celula("cacarejo");
            peca.setIdentificador(contIdentificador);
            maquina1.adicionar(peca);
            contIdentificador++;

        }
        imprimirFila();
    }
    public void processar(){
        maquina3 = maquina2;
        maquina2 = maquina1;
        while(maquina1.vazio()!=true){
            maquina1.remover();
        }
        imprimirFila();
    }






}

