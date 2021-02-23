import java.util.Scanner;

public class FlaviousJosephus {
    // Metodo recursivo
    // retorna o numero do sobrevivente
    public static int josephus(int n, int k) {
        if (n == 1) return 1;
        else
            return (josephus(n - 1, k) + k - 1) % n + 1;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int cases = input.nextInt();
        if (1 <= cases && cases <= 30) {
            for (int i = 1; i <= cases; i++) {
                int pessoas = input.nextInt();
                int salto = input.nextInt();
                if (1 <= pessoas && pessoas <= 10000 && 10000 >= salto && salto >= 1) {
                    int sobrevivente = josephus(pessoas, salto);
                    System.out.println("Case " + i + ": " + sobrevivente);
                }
            }
        }
    }
}
