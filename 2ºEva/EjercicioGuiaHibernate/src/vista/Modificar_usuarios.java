
package vista;

import controlador.Operaciones;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Usuarios;

public class Modificar_usuarios extends javax.swing.JFrame {

    public Modificar_usuarios() {
        initComponents();
        PrepararTabla();
        LLenarTabla();
    }

    DefaultTableModel m;
    DefaultListModel dlm=new DefaultListModel();
    Operaciones oper=new Operaciones();
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        usuario = new javax.swing.JTextField();
        provincia = new javax.swing.JTextField();
        nombre = new javax.swing.JTextField();
        apellidos = new javax.swing.JTextField();
        calle = new javax.swing.JTextField();
        cp = new javax.swing.JTextField();
        numero = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        telefono = new javax.swing.JTextField();
        clave = new javax.swing.JPasswordField();
        jbActualizar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(241, 6, 210));
        jLabel1.setText("Elige un usuario a actualizar:");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel2.setText("Usuario");

        jLabel3.setText("Clave");

        jLabel4.setText("Nombre");

        jLabel5.setText("Apellidos");

        jLabel6.setText("Calle");

        jLabel7.setText("Número");

        jLabel8.setText("Provincia");

        jLabel9.setText("CP");

        jLabel10.setText("E-mail");

        jLabel11.setText("Teléfono");

        clave.setText("jPasswordField1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6))
                        .addGap(52, 52, 52)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(nombre, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                                .addComponent(usuario))
                            .addComponent(calle, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(provincia, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                            .addComponent(email))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(jLabel3)
                        .addGap(34, 34, 34)
                        .addComponent(clave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(138, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(18, 18, 18)
                                .addComponent(telefono))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cp)
                                    .addComponent(apellidos, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(numero, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(calle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(provincia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(386, 386, 386))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(cp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(numero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10)
                            .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jbActualizar.setText("Actualizar");
        jbActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbActualizarActionPerformed(evt);
            }
        });

        jButton2.setText("Volver");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(jbActualizar)
                        .addGap(214, 214, 214)
                        .addComponent(jButton2)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbActualizar)
                    .addComponent(jButton2))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Menú_principal abrir = new Menú_principal();
        abrir.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jbActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbActualizarActionPerformed
        
        chequearEntradas();
        int filsel;
        String dni;
        int resp;
        try {
            filsel=jTable1.getSelectedRow();
            if (filsel==-1){
                JOptionPane.showMessageDialog(null, "Debes seleccionar Usuario a Modificar.");
            }else{
                boolean b=chequearEntradas();
                if(b){
                    Usuarios us_act=new Usuarios(usuario.getText(), nombre.getText(),
                            apellidos.getText(), calle.getText(), Integer.parseInt(numero.getText()),
                            cp.getText(), telefono.getText(), email.getText(), provincia.getText(), telefono.getText());
                    oper.actualizarUsuarios(us_act);
                    LLenarTabla();
                    limpiar();
                }
            }
        } catch (Exception e){
            JOptionPane.showMessageDialog(null,e+ "Error al actualizar el usuario.");
        }
        
    }//GEN-LAST:event_jbActualizarActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        
        obtenerDeLaTabla();
    }//GEN-LAST:event_jTable1MouseClicked

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
                new  Modificar_usuarios().setVisible(true);

            }
        });
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apellidos;
    private javax.swing.JTextField calle;
    private javax.swing.JPasswordField clave;
    private javax.swing.JTextField cp;
    private javax.swing.JTextField email;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbActualizar;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField numero;
    private javax.swing.JTextField provincia;
    private javax.swing.JTextField telefono;
    private javax.swing.JTextField usuario;
    // End of variables declaration//GEN-END:variables

    private void PrepararTabla() {
        String titulos[]=new String[10];
        m=new DefaultTableModel(null,titulos);
        jTable1.setModel(m);
    }

    private void LLenarTabla() {
        String titulos[]={"Usuario","Clave","Nombre","Apellidos","Calle","Número","CP","Provincia","E_Mail","Teléfono"};
        m=new DefaultTableModel(null,titulos);
        dlm=oper.mostrarUsuarios();
        String fila[]= new String[10];
        for (int i=0;i<dlm.size();i++){
            Usuarios aux=(Usuarios)dlm.get(i);
            fila[0]=aux.getUsuario();
            fila[1]=aux.getClave();
            fila[2]=aux.getNombre();
            fila[3]=aux.getApellidos();
            fila[4]=aux.getCalle();
            fila[5]=Integer.toString(aux.getNumero());
            fila[6]=aux.getCp();
            fila[7]=aux.getProvincia();
            fila[8]=aux.getEmail();
            fila[9]=aux.getTelefono();
            m.addRow(fila);
        }
        jTable1.setModel(m);
    }
    
    /*
    Transaction tx=null;
        Session session=null;
        try {
            SessionFactory sesion = NewHibernateUtil.getSessionFactory();
            session = sesion.openSession();
            tx = session.beginTransaction();
            String key=usuario.getUsuario();
            //recuperamos el objeto a modificar
            Usuarios us=(Usuarios)session.load(Usuarios.class, key);
            //Actualizar datos
            //us.setUsuario(usuario.getUsuario());
            us.setNombre(usuario.getNombre());
            us.setApellidos(usuario.getApellidos());
            us.setCalle(usuario.getCalle());
            us.setNumero(usuario.getNumero());
            us.setCp(usuario.getCp());
            us.setTelefono(usuario.getTelefono());
            us.setEmail(usuario.getEmail());
            us.setProvincia(usuario.getProvincia());
            us.setClave(usuario.getClave());
            //us.setNoticiases(usuario.getNoticiases());
            //actualizamos objeto
            session.update(us);
            tx.commit();
            JOptionPane.showMessageDialog(null,"Actualizado correctamente.");
        } catch (HibernateException he) {
            tx.rollback();
            JOptionPane.showMessageDialog(null,he.getMessage()+"No ha sido posible actualizar usuario");
            //System.out.println("Mensaje de la baja "+he.getMessage());
        } finally {
            session.close();
        }
    */
    
   private void obtenerDeLaTabla(){
        int filsel;
        filsel=jTable1.getSelectedRow();
        usuario.setText((String)m.getValueAt(filsel, 0));
        clave.setText((String) m.getValueAt(filsel, 1));
        System.out.println("Valor tabla "+(String)m.getValueAt(filsel, 1));
        System.out.println("Valor tabla asignado campo clave "+clave.getText());
        nombre.setText((String)m.getValueAt(filsel, 2));
        apellidos.setText((String)m.getValueAt(filsel, 3));
        calle.setText((String)m.getValueAt(filsel, 4));
        numero.setText((String)m.getValueAt(filsel, 5));
        cp.setText((String)m.getValueAt(filsel, 6));
        provincia.setText((String)m.getValueAt(filsel, 7));
        email.setText((String)m.getValueAt(filsel, 8));
        telefono.setText((String)m.getValueAt(filsel, 9));    
   } 

    private void limpiar() {
        usuario.setText("");
        nombre.setText("");
        apellidos.setText("");
        calle.setText("");
        numero.setText("");
        cp.setText("");
        provincia.setText("");
        telefono.setText("");
        email.setText("");
        telefono.setText("");
    }

    boolean chequearEntradas() {
        boolean b=true;
        String mensaje="";
        if (usuario.getText().equals("")){
            mensaje+="Introduce código de usuario\n";
            b=false;
        }
        if (nombre.getText().equals("")){
            mensaje+="Introduce nombre de usuario\n";
            b=false;
        }
        if (apellidos.getText().equals("")){
            mensaje+="Introduce apellidos de usuario\n";
            b=false;
        }
        if (calle.getText().equals("")){
            mensaje+="Introduce calle\n";
            b=false;
        }
        int num;
        try{
            num=Integer.parseInt(numero.getText());
        }catch (Exception e ){
            mensaje+="Formato de número incorrecto\n";
            b=false;
        }
        if (cp.getText().equals("")){
            mensaje+="Introduce código postal\n";
            b=false;
        }
        if (provincia.getText().equals("")){
            mensaje+="Introduce provincia\n";
            b=false;
        }
        if (telefono.getText().equals("")){
            mensaje+="Introduce teléfono\n";
            b=false;
        }
        if (email.getText().equals("")){
            mensaje+="Introduce E-mail\n";
            b=false;
        }
        if (new String(clave.getPassword()).equals("")){
            mensaje+="Introduce clave\n";
            b=false;
        }
        if (!b){
            JOptionPane.showMessageDialog(null, mensaje);
        }
        return b;
    }
}
