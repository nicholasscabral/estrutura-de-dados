import java.util.Scanner;

public class idades {
    public static void main(String[] args)  {
        int idade, soma = 0, contador = 0;
        Scanner input = new Scanner(System.in);
        do{
            idade = input.nextInt();
            if (idade > 0){
                soma += idade;
                contador++;
            }
        }while(idade > 0);
        double media = (double) soma/contador;
        System.out.printf("%.2f\n", media);
    }
}