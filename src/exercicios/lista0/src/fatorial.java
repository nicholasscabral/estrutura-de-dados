import java.util.Scanner;

public class fatorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number, multi;

        number = input.nextInt();
        multi = number - 1;
        if (number > 0 && number < 13) {
            while (multi > 0) {
                number *= multi;
                multi--;
            }
        }
        System.out.println(number);
    }
}
