
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author lucasrocha
 */
public class Elevador {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int inputs = sc.nextInt();
        int limite = sc.nextInt();
        int contadorInputs = 0;
        int entrada = 0;
        int saida = 0;
        int somaPassageiros = 0;
        int contadorUltrapassagem = 0;
        

        while(contadorInputs < inputs){
            saida = sc.nextInt();
            entrada = sc.nextInt();
            somaPassageiros = somaPassageiros - saida + entrada;
            if (somaPassageiros > limite){
                contadorUltrapassagem += 1;
            }
            contadorInputs += 1;
        }
        
        if(contadorUltrapassagem > 0){
            System.out.println("S");
        }
        else{
            System.out.println("N");
        }
    }
}
