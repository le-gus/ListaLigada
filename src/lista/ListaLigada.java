package lista;

public class ListaLigada {
    private Celula primeira = null;
    private Celula ultima = null;
    private int totalDeElementos = 0;
    public void adicionaNoComeco (Object elemento) {
        if (totalDeElementos ==0){
            Celula nova = new Celula (elemento);
            this.primeira = nova;
            this.ultima = nova;
        } else {
            Celula nova = new Celula(elemento, this.primeira);
            this.primeira.setAnterior(nova);
            this.primeira = nova;
        }
        totalDeElementos++;

    }

    @Override
    public String toString() {
        if(this.totalDeElementos==0){
            return "[]";
        }
        Celula atual = this.primeira;
        StringBuilder builder = new StringBuilder("[");
        for (int i=0; i < totalDeElementos; i++){
            builder.append(atual.getElemento());
            builder.append(",");

            atual = atual.getProximo();
        }
        builder.append("]");

        return builder.toString();
    }

    public void adicionarNoFinal (Object elemento) {

        if (this.totalDeElementos == 0){
            adicionaNoComeco(elemento);
        }

        Celula nova = new Celula(elemento);
        this.ultima.setProximo(nova);
        nova.setAnterior(this.ultima);
        this.ultima = nova;
        this.totalDeElementos++;
    }

    private boolean posicaoOcupada (int posicao) {
        return posicao >= 0 && posicao < this.totalDeElementos;
    }
    private Celula pegaCelula (int posicao) {
        if(!posicaoOcupada(posicao)){
            throw new IllegalArgumentException("Posição inexistente");
        }
        Celula atual = this.primeira;

        for (int i=0; i < posicao; i++){
            atual = atual.getProximo();
        }
        return atual;
    }

    public void adiciona (int posicao, Object elemento) {

        if (posicao == 0) {
            adicionaNoComeco(elemento);
        } else if (posicao == this.totalDeElementos) {
            adicionarNoFinal(elemento);
        } else {
            Celula anterior = this.pegaCelula(posicao - 1);
            Celula proxima = anterior.getProximo();

            Celula nova = new Celula(elemento, anterior.getProximo());
            nova.setAnterior(anterior);
            anterior.setProximo(nova);
            proxima.setAnterior(nova);
            proxima.setAnterior(nova);
            this.totalDeElementos++;
        }
    }
    public Object pega (int posicao) {
        return this.pegaCelula(posicao).getElemento();
    }

    public void removeDoComeco(){

        if (this.totalDeElementos==0){
            throw new IllegalArgumentException("A lista esta vazia");
        }
        this.primeira = this.primeira.getProximo();
        this.totalDeElementos--;
    }
    public void remove (int posicao){
        if (posicao == 0){
            removeDoComeco();
        }
        else if (posicao == totalDeElementos){
            Celula anterior = this.pegaCelula(posicao - 1);
            ultima = anterior;
            totalDeElementos --;
        }
        pegaCelula(posicao-1).setProximo(pegaCelula(posicao+1));
        totalDeElementos--;
    }

    public void removerNoFinal(){
        remove(totalDeElementos);
    }
    public int tamanho(){
        return this.totalDeElementos;
    }
    public boolean contem(Object elemento){
        return true;
    }
}
