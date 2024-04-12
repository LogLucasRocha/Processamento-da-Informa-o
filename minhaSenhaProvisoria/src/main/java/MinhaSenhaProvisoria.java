
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author lucasrocha
 */
public class MinhaSenhaProvisoria {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int quantidadeRAs = sc.nextInt();
        sc.nextLine();
        int counter = 0;
        
        for(int x = 0; x < quantidadeRAs; x++){
            String RA = sc.nextLine();
            counter = 0;
            
            if(RA.charAt(0) == 'R' && RA.charAt(1) == 'A' && RA.length() == 20){
                for(int j = 2; j < 20; j++){
                    if(RA.charAt(j) != '0' && counter != 1){
                        for(int t = j; t < 20; t++){
                            if(t <= 18){
                                System.out.print(RA.charAt(t));
                            }
                            else{
                                System.out.println(RA.charAt(t));
                            }
                        }
                        counter ++;
                    }
                }
            }
            else{
                System.out.println("INVALID DATA");
            }
        }
    }
}
