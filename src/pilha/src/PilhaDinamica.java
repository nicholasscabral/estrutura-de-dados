public class PilhaDinamica {
    public No primeiro;
    public No ultimo;
    public int contador;

    public PilhaDinamica () {
        this.primeiro = null;
        this.ultimo = null;
        this.contador = 0;
    }

    public void push(Object valor) {
        No novo = new No(valor);
        if (primeiro == null) {
            primeiro = novo;
            ultimo = novo;
        } else {
            ultimo.proximo = novo;
            novo.anterior = ultimo;
            ultimo = novo;
        }
    }

    public void pop() {
        if (primeiro != null) {
            ultimo = ultimo.anterior;
            ultimo.proximo = null;
        }
    }

    public Object peek() {
        return ultimo.dado;
    }

    public boolean search(Object valor) {
        No aux = primeiro;

        while (aux != null) {
            if (aux.dado.equals(valor)) {
                return true;
            }
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
            System.out.print(aux.dado + " ");
            aux = aux.proximo;
        }
        System.out.println();
    }
}
