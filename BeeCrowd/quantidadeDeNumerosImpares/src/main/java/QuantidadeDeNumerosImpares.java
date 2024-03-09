
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author lucasrocha
 */
public class QuantidadeDeNumerosImpares {

    public static void main(String[] args) {
        sc Scanner = new Scanner(System.in);
        
        int numero = sc.nextInt();
        int q = 1;
            
        while (numero > 0){
            if ((numero % 10)%2 == 1){
                q =+ 1;     
            }
            
            numero = numero/10;
        }
        
        System.out.println(q);
    }
}
