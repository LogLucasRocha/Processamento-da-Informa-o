
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author lucasrocha
 */
public class SalarioComBonus {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String nome;
        double salario, totalVendas, recebimentoTotal;
        
        nome = sc.nextLine();
        salario = sc.nextDouble();
        totalVendas = sc.nextDouble();
        
        recebimentoTotal = salario + (totalVendas * 0.15);
        
        System.out.printf("TOTAL = R$ %.2f%n", recebimentoTotal);
    }
}
