import java.util.Scanner;

public class AumentoDeSalario {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double salario = sc.nextDouble();
        
        if (salario >= 0 && salario <= 400){
            double novoSalario = salario * 1.15;
            double reajusteGanho = novoSalario - salario;
            System.out.printf("Novo salario: %.2f%n", novoSalario);
            System.out.printf("Reajuste ganho: %.2f%n", reajusteGanho);
            System.out.println("Em percentual: 15 %");
        }
        else{
            if (salario > 400 && salario <= 800){
                double novoSalario = salario * 1.12;
                double reajusteGanho = novoSalario - salario;
                System.out.printf("Novo salario: %.2f%n", novoSalario);
                System.out.printf("Reajuste ganho: %.2f%n", reajusteGanho);
                System.out.println("Em percentual: 12 %");
            }
            else{
                if (salario > 800 && salario <= 1200){    
                    double novoSalario = salario * 1.1;
                    double reajusteGanho = novoSalario - salario;
                    System.out.printf("Novo salario: %.2f%n", novoSalario);
                    System.out.printf("Reajuste ganho: %.2f%n", reajusteGanho);
                    System.out.println("Em percentual: 10 %");
                }
                else{
                    if (salario > 1200 && salario <= 2000){
                        double novoSalario = salario * 1.07;
                        double reajusteGanho = novoSalario - salario;
                        System.out.printf("Novo salario: %.2f%n", novoSalario);
                        System.out.printf("Reajuste ganho: %.2f%n", reajusteGanho);
                        System.out.println("Em percentual: 7 %");
                    }
                    else{
                        double novoSalario = salario * 1.04;
                        double reajusteGanho = novoSalario - salario;
                        System.out.printf("Novo salario: %.2f%n", novoSalario);
                        System.out.printf("Reajuste ganho: %.2f%n", reajusteGanho);
                        System.out.println("Em percentual: 4 %");
                    }
                }
            }  
        }
    }
}
