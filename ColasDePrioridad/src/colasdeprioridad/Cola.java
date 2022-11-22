package colasdeprioridad;

import java.util.ArrayList;

/**
 * @author Eduardo Salazar
 * @param <T>
 */
public class Cola <T>{

    private ArrayList<T> elem;

    public Cola() {
        this.elem = new ArrayList<>();
    }

    public boolean isEmpty() {
        return this.elem.isEmpty();
    }

    public void enqueue(T valor) {
        this.elem.add(valor);
    }

    public T dequeue() {
        if (isEmpty()) {
            return (T) "La cola esta vacia";
        } else {
            T aux = elem.get(0);
            elem.remove(0);
            return aux;
        }
    }

    public int tamaño() {
        return elem.size();
    }

    @Override
    public String toString() {
        for (int i = 0; i < elem.size(); i++) {
            System.out.println(elem.get(i));
        }
        return "";
    }
}
