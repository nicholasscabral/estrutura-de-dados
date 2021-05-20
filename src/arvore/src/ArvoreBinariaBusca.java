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
        if (root == null)
            return false;
        else {
            return this.contains(e, root);
        }
    }

    public boolean contains(int e, No root) {
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

    public void list() {
        this.list(root);
    }

    public void list(No root) {
        System.out.print(root.dado + " "); // PRE ORDEM

        if (root.esquerdo != null)
            this.list(root.esquerdo);

        //System.out.print(root.dado + " "); // ORDEM

        if (root.direito != null) {
            this.list(root.direito);
        }

        //System.out.print(root.dado + " "); // POS ORDEM

    }
}
