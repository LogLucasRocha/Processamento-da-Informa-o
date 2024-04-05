
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author lucasrocha
 */
public class ValidacaoDeNota {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contadorDeNotas = 0;
        double soma = 0;
        
        while(contadorDeNotas < 2){           
            double nota = sc.nextDouble();
            if(nota < 0 || nota > 10){
                System.out.println("nota invalida");
            }
            else{
                soma += nota;

                contadorDeNotas++;
            }
        }
        
        float media = (float) soma / 2;
        
        System.out.printf("media = %.2f%n", media);
        
    }
}
