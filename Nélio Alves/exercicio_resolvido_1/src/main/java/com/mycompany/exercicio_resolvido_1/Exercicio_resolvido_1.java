/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio_resolvido_1;

import java.util.Scanner;

/**
 *
 * @author lucasrocha
 */
public class Exercicio_resolvido_1 {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
       double largura, comprimento, valor_m2, A, PRECO;
      
       largura = sc.nextDouble();
       comprimento = sc.nextDouble();
       valor_m2 = sc.nextDouble();
       
       A = largura * comprimento;
       PRECO = valor_m2 * A;
               
      System.out.printf("AREA = %.2f%n", A);
      System.out.printf("PRECO = %.2f%n", PRECO);
       
    }
}
