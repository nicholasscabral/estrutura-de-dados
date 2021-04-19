public class FilaPrioridade {
    private No primeiro;
    private No ultimo;
    private int contador;

    public FilaPrioridade() {
        primeiro = null;
        ultimo = null;
        contador = 0;
    }

    public void enqueue(String valor, int prioridade) {
        No novo = new No(valor, prioridade);

        if (primeiro == null) {
            primeiro = novo;
            ultimo = novo;
        } else {
            ultimo.proximo = novo;
            novo.anterior = ultimo;
            ultimo = novo;
        }

        contador++;
    }

    public void dequeue()  {
        if (primeiro != null) {
            No aux = this.front();

            if (aux.anterior != null)
                aux.anterior.proximo = aux.proximo;
            else
                primeiro = primeiro.proximo;

            if (aux.proximo != null)
                aux.proximo.anterior = aux.anterior;
            else
                ultimo = ultimo.anterior;

            contador--;
        }
    }

    public No front() {
        if (primeiro != null) {
            for (int i = 0; i < 2; i++) {
                No aux = primeiro;

                while (aux != null) {
                    if (aux.prioridade == i)
                        return aux;

                    aux = aux.proximo;
                }
            }
        }
        return primeiro; // return null;
    }

    public boolean search(Object valor) {
        No aux = primeiro;

        while (aux != null) {
            if (aux.dado.equals(valor)) {
                return true;
            }
            aux = aux.proximo;
        }
        return false;
    }

    public boolean empty() {
        if (contador > 0)
            return false;
        else
            return true;
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
