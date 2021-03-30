import java.util.Scanner;

public class intervalo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, x, in = 0, out = 0;

        n = input.nextInt();
        if (n < 10000) {
            for (int i = 0; i < n; i++) {
                x = input.nextInt();
                if (x >= 10 && x <= 20) in++;
                else out++;
            }
            System.out.println(in + " in");
            System.out.println(out + " out");
        }
    }
}
