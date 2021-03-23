public class ListaOrdenadaCaracteres {
    public No primeiro;
    public No ultimo;
    public int contador;

    public ListaOrdenadaCaracteres() {
        this.primeiro = null;
        this.ultimo = null;
        this.contador = 0;
    }

    public void add(String nome) {
        No novo = new No(nome);

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
            No aux = primeiro;

            while (novo.dado.length() > aux.dado.length()) {
                aux = aux.proximo;
            }

            aux.anterior = novo;
            novo.proximo = aux;
        }
        contador++;
    }

    public boolean containsChar(String nome) {
        No aux = primeiro;

        while (aux != null) {
            if (nome.length() == aux.dado.length()) {
                System.out.println(nome + " tem a mesma quantidade de letras que " + aux.dado);
                return true;
            }
            aux = aux.proximo;
        }
        return false;
    }

    public void list() {
        No aux = primeiro;

        while (aux != null) {
            if (aux.dado.equals(ultimo.dado)) {
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
