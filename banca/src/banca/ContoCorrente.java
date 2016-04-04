/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banca;

/**
 *
 * @author svilupposw
 */
public class ContoCorrente {
    private int idConto;
    private Persona intestatario;
    private Double saldo;

    public int getIdConto() {
        return idConto;
    }

    public void setIdConto(int idConto) {
        this.idConto = idConto;
    }

    public Persona getIntestatario() {
        return intestatario;
    }

    public void setIntestatario(Persona intestatario) {
        this.intestatario = intestatario;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public ContoCorrente(int idConto, Persona intestatario, Double saldo) {
        this.idConto = idConto;
        this.intestatario = intestatario;
        this.saldo = saldo;
    }
    
    
}
