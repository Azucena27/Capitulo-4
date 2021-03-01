/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import java.util.Scanner;
import ejercicio4.BloodData;
import ejercicio4.TipoSangre;
/**
 *
 * @author Azucena
 */
public class TestBloodData {

     private static TipoSangre sangre;
     private static String rH;
     
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingresa el tipo de sangre: ");
        String tipo = scanner.nextLine();
       
        switch(tipo){
        
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
  
        
        BloodData bloodData = new BloodData(sangre,rH);
        //BloodData bloodData1 = new BloodData();
        //System.out.println("tipo sangre: "+bloodData1.getTipoSangre().toString()+bloodData1.getrH().toString());
        
        
  }

    
}
