import java.util.Scanner;

public class maiorPosicao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number, maior = 0, posicao = 0;

        for (int i = 0; i < 100; i++) {
            number = input.nextInt();
            if (i == 0) maior = number;
            else if (number > maior) {
                maior = number;
                posicao = i + 1;
            }
        }
        System.out.println(maior);
        System.out.println(posicao);
    }
}
