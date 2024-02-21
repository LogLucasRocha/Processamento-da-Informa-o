
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author lucasrocha
 */
public class OMaior {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int A, B, C, maiorAB, maiorAC;
        
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        
        maiorAB = ((A + B + Math.abs(A - B))) / 2;
        maiorAC = ((maiorAB + C + Math.abs(maiorAB - C))) / 2;
        
       System.out.printf("%d eh o maior%n", maiorAC);
        
    }
}
