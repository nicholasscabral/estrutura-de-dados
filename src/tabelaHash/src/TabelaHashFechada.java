public class TabelaHashFechada {
    private ListaDinamica tabela[];

    public TabelaHashFechada(Integer n) {
        tabela = new ListaDinamica[n];

        for (int i = 0; i < n; i++) {
            tabela[i] = new ListaDinamica();
        }
    }

    public int hash(int valor) {
        return valor % tabela.length;
    }

    public void add(int valor) {
        int indice = hash(valor);
        tabela[indice].adicionar(valor);
    }

    public boolean search(int valor) {
        int hash = hash(valor);
        int indice = hash;
        int i = 0;

        while (tabela[indice] != null) {
            if (tabela[indice] == valor)
                return true;

            
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
