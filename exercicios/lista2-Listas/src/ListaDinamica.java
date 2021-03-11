public class ListaDinamica { // lista simplesmente encadeada nao ordenada
    private No primeiro;
    private No ultimo;
    private int contador;

    public ListaDinamica() {
        primeiro = null;
        ultimo = null;
        contador = 0;
    }

    public void add(String nome) {
        No novo = new No(nome);

        if (primeiro == null) {
            primeiro = novo;
            ultimo = novo;
        }
        else {
            ultimo.proximo = novo;
            ultimo = novo;
            // ultimo.proximo = primeiro; circular
        }
        contador++;
    }

    public void remove(int posicao) {
        if (primeiro != null) {
            if (posicao == 0) {
                primeiro = primeiro.proximo;
            }
            else {
                No aux = primeiro;

                for (int i = 0; i < posicao - 1; i++) {
                    aux = aux.proximo;
                }

                aux.proximo = aux.proximo.proximo; // atribuindo o proximo no

                if (posicao == contador - 1) {
                    ultimo = aux;
                }
            }
        }
    }

    public boolean contains(String nome) {
        No aux = primeiro;

        for (int i = 0; i < contador; i++) {
            if (aux.dado.equals(nome)) {
                return true;
            }
            else {
                aux = aux.proximo;
            }
        }
        return false;
    }

    public int indexOf(String nome) {
        No aux = primeiro;

        for (int i = 0; i < contador; i++) {
            if (aux.dado.equals(nome)) {
                return i;
            }
            else {
                aux = aux.proximo;
            }
        }

        return -1;
    }

    public void list() {
        No aux = primeiro;

        while (aux != null) {
            System.out.print(aux.dado + " ");
            aux = aux.proximo;
        }

        System.out.println();
    }

    public int size() {

        return contador;
    }
}
