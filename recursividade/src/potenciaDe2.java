import java.util.Scanner;

public class potenciaDe2 {

    public static double potencia(int n) {
        if (n == 0) {
            return 1;
        }
        else if (n < 0) {
            return 1 / potencia(-n);
        }
        else {
            return 2 * potencia(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        System.out.println(potencia(n));
    }
}
