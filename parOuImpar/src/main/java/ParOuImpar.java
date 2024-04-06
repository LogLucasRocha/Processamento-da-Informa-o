
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author lucasrocha
 */
public class ParOuImpar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        
        for(int i = 0; i < N; i++){
            int X = sc.nextInt();
            if(X % 2 == 0 && X > 0){
                System.out.println("EVEN POSITIVE");
            }
            else if(X % 2 == 0 && X < 0){
                System.out.println("EVEN NEGATIVE");
            }
            else if(X % 2 == 1){
                System.out.println("ODD POSITIVE");
            }
            else if(X % 2 == -1){
                System.out.println("ODD NEGATIVE");
            }
            else{
                System.out.println("NULL");
            }
        }
    }
}
