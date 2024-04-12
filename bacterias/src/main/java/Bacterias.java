
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author lucasrocha
 */
public class Bacterias {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (sc.hasNextLine()) {
            String DNA = sc.nextLine();
            if (!sc.hasNextLine()) break;
            String codigoGeneticoResistente = sc.nextLine();

            if (verificarResistencia(DNA, codigoGeneticoResistente)) {
                System.out.println("Resistente");
            } else {
                System.out.println("Nao resistente");
            }
        }
    }
    
    static boolean verificarResistencia(String DNA, String codigoGeneticoResistente) {
        int tamanho = codigoGeneticoResistente.length();
        for (int i = 0; i <= DNA.length() - tamanho; i++) {
            if (DNA.substring(i, i + tamanho).equals(codigoGeneticoResistente)) {
                return true;
            }
        }
        return false;
    }
}

