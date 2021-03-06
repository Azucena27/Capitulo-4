/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Azucena
 */
public class BirdSighting {

    private Date fecha;
    private String especie;
    private int cantidad;

    public BirdSighting() {
        SimpleDateFormat objSDF = new SimpleDateFormat("dd-mm-yyyy");
        try {
            Date fecha1 = objSDF.parse("01-01-2021");
            diaAño(fecha1);
        } catch (ParseException ex) {
            Logger.getLogger(BirdSighting.class.getName()).log(Level.SEVERE, null, ex);
        }

        this.setCantidad(1);
        this.setEspecie("Robin");

        System.out.println("Cantidad: " + getCantidad());
        System.out.println("Especie: " + getEspecie());
    }

    public BirdSighting(Date fecha, String especie, int cantidadDate) {
        this.setFecha(fecha);
        this.setCantidad(cantidadDate);
        this.setEspecie(especie);
        
        diaAño(fecha);
        System.out.println("Cantidad: " + getCantidad());
        System.out.println("Especie: " + getEspecie());
    }

    public void diaAño(Date fechaDate) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(fechaDate);

        int dia = calendar.get(Calendar.DAY_OF_YEAR);
        System.out.println("Día: " + dia);
    }

    /**
     * @return the fecha
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the especie
     */
    public String getEspecie() {
        return especie;
    }

    /**
     * @param especie the especie to set
     */
    public void setEspecie(String especie) {
        this.especie = especie;
    }

    /**
     * @return the cantidad
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

}
