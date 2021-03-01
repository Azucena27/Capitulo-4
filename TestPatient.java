/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import static java.lang.System.in;
import java.util.Scanner;

/**
 *
 * @author Azucena
 */
public class TestPatient {

    private static TipoSangre sangre;
    private static String rH;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa el ID del paciente: ");
        int id = scanner.nextInt();
        System.out.println("Ingresa la edad del paciente: ");
        int edad = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Ingresa el tipo de sangre: ");
        String tipo = scanner.nextLine();
        switch (tipo) {

            case "O":
                sangre = TipoSangre.O;
                break;
            case "A":
                sangre = TipoSangre.A;
                break;
            case "B":
                sangre = TipoSangre.B;
                break;
            case "AB":
                sangre = TipoSangre.AB;
                break;
        }

        System.out.println("Ingresa el RH (+/-): ");
        rH = scanner.nextLine();

        Patient paciente1 = new Patient(id,edad,sangre,rH); 
        
    }

}
