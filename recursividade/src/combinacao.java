import java.util.Scanner;

public class combinacao {
    // Metodo recursivo
    public static int comb(int n, int k) {
        if (k == 1) return n;
        else if (k == n) return 1;
        else if (1 < k && k < n) {
            return comb(n - 1, k - 1) + comb(n - 1, k);
        }
        return 0;
    }

    // Metodo NÃO recursivo
    public static int comb2(int n, int k) {
        return fat(n) / fat(k) * fat(n - k);
    }

    public static int fat(int n) {
        int aux = 1;
        for (int i = n; i > 0; i--) {
            aux *= i;
        }

        return aux;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int k = input.nextInt();
        System.out.println("é possivel formar " + comb(n, k) + " diferentes grupos"); // recursivo
        System.out.println("é possivel formar " + comb2(n, k) + " diferentes grupos"); // NÃO recursivo
    }
}
