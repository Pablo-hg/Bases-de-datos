
package Vista;

import Controlador.Operaciones;
import Modelo.Empleados;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author pablo
 */
public class VerEmpleado extends javax.swing.JFrame {

    public VerEmpleado() {
        initComponents();
        PrepararTabla();
        setResizable(false);
    }
    
    DefaultTableModel m;
    DefaultListModel dlm=new DefaultListModel();
    Operaciones oper = new Operaciones();

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldasiento = new javax.swing.JTextField();
        jChecktodos = new javax.swing.JCheckBox();
        jButtonVolver = new javax.swing.JButton();
        jButtonVer = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("Ver Empleado");

        jLabel2.setText("Introduce el asiento del Empleado que quieres ver");

        jTextFieldasiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldasientoActionPerformed(evt);
            }
        });

        jChecktodos.setText("Marca esta casilla si quieres ver todos los empleados");

        jButtonVolver.setText("Volver");
        jButtonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverActionPerformed(evt);
            }
        });

        jButtonVer.setText("Ver");
        jButtonVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVerActionPerformed(evt);
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
        jScrollPane2.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(86, 86, 86)
                        .addComponent(jTextFieldasiento, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jChecktodos)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(143, Short.MAX_VALUE))))))
            .addGroup(layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(jButtonVolver)
                .addGap(197, 197, 197)
                .addComponent(jButtonVer)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jLabel1)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldasiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jChecktodos)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonVolver)
                    .addComponent(jButtonVer))
                .addGap(29, 29, 29)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverActionPerformed
        setVisible(false);
        new VentanaAcciones().setVisible(true);
    }//GEN-LAST:event_jButtonVolverActionPerformed

    private void jButtonVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVerActionPerformed
        //Si marcamos la casilla de ver todos
        if (!jChecktodos.isSelected() && jTextFieldasiento.getText().equals("")){
            jLabel4.setText("Debes marcar la casilla o poner un asiento");
        }
        else{
            if (jChecktodos.isSelected()){
                PrepararTabla();
                LLenarTabla();
            }
            if (!jTextFieldasiento.getText().equals("")){
                Empleados e = oper.VerEmpleado(Integer.parseInt(this.jTextFieldasiento.getText()));
                JOptionPane.showMessageDialog(this, e.toString());
            }  
        }
    }//GEN-LAST:event_jButtonVerActionPerformed

    private void jTextFieldasientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldasientoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldasientoActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonVer;
    private javax.swing.JButton jButtonVolver;
    private javax.swing.JCheckBox jChecktodos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    public static javax.swing.JLabel jLabel4;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    public static javax.swing.JTextField jTextFieldasiento;
    // End of variables declaration//GEN-END:variables

    private void PrepararTabla() {
        String titulos[]=new String[3];
        m=new DefaultTableModel(null,titulos);
        jTable1.setModel(m);
    }

    private void LLenarTabla() {
        String titulos[]={"SITIO","NOMBRE","APELLIDOS","DEPARTAMENTO"};
        m=new DefaultTableModel(null,titulos);
        dlm=oper.VerTodosEmpleados();
        String fila[]= new String[4];
        for (int i=0;i<dlm.size();i++){
            Empleados aux= (Empleados) dlm.get(i);
            fila[0]= "" + aux.getSitio();
            fila[1]=aux.getNombre();
            fila[2]=aux.getApellidos();
            fila[3]=aux.getDepartamento();
            m.addRow(fila);
        }
        jTable1.setModel(m);
    }
}

