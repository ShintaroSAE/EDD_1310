package listaligadaadt;

/**
 * @author Eduardo Salazar
 */
public class ListaExcepcion extends Exception{

    public ListaExcepcion() {
    }
    
    public ListaExcepcion (String mensaje){
        super(mensaje);
    }
}
