import java.util.Scanner;

public class Figurinhas {

    public static int mdc(int x, int y) {
        if (x % y == 0)
            return y;
        else
            return mdc(y, x % y);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int cases = input.nextInt();
        if (1 <= cases && cases <= 3000) {
            for (int i = 0; i < cases; i++) {
                int ricardo = input.nextInt();
                int vicente = input.nextInt();
                if (1 <= ricardo && ricardo <= 1000 && 1000 >= vicente && vicente >= 1) {
                    if (ricardo > vicente)
                        System.out.println(mdc(ricardo, vicente));
                    else if (vicente > ricardo)
                        System.out.println(mdc(vicente, ricardo));
                }
            }
        }
    }
}
