/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

/**
 *
 * @author Azucena
 */
public class SandwichFilling {

    private String relleno;
    private String caloriasPorcion;

    public SandwichFilling(String relleno, String caloriasPorcion) {
        this.relleno = relleno;
        this.caloriasPorcion = caloriasPorcion;
        System.out.println("Tipo de relleno: " + getRelleno());
        System.out.println("Calorias por porción: " + getCaloriasPorcion());
        System.out.println();
    }

    /**
     * @return the relleno
     */
    public String getRelleno() {
        return relleno;
    }

    /**
     * @param relleno the relleno to set
     */
    public void setRelleno(String relleno) {
        this.relleno = relleno;
    }

    /**
     * @return the caloriasPorcion
     */
    public String getCaloriasPorcion() {
        return caloriasPorcion;
    }

    /**
     * @param caloriasPorcion the caloriasPorcion to set
     */
    public void setCaloriasPorcion(String caloriasPorcion) {
        this.caloriasPorcion = caloriasPorcion;
    }

}
