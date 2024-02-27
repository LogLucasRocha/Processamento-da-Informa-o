/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.fibonaccirapido;

import java.util.Scanner;

/**
 *
 * @author lucasrocha
 */
public class FibonacciRapido {
    
    public static void binetFormula(double n){
        double binet = (Math.pow((1 + Math.sqrt(5)) / 2, n) - Math.pow((1 - Math.sqrt(5)) / 2, n)) / Math.sqrt(5);
       
        System.out.printf("%.1f%n", binet);
    }

    public static void main(String[] args) {
        double valor;
        
        Scanner sc = new Scanner(System.in);
        
        valor = sc.nextDouble();
        
        binetFormula(valor);
        
        
    }
}
