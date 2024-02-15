
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author lucasrocha
 */
public class Distancia {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int KM, tempoRestante;
        
        KM = sc.nextInt();
        tempoRestante = KM * 2;
        
        System.out.printf("%d minutos%n", tempoRestante);
        
    }
}
