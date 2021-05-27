public class Main {
    public static void main(String[] args) {
        ArvoreBinariaBusca tree = new ArvoreBinariaBusca();

        tree.add(7);
        tree.add(5);
        tree.add(12);
        tree.add(2);
        tree.add(6);
        tree.add(9);
        tree.add(21);
        tree.add(19);
        tree.add(25);

        tree.list();

        tree.remove(12);
        tree.list();

        System.out.println(tree.max(tree.root())); // maior valor da arvore
        System.out.println(tree.min(tree.root())); // menor valor da arvore
    }
}
