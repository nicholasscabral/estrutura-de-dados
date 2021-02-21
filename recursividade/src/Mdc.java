public class Mdc {
    //Algoritimo de Euclides recursivo
    public static int mdc(int a, int b) {
        if (b == 0) return a;
        int resto = a % b;
        a = b;
        b = resto;
        return mdc(a, b);
    }

    public static void main(String[] args) {
        System.out.println(mdc(20, 8)); // 4
    }
}
