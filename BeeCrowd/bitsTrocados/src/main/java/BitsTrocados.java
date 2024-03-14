
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author lucasrocha
 */
public class BitsTrocados {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contadorTeste = 1;
        int notasDe50 = 0;
        int notasDe10 = 0;
        int notasDe5 = 0;
        int notasDe1 = 0;
        int valor = sc.nextInt();
        
        
        
        
        while(valor != 0){
            System.out.printf("Teste %d%n", contadorTeste);
            if (valor >= 50) {
                notasDe50 = valor / 50;
            }

            if (valor >= 10) {
                notasDe10 = (valor - (notasDe50 * 50)) / 10;
            }

            if (valor >= 5) {
                notasDe5 = (valor - (notasDe50 * 50 + notasDe10 * 10))/ 5;
            }

            if (valor >= 1) {
                notasDe1 = valor - (notasDe50 * 50 + notasDe10 * 10 + notasDe5 * 5);
            }
                    
                
            
            
            System.out.printf("%d %d %d %d%n%n", notasDe50, notasDe10, notasDe5, notasDe1);
            contadorTeste += 1;
            valor = sc.nextInt();
        }
    }
}
