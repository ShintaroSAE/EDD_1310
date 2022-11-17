package pilaadt;

import java.io.*;
import StackBalanceo.BalanceoSimbolos;
/**
 * @author Eduardo Salazar
 */
public class PilaPruebas {

    public static void main(String[] args) throws FileNotFoundException {

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

        String textoNuevo = "";
        String texto2Nuevo = "";
        try {
            FileReader texto1 = new FileReader("C:\\Users\\Eduardo Salazar\\Documents\\texto1.txt");
            int i = 0;
            while (i != -1) {
                i = texto1.read();
                char c = (char) i;
                textoNuevo += c;
            }
        } catch (IOException e) {
            System.out.println("No se ha encontrado el archivo");
        }
        
        try {
            FileReader texto2 = new FileReader("C:\\Users\\Eduardo Salazar\\Documents\\texto2.txt");
            int i = 0;
            while (i != -1) {
                i = texto2.read();
                char c = (char) i;
                texto2Nuevo += c;
            }
        } catch (IOException e) {
            System.out.println("No se ha encontrado el archivo");
        }
        
        System.out.println("\n");
        BalanceoSimbolos PilaTexto1 = new BalanceoSimbolos();
        System.out.println(PilaTexto1.Balanceo(textoNuevo));
        BalanceoSimbolos PilaTexto2 = new BalanceoSimbolos();
        System.out.println(PilaTexto2.Balanceo(texto2Nuevo));
    }
}
