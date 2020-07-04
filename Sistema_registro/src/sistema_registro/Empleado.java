/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema_registro;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import sistema_registro.SQL.ConectorSQL;

/**
 *
 * @author Mitsuki
 */
public class Empleado extends javax.swing.JFrame {
    Connection con;

    /**
     * Creates new form RegistroEmpleado
     */
    public Empleado() throws SQLException {
        this.con = ConectorSQL.obtenerConexion();
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

        jButton1 = new javax.swing.JButton();
        txt_Nombre = new javax.swing.JTextField();
        txt_Apellido = new javax.swing.JTextField();
        lbl_nombres = new javax.swing.JLabel();
        lbl_apellidos = new javax.swing.JLabel();
        lbl_salario = new javax.swing.JLabel();
        txt_Salario = new javax.swing.JTextField();
        lbl_nombreUsuario = new javax.swing.JLabel();
        txt_NombreUsuario = new javax.swing.JTextField();
        lbl_contraseña = new javax.swing.JLabel();
        btn_guardar = new javax.swing.JButton();
        lbl_telefono = new javax.swing.JLabel();
        lbl_idCampus = new javax.swing.JLabel();
        txt_Telefono = new javax.swing.JTextField();
        cbo_idCampus = new javax.swing.JComboBox<>();
        pwd_contraseña = new javax.swing.JPasswordField();
        btn_limpiar = new javax.swing.JButton();
        lbl_titulo = new javax.swing.JLabel();
        chb_mostrarContraseña = new javax.swing.JCheckBox();
        lbl_tipoUsuario = new javax.swing.JLabel();
        cbo_tipoUsuario = new javax.swing.JComboBox<>();
        btn_consultar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        txt_Nombre.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txt_Nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_NombreActionPerformed(evt);
            }
        });
        txt_Nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_NombreKeyTyped(evt);
            }
        });

        txt_Apellido.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txt_Apellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_ApellidoKeyTyped(evt);
            }
        });

        lbl_nombres.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_nombres.setText("Nombres");

        lbl_apellidos.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_apellidos.setText("Apellidos");

        lbl_salario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_salario.setText("Salario");

        txt_Salario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txt_Salario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_SalarioActionPerformed(evt);
            }
        });
        txt_Salario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_SalarioKeyTyped(evt);
            }
        });

        lbl_nombreUsuario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_nombreUsuario.setText("Nombre De Usuario");

        txt_NombreUsuario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        lbl_contraseña.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_contraseña.setText("Contraseña");

        btn_guardar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_guardar.setText("Guardar");
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });

        lbl_telefono.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_telefono.setText("Teléfono");

        lbl_idCampus.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_idCampus.setText("ID Campus");

        txt_Telefono.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txt_Telefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_TelefonoKeyTyped(evt);
            }
        });

        cbo_idCampus.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cbo_idCampus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        pwd_contraseña.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        pwd_contraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pwd_contraseñaActionPerformed(evt);
            }
        });

        btn_limpiar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_limpiar.setText("Limpiar");

        lbl_titulo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbl_titulo.setText("Registro de Empleado");

        chb_mostrarContraseña.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        chb_mostrarContraseña.setText("Mostrar contraseña");
        chb_mostrarContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chb_mostrarContraseñaActionPerformed(evt);
            }
        });

        lbl_tipoUsuario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_tipoUsuario.setText("Tipo Usuario");

        cbo_tipoUsuario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cbo_tipoUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbo_tipoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_tipoUsuarioActionPerformed(evt);
            }
        });

        btn_consultar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_consultar.setText("Consultar");
        btn_consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_consultarActionPerformed(evt);
            }
        });

        jMenu1.setText("Inicio");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Menu Principal");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbl_apellidos)
                            .addComponent(lbl_nombres, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txt_Nombre, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbl_telefono)
                            .addComponent(lbl_salario)
                            .addComponent(lbl_idCampus))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbo_idCampus, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_Salario)))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)))))
                .addGap(112, 112, 112)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbl_nombreUsuario)
                            .addComponent(lbl_contraseña)
                            .addComponent(lbl_tipoUsuario))
                        .addGap(69, 69, 69)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbo_tipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(pwd_contraseña)
                                .addComponent(txt_NombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(chb_mostrarContraseña)
                        .addGap(78, 78, 78)))
                .addGap(56, 56, 56))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lbl_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(359, 359, 359))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btn_guardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_limpiar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_consultar)
                        .addGap(315, 315, 315))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(lbl_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_nombreUsuario)
                            .addComponent(txt_NombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_contraseña)
                            .addComponent(pwd_contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_tipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbo_tipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addComponent(chb_mostrarContraseña))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_telefono)
                            .addComponent(txt_Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_nombres, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_apellidos))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_Salario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_salario))
                        .addGap(78, 78, 78)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbo_idCampus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_idCampus))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_consultar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(114, 114, 114))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_SalarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_SalarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_SalarioActionPerformed

    private void chb_mostrarContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chb_mostrarContraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chb_mostrarContraseñaActionPerformed

    private void pwd_contraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pwd_contraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pwd_contraseñaActionPerformed

    private void cbo_tipoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_tipoUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbo_tipoUsuarioActionPerformed

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
        String cadena3, cadena4, cadena5, cadena6, cadena7, cadena8, cadena9, cadena10;
        cadena3 = txt_Nombre.getText();
        cadena4 = txt_Apellido.getText();
        cadena5 = txt_Salario.getText();
        cadena6 = txt_Telefono.getText();
        cadena7 = cbo_idCampus.getSelectedItem().toString();
        cadena8 = txt_NombreUsuario.getText();
        cadena9 = pwd_contraseña.getText();
        cadena10 = cbo_tipoUsuario.getSelectedItem().toString();
        
        if ((txt_Nombre.getText().equals("")) || (txt_Apellido.getText().equals("")) || (txt_Salario.getText().equals(""))
         || (txt_Telefono.getText().equals("")) || (cbo_idCampus.getSelectedItem().equals(null)) || (txt_NombreUsuario.getText().equals(""))|| (pwd_contraseña.getText().equals("")) || (cbo_tipoUsuario.getSelectedItem().equals(null)) ) {
            
            javax.swing.JOptionPane.showMessageDialog(this,"Debe llenar todos los campos \n","AVISO!",javax.swing.JOptionPane.INFORMATION_MESSAGE);
            txt_Nombre.requestFocus();
        }
    }//GEN-LAST:event_btn_guardarActionPerformed

    private void txt_NombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_NombreKeyTyped
       char c = evt.getKeyChar();
       if((c < 'a' || c > 'z') && (c < 'A' || c >'Z') && (c > ' ' || c > ' '))evt.consume();
    }//GEN-LAST:event_txt_NombreKeyTyped

    private void txt_ApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_ApellidoKeyTyped
       char c = evt.getKeyChar();
       if((c < 'a' || c > 'z') && (c < 'A' || c >'Z') && (c > ' ' || c > ' '))evt.consume();
    }//GEN-LAST:event_txt_ApellidoKeyTyped

    private void txt_TelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_TelefonoKeyTyped
        char c = evt.getKeyChar();
        if((c < '0' || c > '9'))evt.consume();
    }//GEN-LAST:event_txt_TelefonoKeyTyped

    private void txt_SalarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_SalarioKeyTyped
      char c = evt.getKeyChar();
      if((c < '0' || c > '9'))evt.consume();
    }//GEN-LAST:event_txt_SalarioKeyTyped

    private void txt_NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_NombreActionPerformed
        
    }//GEN-LAST:event_txt_NombreActionPerformed

    private void btn_consultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_consultarActionPerformed
        
        this.dispose();
        
        ConsultasEmpleados u = null;
        try {
            u = new ConsultasEmpleados();
        } catch (SQLException ex) {
            Logger.getLogger(Empleado.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        u.setVisible(true);
        
    }//GEN-LAST:event_btn_consultarActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        this.dispose();
        
        Principal p = new Principal();
        p.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(Empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Empleado().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Empleado.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_consultar;
    private javax.swing.JButton btn_guardar;
    private javax.swing.JButton btn_limpiar;
    private javax.swing.JComboBox<String> cbo_idCampus;
    private javax.swing.JComboBox<String> cbo_tipoUsuario;
    private javax.swing.JCheckBox chb_mostrarContraseña;
    private javax.swing.JButton jButton1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JLabel lbl_apellidos;
    private javax.swing.JLabel lbl_contraseña;
    private javax.swing.JLabel lbl_idCampus;
    private javax.swing.JLabel lbl_nombreUsuario;
    private javax.swing.JLabel lbl_nombres;
    private javax.swing.JLabel lbl_salario;
    private javax.swing.JLabel lbl_telefono;
    private javax.swing.JLabel lbl_tipoUsuario;
    private javax.swing.JLabel lbl_titulo;
    private javax.swing.JPasswordField pwd_contraseña;
    private javax.swing.JTextField txt_Apellido;
    private javax.swing.JTextField txt_Nombre;
    private javax.swing.JTextField txt_NombreUsuario;
    private javax.swing.JTextField txt_Salario;
    private javax.swing.JTextField txt_Telefono;
    // End of variables declaration//GEN-END:variables

  

}
