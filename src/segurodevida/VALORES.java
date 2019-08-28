/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segurodevida;

/**
 *
 * @author CBN
 */
public class VALORES {
    private String nombre, valorBase, valorFinal;

    public VALORES(String nombre, String valorBase, String valorFinal) {
        this.nombre = nombre;
        this.valorBase = valorBase;
        this.valorFinal = valorFinal;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setValorBase(String valorBase) {
        this.valorBase = valorBase;
    }

    public void setValorFinal(String valorFinal) {
        this.valorFinal = valorFinal;
    }
    
}
