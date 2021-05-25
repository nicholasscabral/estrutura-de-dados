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
            remove(e, root, null);
    }

    private void remove(int e, No root, No pai) {
        if (e == root.dado) {
            if (root.esquerdo == null && root.direito == null) {
                if (root == pai.esquerdo)
                    pai.esquerdo = null;
                else
                    pai.direito = null;
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

    public boolean contains(int e) {
        if (empty())
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
