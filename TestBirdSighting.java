/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.text.SimpleDateFormat;
import java.text.ParseException;

/**
 *
 * @author Azucena
 */
public class TestBirdSighting {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la espcie de ave vista: ");
        String especie = scanner.nextLine();
        System.out.println("Ingrese el nuemero de aves vista: ");
        String fechaString = scanner.nextLine();
        
        int cantidad = 0;
        if (fechaString != null && fechaString.length() > 0) {
            cantidad = Integer.parseInt(fechaString);
        }
        System.out.println("Introduzca la fecha con formato dd-mm-yyyy");
        String fecha = scanner.nextLine();

        if (fecha != null && fecha.length() > 0) {
            SimpleDateFormat formato = new SimpleDateFormat("dd-mm-yyyy");
            Date fechaDate = null;
            try {
                fechaDate = formato.parse(fecha);
            } catch (ParseException ex) {
                System.out.println(ex);
            }

            BirdSighting dia = new BirdSighting(fechaDate, especie, cantidad);
           
        } else {
            BirdSighting dia = new BirdSighting();
        }

    }
}
