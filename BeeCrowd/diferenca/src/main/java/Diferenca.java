
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author lucasrocha
 */
public class Diferenca {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int A, B, C, D, DIFERENCA;
        
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        D = sc.nextInt();
        DIFERENCA = (A * B - C * D);
        
        System.out.printf("DIFERENCA = %d%n", DIFERENCA);
    }
}
