
package Vista;

public class VentanaAcciones extends javax.swing.JFrame {

    
    public VentanaAcciones() {
        initComponents();
        setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButtonAñadir1 = new javax.swing.JButton();
        jButtonmodificar1 = new javax.swing.JButton();
        jButtonEliminar1 = new javax.swing.JButton();
        jButtonVer1 = new javax.swing.JButton();
        jButtonVolver = new javax.swing.JButton();

        jLabel7.setText("jLabel7");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel3.setText("Menú de acciones");

        jButtonAñadir1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButtonAñadir1.setText("Añadir");
        jButtonAñadir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAñadir1ActionPerformed(evt);
            }
        });

        jButtonmodificar1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButtonmodificar1.setText("Modificar");
        jButtonmodificar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonmodificar1ActionPerformed(evt);
            }
        });

        jButtonEliminar1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButtonEliminar1.setText("Eliminar");
        jButtonEliminar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminar1ActionPerformed(evt);
            }
        });

        jButtonVer1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButtonVer1.setText("Ver");
        jButtonVer1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVer1ActionPerformed(evt);
            }
        });

        jButtonVolver.setText("Volver");
        jButtonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(247, 247, 247)
                        .addComponent(jLabel3))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(191, 191, 191)
                            .addComponent(jButtonAñadir1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonmodificar1))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(203, 203, 203)
                            .addComponent(jButtonVer1)
                            .addGap(162, 162, 162)
                            .addComponent(jButtonEliminar1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(303, 303, 303)
                        .addComponent(jButtonVolver)))
                .addContainerGap(190, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jLabel3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonmodificar1)
                            .addComponent(jButtonAñadir1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonVer1)
                            .addComponent(jButtonEliminar1))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(jButtonVolver)
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAñadir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAñadir1ActionPerformed
        //Si el boolean boempleado es true, pasamos a la ventana de Crear empleado
        setVisible(false);
        if(Vista.VentanaEntidades.entidad.equals("Empleado")){
            new CrearEmpleado().setVisible(true);
        }
        if (Vista.VentanaEntidades.entidad.equals("Ordenador")){
            new CrearOrdenador().setVisible(true);
        }
        if(Vista.VentanaEntidades.entidad.equals("Perifericos")){
            new CrearPeriferico().setVisible(true);
        }
    }//GEN-LAST:event_jButtonAñadir1ActionPerformed

    private void jButtonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverActionPerformed
        //Cerramos la ventana y volvemos a la anteior
        setVisible(false);
        new VentanaEntidades().setVisible(true);
    }//GEN-LAST:event_jButtonVolverActionPerformed

    private void jButtonmodificar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonmodificar1ActionPerformed
        setVisible(false);
        if(Vista.VentanaEntidades.entidad.equals("Empleado")){
            new ModificarEmpleado().setVisible(true);
        }
        if(Vista.VentanaEntidades.entidad.equals("Ordenador")){
            new ModificarOrdenador().setVisible(true);
        }
        if(Vista.VentanaEntidades.entidad.equals("Perifericos")){
            new ModificarPerifericos().setVisible(true);
        }
    }//GEN-LAST:event_jButtonmodificar1ActionPerformed

    private void jButtonVer1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVer1ActionPerformed
       setVisible(false);
        if(Vista.VentanaEntidades.entidad.equals("Empleado")){
            new VerEmpleado().setVisible(true);
        }
        if(Vista.VentanaEntidades.entidad.equals("Ordenador")){
            new VerOrdenador().setVisible(true);
        }
        if(Vista.VentanaEntidades.entidad.equals("Perifericos")){
            new VerPerifericos().setVisible(true);
        }
    }//GEN-LAST:event_jButtonVer1ActionPerformed

    private void jButtonEliminar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminar1ActionPerformed
        setVisible(false);
        if(Vista.VentanaEntidades.entidad.equals("Empleado")){
            new EliminarEmpleado().setVisible(true);
        }
        if(Vista.VentanaEntidades.entidad.equals("Ordenador")){
            new EliminarOrdenador().setVisible(true);
        }
        if(Vista.VentanaEntidades.entidad.equals("Perifericos")){
            new EliminarPeriferico().setVisible(true);
        }
       
    }//GEN-LAST:event_jButtonEliminar1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAñadir1;
    private javax.swing.JButton jButtonEliminar1;
    private javax.swing.JButton jButtonVer1;
    private javax.swing.JButton jButtonVolver;
    private javax.swing.JButton jButtonmodificar1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
