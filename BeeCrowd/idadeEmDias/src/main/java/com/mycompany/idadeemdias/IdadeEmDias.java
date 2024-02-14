/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.idadeemdias;

import java.util.Scanner;

/**
 *
 * @author lucasrocha
 */
public class IdadeEmDias {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int diasEntrada, anos, meses, dias;
        
        diasEntrada = sc.nextInt();
        
        anos = diasEntrada / 365;
        System.out.printf("%d ano(s)%n", anos);
        
        int diasRestantes = diasEntrada - (anos * 365);
        
        meses = diasRestantes / 30;
        System.out.printf("%d mes(es)%n", meses);
        
        dias = diasRestantes - (meses * 30);
        System.out.printf("%d dia(s)%n", dias);
    }
}
