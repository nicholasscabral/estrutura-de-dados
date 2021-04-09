public class Main {
    public static void main(String[] args) {
        FilaDinamica fila = new FilaDinamica();

        fila.enqueue(7);
        fila.enqueue(2);
        fila.enqueue(5);
        fila.enqueue(3);
        fila.list(); // 7 2 5 3
        System.out.println("proximo: " + fila.front());
        fila.dequeue();
        fila.dequeue();
        fila.list(); // 5 3
        System.out.println("proximo: " + fila.front());

    }
}
