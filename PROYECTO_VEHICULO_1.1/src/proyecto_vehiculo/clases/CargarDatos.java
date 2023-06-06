/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_vehiculo.clases;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CargarDatos implements CargarDatosInterf {
   @Override
   public ArrayList<Vehiculo> Cargar() {
        ArrayList<Vehiculo> autos = new ArrayList<>();
        autos.clear();

        try {

            FileReader lectorArchivo = new FileReader("C:\\AutoSoftPro\\prueba.txt");

            BufferedReader br = new BufferedReader(lectorArchivo);
            String linea;

            while ((linea = br.readLine()) != null) {

                // ponemos como separador ;
                String [] valores = linea.split(";");
                int ano;
                ano = Integer.parseInt(valores[2]);
                
                float precio;
                precio = Float.parseFloat(valores[4]);
                
                int cantidad;
                cantidad = Integer.parseInt(valores[5]);

                autos.add(new Vehiculo(valores[0], valores[1], ano, valores[3], precio,cantidad));

            }
            br.close();

        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return autos;
    }

}
