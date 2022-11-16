package pilaadt;

/**
 * @author Eduardo Salazar
 */
public class PilaPruebas {

    public static void main(String[] args) {
        
        PilaADT datos = new PilaADT();
        
        System.out.println(datos.isEmpty());
        
        System.out.println(datos.length());
        
        datos.pop();
        
        datos.peek();
        
        datos.push(new NodoPila<>(2));       
        datos.push(new NodoPila<>(3));
        datos.push(new NodoPila<>(4));       
        datos.push(new NodoPila<>(5));
        datos.push(new NodoPila<>(6));       
        datos.push(new NodoPila<>(7));
        
        datos.transversal();
        System.out.println("\n");
        
        System.out.println(datos.isEmpty());
        System.out.println(datos.length());
        datos.pop();
        datos.peek();
        datos.transversal();
          
    }

    
    
}
