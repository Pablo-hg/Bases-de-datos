
package vista;

/**
 *
 * @author pablo
 */
public class ModificarEmpleado extends javax.swing.JFrame {

    
    public ModificarEmpleado() {
        initComponents();
        setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSpinner1 = new javax.swing.JSpinner();
        jButton1 = new javax.swing.JButton();
        jButtonmodificar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldasiento = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldnewdept = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldnewApellidos = new javax.swing.JTextField();
        jTextFieldnewNombre = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Volver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButtonmodificar.setText("Modificar");
        jButtonmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonmodificarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setText("Modificar un empleado");

        jLabel1.setText("Introduce el asiento del empleado : ");

        jLabel3.setText("Introduce el nuevo nombre :");

        jTextFieldnewdept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldnewdeptActionPerformed(evt);
            }
        });

        jLabel4.setText("Introduce los nuevos apellidos :");

        jLabel5.setText("Introduce el departamento : ");

        jTextFieldnewApellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldnewApellidosActionPerformed(evt);
            }
        });

        jTextFieldnewNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldnewNombreActionPerformed(evt);
            }
        });

        jLabel6.setText("Nota : no hace falta que rellenes todos los nuevos datos, con uno sirve");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addComponent(jButton1)
                        .addGap(91, 91, 91)
                        .addComponent(jButtonmodificar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(85, 85, 85)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldnewNombre)
                            .addComponent(jTextFieldasiento)
                            .addComponent(jTextFieldnewdept)
                            .addComponent(jTextFieldnewApellidos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jLabel6)))
                .addContainerGap(132, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel2)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldasiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldnewNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldnewApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextFieldnewdept, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonmodificar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1))
                .addGap(42, 42, 42))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        setVisible(false);
        new VentanaAcciones().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextFieldnewdeptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldnewdeptActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldnewdeptActionPerformed

    private void jButtonmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonmodificarActionPerformed
        if (jTextFieldasiento.getText().equals("")){
            jLabel6.setText("Para modificar un empleado, necesitas poner el asiento");
        }
        else{
            controlador.Controlador.ModificarEmpleado();
            controlador.ControladorMongo.ModificarEmpleado();
            jLabel6.setText("El empleado que se sentaba en " + this.jTextFieldasiento + " ha sido modificado");
        }
    }//GEN-LAST:event_jButtonmodificarActionPerformed

    private void jTextFieldnewApellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldnewApellidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldnewApellidosActionPerformed

    private void jTextFieldnewNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldnewNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldnewNombreActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonmodificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    public static javax.swing.JLabel jLabel6;
    private javax.swing.JSpinner jSpinner1;
    public static javax.swing.JTextField jTextFieldasiento;
    public static javax.swing.JTextField jTextFieldnewApellidos;
    public static javax.swing.JTextField jTextFieldnewNombre;
    public static javax.swing.JTextField jTextFieldnewdept;
    // End of variables declaration//GEN-END:variables
}
