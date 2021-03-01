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
public class Card {
    private char suit;
    private Integer numero;
    public char getSuit() {
        return suit;
    }

    public void setSuit(char suit) {
        this.suit = suit;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        final int CARDS_IN_SUIT = 13;
        this.numero = ((int)(Math.random() * 100) % CARDS_IN_SUIT + 1);
    }
   
    
    
}
