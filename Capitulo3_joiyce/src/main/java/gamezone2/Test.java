/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamezone2;

/**
 *
 * @author ARCHV
 */
public class Test {
    public static void main(String[] args) {
        
        MyCharacter pikachu = new MyCharacter();
        pikachu.setName("motapod");
        pikachu.setColor("Amarillo");
        pikachu.setNumberLives(1);
        pikachu.setPower("Electricidad");
        System.out.println(pikachu.getName());
        System.out.println(pikachu.getColor());
        System.out.println(pikachu.getNumberLives());
        System.out.println(pikachu.getPower());
    }
}
