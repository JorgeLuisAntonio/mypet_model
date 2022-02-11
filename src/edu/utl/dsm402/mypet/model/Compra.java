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
public class Compra {
    
    private int idCompra;
    private String fechaCompra;
    private int folio;
    private int estatus;
    private Proveedor idProveedor;
    private Empleado idEmpleado;

    
    public Compra(){}

    public Compra(String fechaCompra, int folio, int estatus, Proveedor idProveedor, Empleado idEmpleado) {
        this.fechaCompra = fechaCompra;
        this.folio = folio;
        this.estatus = estatus;
        this.idProveedor = idProveedor;
        this.idEmpleado = idEmpleado;
    }

    public Compra(int idCompra, String fechaCompra, int folio, int estatus, Proveedor idProveedor, Empleado idEmpleado) {
        this.idCompra = idCompra;
        this.fechaCompra = fechaCompra;
        this.folio = folio;
        this.estatus = estatus;
        this.idProveedor = idProveedor;
        this.idEmpleado = idEmpleado;
    }
    
    
    
    public int getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(int idCompra) {
        this.idCompra = idCompra;
    }

    public String getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(String fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public int getFolio() {
        return folio;
    }

    public void setFolio(int folio) {
        this.folio = folio;
    }

    public int getEstatus() {
        return estatus;
    }

    public void setEstatus(int estatus) {
        this.estatus = estatus;
    }

    public Proveedor getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(Proveedor idProveedor) {
        this.idProveedor = idProveedor;
    }

    public Empleado getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(Empleado idEmpleado) {
        this.idEmpleado = idEmpleado;
    }
    
    
}
