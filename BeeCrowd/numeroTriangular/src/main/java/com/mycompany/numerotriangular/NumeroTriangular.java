/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.numerotriangular;

import java.util.Scanner;

/**
 *
 * @author lucasrocha
 */
public class NumeroTriangular {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int i = 1;
        int n = sc.nextInt();
        boolean tf;
        
        while ((i * (1 + i) * (i + 2)) < n){
            i += 1;
        }
        
        if ((i * (1 + i) * (i + 2)) == n){
            System.out.printf("Número Triangular %n %d * %d * %d = %d", i, i+1, i+2, n);
        }
        else{
            System.out.println("Número não triângular");
        }
        
    }
}
