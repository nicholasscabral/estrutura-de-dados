import java.util.Scanner;

public class numerosPares {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        int pares = 0;

        for (int i = 0; i < 5; i++) {
            number = input.nextInt();

            if (number % 2 == 0) pares++;
        }
        System.out.println(pares + " valores pares");
    }
}
