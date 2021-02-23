import java.util.Scanner;

public class combustivel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int escolha, alcool = 0, gasolina = 0, diesel = 0;

        while (true) {
            escolha = input.nextInt();
            if (escolha >= 1 && escolha <= 4) {
                if (escolha == 1) alcool++;
                else if (escolha == 2) gasolina++;
                else if (escolha == 3) diesel++;
                else if (escolha == 4) break;
            }
        }
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);
    }
}
