
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author lucasrocha
 */
public class Intervalo2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int X = sc.nextInt();
        int in = 0;
        int out = 0;
            for(int i = 0; i < X; i++){
                int Y = sc.nextInt();
                if(Y <= 20 && Y >= 10){
                    in ++;
                }
                else{
                    out++;
                }
            }
            System.out.printf("%d in%n", in);
            System.out.printf("%d out%n", out);
    }
}
