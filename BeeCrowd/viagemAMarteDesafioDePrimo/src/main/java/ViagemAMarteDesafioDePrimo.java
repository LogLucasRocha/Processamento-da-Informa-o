
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author lucasrocha
 */
public class ViagemAMarteDesafioDePrimo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int peso = sc.nextInt();    
        int quantidadeDivisores = 0;
        int contadorDePrimos = 0;
        int somaPrimos = 0;       
        while(contadorDePrimos < 10){
            int i = 1;
            quantidadeDivisores = 0;            
            while(i <= peso){ 
                if(peso % i == 0){
                    quantidadeDivisores += 1;
                    i += 1;
                }
                else{
                    i += 1;
                }
            }            
            if(quantidadeDivisores == 2){
                contadorDePrimos += 1;
                somaPrimos += peso;
            }
            peso += 1;
        }            
        int tempoHoras = 60000000/somaPrimos;
        int tempoDias = tempoHoras / 24;       
        System.out.printf("%d km/h%n", somaPrimos);
        System.out.printf("%d h / %d d%n", tempoHoras, tempoDias);   
    }
}
