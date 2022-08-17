
package Vista;

import Controlador.Operaciones;
import Modelo.Ordenadores;
import Modelo.Perifericos;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author pablo.horcajada
 */
public class ModificarOrdenador extends javax.swing.JFrame {

    
    public ModificarOrdenador() {
        initComponents();
        setResizable(false);
        PrepararTabla();
        LLenarTabla();
    }
    
    DefaultTableModel m;
    DefaultListModel dlm=new DefaultListModel();
    Operaciones oper = new Operaciones();
    int Asiento;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldasiento = new javax.swing.JTextField();
        jButtonmodificar = new javax.swing.JButton();
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
        jLabel9 = new javax.swing.JLabel();
        jButtonvolver = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jTextFieldram = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Modificar Ordenador");

        jLabel2.setText("Asiento");

        jTextFieldasiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldasientoActionPerformed(evt);
            }
        });

        jButtonmodificar.setText("Modificar");
        jButtonmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonmodificarActionPerformed(evt);
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
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 981, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(200, 200, 200)
                                        .addComponent(jButtonvolver)
                                        .addGap(122, 122, 122)
                                        .addComponent(jButtonmodificar))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(162, 162, 162)
                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(11, 11, 11)
                                        .addComponent(jLabel4)
                                        .addGap(47, 47, 47))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel2))
                                        .addGap(41, 41, 41)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldasiento, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldtarjeta)
                                    .addComponent(jTextFieldprocesador, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(56, 56, 56)
                                        .addComponent(jTextFieldventilacion, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel11)
                                            .addComponent(jLabel3))
                                        .addGap(40, 40, 40)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTextFieldram)
                                            .addComponent(jTextFieldplaca, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(64, 64, 64)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel8))
                                .addGap(55, 55, 55)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFielddisco, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldalimentacion, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldssd, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(392, 392, 392)
                        .addComponent(jLabel1)))
                .addContainerGap(91, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel1)
                .addGap(44, 44, 44)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel9)
                                        .addComponent(jLabel2)
                                        .addComponent(jTextFieldasiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextFieldventilacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel6)))
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(jTextFieldtarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(jTextFieldplaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel11)
                            .addComponent(jTextFieldram, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jTextFieldprocesador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(jTextFielddisco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextFieldalimentacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldssd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonvolver)
                    .addComponent(jButtonmodificar))
                .addContainerGap(50, Short.MAX_VALUE))
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

    private void jButtonmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonmodificarActionPerformed
        chequearEntradas();
        int filsel;
        try{
            filsel=jTable1.getSelectedRow();
            if (filsel==-1){
                JOptionPane.showMessageDialog(null, "Debes seleccionar Empleado a Modificar.");
            }else{
                boolean b=chequearEntradas();
                if(b){
                    int sitio = Integer.parseInt(jTextFieldasiento.getText());
                    String placa = jTextFieldplaca.getText();
                    String procesador = jTextFieldprocesador.getText();
                    String tarjeta = jTextFieldtarjeta.getText();
                    String memoria = jTextFieldram.getText();
                    String ali = jTextFieldalimentacion.getText();
                    String duro = jTextFielddisco.getText();
                    String ss = jTextFieldssd.getText();
                    String venti = jTextFieldventilacion.getText();
                    Ordenadores o = new Ordenadores(sitio,placa,procesador,tarjeta,memoria,ali,duro,ss,venti);
                    oper.ModificarOrdenador(o);
                    LLenarTabla();
                }
            }    
        } catch (Exception e){
            JOptionPane.showMessageDialog(null,e+ "Error al modificar el empleado");
        }
    }//GEN-LAST:event_jButtonmodificarActionPerformed

    private void jTextFieldasientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldasientoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldasientoActionPerformed

    private void jTextFieldventilacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldventilacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldventilacionActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        
        ObtenerDeLaTabla();
    }//GEN-LAST:event_jTable1MouseClicked

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonmodificar;
    private javax.swing.JButton jButtonvolver;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    public static javax.swing.JTextField jTextFieldalimentacion;
    public static javax.swing.JTextField jTextFieldasiento;
    public static javax.swing.JTextField jTextFielddisco;
    public static javax.swing.JTextField jTextFieldplaca;
    public static javax.swing.JTextField jTextFieldprocesador;
    public static javax.swing.JTextField jTextFieldram;
    public static javax.swing.JTextField jTextFieldssd;
    public static javax.swing.JTextField jTextFieldtarjeta;
    public static javax.swing.JTextField jTextFieldventilacion;
    // End of variables declaration//GEN-END:variables

    private void ObtenerDeLaTabla() {
        int filse;
        filse = jTable1.getSelectedRow();
        jTextFieldasiento.setText((String) m.getValueAt(filse, 0));
        jTextFieldplaca.setText((String) m.getValueAt(filse, 1));
        jTextFieldprocesador.setText((String) m.getValueAt(filse, 2));
        jTextFieldtarjeta.setText((String) m.getValueAt(filse, 3));
        jTextFieldram.setText((String) m.getValueAt(filse, 4));
        jTextFieldalimentacion.setText((String) m.getValueAt(filse, 5));
        jTextFielddisco.setText((String) m.getValueAt(filse, 6));
        jTextFieldssd.setText((String) m.getValueAt(filse, 7));
        jTextFieldventilacion.setText((String) m.getValueAt(filse, 8));
        
    }

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
    
    boolean chequearEntradas() {
        boolean b=true;
        String mensaje="";
        if(jTextFieldasiento.getText().equals("")){
             mensaje+="El asiento no se puede quedar vacio\n";
            b=false;
        }
        int num;
        try{
            num=Integer.parseInt(jTextFieldasiento.getText());
        }catch (Exception e ){
            mensaje+="Formato de número incorrecto\n";
            b=false;
        }
        if(jTextFieldplaca.getText().equals("")){
             mensaje+="La placa no se puede quedar vacio\n";
            b=false;
        }
        if(jTextFieldprocesador.getText().equals("")){
             mensaje+="El procesador no se puede quedar vacio\n";
            b=false;
        }
        if(jTextFieldtarjeta.getText().equals("")){
             mensaje+="La tarjeta gráfica no se puede quedar vacio\n";
            b=false;
        }
        if(jTextFieldram.getText().equals("")){
             mensaje+="La memoria ram no se puede quedar vacio\n";
            b=false;
        }
        if(jTextFieldalimentacion.getText().equals("")){
             mensaje+="La ventilacion no se puede quedar vacio\n";
            b=false;
        }
        if(jTextFielddisco.getText().equals("")){
             mensaje+="El Disco solido no se puede quedar vacio\n";
            b=false;
        }
        if(jTextFieldssd.getText().equals("")){
             mensaje+="El disco ssd no se puede quedar vacio\n";
            b=false;
        }
        if(jTextFieldventilacion.getText().equals("")){
             mensaje+="La ventilacion no se puede quedar vacio\n";
            b=false;
        }
        return b;
    }
}
