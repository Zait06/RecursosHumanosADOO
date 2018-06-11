/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursoshumanos;

import com.mysql.jdbc.Connection;
import java.sql.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Zait
 */
public class listaEmpleados extends javax.swing.JInternalFrame {

    /**
     * Creates new form listaEmpleados
     */
    public listaEmpleados() {
        initComponents();
        verEmpleado();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 181, 181));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Empleados");

        jLabel1.setFont(new java.awt.Font("Leelawadee", 1, 48)); // NOI18N
        jLabel1.setText("Lista de Empleados");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 472, Short.MAX_VALUE)
                .addGap(78, 78, 78))
            .addComponent(jScrollPane2)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void verEmpleado()
    {
        String [] cabeza={"No. Empleado","Numero de tarjeta","Nombre","Turno"};
        DefaultTableModel m=new DefaultTableModel(null,cabeza);
        int ca=0;
        try
        {
            //Creación de la conexión a la base de datos
            Connection con;
            con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/sae","root","quetzal");
            // Creación de instancia
            Statement stant=con.createStatement();
            //Ejecutar sql
            ResultSet re=stant.executeQuery("select * from EMPLEADO");
            while(re.next())
            {
                String [] empp={re.getString("noEmp"),re.getString("idTarjeta"),re.getString("nomEmp"),re.getString("turno")};
                m.addRow(empp);
            }
            jTable1.setModel(m);
        }catch(Exception ex){}
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
