public class NoNomes {
    public ListaOrdenadaCaracteres dado;
    public NoNomes proximo;
    public NoNomes anterior;

    public NoNomes(ListaOrdenadaCaracteres lista) {
        this.dado = lista;
        this.proximo = null;
        this.anterior = null;
    }
}
