import java.util.Scanner;

public class numeroPositivos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double number;
        int contador = 0;

        for (int i = 0; i <= 5; i++) {
            number = input.nextDouble();

            if (number > 0) contador++;
        }
        System.out.println(contador + " valores positivos");
    }
}
