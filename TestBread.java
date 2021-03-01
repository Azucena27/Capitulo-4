/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

import java.util.Scanner;

/**
 *
 * @author Azucena
 */
public class TestBread {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el tipo de pan: ");
        String tipo = scanner.nextLine();
        System.out.println("Calorias por rebanada:  ");
        String calorias = scanner.nextLine();
        System.out.println("Ingrese el tipo de pan: ");
        String tipo2 = scanner.nextLine();
        System.out.println("Calorias por rebanda:  ");
        String calorias2 = scanner.nextLine(); 
        System.out.println("Ingrese el tipo de pan: ");
        String tipo3 = scanner.nextLine();
        System.out.println("Calorias por rebanda:  ");
        String calorias3 = scanner.nextLine();
        
        Bread pan1 = new Bread(tipo,calorias);  
        Bread pan2 = new Bread(tipo2, calorias2);
        Bread pan3 = new Bread(tipo3, calorias3);
    }


}
