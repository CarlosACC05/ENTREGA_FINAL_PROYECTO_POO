/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_vehiculo;

import proyecto_vehiculo.clases.Vehiculo;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class MenuC extends javax.swing.JFrame {

    /**
     * Creates new form MenuC
     */
    private ArrayList<Vehiculo> autos;

    public MenuC() {

        autos = new ArrayList<>();

        initComponents();
        this.setTitle("AutoSoftPro");
        setLocationRelativeTo(null);

        try {
            FileReader lectorArchivo = new FileReader("C:\\AutoSoftPro\\prueba.txt");

            BufferedReader datosArch = new BufferedReader(lectorArchivo);
            String linea;

            while ((linea = datosArch.readLine()) != null) {

                // ponemos como separador ;
                String[] valores = linea.split(";");
                int ano;
                ano = Integer.parseInt(valores[2]);
                float precio;
                precio = Float.parseFloat(valores[4]);
                int cantidad;
                cantidad = Integer.parseInt(valores[5]);

                autos.add(new Vehiculo(valores[0], valores[1], ano, valores[3], precio, cantidad));

            }

        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        this.Imprimir();
    }

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
        txtConsulta.setText(mostrar);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnFiltro = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtConsulta = new javax.swing.JTextArea();
        btnCancelar = new javax.swing.JButton();
        btnFiltro1 = new javax.swing.JButton();

        btnFiltro.setText("Filtrar");
        btnFiltro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnFiltroMouseClicked(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtConsulta.setColumns(20);
        txtConsulta.setRows(5);
        jScrollPane1.setViewportView(txtConsulta);

        btnCancelar.setText("Cancelar");
        btnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelarMouseClicked(evt);
            }
        });

        btnFiltro1.setText("Filtrar");
        btnFiltro1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnFiltro1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 473, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnFiltro1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCancelar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFiltro1)
                    .addComponent(btnCancelar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseClicked
        // TODO add your handling code here:
        LoginC log = new LoginC();
        log.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCancelarMouseClicked

    private void btnFiltroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFiltroMouseClicked
        // TODO add your handling code here:
        String filtro = JOptionPane.showInputDialog("Introduzca el filtro:");
        filtrarDatos(filtro);
    }//GEN-LAST:event_btnFiltroMouseClicked

    private void btnFiltro1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFiltro1MouseClicked
        // TODO add your handling code here:
        String filtro = JOptionPane.showInputDialog("Introduzca el filtro:");
        filtrarDatos(filtro);
    }//GEN-LAST:event_btnFiltro1MouseClicked
    private void filtrarDatos(String filtro) {
        String mostrar = "id     Marca\tModelo\tAño\tColor\tPrecio\tCantidad\n"
                + "-----------------------------------------------------"
                + "----------------------------------------------------------------------\n";

        for (int i = 0; i < autos.size(); i++) {
            Vehiculo vehiculo = autos.get(i);

            if (vehiculo == null) {
                break;
            }

            // Verifica si el vehículo cumple con el filtro
            if (vehiculo.getMarca().equalsIgnoreCase(filtro)
                    || vehiculo.getModelo().equalsIgnoreCase(filtro)
                    || String.valueOf(vehiculo.getAno()).contains(filtro)
                    || vehiculo.getColor().equalsIgnoreCase(filtro)) {
                mostrar += i + "     " + vehiculo.getMarca()
                        + "\t" + vehiculo.getModelo()
                        + "\t" + vehiculo.getAno() 
                        + "\t" + vehiculo.getColor() 
                        + "\t" + vehiculo.getPrecio() 
                        + "\t" + vehiculo.getCantidad() + "\n";
            }
        }

        txtConsulta.setText(mostrar);
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
            java.util.logging.Logger.getLogger(MenuC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuC().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnFiltro;
    private javax.swing.JButton btnFiltro1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtConsulta;
    // End of variables declaration//GEN-END:variables
}
