public class FilaDinamica {
    private No primeiro;
    private No ultimo;
    private int contador;

    public FilaDinamica() {
        primeiro = null;
        ultimo = null;
        contador = 0;
    }

    public void enqueue(Object valor) { // add
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

    public void dequeue()  {
        if (primeiro != null) {
            primeiro = primeiro.proximo;
            contador--;
        }
    }

    public Object front() {
        return primeiro.dado;
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
            System.out.print(aux.dado + " ");
            aux = aux.proximo;
        }
        System.out.println();
    }

}