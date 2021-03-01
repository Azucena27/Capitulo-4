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
public class TestSandwichFilling {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese el tipo de relleno: ");
        String relleno = scanner.nextLine();
        System.out.println("Ingrese las calorias por porción:  ");
        String caloriasPorcion = scanner.nextLine();
        System.out.println("Ingrese el tipo de relleno: ");
        String relleno1 = scanner.nextLine();
        System.out.println("Ingrese las calorias por porción:  ");
        String caloriasPorcion1 = scanner.nextLine();
         System.out.println("Ingrese el tipo de relleno: ");
        String relleno2 = scanner.nextLine();
        System.out.println("Ingrese las calorias por porción:  ");
        String caloriasPorcion2 = scanner.nextLine();
        
        SandwichFilling sandwich1 = new SandwichFilling(relleno, caloriasPorcion);
        SandwichFilling sandwich2 = new SandwichFilling(relleno1, caloriasPorcion1);
        SandwichFilling sandwich3 = new SandwichFilling(relleno2, caloriasPorcion2);
        
    }
    
}
