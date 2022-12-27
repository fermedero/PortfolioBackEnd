
package com.mycompany.portfolio;

/**
 *
 * @author MEDERO
 */
public class Camion extends Vehiculo{
    
    int cantEjes;
    boolean acoplado;

    public Camion(int cantEjes, boolean acoplado, int numRegistro, int cantRuedas, String marca, String modelo) {
        super(numRegistro, cantRuedas, marca, modelo);
        this.cantEjes = cantEjes;
        this.acoplado = acoplado;
    }

    public Camion() {
    }

    public int getCantEjes() {
        return cantEjes;
    }

    public void setCantEjes(int cantEjes) {
        this.cantEjes = cantEjes;
    }

    public boolean isAcoplado() {
        return acoplado;
    }

    public void setAcoplado(boolean acoplado) {
        this.acoplado = acoplado;
    }
        
}
