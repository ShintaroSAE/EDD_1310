package hashtableadt;

/**
 * @author Eduardo Salazar
 * @param <T>
 */
public class LinkedList<T> {

    Nodo<T> head;
    int tamanio;

    public LinkedList() {
        this.head = null;
        this.tamanio = 0;
    }

    public boolean isEmpty() {
        return this.head == null;
    }

    public int getLength() {
        return tamanio;
    }

    public void agregarAlFinal(int llave, T dato) {
        Nodo nuevo = new Nodo(llave, dato);
        if (this.isEmpty()) {
            this.head = nuevo;
        } else {
            Nodo aux = this.head;
            while (aux.getSiguiente() != null) {
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
        }
        this.tamanio++;
    }

    public void agregarAlInicio(int llave, T dato) {
        Nodo nuevo = new Nodo(llave, dato);
        if (this.isEmpty()) {
            this.head = nuevo;
        } else {
            nuevo.setSiguiente(head);
            this.head = nuevo;
        }
        this.tamanio++;
    }

    public void agregarDespuesDe(int llave, T dato, int pos) {
        Nodo nuevo = new Nodo(llave, dato);
        Nodo aux = this.head;
        for (int i = 1; i <= pos - 1; i++) {
            aux = aux.getSiguiente();
        }
        nuevo.setSiguiente(aux.getSiguiente());
        aux.setSiguiente(nuevo);
        this.tamanio++;
    }

    public void eliminar(int pos) {
        Nodo aux = this.head;
        for (int i = 1; i <= pos - 1; i++) {
            aux = aux.getSiguiente();
        }
        aux.setSiguiente(aux.getSiguiente().getSiguiente());
        this.tamanio--;
    }

    public void eliminarElPrimero() {
        if (this.isEmpty()) {
            System.out.println("La lista ya esta vacia");
        } else {
            Nodo aux = this.head;
            aux = aux.getSiguiente();
            head = aux;
        }
        this.tamanio--;
    }

    public void eliminarElFinal() {
        if (this.isEmpty()) {
            System.out.println("La lista ya esta vacia");
        } else {
            Nodo aux = this.head;
            while (aux.getSiguiente().getSiguiente() != null) {
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(aux.getSiguiente().getSiguiente());
        }
        this.tamanio--;
    }

    public int buscar(T valor) {
        int posicion = 1;
        Nodo aux = this.head;
        while (aux.getDato() != valor) {
            aux = aux.getSiguiente();
            posicion++;
        }
        return posicion - 1;
    }

    public void actualizar(T valorBuscado, T valor) {
        Nodo aux = this.head;
        while (aux.getDato() != valorBuscado) {
            aux = aux.getSiguiente();
        }
        aux.setDato(valor);
    }
    
    public void transversal() {
        Nodo actual = this.head;
        while (actual != null) {
            System.out.print(actual);
            actual = actual.getSiguiente();
        }
        System.out.println("");
    }
    
    public T getValorLlave(int llave) {
        Nodo aux = this.head;
        while (aux.getLlave() != llave) {
            aux = aux.getSiguiente();
        }
        return (T) aux.getDato();
    }
    
    public T valorHead() {
        return this.head.getDato();
    }
}
