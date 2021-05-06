public class NoLista {
    public NoLista proximo;
    public NoLista anterior;
    public ListaDinamica lista;

    public NoLista(ListaDinamica lista) {
        this.lista = lista;
        this.proximo = null;
        this.anterior = null;
    }
}
