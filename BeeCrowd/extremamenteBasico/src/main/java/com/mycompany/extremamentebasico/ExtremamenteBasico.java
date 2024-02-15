/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.extremamentebasico;

import java.util.Scanner;

/**
 *
 * @author lucasrocha
 */
public class ExtremamenteBasico {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int A, B, resultado;
        
        A = sc.nextInt();
        B = sc.nextInt();
        resultado = A + B;
        
        System.out.printf("X = %d%n", resultado);
         
    }
}
