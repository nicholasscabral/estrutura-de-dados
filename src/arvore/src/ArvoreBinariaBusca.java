public class ArvoreBinariaBusca {
    private No root;

    public ArvoreBinariaBusca() {
        this.root = null;
    }

    public void add(int e) {
        if (root == null)
            root = new No(e);
        else {
            this.add(e, root);
        }
    }

    public void add(int e, No root) {
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

    }

    public boolean contains(int e) {
        return false;
    }

    public void list() {

    }
}
