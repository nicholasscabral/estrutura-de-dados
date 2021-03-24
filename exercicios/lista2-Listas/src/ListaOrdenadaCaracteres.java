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
            //primeiro.anterior = ultimo; // circular
        }
        else if (novo.dado.length() > ultimo.dado.length()) { // final da lista
            ultimo.proximo = novo;
            //novo.anterior = ultimo;
            ultimo = novo;
           // ultimo.proximo = primeiro; // circular
        }
        else {
            No anterior = null;
            No aux = primeiro;

            while (aux != null && novo.dado.length() > aux.dado.length()) {
                anterior = aux;
                aux = aux.proximo;
            }
            anterior.proximo = novo;
            novo.anterior = anterior;
            novo.proximo = aux;
            aux.anterior = novo;
            //System.out.println("adiconei entre " + novo.anterior.dado + " e " + novo.proximo.dado);
        }
        contador++;
    }

    public boolean containsChar(String nome) {
        No aux = primeiro;
        //System.out.println(nome + " tem " + nome.length() + " letras");
        for (int i = 0; i < contador; i++) {
            //System.out.println("comparando " + nome + " com " + aux.dado);
            if (nome.length() == aux.dado.length()) {
                //System.out.println(nome + " tem a mesma quantidade de letras que " + aux.dado);
                return true;
            }
            aux = aux.proximo;
        }
        return false;
    }

    public void list() {
        No aux = primeiro;

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
