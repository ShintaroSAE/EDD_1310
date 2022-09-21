package adt2d;

import java.util.Scanner;

/**
 * @param <T>
 * @author Eduardo Salazar
 */
public class ADT2D {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca el numero de renglones");
        int ren = sc.nextInt();
        System.out.println("Introduzca el numero de columnas");
        int col = sc.nextInt();
        Metodos2D arr2D = new Metodos2D(ren, col);//Constructor

        System.out.println("\nIndique un indice de renglon");
        ren = sc.nextInt();
        System.out.println("Indique un indice de columna");
        col = sc.nextInt();
        System.out.println("Introduzca un dato");
        int dato = sc.nextInt();
        arr2D.setItem(ren, col, dato);//Metodo para colocar un dato en cierta posicion

        int item = arr2D.getItem(ren, col);//Metodo para obtener un valor en el indice i j
        System.out.println("El nuevo valor en el indice " + ren + ", " + col + " es " + item + "\n");

        int reng = arr2D.getRowSize();//Metodo para obtener el tamaño de los renglones
        System.out.println("Numero de renglones en el arreglo: " + reng);

        int colum = arr2D.getColSize();//Metodo para obtener el tamaño de las columnas
        System.out.println("Numero de columnas en el arreglo: " + colum + "\n");
        
        System.out.println("Indique un dato nuevo para limpiar");
        dato = sc.nextInt();
        arr2D.clear(dato);//Metodo para asignar un dato a todos los valores del arreglo

        System.out.println(arr2D.toString());//Metodo toString
    }

}
