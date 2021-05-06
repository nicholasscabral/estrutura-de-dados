public class TabelaHashAberta {
    private Integer tabela[];

    public TabelaHashAberta(Integer n) {
        tabela = new Integer[n];
    }

    // (enderaçamento ABERTO)
    public int hash(int valor) { // retorna o indice o valor
        int hash = valor % tabela.length;
        int indice = hash;
        int i = 0;

        while (tabela[indice] !=  null) {
            i++;
            //indice = (hash + i) % tabela.length; // tentativa linear
            indice = (indice + i) % tabela.length; // tentativa quadratica
        }

        return indice;
    }

    public void add(int valor) {
        int indice = hash(valor);
        tabela[indice] = valor;
    }

    public boolean search(int valor) {
        int hash = hash(valor);
        int indice = hash;
        int i = 0;   

        while (tabela[indice] != null) {
            if (tabela[indice] == valor)
                return true;

            i++;
            indice = (indice + i) % tabela.length; // tentativa quadrática
            //indice = (hash + i) % tabela.length; // tentativa linear
        }

        return false;
    }

    public void list() {
        for (int i = 0; i < tabela.length; i++) {
            System.out.print(tabela[i] + " ");
        }
        System.out.println();
    }
}
