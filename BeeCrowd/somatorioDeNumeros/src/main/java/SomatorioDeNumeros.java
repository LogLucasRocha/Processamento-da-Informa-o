
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author lucasrocha
 */
public class SomatorioDeNumeros {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int k = sc.nextInt();
        int contador = 1;
        int soma = 0;
        int parcela = 0;
        
        while(contador <= n){
           parcela = (int) Math.pow(contador, k);
           soma += parcela;
           contador += 1;
        }
        
        System.out.println(soma);
        
    }
}
