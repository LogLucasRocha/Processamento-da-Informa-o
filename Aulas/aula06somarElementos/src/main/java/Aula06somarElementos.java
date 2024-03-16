
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author lucasrocha
 */
public class Aula06somarElementos {

    static int somarElementos(int v[]){
        int i;
        int soma = 0;
        
            for(i = 0; i < v.length; i+=1){
                soma += v[i];
            }
        
        return soma;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int vetor[] = {10, 20, 30, -70};
        
        System.out.println(somarElementos(vetor));
    }
}
