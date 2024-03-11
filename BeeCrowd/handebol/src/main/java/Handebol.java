
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author lucasrocha
 */
public class Handebol {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contadorJogadores = 0;
        int quantidadeJogadores = sc.nextInt();
        int quantidadeJogos = sc.nextInt();
        int contadorDeEficiencia = 0;
        
        while(contadorJogadores < quantidadeJogadores){

            int contadorJogos = 0;
            int saldoDeGols = 0;

            
            while(contadorJogos < quantidadeJogos){
                int gols = sc.nextInt();

                
                if (gols > 0){
                    saldoDeGols += 1;
                }
                
                if (saldoDeGols == quantidadeJogos){
                    contadorDeEficiencia += 1;
                }
                
                contadorJogos += 1;
            }
            
            contadorJogadores += 1;
        }
        
        System.out.println(contadorDeEficiencia);
       
    }
}
