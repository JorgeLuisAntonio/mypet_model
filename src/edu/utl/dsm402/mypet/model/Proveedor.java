/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.utl.dsm402.mypet.model;

/**
 *
 * @author Usuario
 */
public class Proveedor {
    
    private int idProveedor;
    private String rfc;
    private String razonSocial;
    private Persona idRepresentante;

    public Proveedor() {}

    public Proveedor(int idProveedor, String rfc, String razonSocial, Persona idRepresentante) {
        this.idProveedor = idProveedor;
        this.rfc = rfc;
        this.razonSocial = razonSocial;
        this.idRepresentante = idRepresentante;
    }

    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public Persona getIdRepresentante() {
        return idRepresentante;
    }

    public void setIdRepresentante(Persona idRepresentante) {
        this.idRepresentante = idRepresentante;
    }
    
    
    
}
