package colasadt;

/**
 * @author Eduardo Salazar
 */
public class PruebasColasADT {

    public static void main(String[] args) {
       
        ColasADT<Integer> datos = new ColasADT<>();
        
        System.out.println(datos.isEmpty());
        
        System.out.println(datos.length());
        
        datos.enqueue(new NodoCola(1));
        datos.enqueue(new NodoCola(2));
        datos.enqueue(new NodoCola(3));
        datos.enqueue(new NodoCola(4));
        datos.enqueue(new NodoCola(5));
        datos.enqueue(new NodoCola(6));
        datos.enqueue(new NodoCola(7));
        
        datos.transversal();
        
        System.out.println("\n");
        System.out.println(datos.isEmpty());
        System.out.println(datos.length());
        
        datos.dequeue();
        datos.transversal();
        System.out.println("\n");
        datos.dequeue();
        datos.dequeue();
        datos.dequeue();
        datos.transversal();
    }
    
}
