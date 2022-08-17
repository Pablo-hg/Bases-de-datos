
package vista;

/**
 *
 * @author pablo.horcajada
 */
public class ModificarOrdenador extends javax.swing.JFrame {

    
    public ModificarOrdenador() {
        initComponents();
        setResizable(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldasiento = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jButtoncrear = new javax.swing.JButton();
        jTextFieldplaca = new javax.swing.JTextField();
        jTextFieldtarjeta = new javax.swing.JTextField();
        jTextFieldprocesador = new javax.swing.JTextField();
        jTextFieldalimentacion = new javax.swing.JTextField();
        jTextFielddisco = new javax.swing.JTextField();
        jTextFieldssd = new javax.swing.JTextField();
        jTextFieldventilacion = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldtorre = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jButtonvolver = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jTextFieldram = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Modificar Ordenador");

        jLabel2.setText("Introduce el asiento donde se modificará");

        jTextFieldasiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldasientoActionPerformed(evt);
            }
        });

        jLabel10.setText("Torre");

        jButtoncrear.setText("Modificar");
        jButtoncrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtoncrearActionPerformed(evt);
            }
        });

        jTextFieldplaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldplacaActionPerformed(evt);
            }
        });

        jTextFieldprocesador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldprocesadorActionPerformed(evt);
            }
        });

        jTextFielddisco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFielddiscoActionPerformed(evt);
            }
        });

        jTextFieldventilacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldventilacionActionPerformed(evt);
            }
        });

        jLabel3.setText("Placa");

        jLabel4.setText("Procesador");

        jLabel5.setText("Tarjeta Grafica");

        jLabel6.setText("Alimentacion");

        jLabel7.setText("Disco duro");

        jLabel8.setText("Disco duro ssd");

        jLabel9.setText("Ventilacion");

        jButtonvolver.setText("Volver");
        jButtonvolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonvolverActionPerformed(evt);
            }
        });

        jLabel11.setText("Memoria Ram");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(47, 47, 47))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(82, 82, 82))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldplaca, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldprocesador, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldtarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(75, 75, 75)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldventilacion, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                            .addComponent(jTextFieldtorre)
                            .addComponent(jTextFieldram))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(241, 241, 241)
                        .addComponent(jButtonvolver)
                        .addGap(122, 122, 122)
                        .addComponent(jButtoncrear)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(27, 27, 27)
                        .addComponent(jTextFieldssd, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldalimentacion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFielddisco, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(49, 49, 49))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(jLabel2)
                        .addGap(48, 48, 48)
                        .addComponent(jTextFieldasiento, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(203, 203, 203)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(259, 259, 259)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldasiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldventilacion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(jLabel3)
                        .addComponent(jTextFieldplaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextFieldalimentacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9)))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel5)
                    .addComponent(jTextFieldtarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldtorre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jTextFielddisco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldssd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel11)
                    .addComponent(jTextFieldram, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldprocesador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonvolver)
                    .addComponent(jButtoncrear))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonvolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonvolverActionPerformed
        setVisible(false);
        new VentanaAcciones().setVisible(true);
    }//GEN-LAST:event_jButtonvolverActionPerformed

    private void jTextFieldprocesadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldprocesadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldprocesadorActionPerformed

    private void jTextFieldplacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldplacaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldplacaActionPerformed

    private void jTextFielddiscoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFielddiscoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFielddiscoActionPerformed

    private void jButtoncrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtoncrearActionPerformed
        if (jTextFieldasiento.getText().equals("")){
            jLabel12.setText("Para modificar tienes que escribir el asiento");
        }
        else{
            controlador.Controlador.ModificarOrdenador();
            controlador.ControladorMongo.ModificarOrdenador();
            this.jLabel12.setText("El ordenador en el asiento " + this.jTextFieldasiento.getText() + " ha sido modificado");
        }
    }//GEN-LAST:event_jButtoncrearActionPerformed

    private void jTextFieldasientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldasientoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldasientoActionPerformed

    private void jTextFieldventilacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldventilacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldventilacionActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtoncrear;
    private javax.swing.JButton jButtonvolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    public static javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public static javax.swing.JTextField jTextFieldalimentacion;
    public static javax.swing.JTextField jTextFieldasiento;
    public static javax.swing.JTextField jTextFielddisco;
    public static javax.swing.JTextField jTextFieldplaca;
    public static javax.swing.JTextField jTextFieldprocesador;
    public static javax.swing.JTextField jTextFieldram;
    public static javax.swing.JTextField jTextFieldssd;
    public static javax.swing.JTextField jTextFieldtarjeta;
    public static javax.swing.JTextField jTextFieldtorre;
    public static javax.swing.JTextField jTextFieldventilacion;
    // End of variables declaration//GEN-END:variables
}
