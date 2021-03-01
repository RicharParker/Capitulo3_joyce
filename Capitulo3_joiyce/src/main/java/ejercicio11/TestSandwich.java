/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio11;

/**
 *
 * @author ARCHV
 */
public class TestSandwich {
    public static void main(String[] args) {
        Sandwich almuerzo = new Sandwich("Huevito","Casero",10.5);
        System.out.println(almuerzo.getIngredient());
        System.out.println(almuerzo.getBread());
        System.out.println(almuerzo.getPrice());
    }
}
