package hashtableadt;

/**
 * @author Eduardo Salazar
 * @param <T>
 */
public class HashTableADT<T> {

    private Arreglo<LinkedList<T>> datos;
    private int tam;

    public HashTableADT(int tam) {
        if (this.tam >= 7 && this.primo(tam)) {
            this.tam = tam;
            this.datos = new Arreglo<>(tam);
            for (int i = 0; i < this.datos.getLength(); i++) {
                this.datos.setElemento(i, new LinkedList<>());
            }
        } else {
            System.out.println("El tamaño de la tabla debe ser primo");
        }
    }

    public void add(int llave, T valor) {
        int indice = this.hash(llave);
        if (this.datos.getElemento(indice).isEmpty()) {
            this.datos.getElemento(indice).agregarAlInicio(llave, valor);
        } else {
            this.datos.getElemento(indice).agregarAlFinal(llave, valor);
        }
    }

    public void remove(int llave) {
        int indice = this.hash(llave);
        if (this.datos.getElemento(indice).getLength() > 1) {
            T valorObt = this.datos.getElemento(indice).getValorLlave(llave);
            int posObt = this.datos.getElemento(indice).buscar(valorObt);
            this.datos.getElemento(indice).eliminar(posObt);
        } else {
            this.datos.getElemento(indice).eliminarElPrimero();
        }
    }

    public T valueOf(int llave) {
        int indice = this.hash(llave);
        T valorObt;

        if (this.datos.getElemento(indice).getLength() > 1) {
            valorObt = this.datos.getElemento(indice).getValorLlave(llave);
        } else {
            valorObt = this.datos.getElemento(indice).valorHead();
        }
        return valorObt;
    }

    private int hash(int llave) {
        return llave % this.tam;
    }

    private boolean primo(int numero) {
        if (numero % 2 == 0) {
            return false;
        }
        for (int i = 3; i * i <= numero; i += 2) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}
