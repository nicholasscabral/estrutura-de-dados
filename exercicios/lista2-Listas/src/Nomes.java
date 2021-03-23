import java.util.Scanner;

public class Nomes {
    public static void main(String[] args) {
        ListaDinamicaListas listaNomes = new ListaDinamicaListas();
        ListaOrdenadaCaracteres nomes = new ListaOrdenadaCaracteres();
        listaNomes.add(nomes);

        Scanner input = new Scanner(System.in);

        int cases = input.nextInt();

        for (int i = 0; i < cases; i++) {
            System.out.println("quantidade total de listas: " + listaNomes.size());
            //System.out.println("comecei a repetição");
            String nome = input.next();
            boolean added = false;

            for (int j = 0; j < listaNomes.size(); j++) {
                ListaOrdenadaCaracteres lista = listaNomes.searchList(j);
                System.out.println("verificando se " + nome + " pode entrar na lista " + (j + 1));

                if (!lista.containsChar(nome)) {
                    added = true;
                    System.out.println("adicionei " + nome + " na lista " + (j + 1));
                    lista.add(nome);
                    break;
                }
            }
            //System.out.println("adicionei ou nao o nome");
            if (!added) {
                System.out.println(nome + " nao pode entrar nessa lista");
                ListaOrdenadaCaracteres novaLista = new ListaOrdenadaCaracteres();
                listaNomes.add(novaLista);
                novaLista.add(nome);
                System.out.println("criei uma nova lista e adicionei " + nome);
            }
            added = false;
            //System.out.println("finalizei a repetição");
        }
        System.out.println("quantidade total de listas: " + listaNomes.size());
        listaNomes.list();
    }
}
