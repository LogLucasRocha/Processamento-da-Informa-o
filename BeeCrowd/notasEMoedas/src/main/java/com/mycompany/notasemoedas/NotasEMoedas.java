/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.notasemoedas;

import java.util.Scanner;

/**
 *
 * @author lucasrocha
 */
public class NotasEMoedas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double valor, resto, NotasDe100, NotasDe50, NotasDe20, NotasDe10, NotasDe5, NotasDe2, MoedasDe1, MoedasDe50, MoedasDe25, MoedasDe10, MoedasDe5, MoedasDe01;
        
        valor = sc.nextDouble();
        
        NotasDe100 = Math.floor(valor / 100);
        resto = valor % 100;
        
        NotasDe50 = Math.floor(resto / 50);
        resto = resto % 50;
        
        NotasDe20 = Math.floor(resto / 20);
        resto = resto % 20;
        
        NotasDe10 = Math.floor(resto / 10);
        resto = resto % 10;
        
        NotasDe5 = Math.floor(resto / 5);
        resto = resto % 5;
        
        NotasDe2 = Math.floor(resto / 2);
        resto = resto % 2;
        
        MoedasDe1 = Math.floor(resto / 1);
        resto = resto % 1;
        
        MoedasDe50 = Math.floor(resto / 0.5);
        resto = resto % 0.5;
        
        MoedasDe25 = Math.floor(resto / 0.25);
        resto = resto % 0.25;
        
        MoedasDe10 = Math.floor(resto / 0.10);
        resto = resto % 0.10;
        
        MoedasDe5 = Math.floor(resto / 0.05);
        resto = resto % 0.05;
        
        MoedasDe01 = Math.floor(resto / 0.01);

        
      
        System.out.println("NOTAS: ");
        System.out.printf("%.0f notas de R$ 100.00%n", NotasDe100);
        System.out.printf("%.0f notas de R$ 50.00%n", NotasDe50);
        System.out.printf("%.0f notas de R$ 20.00%n", NotasDe20);
        System.out.printf("%.0f notas de R$ 10.00%n", NotasDe10);
        System.out.printf("%.0f notas de R$ 5.00%n", NotasDe5);
        System.out.printf("%.0f notas de R$ 2.00%n", NotasDe2);
        System.out.println("MOEDAS: ");
        System.out.printf("%.0f moedas de R$ 1.00%n", MoedasDe1);
        System.out.printf("%.0f moedas de R$ 0.50%n", MoedasDe50);
        System.out.printf("%.0f moedas de R$ 0.25%n", MoedasDe25);
        System.out.printf("%.0f moedas de R$ 0.10%n", MoedasDe10);
        System.out.printf("%.0f moedas de R$ 0.05%n", MoedasDe5);
        System.out.printf("%.0f moedas de R$ 0.01%n", MoedasDe01);
    }
}
