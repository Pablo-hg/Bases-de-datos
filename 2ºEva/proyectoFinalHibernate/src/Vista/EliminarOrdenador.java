
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
public class EliminarOrdenador extends javax.swing.JFrame {

    
    public EliminarOrdenador() {
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

        jLabel1 = new javax.swing.JLabel();
        jButtonvolver = new javax.swing.JButton();
        jButtonEliminar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Eliminar Ordenador");

        jButtonvolver.setText("Volver");
        jButtonvolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonvolverActionPerformed(evt);
            }
        });

        jButtonEliminar.setText("Eliminar");
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
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
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 912, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(240, 240, 240)
                        .addComponent(jButtonvolver)
                        .addGap(285, 285, 285)
                        .addComponent(jButtonEliminar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(408, 408, 408)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonvolver)
                    .addComponent(jButtonEliminar))
                .addGap(68, 68, 68))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonvolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonvolverActionPerformed
        setVisible(false);
        new VentanaAcciones().setVisible(true);
    }//GEN-LAST:event_jButtonvolverActionPerformed

    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed
        int filsel;
        int resp;
        try{
            filsel=jTable1.getSelectedRow();
            if (filsel==-1){
                JOptionPane.showMessageDialog(null, "Debes seleccionar el Ordenador a borrar.");
            } else {
                resp = JOptionPane.showConfirmDialog(null, "Desea eliminar el Ordenador seleccionado?","Eliminar",JOptionPane.YES_NO_OPTION);
                if (resp==JOptionPane.YES_OPTION){
                    int selectedRow=filsel;
                    String asiento =(String) m.getValueAt(selectedRow, 0);
                    int clave = Integer.parseInt(asiento);
                    oper.EliminarOrdenador(clave);
                    LLenarTabla();
                }
            }
        } catch (Exception e){
            JOptionPane.showMessageDialog(null,e+ "Error al eliminar la noticia.");
        }
    }//GEN-LAST:event_jButtonEliminarActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JButton jButtonvolver;
    private javax.swing.JLabel jLabel1;
    public static javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
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
