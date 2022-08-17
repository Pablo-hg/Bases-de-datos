
package vista;

 
public class VentanaEntidades extends javax.swing.JFrame {

    
    
    static public String entidad = "";
    
    public VentanaEntidades() {
        initComponents();
        setResizable(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jButtonEmpleado = new javax.swing.JButton();
        jButtonDispositivos = new javax.swing.JButton();
        jButtonOrdenador = new javax.swing.JButton();
        jButtonPerifericos = new javax.swing.JButton();
        jButtoncerrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setText("Menú de Entidades");

        jButtonEmpleado.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButtonEmpleado.setText("Empleado");
        jButtonEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEmpleadoActionPerformed(evt);
            }
        });

        jButtonDispositivos.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButtonDispositivos.setText("Dispositivos");
        jButtonDispositivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDispositivosActionPerformed(evt);
            }
        });

        jButtonOrdenador.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButtonOrdenador.setText("Ordenador");
        jButtonOrdenador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOrdenadorActionPerformed(evt);
            }
        });

        jButtonPerifericos.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButtonPerifericos.setText("Perifericos");
        jButtonPerifericos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPerifericosActionPerformed(evt);
            }
        });

        jButtoncerrar.setText("Cerrar");
        jButtoncerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtoncerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonEmpleado)
                    .addComponent(jButtonOrdenador))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonDispositivos)
                    .addComponent(jButtonPerifericos))
                .addGap(205, 205, 205))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(233, 233, 233)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(290, 290, 290)
                        .addComponent(jButtoncerrar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jLabel2)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonEmpleado)
                    .addComponent(jButtonDispositivos))
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonOrdenador)
                    .addComponent(jButtonPerifericos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(jButtoncerrar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonOrdenadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOrdenadorActionPerformed
        entidad = "Ordenador";
        new VentanaAcciones().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButtonOrdenadorActionPerformed

    private void jButtonEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEmpleadoActionPerformed
        //Al pulsar en empleado, cambiamos de valor la variable y hacemos visible la ventana de Acciones
        entidad = "Empleado";
        new VentanaAcciones().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButtonEmpleadoActionPerformed

    private void jButtonDispositivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDispositivosActionPerformed
        entidad = "Dispositivo";
        new VentanaAcciones().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButtonDispositivosActionPerformed

    private void jButtonPerifericosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPerifericosActionPerformed
        entidad = "Perifericos";
        new VentanaAcciones().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButtonPerifericosActionPerformed

    private void jButtoncerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtoncerrarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtoncerrarActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDispositivos;
    private javax.swing.JButton jButtonEmpleado;
    private javax.swing.JButton jButtonOrdenador;
    private javax.swing.JButton jButtonPerifericos;
    private javax.swing.JButton jButtoncerrar;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
