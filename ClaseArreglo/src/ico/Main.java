package ico;
import java.io.*;

/**
 *
 * @author Eduardo Salazar
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        BufferedReader fd = null;
        String linea = "";
        try {
            fd = new BufferedReader (new FileReader ("C:\\Users\\Eduardo Salazar\\Documents\\FES\\EDD_1310\\junio.dat"));
        }
        catch (FileNotFoundException e) {
            System.out.println ("No pude abrir el archivo");
        }
        try {
            while ((linea = fd.readLine ()) != null)
                System.out.println (linea);
                fd.close ();
            }
        catch (IOException e) {
            System.out.println ("Error al leer");
        }
    }
}
 


