
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author lucasrocha
 */
public class SeisNumerosImpares {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int X = sc.nextInt();
        int contador = 0;
        
        while(contador < 6){
            if(X % 2 == 1){
                System.out.println(X);
                contador += 1;
                X += 1;
            }
            else{
                X += 1;
            }
        }
    }
}
