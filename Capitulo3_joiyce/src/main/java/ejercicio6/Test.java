/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;

/**
 *
 * @author ARCHV
 */
public class Test {
    public static void main(String[] args) {
         MetricConversion valor = new MetricConversion();
         valor.setCentimeters(34.5);
         valor.setLitiers(56.67);
         System.out.println(valor.getCentimeters());
         System.out.println(valor.getLitiers());
    }
    
}
