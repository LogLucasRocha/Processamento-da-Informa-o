/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.testedemesa;

/**
 *
 * @author lucasrocha
 */
public class TesteDeMesa {
    
    static int m1(int x, int y){
        int t, r = 0;
        if (x > y){
            t = x;
            x = y;
            y = t;
        }
        while (x <= y){
            r = r + x;
            x = x + 1;
        }
        
        return r;
    }

    public static void main(String[] args) {
        System.out.println(m1(4, -2));
    }
}
