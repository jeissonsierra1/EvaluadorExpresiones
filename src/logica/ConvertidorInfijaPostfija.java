/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;
import java.util.Stack;

/**
 *
 * @author sierr
 */
public class ConvertidorInfijaPostfija {
    
     public static String convertir(String expresion) {
        StringBuilder postfija = new StringBuilder();
        Stack<Character> pila = new Stack<>();
        
        for (char c : expresion.toCharArray()) {
            if (Character.isDigit(c)) {
                postfija.append(c);
            } else if (c == '(') {
                pila.push(c);
            } else if (c == ')') {
                while (!pila.isEmpty() && pila.peek() != '(') {
                    postfija.append(pila.pop());
                }
                pila.pop(); // Eliminar '('
            } else {
                while (!pila.isEmpty() && prioridad(c) <= prioridad(pila.peek())) {
                    postfija.append(pila.pop());
                }
                pila.push(c);
            }
        }
        
        while (!pila.isEmpty()) {
            postfija.append(pila.pop());
        }
        
        return postfija.toString();
    }

    private static int prioridad(char operador) {
        return switch (operador) {
            case '+', '-' -> 1;
            case '*', '/' -> 2;
            default -> -1;
        };
    }
    
}
