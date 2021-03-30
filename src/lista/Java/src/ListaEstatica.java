public class ListaEstatica {
    private Object v[];
    private int contador;

    public ListaEstatica() {
        v = new Object[10];
        contador = 0;
    }

    public ListaEstatica(int n) {
        v = new Object[n];
    }

    public void adicionar(Object valor) throws Exception { // add
        if (contador != v.length) {
            v[contador] = valor;
            contador++;
        }
        else {
            // criar novo vetor com 1.5size ou tratar erro
            Object[] aux = new Object[(int) (v.length * 1.5)];

            for (int i = 0; i < v.length; i++) {
                aux[i] = v[i];
            }

            v = aux;
        }
    }

    public void adicionar(int posicao, Object valor) throws Exception { // add
        if (posicao <= contador) {
            for (int i = contador; i > posicao; i--) {
                v[i] = v[i - 1];
            }
            v[posicao] = valor;
            contador++;
        }
        else {
            // tratar erro de posição > contador
            throw new Exception("POSITION GREATER THAN LIST SIZE");
        }
    }

    public int tamanho() { // size
        return contador;
    }

    public boolean pesquisar(Object valor) { // contains
        for (int i = 0; i < contador; i++) {
            if (v[i].equals(valor)) return true;
        }
        return false;
    }

    public int pesquisarIndice(Object valor) { // indexOf
        for (int i = 0; i < contador; i++) {
            if (v[i].equals(valor)) return i;
        }
        return -1;
    }

    public Object pesquisarElemento(int posicao) { // get
        if (posicao < contador) return v[posicao];
        else
            return null;
    }

    public void remover(int posicao) throws Exception { // remove
        if (posicao < contador) {
            for (int i = posicao; i < contador - 1; i++) {
                v[i] = v[i + 1];
            }

            contador--;
        }
        else {
            // tratar erro, posicao > = contador
            throw new Exception("POSITION GREATER/EQUAL THAN LIST SIZE");
        }
    }

    public void exibir() {
        for (int i = 0; i < contador; i++) System.out.print(v[i] + " ");
        System.out.println();
    }
}
