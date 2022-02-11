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
public class DetalleVenta {
    private int idDetalleVenta;
    private Venta idVenta;
    private Producto idProducto;
    private float costoVenta;
    private int cantidad;

    public DetalleVenta(){}
    
    public DetalleVenta(Venta idVenta, Producto idProducto, float costoVenta, int cantidad) {
        this.idVenta = idVenta;
        this.idProducto = idProducto;
        this.costoVenta = costoVenta;
        this.cantidad = cantidad;
    }

    public DetalleVenta(int idDetalleVenta, Venta idVenta, Producto idProducto, float costoVenta, int cantidad) {
        this.idDetalleVenta = idDetalleVenta;
        this.idVenta = idVenta;
        this.idProducto = idProducto;
        this.costoVenta = costoVenta;
        this.cantidad = cantidad;
    }


    public int getIdDetalleVenta() {
        return idDetalleVenta;
    }

    public void setIdDetalleVenta(int idDetalleVenta) {
        this.idDetalleVenta = idDetalleVenta;
    }

    public Venta getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(Venta idVenta) {
        this.idVenta = idVenta;
    }

    public Producto getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Producto idProducto) {
        this.idProducto = idProducto;
    }

    public float getCostoVenta() {
        return costoVenta;
    }

    public void setCostoVenta(float costoVenta) {
        this.costoVenta = costoVenta;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    
}
