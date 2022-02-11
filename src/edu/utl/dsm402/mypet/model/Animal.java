//el proyecto es una JAVA CLASS LIBRARY
package edu.utl.dsm402.mypet.model;

/**
 *
 * @author jorge luis
 */
public class Animal {
    private int idAnimal;
    private Producto producto;
    private String raza;
    private String especie;
    private String fechaNacimiento;
    private String fechaLlegada;

    public Animal(){}

    public Animal(Producto producto, String raza, String especie, String fechaNacimiento, String fechaLlegada) {
        this.producto = producto;
        this.raza = raza;
        this.especie = especie;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaLlegada = fechaLlegada;
    }

    
    public Animal(int idAnimal, Producto producto, String raza, String especie, String fechaNacimiento, String fechaLlegada) {
        this.idAnimal = idAnimal;
        this.producto = producto;
        this.raza = raza;
        this.especie = especie;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaLlegada = fechaLlegada;
    }
    
    
    
    public int getIdAnimal() {
        return idAnimal;
    }

    public void setIdAnimal(int idAnimal) {
        this.idAnimal = idAnimal;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getFechaLlegada() {
        return fechaLlegada;
    }

    public void setFechaLlegada(String fechaLlegada) {
        this.fechaLlegada = fechaLlegada;
    }
    
    
}
