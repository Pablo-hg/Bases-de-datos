
package vista;


import controlador.Operaciones;
import java.util.Date;

public class Menú_principal extends javax.swing.JFrame {

    Operaciones oper = new Operaciones();
    Baja_noticias baja = new Baja_noticias();
    
    
    public Menú_principal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jFrame1 = new javax.swing.JFrame();
        jMenuItem1 = new javax.swing.JMenuItem();
        jFrame2 = new javax.swing.JFrame();
        jMenuItem2 = new javax.swing.JMenuItem();
        jFrame3 = new javax.swing.JFrame();
        jFrame4 = new javax.swing.JFrame();
        jPanel1 = new javax.swing.JPanel();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jButton1 = new javax.swing.JButton();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenuAlta = new javax.swing.JMenu();
        jMenuBaja = new javax.swing.JMenu();
        jMenuModi = new javax.swing.JMenu();
        jMenuListar = new javax.swing.JMenu();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jMenuItem1.setText("jMenuItem1");

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jMenuItem2.setText("jMenuItem2");

        javax.swing.GroupLayout jFrame3Layout = new javax.swing.GroupLayout(jFrame3.getContentPane());
        jFrame3.getContentPane().setLayout(jFrame3Layout);
        jFrame3Layout.setHorizontalGroup(
            jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame3Layout.setVerticalGroup(
            jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame4Layout = new javax.swing.GroupLayout(jFrame4.getContentPane());
        jFrame4.getContentPane().setLayout(jFrame4Layout);
        jFrame4Layout.setHorizontalGroup(
            jFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame4Layout.setVerticalGroup(
            jFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

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

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 164, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 149, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Volver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jMenuAlta.setText("Alta");
        jMenuAlta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuAltaMouseClicked(evt);
            }
        });
        jMenuBar2.add(jMenuAlta);

        jMenuBaja.setText("Baja");
        jMenuBaja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuBajaMouseClicked(evt);
            }
        });
        jMenuBar2.add(jMenuBaja);

        jMenuModi.setText("Modificar");
        jMenuModi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuModiMouseClicked(evt);
            }
        });
        jMenuModi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuModiActionPerformed(evt);
            }
        });
        jMenuBar2.add(jMenuModi);

        jMenuListar.setText("Listar");
        jMenuListar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuListarMouseClicked(evt);
            }
        });
        jMenuBar2.add(jMenuListar);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(305, 305, 305)
                .addComponent(jButton1)
                .addContainerGap(388, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(348, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(108, 108, 108))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuAltaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuAltaMouseClicked
       
        if (vista.Principal.tabla == "noticias"){
            Alta_noticias abrir = new Alta_noticias();
            abrir.setVisible(true);
            dispose();
        }
        else if (vista.Principal.tabla == "usuarios"){
            Alta_usuarios abrir = new Alta_usuarios();
            abrir.setVisible(true);
            dispose();
        }
        
    }//GEN-LAST:event_jMenuAltaMouseClicked

    private void jMenuBajaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuBajaMouseClicked
      
       if (vista.Principal.tabla == "noticias"){ 
        Baja_noticias baja = new Baja_noticias();
        baja.setVisible(true);
        dispose();
       }
       
       else if  (vista.Principal.tabla == "usuarios"){
            Baja_usuarios baja = new Baja_usuarios();
            baja.setVisible(true);
            dispose();
       }
        
        
    }//GEN-LAST:event_jMenuBajaMouseClicked

    private void jMenuModiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuModiMouseClicked
       
        if (vista.Principal.tabla == "noticias"){ 
            Modificar_noticias modi = new Modificar_noticias();
            modi.setVisible(true);
            dispose();
        }
       
       else if  (vista.Principal.tabla == "usuarios"){
            Modificar_usuarios modi = new Modificar_usuarios();
            modi.setVisible(true);
            dispose();
       }
        
    }//GEN-LAST:event_jMenuModiMouseClicked

    private void jMenuListarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuListarMouseClicked
        
        if (vista.Principal.tabla == "noticias"){
            Lista_Noticias abrir = new Lista_Noticias();
            abrir.setVisible(true);
            dispose();
        }
        else if (vista.Principal.tabla == "usuarios"){
            Listado_Usuario abrir = new Listado_Usuario();
            abrir.setVisible(true);
            dispose();
        }
        
    }//GEN-LAST:event_jMenuListarMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        Principal abrir = new Principal();
        abrir.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuModiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuModiActionPerformed
        
    }//GEN-LAST:event_jMenuModiActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JFrame jFrame3;
    private javax.swing.JFrame jFrame4;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenuAlta;
    private javax.swing.JMenu jMenuBaja;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenu jMenuListar;
    private javax.swing.JMenu jMenuModi;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
