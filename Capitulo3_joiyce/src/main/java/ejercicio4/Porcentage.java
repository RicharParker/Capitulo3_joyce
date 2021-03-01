/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

/**
 *
 * @author ARCHV
 */
public class Porcentage {
    private Double number1;
    private Double number2;
    private Double calculo;
     
    public Porcentage(Double number1, Double number2) {
        this.number1 = number1;
        this.number2 = number2;

    }


     
    public Double computePercentage(){
        Double a = (this.number1*100)/this.number2;
        return a;
    }

   
    public Double getNumber1() {
        return number1;
    }

    public void setNumber1(Double number1) {
        this.number1 = number1;
    }

    public Double getNumber2() {
        return number2;
    }

    public void setNumber2(Double number2) {
        this.number2 = number2;
    }
    
    public Double getCalculo() {
        return computePercentage();
    }

    public void setCalculo(Double calculo) {
        this.calculo = computePercentage();
    }

}
