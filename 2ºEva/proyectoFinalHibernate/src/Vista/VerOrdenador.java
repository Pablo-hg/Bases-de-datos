
package Vista;

import Controlador.Operaciones;
import Modelo.Ordenadores;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author pablo.horcajada
 */
public class VerOrdenador extends javax.swing.JFrame {

    
    public VerOrdenador() {
        initComponents();
        setResizable(false);
    }

    DefaultTableModel m;
    DefaultListModel dlm=new DefaultListModel();
    Operaciones oper = new Operaciones();
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldasiento = new javax.swing.JTextField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jButtonvolver = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(478, 478, 478)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(390, 390, 390)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(79, 79, 79)
                                .addComponent(jTextFieldasiento, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jCheckBox1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 994, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(362, 362, 362)
                        .addComponent(jButtonvolver)
                        .addGap(274, 274, 274)
                        .addComponent(jButton1)))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldasiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBox1)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                        .addComponent(jButtonvolver)
                        .addGap(56, 56, 56))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(64, 64, 64))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonvolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonvolverActionPerformed
        setVisible(false);
        new VentanaAcciones().setVisible(true);
    }//GEN-LAST:event_jButtonvolverActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       if (!jCheckBox1.isSelected() && jTextFieldasiento.getText().equals("")){
           JOptionPane.showMessageDialog(null, "Debes marcar la casilla o poner un asiento");
       }
       else {
            if (jCheckBox1.isSelected()){
               LLenarTabla();
               PrepararTabla();
            }
            if (!jTextFieldasiento.getText().equals("")){
                Ordenadores o = oper.VerOrdenador(Integer.parseInt(this.jTextFieldasiento.getText()));
                JOptionPane.showMessageDialog(this, o.toString());
            }
       }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonvolver;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    public static javax.swing.JTextField jTextFieldasiento;
    // End of variables declaration//GEN-END:variables

    private void PrepararTabla() {
        String titulos[]=new String[8];
        m=new DefaultTableModel(null,titulos);
        jTable1.setModel(m);
    }

    private void LLenarTabla() {
        String titulos[]={"SITIO","PLACA","PROCESADOR","GRÁFICA","RAM","ALIMENTACION","DISCO-SOLIDO","DISCO-SSD","VENTILACION"};
        m=new DefaultTableModel(null,titulos);
        dlm=oper.VerTodosOrdenador();
        String fila[]= new String[9];
        for (int i=0;i<dlm.size();i++){
            Ordenadores aux= (Ordenadores) dlm.get(i);
            fila[0]=""+aux.getSitio();
            fila[1]=aux.getPlaca();
            fila[2]=aux.getProcesador();
            fila[3]=aux.getTarjetaGrafica();
            fila[4]=aux.getMemoriaRam();
            fila[5]=aux.getAlimentacion();
            fila[6]=aux.getDiscoDuro();
            fila[7]=aux.getDiscoSsd();
            fila[8]=aux.getVentilacion();
            m.addRow(fila);
        }
        jTable1.setModel(m);
    }
}
