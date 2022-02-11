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
public class Venta {
    private int idVenta;
    private String fechaVenta;
    private int folio;
    private int estatus;
    private Cliente idCliente;
    private Empleado idEmpleado;
    
    
    public Venta(){}

    public Venta(String fechaVenta, int folio, int estatus, Cliente idCliente, Empleado idEmpleado) {
        this.fechaVenta = fechaVenta;
        this.folio = folio;
        this.estatus = estatus;
        this.idCliente = idCliente;
        this.idEmpleado = idEmpleado;
    }

    public Venta(int idVenta, String fechaVenta, int folio, int estatus, Cliente idCliente, Empleado idEmpleado) {
        this.idVenta = idVenta;
        this.fechaVenta = fechaVenta;
        this.folio = folio;
        this.estatus = estatus;
        this.idCliente = idCliente;
        this.idEmpleado = idEmpleado;
    }

    public Empleado getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(Empleado idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public String getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(String fechaVenta) {
        this.fechaVenta = fechaVenta;
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

    public Cliente getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Cliente idCliente) {
        this.idCliente = idCliente;
    }
    
 
}
