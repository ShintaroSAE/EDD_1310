package listaligadaadt;

/**
 * @author Eduardo Salazar
 * @param <T>
 */
public class ListaLigadaADT<T> {

    Nodo<T> head;
    Nodo<T> fin;
    int tamanio;

    public ListaLigadaADT() {

    }

    public boolean estaVacia() {
        return this.head == null;
    }

    public int getTamanio() {
        return this.tamanio;
    }

    public void agregarAlFinal(T valor) {
        Nodo nuevo = new Nodo(valor, null);
        if (head == null) {
            head = nuevo;
        } else {
            fin.setSiguiente(nuevo);
            fin = nuevo;
            actualizar();
        }
        tamanio++;
    }

    public void agregarAlInicio(T valor) {
        if (this.head == null) {
            this.head = new Nodo(valor);
        } else {
            Nodo aux = head;
            Nodo nuevo = new Nodo(valor);

            nuevo.setSiguiente(aux);
            head = nuevo;
            actualizar();
        }
        tamanio++;
    }

    public void agregarDespuesDe(T Refer, T valor) throws ListaExcepcion {

        if (head == null) {
            throw new ListaExcepcion("La lista está vacía.");
        }
        Nodo<T> actual = head;
        boolean band = false;
        while (!actual.getDato().equals(Refer) && !band) {
            if (actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
            } else {
                band = true;
            }
        }
        if (!band) {
            Nodo<T> nodo = new Nodo<>(valor);
            nodo.setSiguiente(actual.getSiguiente());
            actual.setSiguiente(nodo);
        } else {
            throw new ListaExcepcion("El nodo referencia no existe en la lista");
        }
        tamanio++;
        actualizar();
    }

    public void Eliminar(int posicion) {
        if (posicion == 0) {
            head = head.getSiguiente();
        } else {
            int cont = 0;
            Nodo aux = head;
            while (cont < posicion - 1) {
                aux = aux.getSiguiente();
                cont++;
            }
            aux.setSiguiente(aux.getSiguiente().getSiguiente());
        }
        tamanio--;
        actualizar();
    }

    public void eliminarUltimoElem() {
        int cont = 0;
        Nodo aux = head;
        while (cont < tamanio - 1) {
            aux = aux.getSiguiente();
            cont++;
        }
        aux.setSiguiente(null);
        tamanio--;
        if (tamanio == 0) {
            head = null;
        }
        actualizar();
    }

    public void eliminarPrimerElem() {
        if (head != null) {
            head = head.getSiguiente();
        }
        actualizar();
    }

    public int Buscar(T valor) {
        int cont = 0;
        Nodo aux = head;
        while (head.getDato() != valor) {
            aux = aux.getSiguiente();
            cont++;
        }
        actualizar();
        return cont;
    }

    public void actualizar() {
        Nodo aux = head;
        while (aux.getSiguiente() != null) {
            aux = aux.getSiguiente();
        }
        fin = aux;
    }

    public void transversal() {
        int cont = 0;
        Nodo aux = head;
        while (cont < tamanio) {
            System.out.print(aux.getDato() + "-->");
            aux = aux.getSiguiente();
            cont++;
        }
        actualizar();
    }
}
