
package vista;

/**
 *
 * @author pablo
 */
public class CrearOrdenador extends javax.swing.JFrame {

    public CrearOrdenador() {
        initComponents();
        setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel11 = new javax.swing.JLabel();
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
        jTextFieldasiento = new javax.swing.JTextField();
        jTextFieldtorre = new javax.swing.JTextField();
        jTextFielddiscoduro = new javax.swing.JTextField();
        jTextFielddiscossd = new javax.swing.JTextField();
        jTextFieldventilacion = new javax.swing.JTextField();
        jTextFieldplaca = new javax.swing.JTextField();
        jTextFieldprocesador = new javax.swing.JTextField();
        jTextFieldtarjeta = new javax.swing.JTextField();
        jTextFieldalimentacion = new javax.swing.JTextField();
        jButtonvolver = new javax.swing.JButton();
        jButtoncrear = new javax.swing.JButton();
        jLabelerror = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextFieldram = new javax.swing.JTextField();

        jLabel11.setText("jLabel11");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("Crear Ordenador");

        jLabel2.setText("Asiento");

        jLabel3.setText("Placa");

        jLabel4.setText("Procesador");

        jLabel5.setText("Tarjeta Grafica");

        jLabel6.setText("Alimentacion");

        jLabel7.setText("Disco duro");

        jLabel8.setText("Disco duro ssd");

        jLabel9.setText("Ventilacion");

        jLabel10.setText("Torre");

        jTextFieldasiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldasientoActionPerformed(evt);
            }
        });

        jTextFieldtorre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldtorreActionPerformed(evt);
            }
        });

        jTextFielddiscoduro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFielddiscoduroActionPerformed(evt);
            }
        });

        jTextFielddiscossd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFielddiscossdActionPerformed(evt);
            }
        });

        jTextFieldventilacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldventilacionActionPerformed(evt);
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

        jTextFieldtarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldtarjetaActionPerformed(evt);
            }
        });

        jTextFieldalimentacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldalimentacionActionPerformed(evt);
            }
        });

        jButtonvolver.setText("Volver");
        jButtonvolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonvolverActionPerformed(evt);
            }
        });

        jButtoncrear.setText("Crear");
        jButtoncrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtoncrearActionPerformed(evt);
            }
        });

        jLabelerror.setText("NO PUEDS DEJAR NIGUN CAMPO  VACIO");
        jLabelerror.setVisible(false);

        jLabel12.setText("Memoria Ram");

        jTextFieldram.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldramActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextFieldplaca, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldprocesador, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldram)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel10)
                        .addGap(51, 51, 51)
                        .addComponent(jTextFieldtorre, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButtoncrear)
                                .addGap(184, 184, 184))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(124, 124, 124))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7)
                                .addGap(35, 35, 35))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(jLabel5)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextFieldtarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(27, 27, 27)
                                        .addComponent(jLabel8))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(15, 15, 15)
                                        .addComponent(jLabel2)
                                        .addGap(45, 45, 45)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextFieldasiento, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextFieldalimentacion, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(18, 18, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextFielddiscoduro, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldventilacion, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFielddiscossd, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelerror, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(153, 153, 153))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addComponent(jButtonvolver))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(233, 233, 233)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldasiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(jTextFieldplaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6)
                                .addComponent(jTextFieldalimentacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextFielddiscoduro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTextFieldprocesador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jTextFieldtarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(jTextFielddiscossd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldventilacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(6, 6, 6))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12)
                        .addComponent(jTextFieldram, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10)
                        .addComponent(jTextFieldtorre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(jLabelerror, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonvolver)
                    .addComponent(jButtoncrear))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldasientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldasientoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldasientoActionPerformed

    private void jTextFieldtorreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldtorreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldtorreActionPerformed

    private void jTextFielddiscoduroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFielddiscoduroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFielddiscoduroActionPerformed

    private void jTextFielddiscossdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFielddiscossdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFielddiscossdActionPerformed

    private void jTextFieldventilacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldventilacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldventilacionActionPerformed

    private void jTextFieldplacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldplacaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldplacaActionPerformed

    private void jTextFieldprocesadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldprocesadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldprocesadorActionPerformed

    private void jTextFieldtarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldtarjetaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldtarjetaActionPerformed

    private void jTextFieldalimentacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldalimentacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldalimentacionActionPerformed

    private void jButtonvolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonvolverActionPerformed
        setVisible(false);
        new VentanaAcciones().setVisible(true);
    }//GEN-LAST:event_jButtonvolverActionPerformed

    private void jButtoncrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtoncrearActionPerformed
        if (jTextFieldasiento.getText().equals("")){
            jLabelerror.setVisible(true);
        }
        else {
            controlador.ControladorMongo.Añadirordenador();
            controlador.Controlador.AñadirOrdenador();
            jLabelerror.setVisible(true);
            this.jLabelerror.setText("Ordenador creado");
        }
    }//GEN-LAST:event_jButtoncrearActionPerformed

    private void jTextFieldramActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldramActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldramActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtoncrear;
    private javax.swing.JButton jButtonvolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public static javax.swing.JLabel jLabelerror;
    public static javax.swing.JTextField jTextFieldalimentacion;
    public static javax.swing.JTextField jTextFieldasiento;
    public static javax.swing.JTextField jTextFielddiscoduro;
    public static javax.swing.JTextField jTextFielddiscossd;
    public static javax.swing.JTextField jTextFieldplaca;
    public static javax.swing.JTextField jTextFieldprocesador;
    public static javax.swing.JTextField jTextFieldram;
    public static javax.swing.JTextField jTextFieldtarjeta;
    public static javax.swing.JTextField jTextFieldtorre;
    public static javax.swing.JTextField jTextFieldventilacion;
    // End of variables declaration//GEN-END:variables
}
