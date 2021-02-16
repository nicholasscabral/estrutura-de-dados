public class sequencia2 {
    public static void main(String[] args) {
        double b = 1, a, valor, soma = 0;
        for (a = 1; a <= 39; a+= 2) {
            valor = a/b;
            soma += valor;
            b *= 2;
        }
        System.out.printf("%.2f\n", soma);
    }
}
