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
public class PaintCalculator {
    private Integer length;
    private Integer width;
    private Integer heigth;
    private Integer area;
    private Double gallon;
    private Double price;

    public PaintCalculator() {
        this.length = length;
        this.width = width;
        this.heigth = heigth;
        this.area = area;
        this.gallon = gallon;
        this.price = price;
    }
    
    

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getHeigth() {
        return heigth;
    }

    public void setHeigth(Integer heigth) {
        this.heigth = heigth;
    }

    public Integer getArea() {
        return area;
    }

    public void setArea(Integer length, Integer width, Integer heigth) {
        this.area = (2*length*heigth) + (2* width *heigth);
    }

    public Double getGallon() {
        return gallon;
    }

    public void setGallon(Double Area) {
        this.gallon = (double) this.area /350;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double gallon) {
        this.price = this.gallon*32;
    }
    
    
}
