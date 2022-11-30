package hashtableadt;

import java.util.ArrayList;

/**
 * @author Eduardo Salazar
 * @param <T>
 */
public class Arreglo<T> {

    private int tam;
    private ArrayList<T> datos;

    public Arreglo(int tam) {
        this.tam = tam;
        datos = new ArrayList<>();
        for (int i = 0; i < tam; i++) {
            datos.add(null);
        }
    }
    
    public int getLength(){
        return tam;
    }
    
    public void setElemento(int indice, T Elemento) {
        if (indice >= 0 && indice < this.tam) {
            datos.set(indice, Elemento);
        }
    }
    
    public T getElemento(int indice) {
        if (indice >= 0 && indice < this.tam) {
            return datos.get(indice);
        }
        return null;
    }
    
    public void limpiar(T dato) {
        for (int i = 0; i < tam; i++) {
            datos.set(i, dato);
        }
    }
    
    @Override
    public String toString() {
        return " + [datos.toString()]";
    }
}
