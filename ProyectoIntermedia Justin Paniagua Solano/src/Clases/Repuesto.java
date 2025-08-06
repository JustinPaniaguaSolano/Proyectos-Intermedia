/*
    Proyecto 1 programacion intermedia 

    Autor del proyecto:Justin Paniagua Solano

    Celula:305530632

    Segundo Cuatrimestre 2024
*/
package Clases;

public class Repuesto {
    //atritutos
    private  String nombre;
    private String marca;
    private double precioSinImpuesto;
    private double impuesto;
    private double precioConImpuestos;
    private String categoria;
    
    //constructor con atritutos
    public Repuesto(String nombre, String marca, double precioSinImpuesto, double impuesto, double precioConImpuestos, String categoria) {
        this.nombre = nombre;
        this.marca = marca;
        this.precioSinImpuesto = precioSinImpuesto;
        this.impuesto = impuesto;
        this.precioConImpuestos = precioConImpuestos;
        this.categoria = categoria;
    }
    
//constructor sin atritutos//inicializar los atritutos
    public Repuesto() {
        this.nombre = "";
        this.marca = "";
        this.precioSinImpuesto = 0;
        this.impuesto = impuesto;
        this.precioConImpuestos = 0;
        this.categoria = "";
    }
    
    //getter and setter de los atritutos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecioSinImpuesto() {
        return precioSinImpuesto;
    }

    public void setPrecioSinImpuesto(double precioSinImpuesto) {
        this.precioSinImpuesto = precioSinImpuesto;
    }

    public double getImpuesto() {
        return impuesto;
    }

    public void setImpuesto(double impuesto) {
        this.impuesto = impuesto;
    }

    public double getPrecioConImpuestos() {
        return precioConImpuestos;
    }

    public void setPrecioConImpuestos(double precioConImpuestos) {
        this.precioConImpuestos = precioConImpuestos;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    //overide
    @Override
    public String toString() {
        return "Repuesto{" + "nombre=" + nombre + ", marca=" + marca + ", precioSinImpuesto=" + precioSinImpuesto + ", impuesto=" + impuesto + ", precioConImpuestos=" + precioConImpuestos + ", categoria=" + categoria + '}';
    }
    
    
    
}
