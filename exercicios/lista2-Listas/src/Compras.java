import java.util.Scanner;

public class Compras {
    public static void main(String[] args) {

        int cases;
        Scanner input = new Scanner(System.in);

        cases = input.nextInt();
        input.nextLine();   
        for (int i = 0; i < cases; i++) {
            ListaOrdenada listaCompras = new ListaOrdenada();

            String[] items = input.nextLine().split(" ");
            for (String item : items) {
                if (!listaCompras.contains(item)) {
                    listaCompras.add(item);
                }
            }

            listaCompras.list();
        }
    }
}
