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
/**
 *
 * @author danie
 */
public class CRUDAlumno extends javax.swing.JFrame {
    Alumno objAlumno = new Alumno();
    Grupo objGrupo = new Grupo();
    //clases de conexion y sus objetos
    public Connection cn;
    public Statement stmt;
    public ResultSet rs;

    
    
    public CRUDAlumno() {
        initComponents();
        mostrarListaAlumnos();
        mostrarListaGrupo();
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
    public void mostrarListaGrupo(){
        try {
            conectarBase();//Llamada a la conexión
            //Declaracion de un Objeto de almacenamiento logico de datos "Modelo de datos"
            DefaultTableModel modeloDatos = new DefaultTableModel();
            tblGrupo.setModel(modeloDatos);
            rs=stmt.executeQuery("select * from tgrupo");
            //imprimir y contar columnas
            ResultSetMetaData rsmd = rs.getMetaData();
            int cantidadColumnas=rsmd.getColumnCount();
            modeloDatos.addColumn("Id Grupo");
            modeloDatos.addColumn("Grupo");
            modeloDatos.addColumn("Instructor");
            modeloDatos.addColumn("Grado instructor");
            modeloDatos.addColumn("Horario");
            modeloDatos.addColumn("Días");
            modeloDatos.addColumn("Id Alumno");
            
            
            
            //Imprimir filas o registros
            while(rs.next()){//inicia while
                Object fila [] = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    fila[i]=rs.getObject(i+1);
                }
                modeloDatos.addRow(fila);
            }//termina while
        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "Error 2 de BD Consulta" + e);
        }    
    }
    public void mostrarListaAlumnos(){
    
     try {
            conectarBase();//Llamada a la conexión
            //Declaracion de un Objeto de almacenamiento logico de datos "Modelo de datos"
            DefaultTableModel modeloDatos = new DefaultTableModel();
            jtConsulta.setModel(modeloDatos);
            rs=stmt.executeQuery("select * from talumno");
            //imprimir y contar columnas
            ResultSetMetaData rsmd = rs.getMetaData();
            int cantidadColumnas=rsmd.getColumnCount();
            modeloDatos.addColumn("Id Alumno");
            modeloDatos.addColumn("Nombre");
            modeloDatos.addColumn("Apellido Paterno");
            modeloDatos.addColumn("Apellido Materno");
            modeloDatos.addColumn("Edad");
            modeloDatos.addColumn("Teléfono");
            modeloDatos.addColumn("CURP");
            modeloDatos.addColumn("Grado Cinta");
            modeloDatos.addColumn("Dirección");
            modeloDatos.addColumn("Alta");
            
            
            
            //Imprimir filas o registros
            while(rs.next()){//inicia while
                Object fila [] = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    fila[i]=rs.getObject(i+1);
                }
                modeloDatos.addRow(fila);
            }//termina while
        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "Error 2 de BD Consulta" + e);
        }    
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        txtId = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApellidoPaterno = new javax.swing.JTextField();
        txtApellidoMaterno = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtCurp = new javax.swing.JTextField();
        txtGradoCinta = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtAlta = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        txtId_E = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtNombre_E = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtApellidoPaterno_E = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txtApellidoMaterno_E = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtEdad_E = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txtTelefono_E = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        txtCurp_E = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        txtGradoCinta_E = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        txtDireccion_E = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        txtAlta_E = new javax.swing.JTextField();
        btnEditar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        txtIdalumno_El = new javax.swing.JTextField();
        btnEliminar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        txtIdAlumno = new javax.swing.JTextField();
        txtInstructor = new javax.swing.JTextField();
        txtGradoInstructor = new javax.swing.JTextField();
        txtHorario = new javax.swing.JTextField();
        txtDias = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        btnRegistrarGrupo = new javax.swing.JButton();
        txtGrupo = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblGrupo = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtConsulta = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 0, 51));

        jPanel1.setBackground(new java.awt.Color(204, 0, 51));

        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        jLabel1.setText("Id:");

        jLabel2.setText("Nombre:");

        jLabel3.setText("Apellido Paterno:");

        jLabel4.setText("Apellido Materno:");

        jLabel5.setText("Edad:");

        jLabel6.setText("Teléfono:");

        jLabel7.setText("CURP:");

        jLabel8.setText("Grado Cinta:");

        jLabel9.setText("Dirección:");

        jLabel10.setText("Alta:");

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombre)
                            .addComponent(txtApellidoPaterno)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtApellidoMaterno, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(txtEdad))))
                .addGap(299, 299, 299)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addGap(61, 61, 61))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(117, 117, 117)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtAlta, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                    .addComponent(txtCurp)
                    .addComponent(txtGradoCinta, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtDireccion)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(77, 77, 77))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(501, 501, 501)
                .addComponent(btnRegistrar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCurp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtApellidoPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGradoCinta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtApellidoMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel9)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAlta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRegistrar)
                .addGap(43, 43, 43))
        );

        jTabbedPane1.addTab("Registrar Usuario", jPanel1);

        jPanel3.setBackground(new java.awt.Color(204, 0, 51));

        jLabel17.setText("Id:");

        txtId_E.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtId_EActionPerformed(evt);
            }
        });

        jLabel18.setText("Nombre:");

        txtNombre_E.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombre_EActionPerformed(evt);
            }
        });

        jLabel19.setText("Apellido Paterno:");

        jLabel20.setText("Apellido Materno:");

        jLabel21.setText("Edad:");

        jLabel22.setText("Teléfono:");

        jLabel23.setText("CURP:");

        jLabel24.setText("Grado Cinta:");

        jLabel25.setText("Dirección:");

        jLabel26.setText("Alta:");

        btnEditar.setText("Editar Alumno");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(475, 475, 475)
                .addComponent(btnEditar)
                .addContainerGap(509, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(112, 112, 112)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel18)
                                .addComponent(jLabel17)
                                .addComponent(jLabel19))
                            .addGap(9, 9, 9)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtNombre_E)
                                .addComponent(txtApellidoPaterno_E)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(txtId_E, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, Short.MAX_VALUE))))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel20)
                                .addComponent(jLabel21))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtApellidoMaterno_E, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                .addComponent(txtEdad_E))))
                    .addGap(299, 299, 299)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel22)
                                .addComponent(jLabel23)
                                .addComponent(jLabel24)
                                .addComponent(jLabel25))
                            .addGap(61, 61, 61))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel26)
                            .addGap(117, 117, 117)))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtAlta_E, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                        .addComponent(txtCurp_E)
                        .addComponent(txtGradoCinta_E, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txtDireccion_E)
                        .addComponent(txtTelefono_E, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addGap(112, 112, 112)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(279, Short.MAX_VALUE)
                .addComponent(btnEditar)
                .addContainerGap())
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(66, 66, 66)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtId_E, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtTelefono_E, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel17)
                        .addComponent(jLabel22))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtNombre_E, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtCurp_E, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel18)
                        .addComponent(jLabel23))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtApellidoPaterno_E, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtGradoCinta_E, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel19)
                        .addComponent(jLabel24))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtApellidoMaterno_E, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel20)
                        .addComponent(jLabel25)
                        .addComponent(txtDireccion_E, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtEdad_E, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtAlta_E, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel21)
                        .addComponent(jLabel26))
                    .addContainerGap(58, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Editar Alumno", jPanel3);

        jPanel4.setBackground(new java.awt.Color(204, 0, 51));

        jLabel27.setText("Captura Id del Alumno:");

        btnEliminar.setText("Eliminar Alumno");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jLabel27)
                        .addGap(100, 100, 100)
                        .addComponent(txtIdalumno_El, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(261, 261, 261)
                        .addComponent(btnEliminar)))
                .addContainerGap(562, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtIdalumno_El, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27))
                .addGap(61, 61, 61)
                .addComponent(btnEliminar)
                .addContainerGap(126, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Eliminar Alumno", jPanel4);

        jPanel2.setBackground(new java.awt.Color(204, 0, 51));

        txtDias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiasActionPerformed(evt);
            }
        });

        jLabel11.setText("Id Alumno");

        jLabel12.setText("Instructor");

        jLabel13.setText("Grado Instructor");

        jLabel14.setText("Horario:");

        jLabel15.setText("Días:");

        btnRegistrarGrupo.setText("Registrar Grupo");
        btnRegistrarGrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarGrupoActionPerformed(evt);
            }
        });

        txtGrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGrupoActionPerformed(evt);
            }
        });

        jLabel16.setText("Grupo:");

        tblGrupo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id Grupo", "Grupo", "Instructor", "Grado Instructor", "Horario", "Días", "Id Alumno"
            }
        ));
        jScrollPane2.setViewportView(tblGrupo);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(251, 251, 251)
                .addComponent(btnRegistrarGrupo)
                .addContainerGap(723, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16))
                .addGap(105, 105, 105)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtGrupo, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                    .addComponent(txtIdAlumno)
                    .addComponent(txtInstructor)
                    .addComponent(txtGradoInstructor)
                    .addComponent(txtHorario)
                    .addComponent(txtDias))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtIdAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtInstructor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtGradoInstructor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(btnRegistrarGrupo)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Registro Grupo", jPanel2);

        jtConsulta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id Alumno", "Nombre", "Apellido Paterno", "Apellido Materno", "Edad", "Teléfono", "CURP", "Grado Cinta", "Dirección", "Alta"
            }
        ));
        jScrollPane1.setViewportView(jtConsulta);
        if (jtConsulta.getColumnModel().getColumnCount() > 0) {
            jtConsulta.getColumnModel().getColumn(5).setHeaderValue("Teléfono");
            jtConsulta.getColumnModel().getColumn(6).setHeaderValue("CURP");
            jtConsulta.getColumnModel().getColumn(7).setHeaderValue("Grado Cinta");
            jtConsulta.getColumnModel().getColumn(8).setHeaderValue("Dirección");
            jtConsulta.getColumnModel().getColumn(9).setHeaderValue("Alta");
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(108, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int confirmaBaja;

        try {
            conectarBase();
            int alumnoBaja=Integer.parseInt(txtIdalumno_El.getText());

            confirmaBaja=stmt.executeUpdate("DELETE FROM talumno WHERE id ='"+alumnoBaja+"' " );

            if (confirmaBaja==1) {
                JOptionPane.showMessageDialog(null, "Se dio de baja el Alumno de la base de datos " +alumnoBaja+"\nVerifica Consulta");
                mostrarListaAlumnos();
            } else {
                JOptionPane.showMessageDialog(null, "Error! No existe el Id del Alumno en la base de datos "+alumnoBaja+"\nVerifica Consulta");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al procesar baja de la Bases de datos\n\n"+ex);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
        // llama a el metodo conectar
        conectarBase();

        //Almacenar los valores del formulario objeto
        objAlumno.setId(Integer.parseInt(txtId_E.getText()));
        objAlumno.setNombre(txtNombre_E.getText());
        objAlumno.setApePaterno(txtApellidoPaterno_E.getText());
        objAlumno.setApeMaterno(txtApellidoMaterno_E.getText());
        objAlumno.setEdad(Integer.parseInt(txtEdad_E.getText()));
        objAlumno.setTelefono(Integer.parseInt(txtTelefono_E.getText()));
        objAlumno.setCurp(txtCurp_E.getText());
        objAlumno.setGradoCinta(txtGradoCinta_E.getText());
        objAlumno.setDireccion(txtDireccion_E.getText());
        objAlumno.setAlta(txtAlta_E.getText());

        String actualizaCliente="UPDATE talumno SET nombre='"
        +objAlumno.getNombre()
        +"', apellido_paterno='"+objAlumno.getApePaterno()
        +"', apellido_materno='"+objAlumno.getApeMaterno()
        +"', edad='"+objAlumno.getEdad()
        +"', telefono='"+objAlumno.getTelefono()
        +"', curp='"+objAlumno.getCurp()
        +"', grado_cinta='"+objAlumno.getGradoCinta()
        +"', direccion='"+objAlumno.getDireccion()
        +"', alta='"+objAlumno.getAlta()
        +"' WHERE id = '"+objAlumno.getId()+"'";

        //estructura de control de tratamiento de errores en ejecucion
        try{
            stmt.executeUpdate(actualizaCliente);
            JOptionPane.showMessageDialog(null, "Alumno actualizado de forma exitosa "+objAlumno.getId());
            mostrarListaAlumnos();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error al actualizar a el Alumno de la BD\n\nVerifica\n\n"+ e);
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void txtNombre_EActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombre_EActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombre_EActionPerformed

    private void txtId_EActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtId_EActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtId_EActionPerformed

    private void txtGrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGrupoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGrupoActionPerformed

    private void btnRegistrarGrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarGrupoActionPerformed
        conectarBase();

        //Almacenar los valores del formulario objeto

        objGrupo.setGrupo(txtGrupo.getText());
        objGrupo.setInstructor(txtInstructor.getText());
        objGrupo.setGradoInstructor(txtGradoInstructor.getText());
        objGrupo.setHorario(txtHorario.getText());
        objGrupo.setDias(txtDias.getText());
        objGrupo.setIdAlumno(Integer.parseInt(txtIdAlumno.getText()));

        //variable objeto para registrar alumno
        String altaCliente="INSERT INTO tgrupo(`grupo`,`instructor`,`grado_instructor`,`horario`,`dias`,`id_alumno`)"
        +"VALUES('"+objGrupo.getGrupo()+"','"
        +objGrupo.getInstructor()+"','"
        +objGrupo.getGradoInstructor()+"','"
        +objGrupo.getHorario()+"','"
        +objGrupo.getDias()+"','"
        +objGrupo.getIdAlumno()+"')";
        //estructura de control de tratamiento de errores en ejecucion
        try{
            stmt.executeUpdate(altaCliente);
            JOptionPane.showMessageDialog(null, "Se registro el Grupo de forma exitosa "+objGrupo.getGrupo());
            mostrarListaGrupo();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error 1 de BD al generar alta Grupo\n\nVerifica\n\n"+ e);
        }
    }//GEN-LAST:event_btnRegistrarGrupoActionPerformed

    private void txtDiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiasActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        // TODO add your handling code here:
        // llama a el metodo conectar
        conectarBase();

        //Almacenar los valores del formulario objeto
        objAlumno.setId(Integer.parseInt(txtId.getText()));
        objAlumno.setNombre(txtNombre.getText());
        objAlumno.setApePaterno(txtApellidoPaterno.getText());
        objAlumno.setApeMaterno(txtApellidoMaterno.getText());
        objAlumno.setEdad(Integer.parseInt(txtEdad.getText()));
        objAlumno.setTelefono(Integer.parseInt(txtTelefono.getText()));
        objAlumno.setCurp(txtCurp.getText());
        objAlumno.setGradoCinta(txtGradoCinta.getText());
        objAlumno.setDireccion(txtDireccion.getText());
        objAlumno.setAlta(txtAlta.getText());

        //variable objeto para registrar alumno
        String altaCliente="INSERT INTO talumno(`id`,`nombre`,`apellido_paterno`,`apellido_materno`,`edad`,`telefono`,`curp`,`grado_cinta`,`direccion`,`alta`)"
        +"VALUES('"+objAlumno.getId()+"','"
        +objAlumno.getNombre()+"','"
        +objAlumno.getApePaterno()+"','"
        +objAlumno.getApeMaterno()+"','"
        +objAlumno.getEdad()+"','"
        +objAlumno.getTelefono()+"','"
        +objAlumno.getCurp()+"','"
        +objAlumno.getGradoCinta()+"','"
        +objAlumno.getDireccion()+"','"
        +objAlumno.getAlta()+"')";
        //estructura de control de tratamiento de errores en ejecucion
        try{
            stmt.executeUpdate(altaCliente);
            JOptionPane.showMessageDialog(null, "Se registro el Alumno de forma exitosa "+objAlumno.getNombre());
            mostrarListaAlumnos();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error 1 de BD al generar alta Alumno\n\nVerifica\n\n"+ e);
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

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
            java.util.logging.Logger.getLogger(CRUDAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CRUDAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CRUDAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CRUDAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CRUDAlumno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnRegistrarGrupo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jtConsulta;
    private javax.swing.JTable tblGrupo;
    private javax.swing.JTextField txtAlta;
    private javax.swing.JTextField txtAlta_E;
    private javax.swing.JTextField txtApellidoMaterno;
    private javax.swing.JTextField txtApellidoMaterno_E;
    private javax.swing.JTextField txtApellidoPaterno;
    private javax.swing.JTextField txtApellidoPaterno_E;
    private javax.swing.JTextField txtCurp;
    private javax.swing.JTextField txtCurp_E;
    private javax.swing.JTextField txtDias;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtDireccion_E;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtEdad_E;
    private javax.swing.JTextField txtGradoCinta;
    private javax.swing.JTextField txtGradoCinta_E;
    private javax.swing.JTextField txtGradoInstructor;
    private javax.swing.JTextField txtGrupo;
    private javax.swing.JTextField txtHorario;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtIdAlumno;
    private javax.swing.JTextField txtId_E;
    private javax.swing.JTextField txtIdalumno_El;
    private javax.swing.JTextField txtInstructor;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombre_E;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtTelefono_E;
    // End of variables declaration//GEN-END:variables
}
