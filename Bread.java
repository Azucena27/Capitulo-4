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
public class Bread {
    private String tipo;
    private String calorias;
    public static final String MOTTO = "The staff of life.";
   
    public Bread(String tipo, String calorias){
        this.tipo = tipo;
        this.calorias = calorias;
        
        System.out.println("El tipo de pan es: "+getTipo());
        System.out.println("Calorias por rebanada: "+getCalorias());
        System.out.println(MOTTO);
        System.out.println();
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the calorias
     */
    public String getCalorias() {
        return calorias;
    }

    /**
     * @param calorias the calorias to set
     */
    public void setCalorias(String calorias) {
        this.calorias = calorias;
    }
}
 



