/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author Azucena
 */
public class FormLetterWriter {

    String apellido;
    String nombre;

    public static void displaySalutation(String apellido) {
        System.out.println("Estimado Sr. o Sra. " + apellido);
        System.out.println("Gracias por su pedido reciente.");
    }

    public static void displaySalutation(String nombre, String apellido) {
        System.out.println("Estimado(a) " + nombre + " " + apellido);
        System.out.println("Gracias por su pedido reciente.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa el nombre del cliente: ");
        String nombre = scanner.nextLine();
        System.out.println("Ingresa el apellido del cliente: ");
        String apellido = scanner.nextLine();
        System.out.println(" ");

        displaySalutation(apellido);
        System.out.println(" ");
        displaySalutation(nombre, apellido);

    }
}
