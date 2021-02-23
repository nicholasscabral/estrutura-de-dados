public class sequencia {
    public static void main(String[] args) {
        double denom = 1;
        double soma = 0;

        while (denom <= 100) {
            soma += 1 / denom;
            denom++;
        }

        System.out.printf("%.2f", soma);
    }
}
