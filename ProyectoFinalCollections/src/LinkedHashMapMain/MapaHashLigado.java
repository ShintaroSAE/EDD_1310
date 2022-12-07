package LinkedHashMapMain;

import java.util.Iterator;
import java.util.LinkedHashMap;

/**
 * @author Eduardo Salazar
 */
public class MapaHashLigado {

    public static void main(String[] args) {

        LinkedHashMap<Integer, String> liHashMap = new LinkedHashMap<Integer, String>();

        //Añade un elemento al Linked Hash Map con pares llave-valor
        liHashMap.put(1, "A");
        liHashMap.put(2, "B");
        liHashMap.put(3, "C");
        liHashMap.put(4, "D");
        liHashMap.put(5, "E");
        liHashMap.put(6, "F");
        liHashMap.put(7, "G");
        liHashMap.put(8, "H");
        liHashMap.put(9, "I");
        liHashMap.put(10, "J");

        //Metodo para verificar el tamaño del Linked Hash Map
        System.out.println("Tamanio del Linked Hash Map: " + liHashMap.size());

        //Metodo para saber si el Linked Hash Map está vacío
        System.out.println(liHashMap.isEmpty());

        //Metodo para obtener un dato a través de su llave
        System.out.println("Dato de la llave 1: " + liHashMap.get(1));

        //Metodo para saber si existe una llave igual al parametro enviado
        System.out.println(liHashMap.containsKey(20));

        //Metodo para saber si existe un valor igual al parametro enviado
        System.out.println(liHashMap.containsValue("A"));

        //Metodo para remover un elemento a través de su llave
        System.out.println("Elemento removido: " + liHashMap.remove(3));

        //Imprimimos los valores del Map sin su llave
        System.out.println(liHashMap.values());

        //Iteramos para obtener los valores del Map con su llave
        Iterator it = liHashMap.keySet().iterator();
        while (it.hasNext()) {
            int key = (int) it.next();
            System.out.println("Llave: " + key + " -> Valor: " + liHashMap.get(key));
        }

    }

}
