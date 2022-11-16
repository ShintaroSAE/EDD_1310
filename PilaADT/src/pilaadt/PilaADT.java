package pilaadt;

import java.util.ArrayList;

/**
 * @author Eduardo Salazar
 * @param <T>
 */
public class PilaADT<T> {

    NodoPila<T> top;
    int tamanio;
    
    
    public PilaADT() {
        top = null;
        tamanio = 0;
    }     

    public boolean isEmpty() {
        return tamanio == 0;
    }

    public int length() {
        return tamanio;
    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("La pila esta vacia, no se logro obtener un elemento");
        } else {
            System.out.println("Elemento sacado: " + top.getDato());
            top = top.getSiguiente();
            tamanio--;
        }
    }

    public void peek() {
        if (isEmpty()) {
            System.out.println("La pila esta vacia, no se logro obtener un elemento");
        } else {
            System.out.println("Elemento actual en el tope: " + top.getDato());
        }
    }
    
    public void push(T dato) {
        NodoPila<T> aux = new NodoPila(dato, top);
        top = aux;
        tamanio++;
    }

    public void transversal() {
        int cont = 0;
        NodoPila aux = top;
        while (cont < tamanio) {
            System.out.print(aux.getDato());
            aux = aux.getSiguiente();
            cont++;
        }
    }
}
