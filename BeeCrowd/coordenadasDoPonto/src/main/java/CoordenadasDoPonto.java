
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author lucasrocha
 */
public class CoordenadasDoPonto {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        
        if (x == y && y == 0){
            System.out.println("Origem");
        }
        else{
            if(x > 0 && y > 0){
                System.out.println("Q1");
            }
            else{
                if(x < 0 && y > 0){
                    System.out.println("Q2");
                }
                else{
                    if(x < 0 && y < 0){
                        System.out.println("Q3");
                    }
                    else{
                        if(x > 0 && y < 0){
                            System.out.println("Q4");
                        }
                        else{
                            if((y == 0) && (x >= 0 || x < 0)){
                                System.out.println("Eixo X");
                            }
                            else{
                                System.out.println("Eixo Y");
                            }
                        }
                    }
                }
            }
        }
    }
}
