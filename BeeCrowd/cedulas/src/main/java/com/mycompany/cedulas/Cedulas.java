/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cedulas;

import java.util.Scanner;

/**
 *
 * @author lucasrocha
 */
public class Cedulas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int valor, resto, notasDe100, notasDe50, notasDe20, notasDe10, notasDe5, notasDe2, notasDe1;
        
        valor = sc.nextInt();
        
        System.out.println(valor);
        
        notasDe100 = valor / 100;
        resto = valor % 100;
        
        notasDe50 = resto / 50;
        resto = resto % 50;
        
        notasDe20 = resto / 20;
        resto = resto % 20;
        
        notasDe10 = resto / 10;
        resto = resto % 10;
        
        notasDe5 = resto / 5;
        resto = resto % 5;
        
        notasDe2 = resto / 2;
        resto = resto % 2;
        
        notasDe1 = resto;
           
        System.out.printf("%d nota(s) de R$ 100,00%n", notasDe100);
        System.out.printf("%d nota(s) de R$ 50,00%n", notasDe50);
        System.out.printf("%d nota(s) de R$ 20,00%n", notasDe20);
        System.out.printf("%d nota(s) de R$ 10,00%n", notasDe10);
        System.out.printf("%d nota(s) de R$ 5,00%n", notasDe5);
        System.out.printf("%d nota(s) de R$ 2,00%n", notasDe2);
        System.out.printf("%d nota(s) de R$ 1,00%n", notasDe1);
    }
}
