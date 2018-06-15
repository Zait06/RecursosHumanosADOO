/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursoshumanos;


import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import com.mysql.jdbc.Connection;
import java.io.File;
import java.io.FileOutputStream;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Zait
 */
public class reporteEmp extends javax.swing.JInternalFrame {

    /**
     * Creates new form reporteEmp
     */
    public reporteEmp() {
        initComponents();
    }
    
    String [][]ley= new String[50][3];
    String idE="",nomE="";
    int largo=0;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNumEmp = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        buscarBoton = new javax.swing.JButton();
        botonGenerar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        txtRuta = new javax.swing.JTextField();
        botonURL = new javax.swing.JButton();

        setBackground(new java.awt.Color(166, 208, 124));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Generar Reporte");

        txtNumEmp.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtNumEmp.setText("ej. 12345");
        txtNumEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumEmpActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel1.setText("Número de empleado:");

        buscarBoton.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        buscarBoton.setText("Buscar empleado");
        buscarBoton.setOpaque(false);
        buscarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarBotonActionPerformed(evt);
            }
        });

        botonGenerar.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        botonGenerar.setText("Generar reporte");
        botonGenerar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        botonGenerar.setOpaque(false);
        botonGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGenerarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Khmer UI", 1, 48)); // NOI18N
        jLabel2.setText("Reporte");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jTable1);

        txtRuta.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtRuta.setText("Ruta de guardado");
        txtRuta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRutaActionPerformed(evt);
            }
        });

        botonURL.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        botonURL.setText("Buscar ruta");
        botonURL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonURLActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73)
                        .addComponent(txtNumEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71)
                        .addComponent(buscarBoton, javax.swing.GroupLayout.DEFAULT_SIZE, 342, Short.MAX_VALUE)
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(txtRuta, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(83, 83, 83)
                        .addComponent(botonURL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonGenerar, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(322, 322, 322))))
            .addComponent(jScrollPane2)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, Short.MAX_VALUE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscarBoton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botonGenerar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonURL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtRuta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNumEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumEmpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumEmpActionPerformed

    private void buscarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarBotonActionPerformed
        for(int j=0;j<largo;j++)
        {ley[j][0]="";ley[j][1]="";ley[j][2]="";}
        int nuu=Integer.parseInt(txtNumEmp.getText());
        String [] cabeza={"Fecha","Hora de Entrada","Hora de Salida"};
        DefaultTableModel m=new DefaultTableModel(null,cabeza);
        try
        {
            //Creación de la conexión a la base de datos
            Connection con;
            con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/sae","root","");
            // Creación de instancia
            Statement stant=con.createStatement();
            //Ejecutar sql
            ResultSet re=stant.executeQuery("select * from REGISTROS where noEmp="+nuu+"");
            int i=0;
                while(re.next())
                {
                    String [] dat={re.getString("fechaReg"),re.getString("horEnt"),re.getString("horSal")};
                    ley[i][0]=re.getString("fechaReg");
                    ley[i][1]=re.getString("horEnt");
                    ley[i][2]=re.getString("horSal");
                    m.addRow(dat);
                    i++;
                }
            if(i>0){largo=i;
                jTable1.setModel(m);
                re=stant.executeQuery("select * from EMPLEADO where noEmp="+nuu+"");
                while(re.next())
                {nomE=re.getString("nomEmp")+" "+re.getString("appEmp")+" "+re.getString("apmEmp");}
                idE=nuu+"";}
            else{JOptionPane.showMessageDialog(this,"Empleado no existente","ERROR",JOptionPane.INFORMATION_MESSAGE);txtNumEmp.setText("");}
        }catch(Exception ex){}
    }//GEN-LAST:event_buscarBotonActionPerformed

    private void botonGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGenerarActionPerformed
        String ru=txtRuta.getText();
        String me;
        try
        {
            FileOutputStream ar=new FileOutputStream(ru+".pdf");
            Document doc=new Document();
            PdfWriter.getInstance(doc,ar);
            doc.open();
            me="Número de empleado: "+idE;
            doc.add(new Paragraph(me));
            me="Nombre de empleado: "+nomE;
            doc.add(new Paragraph(me));
            me="FECHA         HORA DE ENTRADA     HORA DE SALIDA";
            doc.add(new Paragraph(me));
            for(int i=0;i<largo;i++)
            {
                me=ley[i][0]+"     "+ley[i][1]+"         "+ley[i][2];
                doc.add(new Paragraph(me));
            }
            doc.close();
            JOptionPane.showMessageDialog(this,"Reporte generado","PDF creado",JOptionPane.INFORMATION_MESSAGE);
            this.setVisible(false);
        }catch(Exception ex){System.out.print(ex);}
    }//GEN-LAST:event_botonGenerarActionPerformed

    private void txtRutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRutaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRutaActionPerformed

    private void botonURLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonURLActionPerformed
        JFileChooser dlg=new JFileChooser();
        int op=dlg.showSaveDialog(this);
        if(op==JFileChooser.APPROVE_OPTION)
        {
            File f=dlg.getSelectedFile();
            txtRuta.setText(f.toString());
        }
    }//GEN-LAST:event_botonURLActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonGenerar;
    private javax.swing.JButton botonURL;
    private javax.swing.JButton buscarBoton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtNumEmp;
    private javax.swing.JTextField txtRuta;
    // End of variables declaration//GEN-END:variables
}
