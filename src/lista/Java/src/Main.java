public class Main {
    public static void main(String[] args) throws Exception {
        //ListaEstatica lista = new ListaEstatica();
        ListaDinamica lista = new ListaDinamica();

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

        lista.remover(0); // removendo numero 7 da primeira posição
        lista.exibir(); // 2 8 3 5 1 9

        lista.remover(5); // removendo numero 9 da ultima posição
        lista.exibir(); // 2 8 3 5 1

        System.out.println(lista.pesquisar(4)); // false
        System.out.println(lista.pesquisarElemento(2)); // 8
        System.out.println(lista.pesquisarIndice(8)); // 2

    }
}
