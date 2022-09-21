package adt2d;

import java.util.*;

/**
 * @author Eduardo Salazar
 * @param <T>
 */
public class Metodos2D {

    Scanner sc = new Scanner(System.in);
    int ren;
    int col;
    int[][] datos;

    public Metodos2D(int ren, int col) {
        this.ren = ren;
        this.col = col;
        datos = new int[this.ren][this.col];
        for (int i = 0; i < this.ren; i++) {
            for (int j = 0; j < this.col; j++) {
                datos[i][j] = 0;
            }
        }
    }

    public void setItem(int ren, int col, int valor) {
        int r = ren;
        int c = col;
        datos[r][c] = valor;
    }

    public int getItem(int ren, int col) {
        int r = ren;
        int c = col;
        return datos[r][c];
    }

    public int getRowSize() {
        return this.ren;
    }

    public int getColSize() {
        return this.col;
    }

    public void clear(int dato) {
        for (int i = 0; i < this.ren; i++) {
            for (int j = 0; j < this.col; j++) {
                datos[i][j] = dato;
            }
        }
    }

    @Override
    public String toString() {
        return "Arreglo: " + Arrays.toString(datos);
    }

}
