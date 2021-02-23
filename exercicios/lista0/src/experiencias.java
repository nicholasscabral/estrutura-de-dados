import java.util.Scanner;

public class experiencias {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String valores;
        int total = 0, coelhos = 0, ratos = 0, sapos = 0;

        int rep = input.nextInt();
        for (int i = 0; i < rep; i++) {
            int quantia = input.nextInt();
            String tipo = input.next();

            if (quantia >= 1 && quantia <= 15) {
                total += quantia;
                if (tipo.equals("C")) coelhos += quantia;
                else if (tipo.equals("R")) ratos += quantia;
                else if (tipo.equals("S")) sapos += quantia;
            }
        }
        double porcentagemCoelhos = (double) coelhos/total * 100;
        double porcentagemRatos = (double) ratos/total * 100;
        double porcentagemSapos = (double) sapos/total * 100;

        System.out.println("Total: " + total + " cobaias");
        System.out.println("Total de coelhos: " + coelhos);
        System.out.println("Total de ratos: " + ratos);
        System.out.println("Total de sapos: " + sapos);
        System.out.println("Percentual de coelhos: " + String.format("%.2f", porcentagemCoelhos) + " %");
        System.out.println("Percentual de ratos: " + String.format("%.2f", porcentagemRatos) + " %");
        System.out.println("Percentual de sapos: " + String.format("%.2f", porcentagemSapos) + " %");

    }
}
