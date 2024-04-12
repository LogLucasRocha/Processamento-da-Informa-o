
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author lucasrocha
 */
public class JoseEATumula {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int inputs = sc.nextInt();
        int primeiroTempo = 45;
        int segundoTempo = 90;

        sc.nextLine();
        
        for(int x = 0; x < inputs; x++){
            int tempoSumula = sc.nextInt();
            String tempo = sc.next(); 
            
            if (tempoSumula <= 45 && tempo.charAt(0) == '1') {
                System.out.printf("%d%n", tempoSumula);
            } else if (tempoSumula > 45 && tempo.charAt(0) == '1') {
                int acrescimos = tempoSumula - primeiroTempo;
                System.out.printf("45+%d%n", acrescimos);
            } else if (tempoSumula <= 45 && tempo.charAt(0) == '2') {
                int tempoCorrigido = primeiroTempo + tempoSumula; 
                System.out.printf("%d%n", tempoCorrigido);
            } else if (tempoSumula > 45 && tempo.charAt(0) == '2') {
                int tempoCorrigido = primeiroTempo + tempoSumula;
                int acrescimos = tempoCorrigido - segundoTempo;
                System.out.printf("90+%d%n",acrescimos);
            }
        }
    }
}
