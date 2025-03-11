/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import logica.BalanceoParentesis;
import logica.ConvertidorInfijaPostfija;
import logica.EvaluadorPostfija;
import java.util.Scanner;

/**
 *
 * @author sierr
 */
public class Main {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese una expresion aritmetica:");
        String expresion = scanner.nextLine();

        if (BalanceoParentesis.verificar(expresion)) {
            System.out.println("Parentesis balanceados.");
            String postfija = ConvertidorInfijaPostfija.convertir(expresion);
            System.out.println("Notacion Postfija: " + postfija);
            int resultado = EvaluadorPostfija.evaluar(postfija);
            System.out.println("Resultado: " + resultado);
        } else {
            System.out.println("Expresion con paréntesis desequilibrados.");
        }
    }
    
}
