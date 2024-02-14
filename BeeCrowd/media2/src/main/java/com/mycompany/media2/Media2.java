/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.media2;

import java.util.Scanner;

/**
 *
 * @author lucasrocha
 */
public class Media2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double A, B, C, media;
        
        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();
        
        media = (A * 2 + B * 3 + C * 5) / 10;
                
        System.out.printf("MEDIA = %.1f%n", media);
    }
}
