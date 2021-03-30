import java.util.Scanner;

public class Nomes {
    public static void main(String[] args) {
        ListaDinamicaListas listaNomes = new ListaDinamicaListas();
        ListaOrdenadaCaracteres nomes = new ListaOrdenadaCaracteres();
        listaNomes.add(nomes);

        Scanner input = new Scanner(System.in);

        int cases = input.nextInt();

        for (int i = 0; i < cases; i++) {
            //System.out.println("quantidade total de listas: " + listaNomes.size());

            String nome = input.next();
            //System.out.println(nome);
            boolean added = false;

            for (int k = 0; k < listaNomes.size(); k++) {
                ListaOrdenadaCaracteres lista = listaNomes.searchList(k);
                //System.out.println("verificando se " + nome + " pode entrar na lista " + (k + 1));
                //System.out.println(lista);
                //System.out.println(lista.containsChar(nome));
                if (!lista.containsChar(nome)) {
                    //System.out.println("to entrando aqui");
                    added = true;
                    //System.out.println("adicionei " + nome + " na lista " + (k + 1));
                    lista.add(nome);
                    break;
                }
            }

            if (!added) {
                //System.out.println(nome + " nao pode entrar nessa lista");
                ListaOrdenadaCaracteres novaLista = new ListaOrdenadaCaracteres();
                listaNomes.add(novaLista);
                novaLista.add(nome);
                //System.out.println("criei uma nova lista e adicionei " + nome);
            }
        }
        //System.out.println("quantidade total de listas: " + listaNomes.size());
        listaNomes.list();
    }
}
