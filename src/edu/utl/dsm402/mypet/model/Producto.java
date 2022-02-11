package edu.utl.dsm402.mypet.model;

/**
 *
 *
 *
 * @author Lolis
 */
public class Producto {

    private int idProducto;

    private String nombre;

    private int existencias;

    private float precioCompra;

    private String foto;

    private int estatus;

    public Producto() {
    }

    public Producto(String nombre, int existencias, float precioCompra, int estatus) {
        this.nombre = nombre;

        this.existencias = existencias;

        this.precioCompra = precioCompra;

        this.estatus = estatus;

    }

    public Producto(int idProducto, String nombre, int existencias, float precioCompra, String foto, int estatus) {
        this.idProducto = idProducto;

        this.nombre = nombre;

        this.existencias = existencias;

        this.precioCompra = precioCompra;

        this.foto = foto;

        this.estatus = estatus;

    }

    public int getIdProducto() {

        return idProducto;

    }

    public void setIdProducto(int idProducto) {

        this.idProducto = idProducto;

    }

    public String getNombre() {

        return nombre;

    }

    public void setNombre(String nombre) {

        this.nombre = nombre;

    }

    public int getExistencias() {

        return existencias;

    }

    public void setExistencias(int existencias) {

        this.existencias = existencias;

    }

    public float getPrecioCompra() {

        return precioCompra;

    }

    public void setPrecioCompra(float precioCompra) {

        this.precioCompra = precioCompra;

    }

    public int getEstatus() {

        return estatus;

    }

    public void setEstatus(int estatus) {

        this.estatus = estatus;

    }

    public String getFoto() {

        return foto;

    }

    public void setFoto(String foto) {

        this.foto = foto;

    }

}
