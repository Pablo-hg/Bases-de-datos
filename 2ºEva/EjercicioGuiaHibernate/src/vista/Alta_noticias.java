
package vista;

import controlador.NewHibernateUtil;
import java.awt.Component;
import java.awt.PopupMenu;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.swing.JComboBox;
import modelo.Usuarios;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import controlador.*;
import javax.swing.DefaultComboBoxModel;
import modelo.Noticias;
import modelo.Usuarios;

public class Alta_noticias extends javax.swing.JFrame {
        
    Operaciones oper = new Operaciones();

    public Alta_noticias() {
        initComponents();
        llenarLista();
        iniciarfecha();
    }
    
    public void llenarLista(){
        
        jComboBox1.removeAllItems();
        Session session = null;
        List<Usuarios> usuarios = null;
        SessionFactory sf = NewHibernateUtil.getSessionFactory();
        session = sf.openSession();
        Query q = (Query) session.createQuery("SELECT u.usuario FROM Usuarios u ");
        usuarios = q.list();
        String [] usus = usuarios.toArray(new String[usuarios.size()]);
        jComboBox1.setModel(new DefaultComboBoxModel<>(usus));
        session.close();  
    }
    
    private void iniciarfecha(){
    
        jXDatePicker1.setFormats("dd/MM/yyyyy");
        jXDatePicker1.setDate(Calendar.getInstance().getTime());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelAlta = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtfTitular = new javax.swing.JTextField();
        jXDatePicker1 = new org.jdesktop.swingx.JXDatePicker();
        jButton1 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        btVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Usuario:");

        jLabel2.setText("Titular:");

        jLabel3.setText("Texto:");

        jLabel4.setText("Fecha:");

        jButton1.setText("Nueva Noticia");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        btVolver.setText("Volver");
        btVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelAltaLayout = new javax.swing.GroupLayout(jPanelAlta);
        jPanelAlta.setLayout(jPanelAltaLayout);
        jPanelAltaLayout.setHorizontalGroup(
            jPanelAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAltaLayout.createSequentialGroup()
                .addGroup(jPanelAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelAltaLayout.createSequentialGroup()
                            .addGap(148, 148, 148)
                            .addGroup(jPanelAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAltaLayout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addGap(182, 182, 182))
                                .addGroup(jPanelAltaLayout.createSequentialGroup()
                                    .addGroup(jPanelAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                            .addGroup(jPanelAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jtfTitular, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanelAltaLayout.createSequentialGroup()
                            .addGap(172, 172, 172)
                            .addGroup(jPanelAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanelAltaLayout.createSequentialGroup()
                                    .addComponent(jButton1)
                                    .addGap(88, 88, 88)
                                    .addComponent(btVolver))
                                .addGroup(jPanelAltaLayout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(41, 41, 41)
                                    .addComponent(jXDatePicker1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(146, 180, Short.MAX_VALUE))
        );
        jPanelAltaLayout.setVerticalGroup(
            jPanelAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAltaLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(jPanelAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanelAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtfTitular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanelAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jXDatePicker1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(btVolver))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelAlta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jPanelAlta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        
        String titular = jtfTitular.getText();
        String texto = jTextArea1.getText();
        Date fecha = jXDatePicker1.getDate();
        SessionFactory sf = NewHibernateUtil.getSessionFactory();
        Session session = null;
        Usuarios usuario = null;
        session = sf.openSession();
        if (titular != "" || texto != "" || !usuario.equals("") || !fecha.equals("")){
            Noticias nuevo = new Noticias(usuario,titular,texto,fecha);
            oper.altaNoticias(nuevo);
            dispose();
            this.setVisible(false);
            new Menú_principal().setVisible(true);
        }else{
            jLabel5.setText("Ningún dato puede estar vacio");
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVolverActionPerformed
        Menú_principal abrir = new Menú_principal();
        abrir.setVisible(true);
        dispose();
    }//GEN-LAST:event_btVolverActionPerformed

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
                new  Alta_noticias().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btVolver;
    private javax.swing.JButton jButton1;
    public static javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanelAlta;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private org.jdesktop.swingx.JXDatePicker jXDatePicker1;
    private javax.swing.JTextField jtfTitular;
    // End of variables declaration//GEN-END:variables

    
}
