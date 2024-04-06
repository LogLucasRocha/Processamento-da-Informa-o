
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author lucasrocha
 */
public class DividindoXporY {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        
        for(int i = 0; i < N; i++){
            int X = sc.nextInt();
            int Y = sc.nextInt();
            if(Y != 0){
                double resultado = (double) X / Y;
                System.out.printf("%.1f %n", resultado);
            }
            else{
                System.out.println("divisao impossivel");
            }
        }
    }
}
