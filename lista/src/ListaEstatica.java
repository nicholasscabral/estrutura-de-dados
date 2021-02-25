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
        v[contador] = valor;
        contador++;
    }

    public void adicionar(int posicao, int valor) {

    }

    public int tamanho() {

    }

    public boolean pesquisar(int valor) {

    }

    public int pesquisar(int posicao) {

    }

    public void remover(int valor) {

    }

    public void exibir() {
        for (int i = 0; i < contador; i++) System.out.print(v[i] + " ");
        System.out.println();
    }
}
