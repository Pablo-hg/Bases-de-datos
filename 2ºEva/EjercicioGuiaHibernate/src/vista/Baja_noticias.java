
package vista;

import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;
import modelo.Noticias;
import controlador.*;
import javax.swing.JOptionPane;

public class Baja_noticias extends javax.swing.JFrame {

    Operaciones oper = new Operaciones();
    DefaultTableModel m;
    DefaultListModel dlm=new DefaultListModel();
    
    public Baja_noticias() {
        initComponents();
        PrepararTabla();
        LLenarTabla();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnBajaActionPerformed = new javax.swing.JButton();
        btnVolverActionPerformed = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(242, 0, 0));
        jLabel1.setText("Borrar Noticia:");

        btnBajaActionPerformed.setText("Eliminar Noticia");
        btnBajaActionPerformed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBajaActionPerformedActionPerformed(evt);
            }
        });

        btnVolverActionPerformed.setText("Volver");
        btnVolverActionPerformed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformedActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(btnBajaActionPerformed)
                        .addGap(142, 142, 142)
                        .addComponent(btnVolverActionPerformed))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBajaActionPerformed)
                    .addComponent(btnVolverActionPerformed))
                .addGap(84, 84, 84))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBajaActionPerformedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBajaActionPerformedActionPerformed
        
        int filsel;
        int resp;
        try{
            filsel=jTable1.getSelectedRow();
            if (filsel==-1){
                JOptionPane.showMessageDialog(null, "Debes seleccionar Noticia a borrar.");
            } else {
                resp = JOptionPane.showConfirmDialog(null, "Desea eliminar la noticia seleccionada?","Eliminar",JOptionPane.YES_NO_OPTION);
                if (resp==JOptionPane.YES_OPTION){
                    int selectedRow=filsel;
                    String clave =(String)m.getValueAt(selectedRow,0);
                    oper.bajaNoticias(clave);
                    LLenarTabla();
                }
            }
        } catch (Exception e){
            JOptionPane.showMessageDialog(null,e+ "Error al eliminar la noticia.");
        }
    }//GEN-LAST:event_btnBajaActionPerformedActionPerformed

    private void btnVolverActionPerformedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformedActionPerformed
        
        Menú_principal abrir = new Menú_principal();
        abrir.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVolverActionPerformedActionPerformed

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
                new Baja_noticias().setVisible(true);

            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBajaActionPerformed;
    private javax.swing.JButton btnVolverActionPerformed;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    private void PrepararTabla() {
        String titulos[]=new String[3];
        m=new DefaultTableModel(null,titulos);
        jTable1.setModel(m);
    }

    private void LLenarTabla() {
        String titulos[]={"AUTOR","FECHA","TITULAR","TEXTO"};
        m=new DefaultTableModel(null,titulos);
        dlm=oper.mostrarNoticias();
        String fila[]= new String[4];
        for (int i=0;i<dlm.size();i++){
            Noticias aux= (Noticias) dlm.get(i);
            fila[0]="sgdfdf";
            fila[1]=aux.getFecha().toString();
            fila[2]=aux.getTitular();
            fila[3]=aux.getTexto();
            m.addRow(fila);
        }
        jTable1.setModel(m);
    }
}
