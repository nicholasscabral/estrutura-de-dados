public class Main {
    public static void main(String[] args) {
        FilaPrioridadeDesordenada fila = new FilaPrioridadeDesordenada();

        fila.enqueue("Joao", 2);
        fila.enqueue("Pedro", 2);
        fila.enqueue("Ricardo", 1);
        fila.enqueue("Nicholas", 2);
        fila.enqueue("Maria", 0);
        fila.enqueue("Eduarda", 0);
        fila.list();
        fila.dequeue();
        fila.list();

    }
}
