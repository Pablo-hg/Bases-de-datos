
package vista;

import controlador.NewHibernateUtil;
import controlador.Operaciones;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Noticias;
import modelo.Usuarios;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Modificar_noticias extends javax.swing.JFrame {

    
    Operaciones oper = new Operaciones();
    DefaultTableModel m;
    DefaultListModel dlm=new DefaultListModel();
    
    public Modificar_noticias() {
        initComponents();
        PrepararTabla();
        LLenarTabla();
        IniciarFecha();
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
        btActualizar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jtUsuario = new javax.swing.JTextField();
        jtFallos = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Usuario:");

        jLabel2.setText("Titular:");

        jLabel3.setText("Texto:");

        jLabel4.setText("Fecha:");

        btActualizar.setText("Actualziar Noticia");
        btActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btActualizarActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanelAltaLayout = new javax.swing.GroupLayout(jPanelAlta);
        jPanelAlta.setLayout(jPanelAltaLayout);
        jPanelAltaLayout.setHorizontalGroup(
            jPanelAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAltaLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanelAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanelAltaLayout.createSequentialGroup()
                        .addGroup(jPanelAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGroup(jPanelAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelAltaLayout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(jPanelAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelAltaLayout.createSequentialGroup()
                                        .addComponent(jXDatePicker1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(57, 57, 57)
                                        .addComponent(btActualizar))
                                    .addGroup(jPanelAltaLayout.createSequentialGroup()
                                        .addGap(424, 424, 424)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanelAltaLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanelAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jtfTitular, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                                    .addComponent(jtUsuario)))))
                    .addComponent(jtFallos, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelAltaLayout.setVerticalGroup(
            jPanelAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAltaLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanelAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtfTitular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanelAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jXDatePicker1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(btActualizar))
                .addGap(18, 18, 18)
                .addComponent(jtFallos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jtFallos.setVisible(false);

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 154, 0));
        jLabel6.setText("Selecciona Noticia");

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

        btVolver.setText("Volver");
        btVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jPanelAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(btVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanelAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(253, 253, 253))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btActualizarActionPerformed

        int filsel;
        int resp;
        try{
            filsel=jTable1.getSelectedRow();
            if (filsel==1){
                JOptionPane.showMessageDialog(null, "Debes seleccionar Noticia a modificar.");
            } else {
                //ChequearEntradas();
                Date fecha = jXDatePicker1.getDate();
                Usuarios usuario = null;
                String tit_copia = jtfTitular.getText();
                String texto = jTextArea1.getText();
                Noticias noti_act = new Noticias(usuario,tit_copia,texto,fecha);
                oper.actualizarNoticia(noti_act, tit_copia);
                Limpiar();
            }
        } catch (Exception e){
            JOptionPane.showMessageDialog(null,e+ "Error al eliminar la noticia.");
        }
    }//GEN-LAST:event_btActualizarActionPerformed

    private void btVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVolverActionPerformed
        
        Menú_principal abrir = new Menú_principal();
        abrir.setVisible(true);
        dispose();
    }//GEN-LAST:event_btVolverActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        
       ObtenerDeLaTabla();
    }//GEN-LAST:event_jTable1MouseClicked

    
    private void PrepararTabla() {
        String titulos[]=new String[3];
        m = new DefaultTableModel(null,titulos);
        jTable1.setModel(m);
    }

    private void LLenarTabla() {
        String titulos [] = {"USUARIO","TITULAR","FECHA"};
        m=new DefaultTableModel(null,titulos);
        dlm = oper.mostrarNoticias();
        String fila[]= new String[4];
        for(int i = 0; i < dlm.size();i++){
            Noticias noti = (Noticias) dlm.get(i);
            fila[0] = noti.getUsuarios().getUsuario().toString();
            fila[2] = noti.getFecha().toString();
            fila[1] = noti.getTitular();
            m.addRow(fila);
        }
        jTable1.setModel(m);
    }
    
    private void ObtenerDeLaTabla() {
        int filse;
        filse = jTable1.getSelectedRow();
        jtUsuario.setText((String) m.getValueAt(filse, 0));
        jtfTitular.setText((String) m.getValueAt(filse,1));
        oper.buscaNoticia(jtfTitular.getText());
        jXDatePicker1.setDate((Date) m.getValueAt(filse,2));
    }
    
    private void ChequearEntradas() {
        
        jtFallos.setVisible(false);
        Session session = null;
        List<Usuarios> usuarios = null;
        SessionFactory sf = NewHibernateUtil.getSessionFactory();
        session = sf.openSession();
        Query q = (Query) session.createQuery("SELECT u.usuario FROM Usuarios u ");
        usuarios = q.list();
        jtFallos.setText("");
        if (!usuarios.contains(jtUsuario)){
            jtFallos.setText("El Usuario no existe.  ");
        }
        else if (jtfTitular.getText().equals("")){
            jtFallos.setText(jtFallos.getText() + "El campo Titular no puede estar vacio");
        }
        else if (jTextArea1.getText().equals("")){
            jtFallos.setText(jtFallos.getText() + "El campo texto no puede estar vacio");
        }
    }
    
    private void Limpiar() {
        jtUsuario.setText("");
        jtfTitular.setText("");
        jTextArea1.setText("");
        IniciarFecha();
    }
    
    private void IniciarFecha(){
        jXDatePicker1.setFormats("dd/MM/yyyyy");
        jXDatePicker1.setDate(Calendar.getInstance().getTime());
    }
    
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
                new  Modificar_noticias().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btActualizar;
    private javax.swing.JButton btVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanelAlta;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    public static javax.swing.JTextArea jTextArea1;
    private org.jdesktop.swingx.JXDatePicker jXDatePicker1;
    private javax.swing.JTextField jtFallos;
    private javax.swing.JTextField jtUsuario;
    private javax.swing.JTextField jtfTitular;
    // End of variables declaration//GEN-END:variables

}
