package pruebasnodo;

/**
 * @author Eduardo Salazar
 */
public class PruebasNodo {

    public static void main(String[] args) {

        Nodo<Integer> head = new Nodo(10);

        head.setSiguiente(new Nodo(20, null));

        head.getSiguiente().setSiguiente(new Nodo(30));

        System.out.println(head.getSiguiente().getSiguiente().getDato());

        head.getSiguiente().getSiguiente().setSiguiente(new Nodo(5, new Nodo(6)));

        Nodo<Integer> aux = head;

        while (aux.getSiguiente() != null) {
            aux = aux.getSiguiente();
        }
        aux.setSiguiente(new Nodo(7));

        Nodo<Integer> nums = new Nodo(1, new Nodo(2, new Nodo(3, new Nodo(4, null))));

        aux = head;
        System.out.println("Transversal...");
        while (aux != null) {
            System.out.print(aux);
            aux = aux.getSiguiente();
        }
        System.out.println("\n");
                
        while (nums != null) {
            System.out.print(nums);
            nums = nums.getSiguiente();
            
            
        }
    }

}
