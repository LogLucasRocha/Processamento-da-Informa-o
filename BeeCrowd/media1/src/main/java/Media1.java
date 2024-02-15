
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author lucasrocha
 */
public class Media1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double nota1, nota2, MEDIA;
        
        nota1 = sc.nextDouble();
        nota2 = sc.nextDouble();
        
        MEDIA = (nota1 * 3.5 + nota2 * 7.5) / 11; 
        
        System.out.printf("MEDIA = %.5f%n", MEDIA);
    }
}
