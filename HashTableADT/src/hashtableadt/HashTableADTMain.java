package hashtableadt;

/**
 *
 * @author Eduardo Salazar
 */
public class HashTableADTMain {

    public static void main(String[] args) {
        HashTableADT tabla = new HashTableADT(7);
        
        tabla.add(135, "A");
        tabla.add(592, "B");
        tabla.add(258, "C");
        tabla.add(982, "D");
        tabla.add(12, "E");
        tabla.add(357, "F");
        tabla.add(452, "G");
        
        System.out.println("Valor de la llave 135: " + tabla.valueOf(135));
        System.out.println("Valor de la llave 12: " + tabla.valueOf(12));
        System.out.println("Valor de la llave 982: " + tabla.valueOf(982));
        
        tabla.remove(12);
        tabla.remove(982);
        tabla.remove(357);
    }

}
