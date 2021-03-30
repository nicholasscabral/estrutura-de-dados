public class ListaAlfabetica {
    public No primeiro;
    public No ultimo;
    public int contador;

    public ListaAlfabetica() {
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
        else if (novo.dado.compareTo(primeiro.dado) < 0) {
            novo.proximo = primeiro;
            primeiro.anterior = novo;
            primeiro = novo;
        }
        else if (novo.dado.compareTo(ultimo.dado) > 0) {
            ultimo.proximo = novo;
            novo.anterior = ultimo;
            ultimo = novo;
        }
        else {
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

    public boolean contains (String nome) {
        No aux = primeiro;

        while (aux != null) {
            if (aux.dado.equals(nome)) {
                return true;
            }
            aux = aux.proximo;
        }

        return false;
    }

    public void list() {
        No aux = primeiro;

        while (aux != null) {
            System.out.println(aux.dado);
            aux = aux.proximo;
        }
    }
}
