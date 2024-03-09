/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.quantidadedenumerosimpar;

import java.util.Scanner;

/**
 *
 * @author lucasrocha
 */
public class QuantidadeDeNumerosImpar {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        int numero = sc.nextInt();
        int q = 0;
            
        while (numero > 0){
            if ((numero % 10)%2 == 1){
                q =+ 1;     
            }
            
            numero = numero/10;
        }
        
        System.out.println(q);
    }
}
