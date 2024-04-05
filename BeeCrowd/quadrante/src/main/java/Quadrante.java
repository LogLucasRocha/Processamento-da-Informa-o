
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author lucasrocha
 */
public class Quadrante {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int x = sc.nextInt();
        int y = sc.nextInt();
        
        while(x != 0 && y != 0){
            if(x>0 && y > 0){
                System.out.println("primeiro");
                x = sc.nextInt();
                y = sc.nextInt();
            }
            else if(x < 0 && y > 0){
                System.out.println("segundo");
                x = sc.nextInt();
                y = sc.nextInt();
            }
            else if(x < 0 && y < 0){
                System.out.println("terceiro");
                x = sc.nextInt();
                y = sc.nextInt();
            }
            else{
                System.out.println("quarto");
                x = sc.nextInt();
                y = sc.nextInt();
            }
        }
    }
}
