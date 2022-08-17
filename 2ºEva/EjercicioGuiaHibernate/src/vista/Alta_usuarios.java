/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;
import modelo.Usuarios;
import controlador.*;
import java.util.List;
import javax.swing.JOptionPane;

public class Alta_usuarios extends javax.swing.JFrame {

    //Inportamos el controlador y creamos un atributo de operaciones
    Operaciones oper = new Operaciones();
    
    public Alta_usuarios() {
        
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
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
        tf_usuario = new javax.swing.JTextField();
        tf_nombre = new javax.swing.JTextField();
        tf_calle = new javax.swing.JTextField();
        tf_apellidos = new javax.swing.JTextField();
        tf_numero = new javax.swing.JTextField();
        tf_cp = new javax.swing.JTextField();
        tf_provincia = new javax.swing.JTextField();
        tf_email = new javax.swing.JTextField();
        tf_telefono = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        tf_clave = new javax.swing.JTextField();
        btnVer = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btonBorrar = new javax.swing.JButton();
        btonVerTodos = new javax.swing.JButton();
        btonVerUsuarioCorreo = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Usuario");

        jLabel2.setText("Nombre");

        jLabel3.setText("Apellidos");

        jLabel4.setText("Calle");

        jLabel5.setText("Numero");

        jLabel6.setText("CP");

        jLabel7.setText("Provincia");

        jLabel8.setText("Telefono");

        jLabel9.setText("Email");

        jLabel10.setText("Clave");

        btnGuardar.setText("Añadir");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnVer.setText("Ver");
        btnVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btonBorrar.setText("Borrar");
        btonBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btonBorrarActionPerformed(evt);
            }
        });

        btonVerTodos.setText("VerTodosusuarios");
        btonVerTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btonVerTodosActionPerformed(evt);
            }
        });

        btonVerUsuarioCorreo.setText("VerUsuariosyCorreos");
        btonVerUsuarioCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btonVerUsuarioCorreoActionPerformed(evt);
            }
        });

        jButton1.setText("Volver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel10)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(jLabel9))
                .addGap(93, 93, 93)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tf_calle, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52)
                                .addComponent(jButton1))
                            .addComponent(tf_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(96, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_clave, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_email, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_numero, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_cp, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_provincia, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(btnVer))
                            .addComponent(btnGuardar)
                            .addComponent(btnModificar)
                            .addComponent(btonBorrar)
                            .addComponent(btonVerTodos)
                            .addComponent(btonVerUsuarioCorreo))
                        .addGap(17, 17, 17))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tf_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tf_apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tf_calle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(tf_numero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(tf_cp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(tf_provincia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(tf_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(tf_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(tf_clave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                        .addComponent(btonVerUsuarioCorreo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btonVerTodos)
                        .addGap(27, 27, 27)
                        .addComponent(btonBorrar)
                        .addGap(18, 18, 18)
                        .addComponent(btnModificar)
                        .addGap(26, 26, 26)
                        .addComponent(btnGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnVer)
                        .addGap(40, 40, 40))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        //Creamos un nuevo usuario cogiendo todos los textos 
        Usuarios nuevo = new Usuarios(tf_usuario.getText(), tf_nombre.getText(), tf_apellidos.getText() ,
            tf_calle.getText(), Integer.parseInt(tf_numero.getText()), tf_cp.getText(), tf_provincia.getText(), tf_telefono.getText(), 
            tf_email.getText(), tf_clave.getText());
        //Al método AltaUsuario del controlasdor le pasamos el usuarioq ue queremos añdir
        oper.altaUsuario(nuevo);
        
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerActionPerformed
        
        //Ejeuctamos el método Obtenerusuario, pasandole el texto(usuario) 
        //que hay dentro de tf_usuario
        Usuarios u = oper.Obtenerusuario(this.tf_usuario.getText());
        //Abrimos una ventanita con el .strng de dicho usuario
        JOptionPane.showConfirmDialog(this, u.toString());
    }//GEN-LAST:event_btnVerActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
       
        oper.cambiarUsuario(this.tf_usuario.getText());
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btonBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btonBorrarActionPerformed
        
         oper.eliminarUsuario(this.tf_usuario.getText());
         JOptionPane.showConfirmDialog(this,"El usuario" + this.tf_usuario.getText() + " ha sido eliminado");
    }//GEN-LAST:event_btonBorrarActionPerformed

    private void btonVerTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btonVerTodosActionPerformed
        
        //Creamos una Lista de usuarios pasandole el método que obtiene todos
        List<Object[]> usuarios = oper.VerUsuarios();
        //Creamos un string para guardar los textos
        String salida = new String();
        //Hacemos un bucle que recorre la lista y los meta en el string
        for(int i = 0; i < usuarios.size();i++){
            salida += usuarios.get(i) + "\n";
        }
        //mostramos el string en una ventanita
        JOptionPane.showMessageDialog(this, salida);
    }//GEN-LAST:event_btonVerTodosActionPerformed

    private void btonVerUsuarioCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btonVerUsuarioCorreoActionPerformed
        
        //Creamos una lista de objetos pasandole el método que obtiene el usuario y el correo
        List<Object[]> usuarios = oper.VerUsuariosCorreo();
        String salida = new String();
        //Hacemos un bucle que recorra la lista y los meta en el string
        for(int i = 0; i < usuarios.size();i++){
            //En la columna 0 está el nombre y la 2 el correo
            salida += "Nombre: " + usuarios.get(i)[0]  +
                    " Email: " + usuarios.get(i)[1] + "\n";
        }
        JOptionPane.showMessageDialog(this, salida); 
    }//GEN-LAST:event_btonVerUsuarioCorreoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Menú_principal abrir = new Menú_principal();
        abrir.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

   public static void main(String args[]) {
        /* Set the Nimbus look and feel /
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        / If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         /
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Listado_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NuevoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NuevoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NuevoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        / Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new  Alta_usuarios().setVisible(true);

            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnVer;
    private javax.swing.JButton btonBorrar;
    private javax.swing.JButton btonVerTodos;
    private javax.swing.JButton btonVerUsuarioCorreo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField tf_apellidos;
    private javax.swing.JTextField tf_calle;
    private javax.swing.JTextField tf_clave;
    private javax.swing.JTextField tf_cp;
    private javax.swing.JTextField tf_email;
    private javax.swing.JTextField tf_nombre;
    private javax.swing.JTextField tf_numero;
    private javax.swing.JTextField tf_provincia;
    private javax.swing.JTextField tf_telefono;
    private javax.swing.JTextField tf_usuario;
    // End of variables declaration//GEN-END:variables
}
