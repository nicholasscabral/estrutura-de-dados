public class ListaOrdenadaAlfabeto {
    private No primeiro;
    private No ultimo;
    private int contador;

    public ListaOrdenadaAlfabeto() {
        this.primeiro = null;
        this.ultimo = null;
        this.contador = 0;
    }

    public void add(String item) {
        No novo = new No(item);

        if (primeiro == null) {
            primeiro = novo;
            ultimo = novo;
        }
        else if (novo.dado.compareTo(primeiro.dado) < 0) { // começo da lista
            novo.proximo = primeiro;
            primeiro.anterior = novo;
            primeiro = novo;
        }
        else if (novo.dado.compareTo(ultimo.dado) > 0) { // final da lista
            ultimo.proximo = novo;
            novo.anterior = ultimo;
            ultimo = novo;
        }
        else { // intermdiaria
            No anterior = null;
            No aux = primeiro;

            while (aux != null && novo.dado.compareTo(aux.dado) > 0) {
                anterior = aux;
                aux = aux.proximo;
            }

            anterior.proximo = novo;
            novo.proximo = aux;
        }
        contador++;
    }

    public boolean contains(String item) {
        No aux = primeiro;

        while (aux != null) {
            if (aux.dado.equals(item)) {
                return true;
            }
            else {
                aux = aux.proximo;
            }
        }
        return false;
    }

    public int size() {
        return contador;
    }

    public void list() {
        No aux = primeiro;

        while (aux != null) {
            if (aux.dado.equals(ultimo.dado)) {
                System.out.print(aux.dado);
            }
            else {
                System.out.print(aux.dado + " ");
            }

            aux = aux.proximo;
        }
        System.out.println();
    }
}
