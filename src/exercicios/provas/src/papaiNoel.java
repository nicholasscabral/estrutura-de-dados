import java.util.Scanner;

public class papaiNoel {
    public static void main(String[] args) {
        ListaAlfabetica lista = new ListaAlfabetica();

        int comportaram = 0;
        int naocomportaram = 0;
        Scanner input = new Scanner(System.in);

        int nomes = input.nextInt();

        for (int i = 0; i < nomes; i++) {
            String comportou = input.next();
            String nome = input.next();

            if (comportou.equals("+")) comportaram++;
            else if (comportou.equals("-")) naocomportaram++;

            lista.add(nome);
        }

        lista.list();
        System.out.println("Se comportaram: " + comportaram + " | Nao se comportaram: " + naocomportaram);
    }
}
