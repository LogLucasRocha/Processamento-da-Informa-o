
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author lucasrocha
 */
public class Lanche {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double valorCodigo, resultado;
        
        int codigo = sc.nextInt();
        
        if (codigo == 1){
            valorCodigo = 4;
        }
        else{
            if (codigo == 2){
                valorCodigo = 4.5;
            }
            else{
                if(codigo == 3){
                    valorCodigo = 5;
                }
                else{
                    if(codigo == 4){
                        valorCodigo = 2;
                    }
                    else{
                        valorCodigo = 1.5;
                    }
                }
            }
        }   
        
        int quantidade = sc.nextInt();
        
        resultado = valorCodigo * quantidade;
        
        System.out.printf("Total: R$ %.2f%n", resultado);
        
    }
}
