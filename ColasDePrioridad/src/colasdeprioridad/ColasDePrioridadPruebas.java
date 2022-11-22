package colasdeprioridad;

/**
 * @author Eduardo Salazar
 */
public class ColasDePrioridadPruebas {

    public static void main(String[] args) {

        ColasDePrioridad Barco = new ColasDePrioridad(5);

        Barco.enqueue(4, "Maestre");
        Barco.enqueue(2, "Niños");
        Barco.enqueue(4, "Mecanico");
        Barco.enqueue(3, "Mujeres");
        Barco.enqueue(1, "Niñas");
        Barco.enqueue(3, "Hombres");
        Barco.enqueue(5, "Capitan");
        Barco.enqueue(4, "Vigia");
        Barco.enqueue(4, "Timonel");
        Barco.enqueue(2, "Ancianos");

        System.out.println(Barco.is_Empty());
        System.out.println(Barco.length());
        Barco.toString();
        
        System.out.println("\n");
        Barco.dequeue();
        Barco.dequeue();
        Barco.dequeue();
        Barco.dequeue();
        Barco.dequeue();

        Barco.toString();
    }
}
