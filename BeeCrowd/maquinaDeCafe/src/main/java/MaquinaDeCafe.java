
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author lucasrocha
 */
public class MaquinaDeCafe {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int A1 = sc.nextInt();
        int A2 = sc.nextInt();
        int A3 = sc.nextInt();
        
        int tempoPrimeiroAndar = A2 * 2 + A3 * 4;
        int tempoSegundoAndar = A1 * 2 + A3 * 2;
        int tempoTerceiroAndar = A1 * 4 + A2 * 2;
        
        if(tempoPrimeiroAndar < tempoSegundoAndar && tempoPrimeiroAndar < tempoTerceiroAndar){
            System.out.println(tempoPrimeiroAndar);
        }
        else{
            if(tempoSegundoAndar < tempoPrimeiroAndar && tempoSegundoAndar < tempoTerceiroAndar){
                System.out.println(tempoSegundoAndar);
            }
            else{
                if ((tempoPrimeiroAndar == tempoSegundoAndar) && tempoPrimeiroAndar < tempoTerceiroAndar){
                    System.out.println(tempoSegundoAndar);
                }    
                else{
                    if(tempoPrimeiroAndar == tempoTerceiroAndar && tempoPrimeiroAndar < tempoSegundoAndar){
                        System.out.println(tempoPrimeiroAndar);
                    }
                    else{
                        if(tempoSegundoAndar == tempoTerceiroAndar && tempoSegundoAndar < tempoPrimeiroAndar){
                            System.out.println(tempoSegundoAndar);
                        }
                        else{
                            System.out.println(tempoTerceiroAndar);
                        }
                    }
                }
            }
        }
        
    }
}
