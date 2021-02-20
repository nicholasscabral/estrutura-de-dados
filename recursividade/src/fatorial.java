import java.util.Scanner;

public class fatorial {
    // metodo recursivo
    public static int fatorial(int n) {
        return (n == 1 || n == 0) ? 1 : n * fatorial(n-1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("informe um numero");
        int n = input.nextInt();

        System.out.println("o fatorial de " + n + " é " + fatorial(n));
    }
}
