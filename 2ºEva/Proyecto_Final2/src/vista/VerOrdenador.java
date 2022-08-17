
package vista;

/**
 *
 * @author pablo.horcajada
 */
public class VerOrdenador extends javax.swing.JFrame {

    
    public VerOrdenador() {
        initComponents();
        setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldasiento = new javax.swing.JTextField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jButtonvolver = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaInfoOrdenadores = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Ver Ordenador");

        jLabel2.setText("Introduce el asiento del ordenador");

        jCheckBox1.setText("Marca esta casiila si quires ver todos los ordenadores");

        jButtonvolver.setText("Volver");
        jButtonvolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonvolverActionPerformed(evt);
            }
        });

        jButton1.setText("Ver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextAreaInfoOrdenadores.setColumns(20);
        jTextAreaInfoOrdenadores.setRows(5);
        jScrollPane1.setViewportView(jTextAreaInfoOrdenadores);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(68, 68, 68)
                                .addComponent(jTextFieldasiento, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(jButtonvolver)
                        .addGap(82, 82, 82)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldasiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jCheckBox1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonvolver)
                    .addComponent(jButton1))
                .addGap(38, 38, 38))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonvolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonvolverActionPerformed
        setVisible(false);
        new VentanaAcciones().setVisible(true);
    }//GEN-LAST:event_jButtonvolverActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       if (!jCheckBox1.isSelected() && jTextFieldasiento.getText().equals("")){
           jTextAreaInfoOrdenadores.setText("Debes marcar la casilla o poner un asiento");
       }
       else {
            if (jCheckBox1.isSelected()){
               jTextAreaInfoOrdenadores.setText("");
               controlador.Controlador.VerTodosOrdenador();
               controlador.ControladorMongo.VertodosOrdenador();
            }
            if (!jTextFieldasiento.getText().equals("")){
                jTextAreaInfoOrdenadores.setText("");
                controlador.Controlador.VerOrdenador();
                controlador.ControladorMongo.VerOrdenador();
            }
       }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonvolver;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTextArea jTextAreaInfoOrdenadores;
    public static javax.swing.JTextField jTextFieldasiento;
    // End of variables declaration//GEN-END:variables
}
