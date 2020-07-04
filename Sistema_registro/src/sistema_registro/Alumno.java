/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema_registro;

/**
 *
 * @author Carlos
 */
public class Alumno extends javax.swing.JFrame {

    /**
     * Creates new form Alumno
     */
    public Alumno() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_numeroCuenta = new javax.swing.JLabel();
        lbl_nombre = new javax.swing.JLabel();
        lbl_apellido = new javax.swing.JLabel();
        lbl_telefono = new javax.swing.JLabel();
        lbl_fechaNacimiento = new javax.swing.JLabel();
        lbl_carrera = new javax.swing.JLabel();
        txt_numeroCuenta = new javax.swing.JTextField();
        txt_nombres = new javax.swing.JTextField();
        txt_apellidos = new javax.swing.JTextField();
        txt_telefono = new javax.swing.JTextField();
        btn_agregarAlumnos = new javax.swing.JButton();
        btn_Limpiar = new javax.swing.JButton();
        lbl_titulo = new javax.swing.JLabel();
        cld_fechaNacimiento = new com.toedter.calendar.JDateChooser();
        cbo_carrera = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl_numeroCuenta.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_numeroCuenta.setText("Numero de Cuenta:");

        lbl_nombre.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_nombre.setText("Nombres:");

        lbl_apellido.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_apellido.setText("Apellidos:");

        lbl_telefono.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_telefono.setText("Telefono:");

        lbl_fechaNacimiento.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_fechaNacimiento.setText("Fecha de nacimiento:");

        lbl_carrera.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_carrera.setText("Carrera:");

        txt_numeroCuenta.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txt_nombres.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txt_apellidos.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txt_telefono.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txt_telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_telefonoActionPerformed(evt);
            }
        });

        btn_agregarAlumnos.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_agregarAlumnos.setText("Agregar alumno");

        btn_Limpiar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_Limpiar.setText("Limpiar");

        lbl_titulo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbl_titulo.setText("Registro de alumnos");

        cbo_carrera.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbo_carrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_carreraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(247, 247, 247)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(btn_agregarAlumnos)
                        .addGap(18, 18, 18)
                        .addComponent(btn_Limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbl_carrera)
                            .addComponent(lbl_fechaNacimiento)
                            .addComponent(lbl_telefono)
                            .addComponent(lbl_apellido)
                            .addComponent(lbl_numeroCuenta)
                            .addComponent(lbl_nombre))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_numeroCuenta)
                            .addComponent(txt_nombres)
                            .addComponent(txt_apellidos)
                            .addComponent(txt_telefono)
                            .addComponent(cld_fechaNacimiento, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                            .addComponent(cbo_carrera, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(312, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_titulo)
                .addGap(386, 386, 386))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(lbl_titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_numeroCuenta)
                    .addComponent(txt_numeroCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_nombre)
                    .addComponent(txt_nombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_apellido)
                    .addComponent(txt_apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_telefono)
                    .addComponent(txt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_fechaNacimiento)
                    .addComponent(cld_fechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_carrera)
                    .addComponent(cbo_carrera, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_agregarAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(137, 137, 137))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_telefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_telefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_telefonoActionPerformed

    private void cbo_carreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_carreraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbo_carreraActionPerformed

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
            java.util.logging.Logger.getLogger(Alumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Alumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Alumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Alumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Alumno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Limpiar;
    private javax.swing.JButton btn_agregarAlumnos;
    private javax.swing.JComboBox<String> cbo_carrera;
    private com.toedter.calendar.JDateChooser cld_fechaNacimiento;
    private javax.swing.JLabel lbl_apellido;
    private javax.swing.JLabel lbl_carrera;
    private javax.swing.JLabel lbl_fechaNacimiento;
    private javax.swing.JLabel lbl_nombre;
    private javax.swing.JLabel lbl_numeroCuenta;
    private javax.swing.JLabel lbl_telefono;
    private javax.swing.JLabel lbl_titulo;
    private javax.swing.JTextField txt_apellidos;
    private javax.swing.JTextField txt_nombres;
    private javax.swing.JTextField txt_numeroCuenta;
    private javax.swing.JTextField txt_telefono;
    // End of variables declaration//GEN-END:variables
}
