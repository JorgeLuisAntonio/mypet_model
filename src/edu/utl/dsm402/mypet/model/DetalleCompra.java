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
public class DetalleCompra {
    private int idDetalleCompra;
    private Compra idCompra;
    private Producto idProducto;
    private float costoUnitario;
    private int cantidad;
    
    public DetalleCompra(){}

    public DetalleCompra(Compra idCompra, Producto idProducto, float costoUnitario, int cantidad) {
        this.idCompra = idCompra;
        this.idProducto = idProducto;
        this.costoUnitario = costoUnitario;
        this.cantidad = cantidad;
    }

    public DetalleCompra(int idDetalleCompra, Compra idCompra, Producto idProducto, float costoUnitario, int cantidad) {
        this.idDetalleCompra = idDetalleCompra;
        this.idCompra = idCompra;
        this.idProducto = idProducto;
        this.costoUnitario = costoUnitario;
        this.cantidad = cantidad;
    }
    
    

    public int getIdDetalleCompra() {
        return idDetalleCompra;
    }

    public void setIdDetalleCompra(int idDetalleCompra) {
        this.idDetalleCompra = idDetalleCompra;
    }

    public Compra getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(Compra idCompra) {
        this.idCompra = idCompra;
    }

    public Producto getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Producto idProducto) {
        this.idProducto = idProducto;
    }

    public float getCostoUnitario() {
        return costoUnitario;
    }

    public void setCostoUnitario(float costoUnitario) {
        this.costoUnitario = costoUnitario;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    
}
