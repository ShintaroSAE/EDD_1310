package StackBalanceo;

import java.util.Objects;
import java.util.Stack;
/**
 * @author Eduardo Salazar
 * @param <T>
 */
public class BalanceoSimbolos<T>{
       
    Stack<T> PilaBal = new Stack<>();

    public BalanceoSimbolos() {
    }
            
    public boolean Balanceo(String texto) {
        Stack<Character> Pila = new Stack<>();
        for (Character c : texto.toCharArray()) {
            if (c == '(') {
                Pila.push(')');
            } else if (c == '{') {
                Pila.push('}');
            } else if (c == '[') {
                Pila.push(']');
            } else if (Pila.isEmpty() || !Objects.equals(Pila.pop(), c)) {
                return false;
            }
        }
        return Pila.isEmpty();
    }
    
    
}
