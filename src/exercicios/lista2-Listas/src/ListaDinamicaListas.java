public class ListaDinamicaListas {
    public NoNomes primeiro;
    public NoNomes ultimo;
    public int contador;

    public ListaDinamicaListas() {
        this.primeiro = null;
        this.ultimo = null;
        this.contador = 0;
    }

    public void add(ListaOrdenadaCaracteres lista) {
        NoNomes novo = new NoNomes(lista);

        if (primeiro == null) {
            primeiro = novo;
            ultimo = novo;
        }
        else {
            ultimo.proximo = novo;
            ultimo = novo;
        }
        contador++;
    }

    public boolean containsCharInList(String nome, ListaOrdenadaCaracteres lista) {
        No aux = lista.primeiro;

        while (aux != null) {
            if (nome.length() == aux.dado.length()) {
                return true;
            }
            aux = aux.proximo;
        }

        return false;
    }

    public ListaOrdenadaCaracteres searchList(int position) {
        NoNomes aux = primeiro;

        for (int i = 0; i < position; i++) {
            aux = aux.proximo;
        }

        return aux.dado;
    }

    public int size() {
        return contador;
    }

    public void list() {
        NoNomes aux = primeiro;

        while (aux != null) {
            aux.dado.list();
            aux = aux.proximo;
        }
    }
}
