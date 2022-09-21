package conjuntoadt;

import java.util.*;

/**
 * @author Eduardo Salazar
 * @param <T>
 */
public class ConjuntoADT<T> {

    Scanner sc = new Scanner(System.in);
    ArrayList<T> conjunto;

    public ConjuntoADT() {
        this.conjunto = new ArrayList();
    }

    public int longitud() {
        return this.conjunto.size();
    }

    public boolean contieneElemento(T elem) {
        boolean a;
        if (this.conjunto.contains(elem)) {
            System.out.println("El valor ya existe en el conjunto");
            a = true;
        } else {
            System.out.println("El valor no existe en el conjunto");
            a = false;
        }
        return a;
    }

    public void agregarElemento(T elem) {
        if (!this.conjunto.contains(elem)) {
            this.conjunto.add(elem);
        } 
    }

    public void eliminarElem(T elem) {
        if (this.conjunto.contains(elem)) {
            this.conjunto.remove(elem);
        } else {
            System.out.println("El valor no existe en el conjunto");
        }
    }

    public boolean igualar(ConjuntoADT conj) {
        boolean b;
        if (this.conjunto.equals(conj.conjunto)) {
            System.out.println("Los conjuntos son iguales");
            b = true;
        } else {
            System.out.println("Los conjuntos no son iguales");
            b = false;
        }
        return b;
    }

    public boolean esSubconjunto(ConjuntoADT conj) {
        boolean c;
        if (this.conjunto.containsAll(conj.conjunto)) {
            System.out.println("El conjunto " + this.conjunto + " es subconjunto de " + conj.conjunto);
            c = true;
        } else {
            System.out.println("El conjunto " + this.conjunto + " no es subconjunto de " + conj.conjunto);
            c = false;
        }
        return c;
    }

    public ConjuntoADT union(ConjuntoADT conj) {
        for (T i:this.conjunto){            
            if (!conj.conjunto.contains(i)){
                conj.conjunto.add(i);
            }
        }
        return conj;
    }

    public ConjuntoADT interseccion(ConjuntoADT conj) {
        ConjuntoADT nuevo = new ConjuntoADT();
        for (T i: this.conjunto){
            if(conj.conjunto.contains(i)){
                nuevo.conjunto.add(i);
            }
        }
        return nuevo;       
    }

    public ConjuntoADT diferencia(ConjuntoADT conj){
        ConjuntoADT nuevo = new ConjuntoADT();
        for (T i: this.conjunto){
            if(!conj.conjunto.contains(i)){
                nuevo.conjunto.add(i);
            }
        }
        if(nuevo.conjunto.isEmpty()){
            return this;
        }               
        return nuevo;
    }
    
    public String iterador(){
        String s = "";
        for (T i : this.conjunto) {
            s += i + ", ";
        }
        return s;
    }

}
