public class Main {
    public static void main(String[] args) {
        PilhaDinamica pilha = new PilhaDinamica();

        pilha.push(4);
        pilha.push(2);
        pilha.push(8);
        pilha.list();
        System.out.println("topo: " + pilha.peek());
        pilha.pop();
        pilha.list();

    }
}
