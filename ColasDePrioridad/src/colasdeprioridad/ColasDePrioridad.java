package colasdeprioridad;

/**
 * @author Eduardo Salazar
 * @param <T>
 */
public class ColasDePrioridad<T> {

    private Arreglo prioridad;
    private int numPrio;

    public ColasDePrioridad(int Prioridades) {
        this.prioridad = new Arreglo<Cola>(Prioridades + 1);
        for (int i = 0; i <= Prioridades + 1; i++) {
            prioridad.setElemento(i, new Cola<>());
        }
        this.numPrio = Prioridades;
    }

    public int length() {
        int tam = 0;
        Cola aux1 = new Cola<>();
        for (int i = 0; i < numPrio - 1; i++) {
            aux1 = (Cola) prioridad.getElemento(i);
            tam = tam + aux1.tamaño();
        }
        return tam;
    }

    public boolean is_Empty() {
        return length() == 0;
    }

    public void enqueue(int prio, T elem) {
        Cola aux1 = new Cola<>();
        if (prio <= numPrio) {
            aux1 = (Cola) this.prioridad.getElemento(prio);
            aux1.enqueue(elem);

        } else {
            System.out.println("Prioridad no valida");
        }

    }

    public T dequeue() {
        Cola aux2 = new Cola<>();
        int prioAct = 0;
        while (aux2.isEmpty()) {
            if (prioAct > numPrio) {
                break;
            }
            aux2 = (Cola) prioridad.getElemento(prioAct);
            if (!aux2.isEmpty()) {

                return (T) aux2.dequeue();

            }
            prioAct++;
        }
        return (T) "";
    }

    @Override
    public String toString() {
        for (int i = 0; i < prioridad.getLongitud(); i++) {

            System.out.print(prioridad.getElemento(i));
        }
        return "";
    }

}
