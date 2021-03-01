/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

/**
 *
 * @author ARCHV
 */
public class ArithmeticMethods {
   
    public static void displayNumberPlus10(int x, int y){
        System.out.println(x +" + 10 = "+(x+10));
        System.out.println(y+" + 10 = "+ y+10);
    }

    public static void displayNumberPlus100(int x,int y){
        System.out.println(x +" + 10 = "+(x+100));
        System.out.println(y+" + 10 = "+ y+100);
    }

    public static void displayNumberPlus1000(int x, int y){
        System.out.println(x +" + 10 = "+(x+1000));
        System.out.println(y+" + 10 = "+ y+1000);
    }
    public static void main(String[] args) {
        int x = 23;
        int y = 45;

        displayNumberPlus10(x,y);
        displayNumberPlus100(x,y);
        displayNumberPlus1000(x,y);
        

    }
}