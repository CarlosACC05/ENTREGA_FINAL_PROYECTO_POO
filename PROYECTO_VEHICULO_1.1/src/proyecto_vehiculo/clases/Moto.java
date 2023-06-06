/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_vehiculo.clases;

public class Moto extends Vehiculo {
    private String cc;

    public Moto() {
    }

    public Moto(String cc, String marca, String modelo, int ano, String color, float precio, int cantidad) {
        super(marca, modelo, ano, color, precio, cantidad);
        this.cc = cc;
    }

    public String getCc() {
        return cc;
    }

    public void setCc(String cc) {
        this.cc = cc;
    }

   
    
    
}
