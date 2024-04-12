
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author lucasrocha
 */
public class TuristasNoParqueJuacachina {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int turistas = 0;
        int jipes = 0;

        String comando;
        while (!(comando = sc.next()).equals("ABEND")) {
            int quantidade = sc.nextInt();
            if (comando.equals("SALIDA")) {
                turistas += quantidade;
                jipes++;
            } else {
                turistas -= quantidade;
                jipes--;
            }
        }

        
        System.out.println(turistas);
        System.out.println(jipes);
    }
}
