/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;

/**
 *
 * @author Azucena
 */
public class TestCircle {

    public static void main(String[] args) {
        
        Circle circulo1 = new Circle();
        Circle circulo2 = new Circle();
        Circle circulo3 = new Circle();
        
        circulo1.setRadio(2);
        circulo2.setRadio(5);
        circulo3.setRadio(1);
        
        circulo1.imprimir();
        circulo2.imprimir();
        circulo3.imprimir();
        
        
    }
    
}
