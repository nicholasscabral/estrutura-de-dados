import java.util.Scanner;

public class grenais {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int gremio, inter, vitoriasGremio= 0, empate = 0, vitoriasInter = 0, continuar = 1, contador = 0;

        while (continuar == 1) {
            contador++;
            inter = input.nextInt();
            gremio = input.nextInt();

            if (inter == gremio) empate++;
            else if (inter > gremio) vitoriasInter++;
            else vitoriasGremio++;

            System.out.println("Novo grenal (1-sim 2-nao)");
            continuar = input.nextInt();
            if (continuar == 2) {
                System.out.println(contador + " grenais");
                System.out.println("Inter:" + vitoriasInter);
                System.out.println("Gremio:" + vitoriasGremio);
                System.out.println("Empates:" + empate);
                if (vitoriasGremio > vitoriasInter) System.out.println("Gremio venceu mais");
                else if (vitoriasGremio < vitoriasInter) System.out.println("Inter venceu mais");
                break;
            }
        }
    }
}
