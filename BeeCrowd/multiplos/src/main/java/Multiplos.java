
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author lucasrocha
 */
public class Multiplos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
                
         int A = sc.nextInt();
         int B = sc.nextInt();
         
         if (A % B == 0 || B % A == 0){
             System.out.println("Sao Multiplos");
         }
         else{
             System.out.println("Nao sao Multiplos");
         }
    }
}
