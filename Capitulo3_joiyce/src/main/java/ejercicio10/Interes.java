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
public class Interes {
    private double dinero;
    private double interes;
    
    public Interes(int dinero){
        this.dinero= dinero;
        this.calcularInteres();
        
    }
    
    private void calcularInteres(){
        this.interes = dinero * 0.05;
        
    }
    
    public double getInteres(){
        return interes;
    }

    public double getDinero (){
        return dinero;
    }
    public void setDinero(double dinero){
        this.dinero =dinero;
        this.calcularInteres();
    }   
    
}
