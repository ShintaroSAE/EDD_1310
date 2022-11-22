package colasdeprioridad;

import java.util.ArrayList;

/**
 * @author Eduardo Salazar
 * @param <T>
 */
public class Arreglo <T>{

    int tamanio;
    ArrayList<T> datos;

    public Arreglo(int tam) {
        this.tamanio = tam;
        datos = new ArrayList(this.tamanio);
        for (int i = 0; i < this.tamanio; i++) {
            this.datos.add(null);
        }
    }

    public T getElemento(int indice) {
        if (comprobar(indice)) {
            return this.datos.get(indice);
        }
        return null;
    }

    private boolean comprobar(int indice) {
        return indice >= 0 && indice < this.tamanio;
    }

    public void setElemento(int indice, T dato) {
        if (comprobar(indice)) {
            this.datos.set(indice, dato);
        }
    }

    public int getLongitud() {
        return this.tamanio;
    }

    public void limpiar(T dato) {
        for (int i = 0; i < this.tamanio; i++) {
            this.datos.set(i, dato);
        }
    }

    public void agregar(T dato) {
        this.datos.add(dato);
    }

    public String toString() {
        String estado = "";
        for (T dato : datos) {
            if (dato != null) {
                estado += dato.toString() + "\n";
            }
        }
        return estado;
    }
}
