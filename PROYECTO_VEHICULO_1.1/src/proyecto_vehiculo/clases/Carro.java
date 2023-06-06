/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_vehiculo.clases;

public class Carro extends Vehiculo {
    
    String tipoCarro;

    public Carro() {
        
    }

    public Carro(String tipoCarro, String marca, String modelo, int ano, String color, float precio, int cantidad) {
        super(marca, modelo, ano, color, precio, cantidad);
        this.tipoCarro = tipoCarro;
    }

    public String getTipoCarro() {
        return tipoCarro;
    }

    public void setTipoCarro(String tipoCarro) {
        this.tipoCarro = tipoCarro;
    }


    
}
