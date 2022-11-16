package pilaadt;

/**
 * @author Eduardo Salazar
 * @param <T>
 */
public class NodoPila <T> {

    private T dato;
    private NodoPila<T> siguiente;

    public NodoPila() {
    }

    public NodoPila(T valor) {
        this.dato = valor;
    }

    public NodoPila(T dato, NodoPila<T> siguiente) {
        this.dato = dato;
        this.siguiente = siguiente;
    }

    public NodoPila<T> getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoPila<T> siguiente) {
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
