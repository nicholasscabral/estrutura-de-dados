public class No {
    public Object dado;
    public No anterior;
    public No proximo;

    public No(Object dado) {
        this.dado = dado;
        this.anterior = null;
        this.proximo = null;
    }
}