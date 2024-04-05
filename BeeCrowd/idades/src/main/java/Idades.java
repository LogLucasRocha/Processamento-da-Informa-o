
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author lucasrocha
 */
public class Idades {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int x = sc.nextInt();
        int soma = 0;
        int contador = 0;
        
        while(x >= 0){
            soma += x;
            contador ++;
            x = sc.nextInt();
        }
        
        float media = (float) soma / contador;
        System.out.printf("%.2f%n", media);
             
    }
}
