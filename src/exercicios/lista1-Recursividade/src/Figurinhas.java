import java.util.Scanner;

public class Figurinhas {

    public static int mdc(int x, int y) {
        if (y == 0) return x;
        int resto = x % y;
        x = y;
        y = resto;
        return mdc(x, y);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int cases = input.nextInt();
        for (int i = 0; i < cases; i++) {
            int x = input.nextInt();
            int y = input.nextInt();

            System.out.println(mdc(x, y));
        }

    }
}
