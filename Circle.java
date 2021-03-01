/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;

import static java.lang.Math.PI;

/**
 *
 * @author Azucena
 */
public class Circle {
      private double diametro;
      private int radio;
      private double area;
    
    public Circle(){
        this.radio = 1;
        this.diametro = this.radio*2;
        this.area = Math.PI*Math.pow(radio,2);
    }

    public void imprimir(){
        System.out.println("El radio es: "+this.radio);
        System.out.println("El diametro es: "+this.diametro);
        System.out.println("El área es: "+this.area);
    }
    /**
     * @return the diametro
     */
    public double getDiametro() {
        return diametro;
    }

    /**
     * @param diametro the diametro to set
     */
    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    /**
     * @return the radio
     */
    public Integer getRadio() {
        return radio;
    }

    /**
     * @param radio the radio to set
     */
    public void setRadio(int radio) {
        this.radio = radio;
        this.diametro = this.radio*2;
        this.area = Math.PI*this.radio*2;  
    }

    /**
     * @return the area
     */
    public double getArea() {
        return area;
    }

    /**
     * @param area the area to set
     */
    public void setArea(double area) {
        this.area = area;
    }


    
    
}
