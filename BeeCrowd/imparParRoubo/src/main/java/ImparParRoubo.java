
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author lucasrocha
 */
public class ImparParRoubo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int p = sc.nextInt();
        int j1 = sc.nextInt();
        int j2 = sc.nextInt();
        int r = sc.nextInt();
        int a = sc.nextInt();
        
        if(r == 1 && a == 1){
            System.out.println("Jogador 2 ganha!");
        }
        else{
            if(r == 1 && a == 0){
                System.out.println("Jogador 1 ganha!");
            }
            else{
                if(r == 0 && a == 1){
                    System.out.println("Jogador 1 ganha!");
                }
                else{
                    if(r == 0 && a == 0){
                        if (p == 1){
                            if((j1 + j2) % 2 == 0){
                                System.out.println("Jogador 1 ganha!");
                            }
                            else{
                                System.out.println("Jogador 2 ganha!");
                            }
                        }
                        else{
                            if ((j1 + j2) % 2 == 0){
                                System.out.println("Jogador 2 ganha!");
                            }
                            else{
                                System.out.println("Jogador 1 ganha!");
                            }
                        }
                    }
                }
            }
        }
    }
   
}
