/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.estudovetores;

import java.util.Scanner;

/**
 *
 * @author rocha.l
 */

public class EstudoVetores {
    
    static int somarElementos(int v[]){
        int soma = 0;
        for(int i=0; i < v.length; i++)
            soma = soma + v[i];
        return soma;
    }
    
    static int buscarElementos(int x, int v[]){
        for(int i=0; i < v.length; i++)
            if(x == v[i]) return i;
        return -1;
    }
    
    static int maiorElemento(int v[]){
        int maior = v[0];
        for(int i=0; i < v.length; i++)
            if (v[i] > maior){
                maior = v[i];
            }
        return maior;
    }
    
    static boolean ordemCrescente(int v[]){
        for(int i=0; i < v.length-1; i++)
            if(v[i + 1] < v[i]){
                return false;
            }
        
        return true;
    }
    
    static boolean duplicados(int v[]){
        for(int i=0; i < v.length - 1; i++){
            for(int j = i + 1; j <  v.length; j++)
                if(v[i] == v[j])
                    return true;
        }
        return false;
    }


    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Digite um número de elemento de vetor");
            int n = sc.nextInt();
            int vetor[] = new int [n];
            for (int i = 0; i < n; i++){
                System.out.printf("Digite o %dº número de vetor%n",(i+1));
                vetor[i] = sc.nextInt();
            }
            System.out.println(duplicados(vetor));
    }
}

