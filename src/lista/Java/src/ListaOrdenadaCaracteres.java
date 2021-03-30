public class ListaOrdenadaCaracteres {
    public NoString primeiro;
    public NoString ultimo;
    public int contador;

    public ListaOrdenadaCaracteres() {
        this.primeiro = null;
        this.ultimo = null;
        this.contador = 0;
    }

    public void add(String nome) {
        NoString novo = new NoString(nome);

        if (primeiro == null) { // lista vazia?
            primeiro = novo;
            ultimo = novo;
        }
        else if (novo.dado.length() < primeiro.dado.length()) { // inicio da lista
            novo.proximo = primeiro;
            primeiro.anterior = novo;
            primeiro = novo;
            primeiro.anterior = ultimo; // circular
        }
        else if (novo.dado.length() > ultimo.dado.length()) { // final da lista
            ultimo.proximo = novo;
            novo.anterior = ultimo;
            ultimo = novo;
            ultimo.proximo = primeiro; // circular
        }
        else {
            NoString anterior = null;
            NoString aux = primeiro;

            while (aux != null && novo.dado.length() > aux.dado.length()) {
                anterior = aux;
                aux = aux.proximo;
            }
            anterior.proximo = novo;
            novo.anterior = anterior;
            novo.proximo = aux;
            aux.anterior = novo;
        }
        contador++;
    }

    public boolean containsChar(String nome) {
        NoString aux = primeiro;
        for (int i = 0; i < contador; i++) {
            if (nome.length() == aux.dado.length()) {
                return true;
            }
            aux = aux.proximo;
        }
        return false;
    }

    public void list() {
        NoString aux = primeiro;

        for (int i = 0; i < contador; i++) {
            if (aux == ultimo) {
                System.out.print(aux.dado);
            }
            else {
                System.out.print(aux.dado + ", ");
            }
            aux = aux.proximo;
        }
        System.out.println();
    }
}
