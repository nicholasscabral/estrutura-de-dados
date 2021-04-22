public class FilaPrioridadeOrdenada {
    public No primeiro;
    public No ultimo;
    public int contador;

    public FilaPrioridadeOrdenada() {
        primeiro = null;
        ultimo = null;
        contador = 0;
    }

    public void enqueue(String valor, int prioridade) {
        No novo = new No(valor, prioridade);

        if (primeiro == null) {
            primeiro = novo;
            ultimo = novo;
        }
        else if (novo.prioridade < primeiro.prioridade) {
            novo.proximo = primeiro;
            primeiro.anterior = novo;
            primeiro = novo;
        }
        else if (novo.prioridade >= ultimo.prioridade) {
            ultimo.proximo = novo;
            novo.anterior = ultimo;
            ultimo = novo;
        }
        else {
            No aux = primeiro;

            while (aux != null && novo.prioridade >= aux.prioridade) {
                aux = aux.proximo;
            }

            novo.proximo = aux;
            novo.anterior = aux.anterior;
            aux.anterior = novo;
            novo.anterior.proximo = novo;

        }
        contador++;
    }

    public void dequeue() {
        if (primeiro != null) {
            primeiro = primeiro.proximo;
            contador--;
        }
    }

    public No front() {
        if (primeiro != null) {
            return primeiro;
        }
        return null;
    }

    public int size() {
        return contador;
    }

    public void list() {
        No aux = primeiro;

        while (aux != null) {
            System.out.print(aux.dado + "(" + aux.prioridade + ") ");
            aux = aux.proximo;
        }
        System.out.println();
    }
}
