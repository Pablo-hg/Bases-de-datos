
package vista;

import controlador.Operaciones;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Usuarios;

public class Baja_usuarios extends javax.swing.JFrame {

  
    DefaultTableModel m;
    DefaultListModel dlm=new DefaultListModel();
    Operaciones oper=new Operaciones();
    
    public Baja_usuarios() {
        initComponents();
        PrepararTabla();
        LLenarTabla();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("Baja de Usuarios:");

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
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("Dar baja");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(93, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 721, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(262, 262, 262)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(196, 196, 196)
                        .addComponent(jButton1)
                        .addGap(179, 179, 179)
                        .addComponent(jButton2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(92, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       
        Menú_principal abrir = new Menú_principal();
        abrir.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int filsel;
        int resp;
        try {
            filsel=jTable1.getSelectedRow();
            if (filsel==-1){
                JOptionPane.showMessageDialog(null, "Debes seleccionar Usuario a borrar.");
            }else{
                resp=JOptionPane.showConfirmDialog(null, "Desea eliminar el usuario seleccionado?","Eliminar",JOptionPane.YES_NO_OPTION);
                if(resp==JOptionPane.YES_OPTION){
                    int selectedRow=filsel;
                    String clave =(String)m.getValueAt(selectedRow,0);
                    oper.bajaUsuarios(clave);
                    LLenarTabla();
                }
            }
        } catch (Exception e){
            JOptionPane.showMessageDialog(null,e+ "Error al eliminar el usuario.");
        }
        
        
        /*
        public void bajaUsuarios(String clave){
        Transaction tx=null;
        Session session=null;
        try {
            SessionFactory sesion = NewHibernateUtil.getSessionFactory();
            session = sesion.openSession();
            tx = session.beginTransaction();
            Usuarios usu =(Usuarios)session.load(Usuarios.class, clave);
            session.delete(usu);
            tx.commit();
            JOptionPane.showMessageDialog(null,"Eliminado correctamente.");
        } catch (HibernateException he) {
            tx.rollback();
            JOptionPane.showMessageDialog(null,he.getMessage()+"No ha sido posible eliminar el usuario");
            System.out.println("Mensaje de la baja "+he.getMessage());
        } finally {
            session.close();
        }  
    }
        */
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
                new  Baja_usuarios().setVisible(true);

            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    private void PrepararTabla() {
        String titulos[]=new String[5];
        m=new DefaultTableModel(null,titulos);
        jTable1.setModel(m);   
    }

    private void LLenarTabla() {
        String titulos[]={"Usuario","Nombre","Dirección","Teléfono","E-Mail"};
        m=new DefaultTableModel(null,titulos);
        dlm=oper.mostrarUsuarios();
        String fila[]= new String[5];
        for (int i=0;i<dlm.size();i++){
            Usuarios aux=(Usuarios)dlm.get(i);
            fila[0]=aux.getUsuario();
            fila[1]=aux.getNombre()+" "+aux.getApellidos();
            fila[2]=aux.getCalle()+" "+aux.getNumero()+" CP: "+aux.getCp()+" "+aux.getProvincia();
            fila[3]=aux.getTelefono();
            fila[4]=aux.getEmail();
            m.addRow(fila);
        }
        jTable1.setModel(m);
    }
}
