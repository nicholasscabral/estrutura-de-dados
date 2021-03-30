import java.util.Scanner;

public class posNegImparPar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        int pares = 0, impares = 0, positivos = 0, negativos = 0;

        for (int i = 0; i < 5; i++) {
            number = input.nextInt();

            if (number % 2 == 0) {
                pares++;
                if (number > 0) positivos++;
                else if (number < 0) negativos++;
            } else {
                impares++;
                if (number > 0) positivos++;
                else if (number < 0) negativos++;
            }
        }
        System.out.println(pares + " valor(es) par(es)");
        System.out.println(impares + " valor(es) impar(es)");
        System.out.println(positivos + " valor(es) positivo(s)");
        System.out.println(negativos + " valor(es) negativo(s)");
    }
}

