/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gastocombustivel;

import java.util.Scanner;

/**
 *
 * @author lucasrocha
 */
public class GastoCombustivel {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double horas, velocidadeMedia, combustivelGasto;
        double autonomia = 12;
        
        horas = sc.nextDouble();
        velocidadeMedia = sc.nextDouble();
        
        combustivelGasto = (double) (horas * velocidadeMedia) / autonomia;
                
        System.out.printf("%.3f%n", combustivelGasto );
    }
}
