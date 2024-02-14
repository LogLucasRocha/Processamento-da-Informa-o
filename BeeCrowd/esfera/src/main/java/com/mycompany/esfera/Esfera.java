/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.esfera;

import java.util.Scanner;

/**
 *
 * @author lucasrocha
 */
public class Esfera {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double pi = 3.14159;
        double raio, volume;
        
        raio = sc.nextDouble();
        
        volume = (4.0/3) * pi * Math.pow(raio, 3);
        
        System.out.printf("VOLUME = %.3f%n", volume);
    }
}
