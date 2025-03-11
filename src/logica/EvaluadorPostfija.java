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
public class EvaluadorPostfija {
    
     public static int evaluar(String expresionPostfija) {
        Stack<Integer> pila = new Stack<>();
        for (char c : expresionPostfija.toCharArray()) {
            if (Character.isDigit(c)) {
                pila.push(c - '0'); // Convertir char a int
            } else {
                int b = pila.pop();
                int a = pila.pop();
                switch (c) {
                    case '+' -> pila.push(a + b);
                    case '-' -> pila.push(a - b);
                    case '*' -> pila.push(a * b);
                    case '/' -> pila.push(a / b);
                }
            }
        }
        return pila.pop();
    }
    
}
