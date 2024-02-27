
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author lucasrocha
 */
public class TempoDeJogo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int resultado;
        
        int horaDeInicio = sc.nextInt();
        int horaFinal = sc.nextInt();
        
        if (horaDeInicio == horaFinal){
            System.out.printf("O JOGO DUROU 24 HORA(S)%n");
        }
        else{
            if(horaDeInicio > horaFinal){
                resultado = (24 - horaDeInicio) + horaFinal;
                System.out.printf("O JOGO DUROU %d HORA(S)%n", resultado);
            }
            else{
                resultado = horaFinal - horaDeInicio;
                System.out.printf("O JOGO DUROU %d HORA(S)%n", resultado);
            }
        }
    }
}   
