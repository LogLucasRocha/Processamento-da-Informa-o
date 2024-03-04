
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author lucasrocha
 */
public class AndandoNoTempo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        
        if((A + B == C) || (B + C == A) || (A + C == B) || (A == B) || (A == C) || (C == B)){
            System.out.println("S");
        }
        else{
            System.out.println("N");
        }
        
    }
}
