import java.util.ArrayList;
import java.util.Scanner;

public class numeroPrimo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        boolean ehprimo = true;
        int rep = input.nextInt();
        ArrayList<Integer> numeros = new ArrayList<Integer>();

        if (rep >= 1 && rep <= 100) {
            for (int i = 0; i < rep; i++) {
                number = input.nextInt();
                numeros.add(number);
            }
            for (Integer numero : numeros) {
                for (int j = 2; j < numero; j++) {
                    if (numero % j == 0) {
                        ehprimo = false;
                        break;
                    }
                }
                if (ehprimo) System.out.println(numero + " eh primo");
                else System.out.println(numero + " nao eh primo");
                ehprimo = true;
            }
        }
    }
}
