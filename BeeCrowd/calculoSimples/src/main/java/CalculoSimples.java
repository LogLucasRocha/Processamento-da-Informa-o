
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author lucasrocha
 */
public class CalculoSimples {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int c1, c2, quantidade1, quantidade2;
        double preco1, preco2, total;
        
        c1 = sc.nextInt();
        quantidade1 = sc.nextInt();
        preco1 = sc.nextDouble();
        
        c2 = sc.nextInt();
        quantidade2 = sc.nextInt();
        preco2 = sc.nextDouble();
        
        total = (double) (quantidade1 * preco1 + quantidade2 * preco2);
        
        System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);
    }
}
