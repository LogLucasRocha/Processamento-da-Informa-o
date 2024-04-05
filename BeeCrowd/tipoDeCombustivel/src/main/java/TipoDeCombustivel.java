
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author lucasrocha
 */
public class TipoDeCombustivel {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int x = sc.nextInt();
        int contadorAlcool = 0;
        int contadorGasolina = 0;
        int contadorDiesel = 0;
        
        
        while(x != 4){
            while(x > 4 || x < 0){
                x = sc.nextInt();
            }
            if(x == 1){
                contadorAlcool++;
                x = sc.nextInt();
            }
            else if(x == 2){
                contadorGasolina++;
                x = sc.nextInt();
            }
            else if(x == 3){
                contadorDiesel++;
                x = sc.nextInt();
            }
            
        }
        System.out.println("MUITO OBRIGADO");
        System.out.printf("Alcool: %d%n", contadorAlcool);
        System.out.printf("Gasolina: %d%n", contadorGasolina);
        System.out.printf("Diesel: %d%n", contadorDiesel);
    }
}
