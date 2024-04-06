
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author lucasrocha
 */
public class MediasPonderadas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        
        for(int i = 0; i < N; i++){
            double X = sc.nextDouble();
            double Y = sc.nextDouble();
            double Z = sc.nextDouble();
            double mediaPonderada = (X*2 + Y*3 + Z*5)/10;
            System.out.printf("%.1f%n", mediaPonderada);
        }
    }
}
