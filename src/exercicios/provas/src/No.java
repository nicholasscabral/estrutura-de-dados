public class No {
    public No proximo;
    public No anterior;
    public String dado;

    public No(String nome) {
        this.dado = nome;
        this.proximo = null;
        this.anterior = null;
    }
}
