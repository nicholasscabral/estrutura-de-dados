import java.util.Scanner;

public class Pokemon {
    public static void main(String[] args) {
        ListaDinamica listaPokemons = new ListaDinamica();

        int capturados;
        Scanner input = new Scanner(System.in);

        capturados = input.nextInt();

        for (int i = 0; i < capturados; i++) {
            String pokemon = input.next();

            if (!listaPokemons.contains(pokemon)) {
                listaPokemons.add(pokemon);
            }
        }
        int faltam = 151 - listaPokemons.size();
        System.out.println("Falta(m) " + faltam + " pokemon(s).");
    }
}
