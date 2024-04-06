
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author lucasrocha
 */
public class SomaDeImparesConsecutivosI {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int soma = 0;
        
        if(X > Y){
            for(int i = X - 1; i > Y; i--){
                if(i % 2 == 1 || i % 2 == -1){
                    soma += i;
                }
            }
        }
        else if(Y > X){
            for(int i = X; i > X; i--){
                if(i % 2 == 1){
                    soma += i;
                }
            }
        }
        else if(X == Y){
            soma = 0;
        }
        System.out.println(soma);
    }
}
