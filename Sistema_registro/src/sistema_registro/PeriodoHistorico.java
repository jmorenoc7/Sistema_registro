/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema_registro;

import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Carlos
 */
public class PeriodoHistorico extends javax.swing.JFrame {

    /**
     * Creates new form Periodos
     */
    public PeriodoHistorico() {
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

        lbl_periodo = new javax.swing.JLabel();
        lbl_fechaInicial = new javax.swing.JLabel();
        lbl_fechaFinal = new javax.swing.JLabel();
        cld_fechaInicial = new com.toedter.calendar.JDateChooser();
        cld_fechaFinal = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        btn_agregarPeriodo = new javax.swing.JButton();
        btn_eliminarUltimoPeriodo = new javax.swing.JButton();
        lbl_nombrePeriodo = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        cbo_periodo = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl_periodo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_periodo.setText("Período:");

        lbl_fechaInicial.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_fechaInicial.setText("Fecha inicial:");

        lbl_fechaFinal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_fechaFinal.setText("Fecha final:");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Período Histórico");

        btn_agregarPeriodo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_agregarPeriodo.setText("Agregar periodo");

        btn_eliminarUltimoPeriodo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_eliminarUltimoPeriodo.setText("Eliminar ultimo periodo creado");

        lbl_nombrePeriodo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_nombrePeriodo.setText("Nombre del periodo:");

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        cbo_periodo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cbo_periodo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(315, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbl_nombrePeriodo)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbl_periodo)
                                .addComponent(lbl_fechaInicial)
                                .addComponent(lbl_fechaFinal, javax.swing.GroupLayout.Alignment.TRAILING)))
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cld_fechaInicial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cld_fechaFinal, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                            .addComponent(jTextField1)
                            .addComponent(cbo_periodo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(301, 301, 301))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btn_agregarPeriodo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_eliminarUltimoPeriodo))
                        .addGap(325, 325, 325))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(368, 368, 368))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(jLabel1)
                .addGap(86, 86, 86)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_periodo)
                    .addComponent(cbo_periodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_fechaInicial)
                    .addComponent(cld_fechaInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_fechaFinal)
                    .addComponent(cld_fechaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_nombrePeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addComponent(btn_agregarPeriodo)
                .addGap(31, 31, 31)
                .addComponent(btn_eliminarUltimoPeriodo)
                .addContainerGap(102, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws UnsupportedLookAndFeelException {
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
            java.util.logging.Logger.getLogger(PeriodoHistorico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PeriodoHistorico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PeriodoHistorico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
       
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PeriodoHistorico().setVisible(true);
            }
        });
    }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_agregarPeriodo;
    private javax.swing.JButton btn_eliminarUltimoPeriodo;
    private javax.swing.JComboBox<String> cbo_periodo;
    private com.toedter.calendar.JDateChooser cld_fechaFinal;
    private com.toedter.calendar.JDateChooser cld_fechaInicial;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lbl_fechaFinal;
    private javax.swing.JLabel lbl_fechaInicial;
    private javax.swing.JLabel lbl_nombrePeriodo;
    private javax.swing.JLabel lbl_periodo;
    // End of variables declaration//GEN-END:variables
}
