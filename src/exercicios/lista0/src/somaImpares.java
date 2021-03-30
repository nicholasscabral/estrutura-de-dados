import java.util.Scanner;

public class somaImpares {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x, y;
        int somaImpar = 0;

        x = input.nextInt();
        y = input.nextInt();

        for (int i = y + 1; i < x; i++) {
            if (i % 2 == 1 || i % 2 == -1) somaImpar += i;
        }
        System.out.println(somaImpar);
    }
}
