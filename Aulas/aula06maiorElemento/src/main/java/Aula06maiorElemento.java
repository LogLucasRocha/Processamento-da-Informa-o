
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author lucasrocha
 */
public class Aula06maiorElemento {
    
    static int maiorElemento(int v[]){
        int i = 0;
        int maior = v[0];
        
        for(i = 0; i < v.length; i += 1){
            if(v[i] > maior){
                maior = v[i];
            }
        }
        
        return maior;
    }

    public static void main(String[] args) {
        int vetor[] = {0, 10, 20, 30, 15};
        
        System.out.println(maiorElemento(vetor));
    }
}
