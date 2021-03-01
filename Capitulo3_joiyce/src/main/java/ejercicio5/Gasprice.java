


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

/**
 *
 * @author ARCHV
 */
public class Gasprice {
    private static final Double price1 = 3.5;
    private static final Double price2 = 4.0;
    private Double pricexBarrel;

    public Gasprice(Double pricexBarrel) {
        this.pricexBarrel = pricexBarrel;
    }

    public String precio(){
         return "precio : "+((this.getPricexBarrel()*price1)/100)+" y "+((this.getPricexBarrel()*price2)/100); 
    }
    

    public Double getPricexBarrel() {
        return pricexBarrel;
    }

    public void setPricexBarrel(Double pricexBarrel) {
        this.pricexBarrel = pricexBarrel;
    }
    
    
}
