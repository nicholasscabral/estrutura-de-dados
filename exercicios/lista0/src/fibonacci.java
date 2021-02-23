import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number, a = 0, b = 1, rep = 2;

        number = input.nextInt();

        if (number > 0 && number < 46) {
            while (rep < number) {
                System.out.print(a + " " + b + " ");
                a += b;
                b += a;
                rep += 2;
            }

            if (rep == number) System.out.print(a + " " + b);
            else System.out.print(a);

            System.out.println();
        }
    }
}
