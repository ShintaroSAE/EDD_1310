package hashtableadt;

/**
 * @author Eduardo Salazar
 * @param <T>
 */
public class Nodo<T> {

    private T dato;
    private int llave;
    private Nodo<T> siguiente;

    public Nodo() {
    }

    public Nodo(int key, T valor) {
        this.dato = valor;
        this.llave = key;
    }
    
    public Nodo(T dato, Nodo<T> siguiente, int key) {
        this.dato = dato;
        this.siguiente = siguiente;
        this.llave = key;
    }
    
    public Nodo<T> getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo<T> siguiente) {
        this.siguiente = siguiente;
    }

    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    public int getLlave() {
        return llave;
    }

    @Override
    public String toString() {

        return "|" + dato + "| -->";
    }

    public String printTodo() {
        return "[Dato = " + dato + "] -> [Siguiente : " + this.getSiguiente() + "]";
    }
}
