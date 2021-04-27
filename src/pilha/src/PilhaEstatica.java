public class PilhaEstatica {
    private Object v[];
    private int contador;

    public PilhaEstatica() {
        v = new Object[10];
        contador = 0;
    }

    public PilhaEstatica(int valor) {
        v = new Object[valor];
        contador = 0;
    }

    public void push(Object valor) {
        if (contador != v.length) {
            v[contador] = valor;
            contador++;
        }
        else {

        }
    }

    public void pop() {

    }

    public boolean isEmpty() {
       if (contador > 0)
           return false;
       else
           return true;
    }
}
