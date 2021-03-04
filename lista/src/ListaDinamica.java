public class ListaDinamica {
    private No primeiro;
    private No ultimo;

    public ListaDinamica() {
        primeiro = null;
        ultimo = null;
    }

    public void adicionar(int valor) { // add
        No novo = new No(valor);

        if (primeiro == null) { // Lista vazia?
            primeiro = novo;
            ultimo = novo;
        } else {
            ultimo.proximo = novo;
            ultimo = novo;
        }

    }

    public void adicionar(int posicao, int valor) { // add

    }

    public void remover(int posicao)  { // remove

    }

    public boolean pesquisar(int valor) { // contains
        return false;
    }

    public int pesquisarIndice(int valor) { // indexOf
        return 0;

    }

    public int pesquisarElemento(int posicao) { // get
        No aux = primeiro;

        for (int i = 0; i < posicao; i++) {
            aux = aux.proximo;
        }

        return aux.dado;
    }

    public int tamanho() { // size
        return 0;
    }

    public void exibir() {
        No aux = primeiro;

        while (aux != null) {
            System.out.print(aux.dado + " ");
            aux = aux.proximo;
        }
        System.out.println();
    }

}
