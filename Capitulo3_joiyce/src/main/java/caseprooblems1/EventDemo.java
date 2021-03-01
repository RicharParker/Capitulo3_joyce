/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caseprooblems1;

/**
 *
 * @author ARCHV
 */
public class EventDemo {
    private  Integer precioxInvitado;
    private Integer nInvitados;
    private Integer Costo;
     
    public void fiesta(){
        nInvitados = 22;
        precioxInvitado=3;
        Costo = nInvitados *precioxInvitado;
        System.out.println("El costo de la fiest es: "+Costo);
    }
    
    public Integer getPrecioxInvitado() {
        return precioxInvitado;
    }

    public void setPrecioxInvitado(Integer precioxInvitado) {
        this.precioxInvitado = precioxInvitado;
    }

    public Integer getnInvitados() {
        return nInvitados;
    }

    public void setnInvitados(Integer nInvitados) {
        this.nInvitados = nInvitados;
    }

    public Integer getCosto() {
        return Costo;
    }

    public void setCosto(Integer Costo) {
        this.Costo = Costo;
    }
    
    
}
