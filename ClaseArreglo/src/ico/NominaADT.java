package ico;

import clasearreglo.Arreglo;
import clasearreglo.Empleado;

/**
 * @author Eduardo Salazar
 */
public class NominaADT {
    
    String nombreEmpresa;
    Arreglo<Empleado> nomina;
    String rutaArchivo;
    
    public NominaADT (String ruta){
        this.rutaArchivo = ruta;
    }
           
}
