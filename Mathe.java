/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7;

import java.lang.Math;

/**
 *
 * @author Azucena 
 */
public class Mathe {

    private static double raizCuadrada;
    private double seno;
    private double coseno;
    private double floor;
    private double celi;
    private double round;
    private double random;
    private int x =71;
    private int y= 72;
    private int mayor;

    public void RaizCuadrada(double b) {
    raizCuadrada= Math.sqrt(b);
    }

    public void Seno(double b) {
      seno = Math.sin(b);
    }

    public void Coseno(double b) {
        coseno = Math.cos(b);
    }

    public void Floor(double b) {
        floor = Math.floor(b);
    }
    
    public void Celi(double b) {
       celi= Math.ceil(b);
    }
    
    public void Round(double b) {
     round = Math.round(b);
    }
    public void Random() {
     random = Math.random()*20+1;
    }
    
    public void imprimir(){
        System.out.println("Raiz cuadrada: "+raizCuadrada);
        System.out.println("Seno: "+seno);
        System.out.println("Coseno: "+coseno);
        System.out.println("Floor: "+floor);
        System.out.println("Ceiling: "+celi);
        System.out.println("Round: "+round);
        System.out.println("Random: "+random);
    }
    

}
