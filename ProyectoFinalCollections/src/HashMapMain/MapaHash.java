package HashMapMain;

import java.util.HashMap;
import java.util.Iterator;

/**
 * @author Eduardo Salazar
 */
public class MapaHash {

    public static void main(String[] args) {

        HashMap<Integer, String> hMap = new HashMap<Integer, String>();

        //Añade un elemento al Hash Map con pares llave-valor
        hMap.put(1, "Wil");
        hMap.put(2, "Sam");
        hMap.put(3, "Cielo");
        hMap.put(4, "Eduardo");
        hMap.put(5, "Victor");
        hMap.put(6, "Jesus");
        hMap.put(7, "Fabricio");
        hMap.put(8, "Bolafde");
        hMap.put(9, "Diego");
        hMap.put(10, "Gio");
        hMap.put(11, "Noble");

        //Con el siguiente metodo obtenemos el tamaño del Hash Map
        System.out.println("Tamanio del Hash Map: " + hMap.size());

        //El siguiente metodo nos dice si el Hash Map está vacio
        System.out.println(hMap.isEmpty());

        //Metodo para obtener algun dato a través de su llave
        System.out.println("Dato de la llave 2: " + hMap.get(2));

        //Metodo para remover algun dato del Map a través de su llave
        System.out.println("Dato removido: " + hMap.remove(6));

        //Metodo para saber si existe una llave con el parametro enviado
        System.out.println(hMap.containsKey(5));

        //Metodo para saber si existe un dato con el parametro enviado
        System.out.println(hMap.containsValue("Eduardo"));

        //Metodo que devuelve una colección con los valores del Map
        System.out.println(hMap.values());
        
        //Iterando para obtener los datos del 
        Iterator it = hMap.keySet().iterator();
        while(it.hasNext()){
            int key = (Integer) it.next();
            System.out.println("Llave: "+ key + " -> Dato: " + hMap.get(key));
        }
        
        //Metodo que limpia todo el Hash Map
        hMap.clear();
             
    }
}
