
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author lucasrocha
 */
public class NumerosImpares {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int X = sc.nextInt();
        
        for(int i = 0; i <= X; i++){
            if(i % 2 == 1){
                System.out.println(i);
            }
        }
        
    }
}
