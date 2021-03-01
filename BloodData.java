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
public class BloodData {
    
    public TipoSangre tipoSangre;
    public String rH;
    
    public BloodData(){
    this.tipoSangre= tipoSangre.O;
    this.rH="+";
    
    }
    
    public BloodData(TipoSangre tipoSangre, String rH){
        System.out.println("El tipo de sangre es: "+tipoSangre+rH);
        
    }

    /**
     * @return the tipoSangre
     */
    public TipoSangre getTipoSangre() {
        return tipoSangre;
    }

    /**
     * @param tipoSangre the tipoSangre to set
     */
    public void setTipoSangre(TipoSangre tipoSangre) {
        this.tipoSangre = tipoSangre;
    }

    /**
     * @return the rH
     */
    public String getrH() {
        return rH;
    }

    /**
     * @param rH the rH to set
     */
    public void setrH(String rH) {
        this.rH = rH;
    }
    
    
}
