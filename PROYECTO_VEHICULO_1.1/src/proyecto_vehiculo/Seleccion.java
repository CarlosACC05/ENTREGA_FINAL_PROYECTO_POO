
package proyecto_vehiculo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class Seleccion extends javax.swing.JFrame {

    
    public Seleccion() {
        initComponents();
        this.setTitle("AutoSoftPro");
        setLocationRelativeTo(null);
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnAdmin = new javax.swing.JButton();
        btnCliente = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("BIENVENIDO");

        btnAdmin.setText("Administrador");
        btnAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAdminMouseClicked(evt);
            }
        });

        btnCliente.setText("Cliente");
        btnCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnClienteMouseClicked(evt);
            }
        });

        jLabel2.setText("SELECCIONE UNA OPCIÓN");

        btnSalir.setText("Salir");
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalirMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnSalir)
                .addGap(25, 25, 25))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(jLabel1)))))
                .addContainerGap(139, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(btnAdmin)
                .addGap(45, 45, 45)
                .addComponent(btnCliente)
                .addGap(29, 29, 29)
                .addComponent(btnSalir)
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdminMouseClicked
        // TODO add your handling code here:
       LoginA login2 = new LoginA();
       login2.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_btnAdminMouseClicked

    private void btnClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClienteMouseClicked
        // TODO add your handling code here:
        
        ConsultaC cons = new ConsultaC();
        cons.setVisible(true);
        // abre el panel ConsultaC
        this.dispose();
        // Quita el panel actual
    }//GEN-LAST:event_btnClienteMouseClicked

    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked
        // TODO add your handling code here:
        System.exit(0);
       //  Cierrra la pestaña
    }//GEN-LAST:event_btnSalirMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        File directorio = new File("C:/AutoSoftPro");
        
        // Se verifica si el directorio ya existe y si no se pudo crear
        if (!directorio.exists() && !directorio.mkdirs()) {
            System.out.println("Error al crear directorio");

        }
        
        String rutaArchivo = "C:/AutoSoftPro/usuarios.txt";
        
        File archivo = new File(rutaArchivo);
        // verifica si existe el archivo
        if (archivo.exists()==false) {
            try {
                FileWriter fileWriter = new FileWriter(rutaArchivo);  
                // se crea un archi y se escribe en el un usuario
                fileWriter.write("2\n");
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        String rutaArchivo2 = "C:/AutoSoftPro/contraseña.txt";

        File archivo2 = new File(rutaArchivo2);
         // verifica si existe el archivo
        if (archivo2.exists()==false) {
            try {
                FileWriter fileWriter = new FileWriter(rutaArchivo2);  
                // se crea un archi y se escribe en el uan contraseña
                fileWriter.write("1\n");
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        String rutaArchivo3 = "C:/AutoSoftPro/contraseñaAdministrador.txt";

        File archivo3 = new File(rutaArchivo3);
         // verifica si existe el archivo
        if (archivo3.exists()==false) {
            try {
                FileWriter fileWriter = new FileWriter(rutaArchivo3);  
                // se crea un archi y se escribe en el uan contraseña
              
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        String rutaArchivo4 = "C:/AutoSoftPro/usuarioAdministrador.txt";

        File archivo4 = new File(rutaArchivo4);
         // verifica si existe el archivo
        if (archivo4.exists()==false) {
            try {
                FileWriter fileWriter = new FileWriter(rutaArchivo4);  
                // se crea un archi y se escribe en el uan contraseña
               
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        String rutaArchivo5 = "C:/AutoSoftPro/id.txt";

        File archivo5 = new File(rutaArchivo5);
         // verifica si existe el archivo
        if (archivo5.exists()==false) {
            try {
                FileWriter fileWriter = new FileWriter(rutaArchivo5);  
                // se crea un archi y se escribe en el uan contraseña
                
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        String rutaArchivo6 = "C:/AutoSoftPro/prueba.txt";

        File archivo6 = new File(rutaArchivo6);
         // verifica si existe el archivo
        if (archivo6.exists()==false) {
            try {
                FileWriter fileWriter = new FileWriter(rutaArchivo6);  
                // se crea un archi y se escribe en el uan contraseña
                
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Seleccion().setVisible(true);
            }
            
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdmin;
    private javax.swing.JButton btnCliente;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
