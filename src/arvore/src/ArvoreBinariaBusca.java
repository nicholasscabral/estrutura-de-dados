public class ArvoreBinariaBusca {
    private No root;

    public ArvoreBinariaBusca() {
        this.root = null;
    }

    public void add(int e) {
        if (this.empty())
            root = new No(e);
        else {
            this.add(e, root);
        }
    }

    private void add(int e, No root) {
        if (e < root.dado) {
            if (root.esquerdo == null)
                root.esquerdo = new No(e);
            else
                this.add(e, root.esquerdo);
        }
        else if (e > root.dado) {
            if (root.direito == null)
                root.direito = new No(e);
            else
                this.add(e, root.direito);
        }
    }

    public void remove(int e) {
        if (!this.empty())
            this.remove(e, root, null);
    }

    private void remove(int e, No root, No pai) {
        if (e == root.dado) {
            if (root.esquerdo == null && root.direito == null) { // nao tem filho (folha)
                if (root == pai.esquerdo) // é filho esquerdo
                    pai.esquerdo = null;
                else // é filho direito
                    pai.direito = null;
            }
            else if (root.esquerdo != null && root.direito == null) { // so tem o filho esquerdo
                if (root == pai.esquerdo)
                    pai.esquerdo = root.esquerdo;
                else
                    pai.direito = root.esquerdo;
            }
            else if (root.esquerdo == null && root.direito != null) { // so tem o filho direito
                if (root == pai.esquerdo)
                    pai.esquerdo = root.direito;
                else
                    pai.direito = root.direito;
            }
            else if (root.esquerdo != null && root.direito != null) { // tem dois filhos
                root.dado = min(root.direito); // buscando o menor daa sub arvore direita
                this.remove(root.dado, root.direito, root);
            }
        }
        else if (e < root.dado) {
            if (root.esquerdo != null)
                this.remove(e, root.esquerdo, root);
        }
        else if (e > root.dado) {
            if (root.direito != null)
                this.remove(e, root.direito, root);
        }
    }

    public int min(No root) {
        if (root.esquerdo == null) // nao tem pra onde mais descer
            return root.dado;
        else
            return min(root.esquerdo);
    }

    public boolean contains(int e) {
        if (this.empty())
            return false;
        else {
            return this.contains(e, root);
        }
    }

    private boolean contains(int e, No root) {
        if (e == root.dado) {
            return true;
        }
        else if (e < root.dado) {
            if (root.esquerdo == null)
                return false;
            else
                return this.contains(e, root.esquerdo);
        }
        else if (e > root.dado) {
            if (root.direito == null)
                return false;
            else
                return this.contains(e, root.direito);
        }

        return false;
    }

    public boolean empty() {
        return root == null;
    }

    public void list() {
        this.list(root);
        System.out.println();
    }

    private void list(No root) {
        //System.out.print(root.dado + " "); // PRE ORDEM

        if (root.esquerdo != null)
            this.list(root.esquerdo);

        System.out.print(root.dado + " "); // ORDEM

        if (root.direito != null) {
            this.list(root.direito);
        }

        //System.out.print(root.dado + " "); // POS ORDEM

    }
}
