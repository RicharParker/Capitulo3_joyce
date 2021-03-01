/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10;

/**
 *
 * @author ARCHV
 */
public class Test {
    public static void main(String[] args) {
        
        Interes interes = new Interes(100000);
        System.out.println(interes.getDinero());
        System.out.println(interes.getInteres());
        interes.setDinero(50000);
        System.out.println(interes.getDinero());
        System.out.println(interes.getInteres());
    }
    
}
