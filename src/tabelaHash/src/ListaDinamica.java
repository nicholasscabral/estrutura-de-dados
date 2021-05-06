
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
            //primeiro.anterior = novo;
            primeiro = novo;
            //primeiro.anterior = ultimo;
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
            //aux.proximo.anterior = novo;
            //novo.anterior = aux;
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
        No aux = primeiro;

        for (int i = 0; i < contador; i++) {
            if (aux.dado == valor) {
                return true;
            }
            else {
                aux = aux.proximo;
            }
        }
        return false;
    }

    public int pesquisarIndice(int valor) { // indexOf
        No aux = primeiro;

        for (int i = 0; i < contador; i++) {
            if (aux.dado == valor) {
                return i;
            }
            else {
                aux = aux.proximo;
            }
        }

        return -1;
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