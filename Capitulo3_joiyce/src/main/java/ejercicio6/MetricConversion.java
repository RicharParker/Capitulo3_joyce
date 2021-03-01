/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;

/**
 *
 * @author ARCHV
 */
public class MetricConversion {
    private static final Double inch = 2.54;
    private static final Double gallon = 3.7854;
    private Double centimeters;
    private Double litiers;

    public MetricConversion() {
        this.centimeters =centimeters;
        this.litiers = litiers;
    }

    public Double getCentimeters() {
        return centimeters;
    }

    public void setCentimeters(Double centimeters) {
        this.centimeters = (double) centimeters* inch;
    }

    public Double getLitiers() {
        return litiers;
    }

    public void setLitiers(Double litiers) {
        this.litiers = (double)litiers* gallon;
    }
    
    
    
}
