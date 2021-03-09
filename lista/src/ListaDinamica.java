public class ListaDinamica {
    private No primeiro;
    private No ultimo;
    private int contador;

    public ListaDinamica() {
        primeiro = null;
        ultimo = null;
        contador = 0;
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

        contador++;
    }

    public void adicionar(int posicao, int valor) { // add
        No novo = new No(valor);

        if (primeiro == null) { // lista vazia
            primeiro = novo;
            ultimo = novo;
        } else if (posicao == 0) { // posição inicial
            novo.proximo = primeiro;
            primeiro = novo;
        } else if (posicao == tamanho()) { // posição final
            ultimo.proximo = novo;
            ultimo = novo;
        } else {
            No aux = primeiro;

            for (int i = 0; i < posicao - 1; i++) {
                aux = aux.proximo;
            }

            novo.proximo = aux.proximo;
            aux.proximo = novo;
        }

        contador++;
    }

    public void remover(int posicao)  { // remove
        if (primeiro != null) { // lista nao esta vazia
            if (posicao == 0) { // posição inicial
                primeiro = primeiro.proximo;
            } else { // posições intermediarias e final
                No aux = primeiro;

                for (int i = 0; i < posicao - 1; i++) {
                    aux = aux.proximo;
                }

                aux.proximo = aux.proximo.proximo;

                if (posicao == tamanho() - 1) { // posição final
                    ultimo = aux;
                }
            }
            contador--;
        }
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
        return contador;
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
