
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author lucasrocha
 */
public class Salario {

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int numero, horasTrabalhadas;
            double salarioHora, salario;

            numero = sc.nextInt();
            horasTrabalhadas = sc.nextInt();
            salarioHora = sc.nextDouble();
            salario = (double) salarioHora * horasTrabalhadas;

            System.out.printf("NUMBER = %d%n", numero);
            System.out.printf("SALARY = U$ %.2f%n", salario);

    }
}
