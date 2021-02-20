import java.util.Scanner;

public class fibonnaciChamadas {

    public static int calls = 0;

    public static int fib(int n) {
        if (n == 0) {
            calls++;
            return 0;
        }
        else if (n == 1) {
            calls++;
            return 1;
        }
        else {
            calls += 2;
            return fib(n -1) + fib(n -2);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int soma = 0;

        int cases = input.nextInt();
        if (cases >= 1 && cases <= 39) {
            for (int i = 0; i < cases; i++) {
                int number = input.nextInt();
                for (int j = 0; j < number; j++) {
                    System.out.print(fib(j));
                    System.out.println();
                    soma += fib(j);
                }
                System.out.println("fib(" + number + ") = " + soma + " = " + calls);
                calls = 0;
                soma = 0;
            }
        }
    }
}
