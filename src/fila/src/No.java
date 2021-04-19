public class No {
    public String dado;
    public int prioridade;
    public No anterior;
    public No proximo;

    public No(String dado, int prioridade) {
        this.dado = dado;
        this.prioridade = prioridade;
        this.anterior = null;
        this.proximo = null;
    }

    public No(String dado) {
        this.dado = dado;
        this.proximo = null;
        this.anterior = null;
    }
}