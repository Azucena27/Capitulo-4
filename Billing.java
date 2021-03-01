/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import java.util.Scanner;

/**
 *
 * @author Azucena
 */
public class Billing {

    int precioLibro;
    int cantidad;
    int cupon;

    public static void computeBill(int precioLibro) {
        double precioFinal;
        precioFinal = precioLibro + (0.08 * precioLibro);
        System.out.println(precioFinal);
    }
    
    public static void computeBill(int cantidad, int precioLibro){
        double libroCantidad, precioCantidad;
        libroCantidad = precioLibro*cantidad;
        precioCantidad = libroCantidad+(libroCantidad*0.08);
        System.out.println(precioCantidad);
    }
    
    public static void computeBill(int cantidad, int precioLibro,int cupon){
        float precioPedido;
        float precioLibros;
        double descuento;
        float precioDescuento;
        float libroPedidos;
        float precioFinal;
        precioPedido = precioLibro*cantidad;
        precioLibros = (float)cupon/100;
        libroPedidos = precioPedido*precioLibros;
        precioDescuento = precioPedido-libroPedidos;////////<-----------------
        descuento = (float)precioDescuento*0.08;
        precioFinal = precioDescuento +(float)descuento;
        System.out.println(precioFinal);  ///////////// 
    } 
  
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el precio del libro:");
        int precioLibro = scanner.nextInt();
        System.out.println("Ingrese la cantidad de libros:");
        int cantidad = scanner.nextInt();
        System.out.println("Ingrese el porcentaje de descuento del cupón:");
        int cupon = scanner.nextInt();
        
        
        System.out.println(" ");
        computeBill(precioLibro);
        System.out.println(" ");
        computeBill(cantidad, precioLibro);
        System.out.println(" ");
        computeBill(cantidad,precioLibro,cupon );
        
    }
}
