import java.util.Scanner;

public class fibonacciRecursivo {
    public static int fibonacci(int n) {
        if (n == 1) return 0;
        else if (n == 2) return 1;
        else {
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;

        System.out.print("número de termos da sequência: ");
        number = input.nextInt();

        for (int i = 1; i <= number; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}
