public class ListaEstatica {
    private int v[];
    private int contador;

    public ListaEstatica() {
        v = new int[10];
        contador = 0;
    }

    public ListaEstatica(int n) {
        v = new int[n];
    }

    public void adicionar(int valor) {
        if (contador != v.length) {
            v[contador] = valor;
            contador++;
        }
        else {
            // criar novo vetor com 1.5size ou tratar erro
        }
    }

    public void adicionar(int posicao, int valor) {
        if (posicao <= contador) {
            for (int i = contador; i > posicao; i--) {
                v[i] = v[i - 1];
            }
            v[posicao] = valor;
            contador++;
        }
        else {
            // tratar erro de posição > contador
        }
    }

    public int tamanho() {
        return contador;
    }

    public boolean pesquisar(int valor) {
        for (int i = 0; i < contador; i++) {
            if (v[i] == valor) return true;
        }
        return false;
    }

    public int indice(int posicao) throws Exception {
        if (posicao <= contador) return v[posicao];
        else
            throw new Exception("INVALID POSITION");
    }

    public void remover(int posicao) {
        if (posicao < contador) {
            for (int i = posicao; i < contador - 1; i++) {
                v[i] = v[i + 1];
            }

            contador--;
        }
        else {
            // tratar erro, posicao > = contador
        }
    }

    public void exibir() {
        for (int i = 0; i < contador; i++) System.out.print(v[i] + " ");
        System.out.println();
    }
}
