package TreeMapMain;

import java.util.Iterator;
import java.util.TreeMap;

/**
 * @author Eduardo Salazar
 */
public class MapaArbol {

    public static void main(String[] args) {

        TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();
        
        //Metodo para añadir pares llave-valor al Tree Map
        treeMap.put(1, "Enero");
        treeMap.put(2, "Febrero");
        treeMap.put(3, "Marzo");
        treeMap.put(4, "Abril");
        treeMap.put(5, "Mayo");
        treeMap.put(6, "Junio");
        treeMap.put(7, "Julio");
        treeMap.put(8, "Agosto");
        treeMap.put(9, "Septiembre");
        treeMap.put(10, "Octubre");
        treeMap.put(11, "Noviembre");
        treeMap.put(12, "Diciembre");

        //Metodo para conocer el tamaño actual del Tree Map
        System.out.println(treeMap.size());

        //Metodo para hacer un sub mapa del Tree Map
        System.out.println(treeMap.subMap(7, 13));
        
        //Metodo para saber la llave de la raiz del Tree Map
        System.out.println("Primera llave: " + treeMap.firstKey());
        
        //Metodo para saber el valor y llave de la raiz del Tree Map
        System.out.println("Primer par: " + treeMap.firstEntry());

        //Metodo para verificar si existe la llave enviada
        System.out.println(treeMap.containsKey(10));
        
        //Metodo para verificar si existe el valor enviado
        System.out.println(treeMap.containsValue("Diciembre"));
        
        //Metodo para remover un elemento a través de su llave
        System.out.println("Elemento removido: " + treeMap.remove(2));
        
        //Metodo para imprimir los valores del Tree Map
        System.out.println(treeMap.values());
        
        //Metodo para imprimir las llaves y valores del Tree Map
        Iterator it = treeMap.keySet().iterator();
        while (it.hasNext()) {
            int key = (int) it.next();
            System.out.println("Llave: " + key + " -> Valor: " + treeMap.get(key));
        }
    }
}
