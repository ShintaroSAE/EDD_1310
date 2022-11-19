package colasadt;

/**
 * @author Eduardo Salazar
 * @param <T>
 */
public class NodoCola<T> {
    private T dato;
    private NodoCola<T> siguiente;

    public NodoCola() {
    }

    public NodoCola(T valor) {
        this.dato = valor;
    }

    public NodoCola(T dato, NodoCola<T> siguiente) {
        this.dato = dato;
        this.siguiente = siguiente;
    }

    public NodoCola<T> getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoCola<T> siguiente) {
        this.siguiente = siguiente;
    }

    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    @Override
    public String toString() {
        return "|" + dato + "| -->";
    }
}
