/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.consumo;

import java.util.Scanner;

/**
 *
 * @author lucasrocha
 */
public class Consumo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double X, Y, consumo;
        
        X = sc.nextDouble();
        Y = sc.nextDouble();
        consumo = (double) X/Y;
        
        System.out.printf("%.3f km/l%n", consumo);
        
    }
}
