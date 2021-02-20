import java.util.Scanner;

public class fibonacciChamadas {

    private static int calls = -1;

    public static int fib(int n) {
        calls++;
        if (n == 0) return 0;
        else if (n == 1) return 1;
        else return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int cases = input.nextInt();
        if (cases >= 1 && cases <= 39) {
            for (int i = 0; i < cases; i++) {
                int number = input.nextInt();
                System.out.println("fib(" + number + ") = " + fib(number) + " = " + calls);
                calls = -1;
            }
        }
    }
}
