package listaligadaadt;

/**
 * @author Eduardo Salazar
 */
public class PruebasListaLigadaADT {

    public static void main(String[] args) throws ListaExcepcion {
        
        ListaLigadaADT lista = new ListaLigadaADT(); //Constructor
        
        System.out.println(lista.estaVacia()); //Metodo ¿esta vacia?
        
        System.out.println(lista.getTamanio()); //Metodo get tamaño
        
        lista.agregarAlFinal(1); //Metodo agregar al Final
        lista.transversal();
        System.out.println("\n");
        
        lista.agregarAlFinal(5);
        lista.agregarAlFinal(3);
        lista.agregarAlFinal(4);
        lista.agregarAlFinal(9);
        lista.agregarAlFinal(7);
        lista.agregarAlFinal(8);
                
        lista.agregarAlInicio(3); //Metodo agregar al Inicio
        lista.transversal();
        System.out.println("\n");
        
        lista.agregarDespuesDe(1,10); //Metodo agregar Despues de
        lista.transversal();
        System.out.println("\n");
        
        lista.Eliminar(1); //Metodo Eliminar
        lista.transversal();
        System.out.println("\n");
        
        lista.eliminarUltimoElem(); //Metodo Eliminar ultimo elemento
        lista.transversal();
        System.out.println("\n");
        
        lista.eliminarPrimerElem(); //Metodo Eliminar ultimo elemento
        lista.transversal(); //Metodo transversal
        System.out.println("\n");
        
        /*lista.Buscar(3); //Metodo Buscar
        lista.transversal();
        System.out.println("\n");*/

        lista.actualizar(); //Metodo actualizar
    }
}
