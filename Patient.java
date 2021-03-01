/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

/**
 *
 * @author Azucena
 */
public class Patient {

    private int id;
    private int edad;
    private BloodData bloodData;

    public Patient() {
        this.id = 0;
        this.edad = 0;
        this.bloodData.tipoSangre = bloodData.tipoSangre.O;
        this.bloodData.rH = "+";
        System.out.println("Id del paciente: " + id);
        System.out.println("Edad del paciente: " + edad);
        System.out.println("rh: " + bloodData.getrH().toString());
    }

    public Patient(int id, int edad, TipoSangre sangre, String rH) {
        System.out.println("Id del paciente: " + id);
        System.out.println("Edad del paciente: " + edad);
        System.out.println("Tipo de sangre: "+sangre+rH);
    }
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * @return the bloodData
     */
    public BloodData getBloodData() {
        return bloodData;
    }

    /**
     * @param bloodData the bloodData to set
     */
    public void setBloodData(BloodData bloodData) {
        this.bloodData = bloodData;
    }

}
