import java.util.Scanner;

public class fibonacciChamadas {

    public static int calls = 0;

    public static int fib(int n) {
        if (n == 0) return 0;
        else if (n == 1) return 1;
        else {
            calls += 2;
            return fib(n - 1) + fib(n - 2);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int cases = input.nextInt();
        if (cases >= 1 && cases <= 39) {
            for (int i = 0; i < cases; i++) {
                int number = input.nextInt();
                int result = fib(number);
                System.out.println("fib(" + number + ") = " + calls + " calls = " + result);
                calls = 0;
            }
        }
    }
}
