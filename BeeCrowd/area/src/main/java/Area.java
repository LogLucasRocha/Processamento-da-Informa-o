
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author lucasrocha
 */
public class Area {

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            double A, B, C, pi = 3.14159, areaCirculo, areaTrianguloRetangulo, areaTrapezio, areaQuadrado, areaRetangulo;

            A = sc.nextDouble();
            B = sc.nextDouble();
            C = sc.nextDouble();

            areaTrianguloRetangulo = (A * C) / 2;
            areaCirculo = pi * Math.pow(C, 2);
            areaTrapezio = ((A + B) * C / 2);
            areaQuadrado = B * B;
            areaRetangulo = A * B;

            System.out.printf("TRIANGULO: %.3f%n", areaTrianguloRetangulo);
            System.out.printf("CIRCULO: %.3f%n", areaCirculo);
            System.out.printf("TRAPEZIO: %.3f%n", areaTrapezio);
            System.out.printf("QUADRADO: %.3f%n", areaQuadrado);
            System.out.printf("RETANGULO: %.3f%n", areaRetangulo);
        
    }
}
