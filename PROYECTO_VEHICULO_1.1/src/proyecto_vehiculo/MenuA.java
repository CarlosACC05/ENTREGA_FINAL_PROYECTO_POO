/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyecto_vehiculo;

import proyecto_vehiculo.clases.Vehiculo;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import proyecto_vehiculo.clases.CargarDatos;

public class MenuA extends javax.swing.JFrame {

    /**
     * Creates new form VPrincipal
     */
    private ArrayList<Vehiculo> autos;
    //Se declara un arrayList de clase Vehiculos

    public MenuA() {

        setLocationRelativeTo(null);
        initComponents();
        autos = new ArrayList<>();
        //Se instancia el arrayList
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCargar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtSalida = new javax.swing.JTextArea();
        btninsert = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tfMarca = new javax.swing.JTextField();
        tfModelo = new javax.swing.JTextField();
        tfAño = new javax.swing.JTextField();
        tfColor = new javax.swing.JTextField();
        tfCantidad = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        btnFiltro = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        tfPrecio = new javax.swing.JTextField();
        btnLimpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cargar Datos");

        btnCargar.setText("Cargar datos");
        btnCargar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCargarMouseClicked(evt);
            }
        });

        txtSalida.setEditable(false);
        txtSalida.setColumns(20);
        txtSalida.setRows(5);
        jScrollPane1.setViewportView(txtSalida);

        btninsert.setText("Introducir");
        btninsert.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btninsertMouseClicked(evt);
            }
        });

        btnSave.setText("Guardar");
        btnSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSaveMouseClicked(evt);
            }
        });

        btnBorrar.setText("Borrar");
        btnBorrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBorrarMouseClicked(evt);
            }
        });

        jLabel2.setText("Modelo:");

        jLabel3.setText("Año:");

        jLabel4.setText("Color:");

        jLabel5.setText("Precio:");

        jLabel1.setText("Marca:");

        btnSalir.setText("Salir");
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalirMouseClicked(evt);
            }
        });

        btnFiltro.setText("Filtrar");
        btnFiltro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnFiltroMouseClicked(evt);
            }
        });

        jLabel6.setText("Cantidad:");

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLimpiarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(btnCargar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btninsert, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnBorrar, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                                    .addComponent(btnLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel6))
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(tfColor, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfAño, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCargar)
                            .addComponent(btninsert))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(tfMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(tfModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(tfAño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(tfColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(tfPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(tfCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSave)
                            .addComponent(btnBorrar))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnFiltro)
                            .addComponent(btnLimpiar))
                        .addGap(15, 15, 15))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalir)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Imprimir() {
        // Creamos un metodo imprimir 
        String mostrar = "id     Marca\tModelo\tAño\tColor\tPrecio\tCantidad\n"
                + "-----------------------------------------------------"
                + "----------------------------------------------------------------------\n";

        for (int i = 0; i < autos.size(); i++) {

            if (autos.get(i) == null) {
                break;
            }

            mostrar += i + "     " + autos.get(i).getMarca()
                    + "\t" + autos.get(i).getModelo()
                    + "\t" + autos.get(i).getAno()
                    + "\t" + autos.get(i).getColor()
                    + "\t" + autos.get(i).getPrecio()
                    + "\t" + autos.get(i).getCantidad() + "\n";

        }
        txtSalida.setText(mostrar);
    }

    private void btnCargarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCargarMouseClicked
        // TODO add your handling code here:
        CargarDatos datos = new CargarDatos();

        autos = datos.Cargar();
        this.Imprimir();

    }//GEN-LAST:event_btnCargarMouseClicked

    private void btninsertMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btninsertMouseClicked
        // TODO add your handling code here:

        String textMarca;
        textMarca = tfMarca.getText();

        String textModelo;
        textModelo = tfModelo.getText();

        String textAno;
        textAno = tfAño.getText();
        int ano;

        String textColor;
        textColor = tfColor.getText();

        String textPrecio;
        textPrecio = tfPrecio.getText();
        float precio;

        String textCantidad;
        textCantidad = tfCantidad.getText();
        int cantidad;

        if (textMarca.contains(";")
                || textModelo.contains(";")
                || textAno.contains(";")
                || textColor.contains(";")
                || textPrecio.contains(";")
                || textCantidad.contains(";")) {
            JOptionPane.showMessageDialog(null, "Los campos no pueden contener: " + ";");
        } else if (textMarca.isEmpty()
                || textModelo.isEmpty()
                || textAno.isEmpty()
                || textColor.isEmpty()
                || textPrecio.isEmpty()
                || textCantidad.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor rellene todos los campos.");

        } else {

            try {
                precio = Float.parseFloat(textPrecio);

                ano = Integer.parseInt(textAno);
                cantidad = Integer.parseInt(textCantidad);
                boolean existe = false;
                if (autos.isEmpty()) {
                    autos.add(new Vehiculo(textMarca, textModelo, ano, textColor, precio, cantidad));
                    this.Imprimir();
                } else {
                    for (int i = 0; i < autos.size(); i++) {
                        Vehiculo vehiculo = autos.get(i);
                        if (vehiculo != null
                                && vehiculo.getMarca().equalsIgnoreCase(textMarca)
                                && vehiculo.getModelo().equalsIgnoreCase(textModelo)
                                && vehiculo.getAno() == ano
                                && vehiculo.getColor().equalsIgnoreCase(textColor)
                                && vehiculo.getPrecio() == precio) {
                            existe = true;
                            vehiculo.setCantidad(vehiculo.getCantidad() + cantidad);
                            this.Imprimir();
                        }
     
                    }
                    if (existe==true) {
                            JOptionPane.showMessageDialog(null,
                                    "Ya existe un vehículo con las mismas características, se han agregado: " + cantidad + " vehiculos");
                        } else if(existe == false){
                            
                            autos.add(new Vehiculo(textMarca, textModelo, ano, textColor, precio, cantidad));
                            this.Imprimir();
                        }
                }

            } catch (NumberFormatException e) {

                JOptionPane.showMessageDialog(null, "Debe ingresar un valor numérico válido en las casillas: Año, Precio y Cantidad.");
            }

        }


    }//GEN-LAST:event_btninsertMouseClicked

    private void btnSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveMouseClicked
        // TODO add your handling code here:
        try {
            FileWriter fileW = new FileWriter("C:\\AutoSoftPro\\prueba.txt");

            BufferedWriter datosArch = new BufferedWriter(fileW);

            for (int i = 0; i < autos.size(); i++) {

                if (autos.get(i) == null) {
                    break;
                }
                datosArch.write(autos.get(i).getMarca()
                        + ";" + autos.get(i).getModelo()
                        + ";" + autos.get(i).getAno()
                        + ";" + autos.get(i).getColor()
                        + ";" + autos.get(i).getPrecio()
                        + ";" + autos.get(i).getCantidad() + "\n");

            }
            datosArch.close();

        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_btnSaveMouseClicked

    private void btnBorrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBorrarMouseClicked
        // TODO add your handling code here:
        String txtBorrar;
        txtBorrar = JOptionPane.showInputDialog("Introduzca la ID del vehiculo que desea eliminar: ");
        int idBorrar;
        idBorrar = Integer.parseInt(txtBorrar);
        autos.remove(idBorrar);
        this.Imprimir();

    }//GEN-LAST:event_btnBorrarMouseClicked

    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked
        // TODO add your handling code here:
        Seleccion selec = new Seleccion();
        selec.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSalirMouseClicked

    private void btnFiltroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFiltroMouseClicked
        // TODO add your handling code here:
        String filtro = JOptionPane.showInputDialog("Introduzca el filtro:");
        filtrarDatos(filtro);
    }//GEN-LAST:event_btnFiltroMouseClicked

    private void btnLimpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseClicked
        // TODO add your handling code here:
        tfMarca.setText("");
        tfModelo.setText("");
        tfAño.setText("");
        tfColor.setText("");
        tfPrecio.setText("");
        tfCantidad.setText("");
    }//GEN-LAST:event_btnLimpiarMouseClicked
    private void filtrarDatos(String filtro) {
        String mostrar = "id     Marca\tModelo\tAño\tColor\tPrecio\tCantidad\n"
                + "-----------------------------------------------------"
                + "----------------------------------------------------------------------\n";

        for (int i = 0; i < autos.size(); i++) {

            if (autos.get(i) == null) {
                break;
            }

            // Verifica si el vehículo cumple con el filtro
            if (autos.get(i).getMarca().equalsIgnoreCase(filtro)
                    || autos.get(i).getModelo().equalsIgnoreCase(filtro)
                    || String.valueOf(autos.get(i).getAno()).contains(filtro)
                    || autos.get(i).getColor().equalsIgnoreCase(filtro)) {
                mostrar += i + "     " + autos.get(i).getMarca()
                        + "\t" + autos.get(i).getModelo()
                        + "\t" + autos.get(i).getAno()
                        + "\t" + autos.get(i).getColor()
                        + "\t" + autos.get(i).getPrecio()
                        + "\t" + autos.get(i).getCantidad() + "\n";
            }
        }

        txtSalida.setText(mostrar);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuA().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnCargar;
    private javax.swing.JButton btnFiltro;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btninsert;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField tfAño;
    private javax.swing.JTextField tfCantidad;
    private javax.swing.JTextField tfColor;
    private javax.swing.JTextField tfMarca;
    private javax.swing.JTextField tfModelo;
    private javax.swing.JTextField tfPrecio;
    private javax.swing.JTextArea txtSalida;
    // End of variables declaration//GEN-END:variables
}