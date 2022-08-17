
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
public class ModificarPerifericos extends javax.swing.JFrame {

    public ModificarPerifericos() {
        initComponents();
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldm1ç = new javax.swing.JTextField();
        jTextFieldm2 = new javax.swing.JTextField();
        jTextFieldraton = new javax.swing.JTextField();
        jTextFieldteclado = new javax.swing.JTextField();
        jTextFielddusco = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabelerrror = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("Modificar Perifericos");

        jLabel2.setText("Asiento");

        jLabel3.setText("Monitor1");

        jLabel4.setText("Teclado");

        jLabel5.setText("Monitor2");

        jLabel6.setText("Raton");

        jLabel7.setText("Disco portatil");

        jButton1.setText("Volver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Modificar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
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
                        .addGap(303, 303, 303)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(235, 235, 235)
                        .addComponent(jButton1)
                        .addGap(85, 85, 85)
                        .addComponent(jButton2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 604, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel2))
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jTextFieldasiento, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(67, 67, 67)
                                    .addComponent(jLabel3)
                                    .addGap(18, 18, 18)
                                    .addComponent(jTextFieldm1ç, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5))
                                .addComponent(jLabelerrror, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextFieldraton, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldteclado, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(jLabel7)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldm2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFielddusco, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(87, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldasiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldm1ç, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jTextFieldm2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextFieldraton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldteclado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jTextFielddusco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addComponent(jLabelerrror, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        setVisible(false);
        new VentanaAcciones().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        chequearEntradas();
        int filsel;
        try{
            filsel=jTable1.getSelectedRow();
            if (filsel==-1){
                JOptionPane.showMessageDialog(null, "Debes seleccionar Periferico a Modificar.");
            }else{
                boolean b=chequearEntradas();
                if(b){
                    int sitio = Integer.parseInt(jTextFieldasiento.getText());
                    String m1 = jTextFieldm1ç.getText();
                    String m2 = jTextFieldm2.getText();
                    String raton = jTextFieldraton.getText();
                    String teclado = jTextFieldteclado.getText();
                    String disco = jTextFielddusco.getText();
                    Perifericos p = new Perifericos(sitio,m1,m2,raton,teclado,disco);
                    oper.ModificarPeriferico(p);
                    LLenarTabla();
                }
            }    
        
            
        } catch (Exception e){
            JOptionPane.showMessageDialog(null,e+ "Error al modificar el empleado");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        ObtenerDeLaTabla();
    }//GEN-LAST:event_jTable1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    public static javax.swing.JLabel jLabelerrror;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    public static javax.swing.JTextField jTextFieldasiento;
    public static javax.swing.JTextField jTextFielddusco;
    public static javax.swing.JTextField jTextFieldm1ç;
    public static javax.swing.JTextField jTextFieldm2;
    public static javax.swing.JTextField jTextFieldraton;
    public static javax.swing.JTextField jTextFieldteclado;
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

    private void ObtenerDeLaTabla() {
        int filse;
        filse = jTable1.getSelectedRow();
        jTextFieldasiento.setText((String) m.getValueAt(filse, 0));
        jTextFieldm1ç.setText((String) m.getValueAt(filse, 1));
        jTextFieldm2.setText((String) m.getValueAt(filse, 2));
        jTextFieldraton.setText((String) m.getValueAt(filse, 3));
        jTextFieldteclado.setText((String) m.getValueAt(filse, 4));
        jTextFielddusco.setText((String) m.getValueAt(filse, 5));
        
    }
    
    boolean chequearEntradas() {
        boolean b=true;
        String mensaje="";
        if (jTextFieldasiento.getText().equals("")){
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
        if (jTextFieldm1ç.getText().equals("")){
            mensaje+="El monitor 1 no se puede quedar vacio\n";
            b=false;
        }
        if (jTextFieldm2.getText().equals("")){
            mensaje+="El monitor 2 no se puede quedar vacio\n";
            b=false;
        }
        if (jTextFieldraton.getText().equals("")){
            mensaje+="El raton no se puede quedar vacio\n";
            b=false;
        }
        if (jTextFieldteclado.getText().equals("")){
            mensaje+="El teclado no se puede quedar vacio\n";
            b=false;
        }
        if (jTextFielddusco.getText().equals("")){
            mensaje+="El disco poratil no se puede quedar vacio\n";
            b=false;
        }
        if (!b){
            JOptionPane.showMessageDialog(null, mensaje);
        }
        return b;
    }
}
