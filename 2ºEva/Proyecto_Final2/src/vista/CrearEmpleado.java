
package vista;

public class CrearEmpleado extends javax.swing.JFrame {

    
    public CrearEmpleado() {
        initComponents();
        setResizable(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jButtonvolver = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldnombre = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldapellidos = new javax.swing.JTextField();
        jTextFielddepartamento = new javax.swing.JTextField();
        jTextFieldasiento = new javax.swing.JTextField();
        jButtonguardar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabelerror = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonvolver.setText("Volver");
        jButtonvolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonvolverActionPerformed(evt);
            }
        });

        jLabel2.setText("Nombre :");

        jLabel3.setText("Apellidos :");

        jLabel4.setText("Departamento :");

        jLabel5.setText("Asiento");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel6.setText("Nuevo Empleado");

        jButtonguardar.setText("Guardar");
        jButtonguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonguardarActionPerformed(evt);
            }
        });

        jLabelerror.setText("TIENES QUE RELLENAR TODOS LOS CAMPOS");
        jLabelerror.setVisible(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(290, 290, 290)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(334, 334, 334)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(270, 270, 270)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabelerror))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3))
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jButtonvolver))
                                .addGap(143, 143, 143)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldapellidos)
                                    .addComponent(jTextFielddepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldasiento, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonguardar))))))
                .addContainerGap(196, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(28, 28, 28)
                        .addComponent(jLabel3)
                        .addGap(34, 34, 34)
                        .addComponent(jLabel4)
                        .addGap(34, 34, 34)
                        .addComponent(jLabel5)
                        .addGap(32, 32, 32)
                        .addComponent(jButtonvolver))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextFieldnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jTextFieldapellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jTextFielddepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jTextFieldasiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jButtonguardar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelerror)
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonvolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonvolverActionPerformed
        //Cerramos la ventana y volvemos a la anteior
        setVisible(false);
        new VentanaAcciones().setVisible(true);
    }//GEN-LAST:event_jButtonvolverActionPerformed

    private void jButtonguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonguardarActionPerformed

        if (jTextFieldapellidos.getText().equals("") || jTextFieldnombre.getText().equals("") || jTextFieldasiento.getText().equals("") || jTextFielddepartamento.getText().equals("")){
            jLabelerror.setVisible(true);
        }
        else{
            controlador.ControladorMongo.AñadirEmpleado();
            controlador.Controlador.AnadirEmpleado();
            vista.CrearEmpleado.jLabelerror.setText("Empleado añadido");
        }
    }//GEN-LAST:event_jButtonguardarActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonguardar;
    private javax.swing.JButton jButtonvolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    public static javax.swing.JLabel jLabelerror;
    private javax.swing.JTextField jTextField1;
    public static javax.swing.JTextField jTextFieldapellidos;
    public static javax.swing.JTextField jTextFieldasiento;
    public static javax.swing.JTextField jTextFielddepartamento;
    public static javax.swing.JTextField jTextFieldnombre;
    // End of variables declaration//GEN-END:variables
}
