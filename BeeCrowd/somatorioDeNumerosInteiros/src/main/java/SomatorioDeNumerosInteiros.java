
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author lucasrocha
 */
public class SomatorioDeNumerosInteiros {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int soma = 0;
        int n = a;
        
        while (n <= b){
            soma += n;
            n += 1;
        }
        
        System.out.println(soma);
    }
}
