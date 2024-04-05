
import java.util.Scanner;

public class SomaDeParesConsecutivos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int x = sc.nextInt();
        
        while(x != 0){
            if (x%2 == 0){
                int soma = x + (x + 2) + (x + 4) + (x + 6) + (x + 8);
                System.out.println(soma);
            }
            else if(x%2 == 1 || x % 2 == -1){
                int soma = (x + 1) + (x + 3) + (x + 5) + (x + 7) + (x + 9);
                System.out.println(soma);
            }
            x = sc.nextInt();
        }
    }
}
