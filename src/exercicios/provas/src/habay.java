import java.util.Scanner;

public class habay {
    public static void main(String[] args) {

        ListaAlfabetica listaSIM = new ListaAlfabetica();
        ListaAlfabetica listaNAO = new ListaAlfabetica();
        Scanner input = new Scanner(System.in);
        String vencedor = "";

        while (true) {
            String valor = input.next();
            if (valor.equals("FIM")) {
                break;
            }
            else {
                String nome = valor;
                String querSerAmigo = input.next();

                if (querSerAmigo.equals("YES")) {
                    if (!listaSIM.contains(nome)) {
                        listaSIM.add(nome);
                    }

                    int caracteres = nome.length();

                    if (caracteres > vencedor.length()) {
                        vencedor = nome;
                    }
                }
                else if (querSerAmigo.equals("NO") && !listaNAO.contains(nome)) {
                    listaNAO.add(nome);
                }
            }
        }

        listaSIM.list();
        listaNAO.list();
        System.out.println();
        System.out.println("Amigo do Habay:\n" + vencedor);
    }
}
