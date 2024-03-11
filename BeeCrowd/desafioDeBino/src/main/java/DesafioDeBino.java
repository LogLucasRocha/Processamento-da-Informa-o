
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author lucasrocha
 */
public class DesafioDeBino {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int multiplosDe2 = 0;
        int multiplosDe3 = 0;
        int multiplosDe4 = 0;
        int multiplosDe5 = 0;
        int quantidadeNumeros = sc.nextInt();
        int contador = 0;
        
        
        while(contador < quantidadeNumeros){
            int valor = sc.nextInt();
            
            if(valor % 2 == 0){
                multiplosDe2 += 1;
            }
            if(valor % 3 == 0){
                multiplosDe3 += 1;
            }
            if(valor % 4 == 0){
                multiplosDe4 += 1;
            }
            if(valor % 5 == 0){
                multiplosDe5 += 1;
            }
            
            contador += 1;
        }
        
        System.out.printf("%d Multiplo(s) de 2%n", multiplosDe2);
        System.out.printf("%d Multiplo(s) de 3%n", multiplosDe3);
        System.out.printf("%d Multiplo(s) de 4%n", multiplosDe4);
        System.out.printf("%d Multiplo(s) de 5%n", multiplosDe5);
        
    }
}
