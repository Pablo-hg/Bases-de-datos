
package Vista;

import Controlador.Operaciones;
import Modelo.Perifericos;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author pablo
 */
public class EliminarPeriferico extends javax.swing.JFrame {

    
    public EliminarPeriferico() {
        initComponents();
        PrepararTabla();
        LLenarTabla();
    }
    
    DefaultTableModel m;
    DefaultListModel dlm=new DefaultListModel();
    Operaciones oper = new Operaciones();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jBEliminarconTabla = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jCheckBoxm1 = new javax.swing.JCheckBox();
        jCheckBoxm2 = new javax.swing.JCheckBox();
        jCheckBoxr = new javax.swing.JCheckBox();
        jCheckBoxt = new javax.swing.JCheckBox();
        jCheckBoxd = new javax.swing.JCheckBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextFieldasiento = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jBEliminarpAsiento = new javax.swing.JButton();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("Eliminar Periferico");

        jLabel2.setText("Selecciona en la tabla el conjunto de Perifericos que queires eliminar");

        jButton1.setText("Volver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jBEliminarconTabla.setText("Eliminar Con tabla");
        jBEliminarconTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminarconTablaActionPerformed(evt);
            }
        });

        jLabel5.setText("Nota : si solo quires eliminar un periferico de  ese asiento, marca la casilla de ese periferico");

        jCheckBoxm1.setText("Monitor1");

        jCheckBoxm2.setText("Monitor2");

        jCheckBoxr.setText("Raton");

        jCheckBoxt.setText("Teclado");

        jCheckBoxd.setText("Disco portatil");

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

        jLabel6.setText("Introduce el asiento dodne quieres eliminar algún Periferico");

        jBEliminarpAsiento.setText("Eliminar por Asiento");
        jBEliminarpAsiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminarpAsientoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(jLabel2))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(35, 35, 35)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jCheckBoxm1)
                                            .addGap(103, 103, 103)
                                            .addComponent(jCheckBoxm2)
                                            .addGap(125, 125, 125)
                                            .addComponent(jCheckBoxr))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(97, 97, 97)
                                                        .addComponent(jCheckBoxt))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                        .addComponent(jButton1)
                                                        .addGap(16, 16, 16)))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(115, 115, 115)
                                                        .addComponent(jCheckBoxd))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(79, 79, 79)
                                                        .addComponent(jBEliminarpAsiento)))))))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(153, 153, 153)
                                    .addComponent(jLabel1))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(38, 38, 38)
                                    .addComponent(jLabel6)
                                    .addGap(18, 18, 18)
                                    .addComponent(jTextFieldasiento, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel5))
                            .addGap(122, 122, 122))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 728, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(266, 266, 266)
                                .addComponent(jBEliminarconTabla)))))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldasiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBoxm1)
                    .addComponent(jCheckBoxm2)
                    .addComponent(jCheckBoxr))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBoxd)
                    .addComponent(jCheckBoxt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBEliminarpAsiento))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jButton1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(32, 32, 32)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(jBEliminarconTabla)
                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        setVisible(false);
        new VentanaAcciones().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jBEliminarconTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarconTablaActionPerformed
        int filsel;
        int resp;
        try{
            filsel=jTable1.getSelectedRow();
            if (filsel==-1){
                JOptionPane.showMessageDialog(null, "Debes seleccionar la fila de Perifericos  a borrar.");
            } else {
                resp = JOptionPane.showConfirmDialog(null, "Desea eliminar los Perifericos seleccionados?","Eliminar",JOptionPane.YES_NO_OPTION);
                if (resp==JOptionPane.YES_OPTION){
                    int selectedRow=filsel;
                    String asiento =(String) m.getValueAt(selectedRow, 0);
                    int clave = Integer.parseInt(asiento);
                    oper.EliminarPerifericoTabla(clave);
                    LLenarTabla();
                }
            }
        } catch (Exception e){
            JOptionPane.showMessageDialog(null,e+ "Error al eliminar la noticia.");
        }
    }//GEN-LAST:event_jBEliminarconTablaActionPerformed

    private void jBEliminarpAsientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarpAsientoActionPerformed
        if (jTextFieldasiento.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Debes escribir un asiento para eliminar alhún periférico");
        }
        else{
            Controlador.Operaciones.EliminarPeriferico();
        }
        
    }//GEN-LAST:event_jBEliminarpAsientoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBEliminarconTabla;
    private javax.swing.JButton jBEliminarpAsiento;
    private javax.swing.JButton jButton1;
    public static javax.swing.JCheckBox jCheckBoxd;
    public static javax.swing.JCheckBox jCheckBoxm1;
    public static javax.swing.JCheckBox jCheckBoxm2;
    public static javax.swing.JCheckBox jCheckBoxr;
    public static javax.swing.JCheckBox jCheckBoxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    public static javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    public static javax.swing.JTextField jTextFieldasiento;
    // End of variables declaration//GEN-END:variables

    private void PrepararTabla() {
        String titulos[]=new String[5];
        m=new DefaultTableModel(null,titulos);
        jTable1.setModel(m);
    }

    private void LLenarTabla() {
        String titulos[]={"SITIO","MONITOR1","MONITOR2","RATON","TECLADO","DISCOPORTATIL"};
        m=new DefaultTableModel(null,titulos);
        dlm=oper.VertodosPerifericos();
        String fila[]= new String[6];
        for (int i=0;i<dlm.size();i++){
            Perifericos aux= (Perifericos) dlm.get(i);
            fila[0]=""+aux.getSitio();
            fila[1]=aux.getMonitor1();
            fila[2]=aux.getMonitor2();
            fila[3]=aux.getRaton();
            fila[4]=aux.getTeclado();
            fila[5]=aux.getDiscoPortatil();
            m.addRow(fila);
        }
        jTable1.setModel(m);
    }
}
