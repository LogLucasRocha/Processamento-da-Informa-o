
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author lucasrocha
 */
public class Aula06buscarElemento {
    
    static int buscarElemento(int v[], int x){
        int i = 0;
        
        for(i = 0; i < v.length; i += 1){
            if(v[i] == x){
                return i;
            }
        }
        
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int vetor[] = {30, 40 , 50};
        int elemento = sc.nextInt();
        
        System.out.println(buscarElemento(vetor, elemento));
        
    }
}
