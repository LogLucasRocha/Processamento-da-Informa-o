
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author lucasrocha
 */
public class Tabuada {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        
        for(int i = 1; i <= 10; i++){
            int resultado = i * N;
            System.out.printf("%d x %d = %d%n", i, N, resultado);
        }
    }
}
