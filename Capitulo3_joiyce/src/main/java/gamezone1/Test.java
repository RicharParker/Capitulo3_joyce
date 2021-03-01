/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamezone1;

/**
 *
 * @author ARCHV
 */
public class Test {
    public static void main(String[] args) {
    Card carta1 = new Card ();
    Card carta2 = new Card();
    carta1.setSuit('C');
    carta2.setSuit('T');
    carta1.setNumero(2);
    carta2.setNumero(6);
    System.out.println(carta1.getSuit());
    System.out.println(carta2.getSuit());
    System.out.println(carta1.getNumero());
    System.out.println(carta2.getNumero());
    
    }

    
    
}
