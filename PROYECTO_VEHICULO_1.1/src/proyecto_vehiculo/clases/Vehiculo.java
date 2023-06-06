
package proyecto_vehiculo.clases;


public class Vehiculo {
    private String marca;
    private String modelo;
    private int ano;
    private String color;
    private float precio;
    private int cantidad;

    public Vehiculo() {
    }

    public Vehiculo(String marca, String modelo, int ano, String color, float precio, int cantidad) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.color = color;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

  
   
    
    
}