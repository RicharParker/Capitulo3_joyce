/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7;

/**
 *
 * @author ARCHV
 */
public class Test {
    public static void main(String[] args) {
        PaintCalculator factura = new PaintCalculator();
        factura.setArea(3, 4, 6);
        System.out.println(factura.getArea());
        factura.setGallon(34.6);
        System.out.println(factura.getGallon());
        factura.setPrice(0.24);
        System.out.println(factura.getPrice());
        
    }
}
