
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author lucasrocha
 */
public class SenhaFixa {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int senha = 2002;
        
        int tentativaSenha = sc.nextInt();
        while(tentativaSenha != senha){
            System.out.println("Senha Invalida");
            tentativaSenha = sc.nextInt();
        }
        
        if(senha == tentativaSenha){
            System.out.println("Acesso Permitido");
        }
    }
}
