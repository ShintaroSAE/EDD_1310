package colasadt;

import java.util.ArrayList;

/**
 * @author Eduardo Salazar
 * @param <T>
 */
public class ColasADT<T> {

    NodoCola<T> ini, fin;
    int tam;

    public ColasADT() {
        ini = fin = null;
        tam = 0;
    }

    public boolean isEmpty() {
        return tam == 0;
    }

    public int length() {
        return tam;
    }

    public void enqueue(NodoCola valor) {
        if (ini == null) {
            ini = fin = valor;
        } else {
            fin.setSiguiente(valor);
            fin = valor;
        }
        tam++;
    }

    public NodoCola dequeue() {
        NodoCola aux = ini;
        if (ini != null) {
            ini = ini.getSiguiente();
            tam--;
        }
        return aux;
    }

    public void transversal() {
        int cont = 0;
        NodoCola aux = ini;
        while (cont < tam) {
            System.out.print("|" + aux.getDato() + "|" + "<--");
            aux = aux.getSiguiente();
            cont++;
        }
    }
}