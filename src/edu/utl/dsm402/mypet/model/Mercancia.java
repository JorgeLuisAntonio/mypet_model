package edu.utl.dsm402.mypet.model;

/**
 *
 *
 *
 * @author Lolis
 */
public class Mercancia {

    private int idMercancia;
    private Producto producto;
    private String codigoBarras;
    private String descripcion;
    private String modelo;
    private String marca;

    public Mercancia() {
    }

    public Mercancia(Producto producto, String codigoBarras, String descripcion, String modelo, String marca) {
        this.producto = producto;
        this.codigoBarras = codigoBarras;
        this.descripcion = descripcion;
        this.modelo = modelo;
        this.marca = marca;

    }

    public Mercancia(int idMercancia, Producto producto, String codigoBarras, String descripcion, String modelo, String marca) {

        this.idMercancia = idMercancia;
        this.producto = producto;
        this.codigoBarras = codigoBarras;
        this.descripcion = descripcion;
        this.modelo = modelo;
        this.marca = marca;
    }

    public int getIdMercancia() {
        return idMercancia;
    }

    public void setIdMercancia(int idMercancia) {
        this.idMercancia = idMercancia;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

}
