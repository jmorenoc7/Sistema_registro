
package sistema_registro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import sistema_registro.SQL.ConectorSQL;
import sistema_registro.Empleado;

/**
 *
 * @author wianp
 */
public class ConsultasEmpleados extends javax.swing.JFrame {

   
    String titulos [] = {"Nombre","Apellido", "Salario", "Telefono", "Identidad", "idCampus", "NombreUsuario", "contraseña", "tipoUsuario"};
    String fila [] = new String[7];
    DefaultTableModel modelo;
    Connection con = null;
    Statement stmt = null;
    String var, var2;
     private String driver;

   
    public ConsultasEmpleados()  throws SQLException {
        this.con = ConectorSQL.obtenerConexion();
        initComponents();
        this.setTitle("Consulta Empleados");
        this.setLocation(335,200);
        this.setResizable(false);
     
        try {
        
        String url = "jdbc:sqlserver://DESKTOP-C3H4LER\\SQLEXPRESS;";
            String usuario = "admin";
            String contraseña = "admin";  
            
                    
           Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance(); 
        
               con = DriverManager.getConnection(url);
               if (con!= null)
                   System.out.println("Se ha establecido una conexion a la base de datos"+"\n"+url);

  
               stmt = con.createStatement();
               ResultSet rs = stmt.executeQuery("select* from Empleados");
               
               modelo = new DefaultTableModel(null,titulos);
            
               while(rs.next()) {
                   
                   fila[0] = rs.getString("id");
                   fila[1] = rs.getString("Nombres");
                   fila[2] = rs.getString("Apellidos");
                   fila[3] = rs.getString("Campus");
                   fila[4] = rs.getString("Telefono");
                   fila[5] = rs.getString("Identidad");
                   fila[6] = rs.getString("Password");
                   fila[7] = rs.getString("Tipo Usuario");
                   
                   modelo.addRow(fila);     
               }
               Tabla_Empleados.setModel(modelo);
                TableColumn ci = Tabla_Empleados.getColumn("id");
                ci.setMaxWidth(25);
                TableColumn cn = Tabla_Empleados.getColumn("Nombre");
                cn.setMaxWidth(165);
                TableColumn cd = Tabla_Empleados.getColumn("Domicilio");
                cd.setMaxWidth(160);
                TableColumn ct = Tabla_Empleados.getColumn("Telefono");
                ct.setMaxWidth(90);
              //  TableColumn ct = Tabla_Empleados.getColumn("Identidad");
                //ct.setMaxWidth(90);
                TableColumn cp = Tabla_Empleados.getColumn("Password");
                cp.setMaxWidth(72);
                TableColumn ctipo = Tabla_Empleados.getColumn("Tipo Usuario");
                ctipo.setMaxWidth(95);
               
            }
                catch (Exception e) {
            
            JOptionPane.showMessageDialog(null,"Error al extraer los datos de la tabla");
        }

    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla_Empleados = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btn_modificar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        btn_ConsultaIndividual = new javax.swing.JButton();
        BarraMenu = new javax.swing.JMenuBar();
        MenuArchivo = new javax.swing.JMenu();
        MenuRegistro = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Tabla_Empleados.setBackground(new java.awt.Color(204, 204, 204));
        Tabla_Empleados.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createEtchedBorder()));
        Tabla_Empleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(Tabla_Empleados);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Consulta de empleados");

        btn_modificar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_modificar.setText("Modificar");
        btn_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificarActionPerformed(evt);
            }
        });

        btn_eliminar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_eliminar.setText("Eliminar");

        btn_ConsultaIndividual.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_ConsultaIndividual.setText("Consulta Ind");
        btn_ConsultaIndividual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ConsultaIndividualActionPerformed(evt);
            }
        });

        MenuArchivo.setText("Archivo");

        MenuRegistro.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        MenuRegistro.setText("Registro Empleados");
        MenuRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuRegistroActionPerformed(evt);
            }
        });
        MenuArchivo.add(MenuRegistro);

        BarraMenu.add(MenuArchivo);

        setJMenuBar(BarraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(385, 385, 385)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(278, 278, 278)
                        .addComponent(btn_modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_ConsultaIndividual)
                        .addGap(18, 18, 18)
                        .addComponent(btn_eliminar)))
                .addContainerGap(302, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_modificar)
                    .addComponent(btn_eliminar)
                    .addComponent(btn_ConsultaIndividual))
                .addContainerGap(108, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
     
     
    

    
    
    private void MenuRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuRegistroActionPerformed

        try {
            this.dispose();
            Empleado E = new Empleado();
            E.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(ConsultasEmpleados.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_MenuRegistroActionPerformed

    private void btn_ConsultaIndividualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ConsultaIndividualActionPerformed

       
        //   this.dispose();
        
       //ConsultaIndividual ci = new ConsultaIndividual();
       //ci.setVisible(true);
       
       String cap="";
        ResultSet rs = null; 
var = javax.swing.JOptionPane.showInputDialog(this,"Nombre del Usuario","Consultausuario",javax.swing.JOptionPane.QUESTION_MESSAGE);
        String sql="SELECT* FROM  usuarios WHERE nombre = '"+var+"'";
if(var == null)  
javax.swing.JOptionPane.showMessageDialog(this,"La accion fue cancelada","AVISO!",javax.swing.JOptionPane.INFORMATION_MESSAGE);
      else {
        if (var.equals("")) {
javax.swing.JOptionPane.showMessageDialog(this,"Favor de ingresar el nombre del empleado\nquedesea consultar","AVISO!",javax.swing.JOptionPane.INFORMATION_MESSAGE);
        }
         else {
        try {

String url = "jdbc:sqlserver://DESKTOP-C3H4LER\\SQLEXPRESS;";
String usuario = "admin";
            String contraseña = "admin";

Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance(); 
             con = DriverManager.getConnection(url,usuario,contraseña); 
if( con != null ) 
System.out.println("Se ha establecido una conexión a la base de datos " +  
"\n " + url ); 

stmt = con.createStatement(); 
rs = stmt.executeQuery(sql);

          while(rs.next()) {

               cap = rs.getString("tipoUsuario"); 

          if (cap.equals("administrador") || cap.equals("manager") || cap.equals("servidor")) {

ConsultaIndividual();           
          }
}   // fin del bucle While

        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException ex) {
Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
       }

finally {
            if (con != null) {
                try {
con.close();
stmt.close();
                } catch ( Exception e ) { 
System.out.println( e.getMessage());
                }
              }
            }
           if ( !cap.equals("Empleado") && !cap.equals("Administrador")) {
javax.swing.JOptionPane.showMessageDialog(this,"Elusuario no fueencontrado\n","ERROR!", javax.swing.JOptionPane.ERROR_MESSAGE);

          }
        }
      }  

        
    }                                                      

    private void txt_IdentidadKeyTyped(java.awt.event.KeyEvent evt) {                                       
        // TODO add your handling code here:
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
        
        
      
        
        
    }//GEN-LAST:event_btn_ConsultaIndividualActionPerformed

    
    private void btn_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarActionPerformed
        
         
                
    }//GEN-LAST:event_btn_modificarActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar BarraMenu;
    private javax.swing.JMenu MenuArchivo;
    private javax.swing.JMenuItem MenuRegistro;
    private javax.swing.JTable Tabla_Empleados;
    private javax.swing.JButton btn_ConsultaIndividual;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_modificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private void ConsultaIndividual() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  
}
