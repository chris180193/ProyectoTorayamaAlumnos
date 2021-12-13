/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

// Librerias de conexion
import java.sql.Connection;//conexion a BD
import java.sql.DriverManager;//Driver de conexion
import java.sql.ResultSet;//Resultado final de datos
import java.sql.ResultSetMetaData;//Resultado de metadatos
import java.sql.SQLException;//Tratamiento de Errores de BD SQL
import java.sql.Statement;//Generador de sentencias sql DDL,MDL,DCL
import java.text.SimpleDateFormat;//Formatear datos
import java.util.Date;//Fecha de sistema
import java.util.Set;
import javax.swing.ImageIcon;//Tratamiento de imagenes
import javax.swing.JOptionPane;//ventanas emergentes
import javax.swing.table.DefaultTableModel; //tabla de datos
import pojos.Alumno;
import pojos.Grupo;
import sun.net.smtp.SmtpClient;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import pojos.Dato;

/**
 *
 * @author danie
 */
public class Login extends javax.swing.JFrame {
 //clases de conexion y sus objetos
    public Connection cn;
    public Statement stmt;
    public ResultSet rs;
    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
    }
 public void conectarBase(){
    
        try{//inicia try
        
            Class.forName("com.mysql.jdbc.Driver");
            cn = DriverManager.getConnection("jdbc:mysql://localhost/bdrodriguezproyectois","root","");
            //JOptionPane.showMessageDialog(null, "Conexion a BD OK\n\nRodriguez");
            stmt = cn.createStatement();
        }catch(SQLException ex){
                JOptionPane.showMessageDialog(null, "Error de base de datos 1: \n"+ ex);
        }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Error de base de datos 2:"+e);
        }
    }//termina metodo conectar
    public void buscarId(){
      
        try{
            conectarBase();
            String usuarioAcceso = txtUsuario.getText();
                

             
                rs=stmt.executeQuery("SELECT id FROM talumno WHERE usuario = '"+usuarioAcceso+"'" );
                
                
                if (rs.next()==true) {
                    int idUsuario = rs.getInt("id"); 
                
              Dato objDato = new Dato();
              objDato.setId(idUsuario);
            } else {
                 
            }
               
        }
        catch(SQLException ex){
            
        }
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        txtUsuario = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        optAdministrador = new javax.swing.JRadioButton();
        optAlumno = new javax.swing.JRadioButton();
        btnLogin = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 0, 51));

        jLabel1.setText("Usuario:");

        jLabel2.setText("Password:");

        jPanel2.setBackground(new java.awt.Color(255, 255, 51));

        optAdministrador.setBackground(new java.awt.Color(255, 255, 0));
        buttonGroup2.add(optAdministrador);
        optAdministrador.setText("Administrador");

        optAlumno.setBackground(new java.awt.Color(255, 255, 0));
        buttonGroup2.add(optAlumno);
        optAlumno.setText("Alumno");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(optAdministrador)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addComponent(optAlumno)
                .addGap(33, 33, 33))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(optAdministrador)
                    .addComponent(optAlumno))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        btnLogin.setBackground(new java.awt.Color(255, 255, 255));
        btnLogin.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/torayama3.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(203, 203, 203)
                        .addComponent(btnLogin)))
                .addContainerGap(80, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(48, 48, 48)
                        .addComponent(jLabel1))
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(btnLogin)
                .addContainerGap(98, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    
    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
       buscarId();
        conectarBase(); //LLamada a conexión de BD

        if (optAdministrador.isSelected()) { //if para usuario administrador

            try {
                String usuarioAcceso = txtUsuario.getText();
                String passwordAcceso = txtPassword.getText();

                boolean error = true;
                rs=stmt.executeQuery("SELECT * from tusuariosadmin");
                while(rs.next()==true){
                    if(usuarioAcceso.equals(rs.getString("usuarioadmin"))&&passwordAcceso.equals(rs.getString("passwordadmin"))){
                        error=false;
                        
                       

                        CRUDAlumno ventanaCRUDAlumno = new CRUDAlumno();
                       // JOptionPane.showMessageDialog(null, "Bienvenido a sistema Administrador\n"+usuarioAcceso);
                        ventanaCRUDAlumno.setVisible(true);
                        this.hide();

                    }//termina if
                }//termina while
                if(error ==true){//if si no encontro a usuario
                    JOptionPane.showMessageDialog(null, "Error al ingresar usuario\nVerifica!!!");
                    txtUsuario.setText(usuarioAcceso);
                    txtPassword.setText(null);
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,"Error de DB verifica"+ e);
            }//Termina catch

        } else if (optAlumno.isSelected()){ //If para usuario Alumno

            try {
                String usuarioAcceso = txtUsuario.getText();
                String passwordAcceso = txtPassword.getText();

                boolean error = true;
                rs=stmt.executeQuery("SELECT * from talumno");
                while(rs.next()==true){
                    if(usuarioAcceso.equals(rs.getString("usuario"))&&passwordAcceso.equals(rs.getString("password"))){
                        error=false;
                        
                       
                      
                        

                        Grupos ventanaGrupo = new Grupos();
                        //JOptionPane.showMessageDialog(null, "Bienvenido a sistema Visitante\n"+usuarioAcceso);
                        ventanaGrupo.setVisible(true);
                        this.hide();

                    }//termina if
                }//termina while
                if(error ==true){//if si no encontro a usuario
                    JOptionPane.showMessageDialog(null, "Error al ingresar Alumno\nVerifica!!!");
                    txtUsuario.setText(usuarioAcceso);
                    txtPassword.setText(null);
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,"Error de DB verifica"+ e);
            }

        }
    }//GEN-LAST:event_btnLoginActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton optAdministrador;
    private javax.swing.JRadioButton optAlumno;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
