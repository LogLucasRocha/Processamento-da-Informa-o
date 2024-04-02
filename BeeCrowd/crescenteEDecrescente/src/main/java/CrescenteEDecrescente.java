
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author lucasrocha
 */
public class CrescenteEDecrescente {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();
        while(X != Y){
            if(X > Y){
                System.out.println("Decrescente");
            }
            else if(X < Y){
                System.out.println("Crescente");
            }
            X = sc.nextInt();
            Y = sc.nextInt();
        }
    }
}
