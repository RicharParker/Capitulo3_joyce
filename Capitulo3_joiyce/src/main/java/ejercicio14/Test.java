/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio14;

/**
 *
 * @author ARCHV
 */
public class Test {
    public static void main(String[] args) {
        Painting galeria = new Painting("Mona lIsA","Da vinci","dicil",2333344,344.3); 
        System.out.println(galeria.getTittle());
        System.out.println(galeria.getArtist());
        System.out.println(galeria.getMedium());
        System.out.println(galeria.getPrice());
        System.out.println(galeria.getCommission());
        
    }
   
}


