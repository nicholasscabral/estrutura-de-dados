public class ListaEstatica {
    private Object v[];
    private int contador;

    public ListaEstatica() {
        v = new Object[10];
        contador = 0;
    }

    public ListaEstatica(Object n) {
        v = new Object[n];
    }

    public void adicionar(Object valor) throws Exception {
        if (contador != v.length) {
            v[contador] = valor;
            contador++;
        }
        else {
            // criar novo vetor com 1.5size ou tratar erro
            double newSize = this.tamanho() * 1.5;
            ListaEstatica novaLista = new ListaEstatica(20);
            novaLista.contador = this.contador;
            for (int i = 0; i < contador; i++) {
                novaLista.adicionar(v[i]);
            }
            for (int i = 0; i < contador; i++) {
                this.remover(i);
            }
            //System.out.println(novaLista.tamanho());
        }
    }

    public void adicionar(int posicao, int valor) throws Exception {
        if (posicao <= contador) {
            for (int i = contador; i > posicao; i--) {
                v[i] = v[i - 1];
            }
            v[posicao] = valor;
            contador++;
        }
        else {
            // tratar erro de posição > contador
            throw new Exception("POSITION GREATER SEM LIST SIZE");
        }
    }

    public int tamanho() {
        return contador;
    }

    public boolean pesquisar(Object valor) {
        for (int i = 0; i < contador; i++) {
            if (v[i].equals(valor)) return true;
        }
        return false;
    }

    public int pesquisarIndice(Object valor) {
        for (int i = 0; i < contador; i++) {
            if (v[i].equals(valor)) return i;
        }
        return -1;
    }

    public Object pesquisarElemento(int posicao) {
        if (posicao < contador) return v[posicao];
        else
            return null;
    }

    public void remover(int posicao) throws Exception {
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
