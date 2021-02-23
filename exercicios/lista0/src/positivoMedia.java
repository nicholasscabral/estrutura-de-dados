import java.util.Scanner;

public class positivoMedia {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double number;
        double soma = 0;
        int contador = 0;
        double media;

        for (int i = 0; i <= 5; i++) {
            number = input.nextDouble();
            if (number > 0) {
                soma += number;
                contador++;
            }
        }
        media = soma/contador;
        System.out.println(contador + " valores positivos");
        System.out.printf("%.1f\n", media);
    }
}
