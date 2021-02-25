public class Main {
    public static void main(String[] args) {
        ListaEstatica lista = new ListaEstatica();

        // adicionando valores de teste
        lista.adicionar(7);
        lista.adicionar(4);
        lista.adicionar(3);
        lista.adicionar(5);
        lista.adicionar(1);
        lista.adicionar(9);
        lista.exibir(); // 7 4 3 5 1 9

        lista.adicionar(1, 2); // adicionando valor 2 na posição 1
        lista.exibir(); // 7 2 4 3 5 1 9

        lista.adicionar(3, 8); // adicionando valor 8 na posição 3
        lista.exibir(); // 7 2 4 8 3 5 1 9

        lista.remover(2); // removendo numero 4, na posição 2
        lista.exibir(); // 7 2 8 3 5 1 9
    }
}
