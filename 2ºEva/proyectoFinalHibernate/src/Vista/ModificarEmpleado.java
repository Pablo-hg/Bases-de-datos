
package Vista;

import Controlador.Operaciones;
import Modelo.Empleados;
import java.util.Date;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author pablo
 */
public class ModificarEmpleado extends javax.swing.JFrame {

    
    public ModificarEmpleado() {
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

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

        jLabel1.setText("Usuario:");

        jLabel3.setText("Apellidos:");

        jTextFieldnewdept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldnewdeptActionPerformed(evt);
            }
        });

        jLabel4.setText("Departamento:");

        jLabel5.setText("Asiento:");

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
                .addGap(135, 135, 135)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(105, 105, 105)
                                .addComponent(jButtonmodificar))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel5))
                                    .addGap(52, 52, 52)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextFieldasiento, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jTextFieldnewNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(0, 0, Short.MAX_VALUE))))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(33, 33, 33)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jTextFieldnewApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextFieldnewdept, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(85, 85, 85))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jLabel2)))
                .addContainerGap(167, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldasiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldnewNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldnewApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldnewdept, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonmodificar)
                    .addComponent(jButton1))
                .addGap(66, 66, 66))
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
                    String nombre = jTextFieldnewNombre.getText();
                    String apellidos = jTextFieldnewApellidos.getText();
                    String dept = jTextFieldnewdept.getText();
                    Empleados e = new Empleados(sitio,nombre,apellidos,dept);
                    oper.ModificarEmpleado(e);
                    LLenarTabla();
                }
            }    
        
            
        } catch (Exception e){
            JOptionPane.showMessageDialog(null,e+ "Error al modificar el empleado");
        }
    }//GEN-LAST:event_jButtonmodificarActionPerformed

    private void jTextFieldnewApellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldnewApellidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldnewApellidosActionPerformed

    private void jTextFieldnewNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldnewNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldnewNombreActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        
        ObtenerDeLaTabla();
    }//GEN-LAST:event_jTable1MouseClicked

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonmodificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTable jTable1;
    public static javax.swing.JTextField jTextFieldasiento;
    public static javax.swing.JTextField jTextFieldnewApellidos;
    public static javax.swing.JTextField jTextFieldnewNombre;
    public static javax.swing.JTextField jTextFieldnewdept;
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
    
    private void ObtenerDeLaTabla() {
        int filse;
        filse = jTable1.getSelectedRow();
        jTextFieldasiento.setText((String) m.getValueAt(filse, 0));
        jTextFieldnewNombre.setText((String) m.getValueAt(filse, 1));
        jTextFieldnewApellidos.setText((String) m.getValueAt(filse, 2));
        jTextFieldnewdept.setText((String) m.getValueAt(filse, 3));
    }
    
    boolean chequearEntradas() {
        boolean b=true;
        String mensaje="";
        if (jTextFieldasiento.getText().equals("")){
            mensaje+="El asiento no se puede quedar vacio\n";
            b=false;
        }
        if (jTextFieldnewNombre.getText().equals("")){
            mensaje+="El nombre no se puede quedar vacio\n";
            b=false;
        }
        if (jTextFieldnewApellidos.getText().equals("")){
            mensaje+="Los apellidos  no se pueden quedar vacios\n";
            b=false;
        }
        if (jTextFieldnewdept.getText().equals("")){
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
        if (!b){
            JOptionPane.showMessageDialog(null, mensaje);
        }
        return b;
    }
}
