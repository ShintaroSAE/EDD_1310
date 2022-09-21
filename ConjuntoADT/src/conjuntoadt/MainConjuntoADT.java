package conjuntoadt;

import java.util.*;

/**
 * @author Eduardo Salazar
 */
public class MainConjuntoADT {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] nums = {1, 2, 3, 1, 4, 5, 6, 4, 3, 6, 8, 7, 5, 9, 10};
        int[] nums2 = {1, 2, 3, 1, 4, 5, 6, 4, 3, 6, 8, 7, 5, 9, 10};
        int[] nums3 = {1, 2, 11, 14, 12, 20, 15, 13};
        int[] nums4 = {1,3,5,6,7,8,9};
        int[] nums5 = {1,3,6,8,10,11,20};
        ConjuntoADT conj1 = new ConjuntoADT();//Constructor
        ConjuntoADT conj2 = new ConjuntoADT();
        ConjuntoADT conj3 = new ConjuntoADT();
        ConjuntoADT conj4 = new ConjuntoADT();
        ConjuntoADT conj5 = new ConjuntoADT();
        ConjuntoADT conj6 = new ConjuntoADT();
        ConjuntoADT conj7 = new ConjuntoADT();
        ConjuntoADT union;
        ConjuntoADT interseccion;
        ConjuntoADT diferencia;

        System.out.println("Tamanio del conjunto 1: " + conj1.longitud());//Metodo que regresa la longitud

        for (int i = 0; i < nums.length; i++) {
            conj1.agregarElemento(nums[i]);//Metodo para agregar elementos
            //Se introduce un arreglo de numeros en el conjunto como prueba
        }
        System.out.println(conj1.conjunto);

        for (int i = 0; i < nums2.length; i++) {
            conj2.agregarElemento(nums2[i]);
        }
        System.out.println(conj2.conjunto);

        for (int i = 0; i < nums3.length; i++) {
            conj3.agregarElemento(nums3[i]);
        }
        System.out.println(conj3.conjunto);
        
        for (int i = 0; i < nums.length; i++) {
            conj4.agregarElemento(nums[i]);
        }
        System.out.println(conj4.conjunto);
        
        for (int i = 0; i < nums3.length; i++) {
            conj5.agregarElemento(nums3[i]);
        }
        System.out.println(conj5.conjunto);
        
        for (int i = 0; i < nums4.length; i++) {
            conj6.agregarElemento(nums4[i]);
        }
        System.out.println(conj6.conjunto);
        
        for (int i = 0; i < nums5.length; i++) {
            conj7.agregarElemento(nums5[i]);
        }
        System.out.println(conj7.conjunto);
        
        System.out.println("Tamanio actual del conjunto 1: " + conj1.longitud());
        System.out.println("Tamanio actual del conjunto 2: " + conj2.longitud());
        System.out.println("Tamanio actual del conjunto 3: " + conj3.longitud());

        System.out.println("Ingrese un numero");
        int dato = sc.nextInt();
        conj1.contieneElemento(dato);//Metodo para verificar si el elemento ya existe en el conjunto

        System.out.println("Ingrese un numero a eliminar en el conjunto");
        int dato2 = sc.nextInt();
        conj1.eliminarElem(dato2);//Metodo de eliminacion
        System.out.println(conj1.conjunto);

        conj1.igualar(conj2);//Metodo de igualacion

        conj1.esSubconjunto(conj3);//Metodo de subconjunto

        union = conj1.union(conj3);//Metodo de union
        System.out.println("La union de los conjuntos es: " + union.conjunto);
        
        interseccion = conj4.interseccion(conj5);//Metodo de interseccion
        System.out.println("La interseccion de los conjuntos es: " + interseccion.conjunto);
        
        diferencia = conj1.diferencia(conj7);//Metodo de diferencia
        System.out.println("La diferencia de los conjuntos es: " + diferencia.conjunto);
        
        System.out.println(conj1.iterador());
    }

}
