/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursoshumanos;

import javax.swing.JOptionPane;
import java.sql.*;
import com.mysql.jdbc.Connection;
import java.util.Random;
import java.util.Calendar;
import java.util.LinkedList;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Zait
 */

public class agregarEmpleado extends javax.swing.JInternalFrame {

    /**
     * Creates new form agregarEmpleado
     */
    
    public agregarEmpleado() {
        initComponents();
        TarjetaDisponible();
        int i=aleatorio();
        txtNumEmp.setText(""+i);
    }
    
    public int aleatorio()
    {
        Random rad=new Random();
        int i=9999+rad.nextInt(10000);
        return i;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sexo = new javax.swing.ButtonGroup();
        turno = new javax.swing.ButtonGroup();
        tipoEmp = new javax.swing.ButtonGroup();
        txtAp = new javax.swing.JTextField();
        txtAm = new javax.swing.JTextField();
        txtNom = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        radioMas = new javax.swing.JRadioButton();
        radioFem = new javax.swing.JRadioButton();
        txtNumEmp = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        radioMat = new javax.swing.JRadioButton();
        radioVes = new javax.swing.JRadioButton();
        radioMix = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jfeNac = new com.toedter.calendar.JDateChooser();
        addBoton = new javax.swing.JButton();
        cancelBoton = new javax.swing.JButton();
        radGeneral = new javax.swing.JRadioButton();
        radRecur = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtNumTajeta = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setBackground(new java.awt.Color(136, 200, 246));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Nuevo empleado");
        setToolTipText("");
        setName(""); // NOI18N
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtAp.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtAp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApActionPerformed(evt);
            }
        });
        getContentPane().add(txtAp, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, 106, -1));

        txtAm.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(txtAm, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, 106, -1));

        txtNom.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(txtNom, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, 106, -1));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel1.setText("Apellido paterno");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, -1, -1));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel2.setText("Apellido materno");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, -1, -1));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel3.setText("Nombre(s)");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, -1, -1));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel4.setText("Sexo");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, -1, -1));

        sexo.add(radioMas);
        radioMas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        radioMas.setText("Masculino");
        radioMas.setOpaque(false);
        radioMas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioMasActionPerformed(evt);
            }
        });
        getContentPane().add(radioMas, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, -1, -1));

        sexo.add(radioFem);
        radioFem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        radioFem.setText("Femenino");
        radioFem.setOpaque(false);
        getContentPane().add(radioFem, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 230, -1, -1));

        txtNumEmp.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtNumEmp.setText("00000");
        txtNumEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumEmpActionPerformed(evt);
            }
        });
        getContentPane().add(txtNumEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, 106, -1));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel5.setText("Número de empleado");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, -1, -1));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel6.setText("Turno");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 320, -1, -1));

        turno.add(radioMat);
        radioMat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        radioMat.setText("Matutino");
        radioMat.setOpaque(false);
        radioMat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioMatActionPerformed(evt);
            }
        });
        getContentPane().add(radioMat, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 320, -1, -1));

        turno.add(radioVes);
        radioVes.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        radioVes.setText("Vespertino");
        radioVes.setOpaque(false);
        getContentPane().add(radioVes, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 320, -1, -1));

        turno.add(radioMix);
        radioMix.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        radioMix.setText("Mixto");
        radioMix.setOpaque(false);
        getContentPane().add(radioMix, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 320, -1, -1));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel7.setText("Fecha de nacimiento");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, -1, -1));
        getContentPane().add(jfeNac, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 270, 161, -1));

        addBoton.setBackground(new java.awt.Color(255, 255, 255));
        addBoton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        addBoton.setText("Agregar");
        addBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBotonActionPerformed(evt);
            }
        });
        getContentPane().add(addBoton, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 420, -1, -1));

        cancelBoton.setBackground(new java.awt.Color(255, 255, 255));
        cancelBoton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cancelBoton.setText("Cancelar");
        cancelBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBotonActionPerformed(evt);
            }
        });
        getContentPane().add(cancelBoton, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 420, -1, -1));

        tipoEmp.add(radGeneral);
        radGeneral.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        radGeneral.setText("General");
        radGeneral.setOpaque(false);
        getContentPane().add(radGeneral, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 360, -1, -1));

        tipoEmp.add(radRecur);
        radRecur.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        radRecur.setText("Recursos Humanos");
        radRecur.setOpaque(false);
        getContentPane().add(radRecur, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 360, -1, -1));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel8.setText("Tipo de Empleado");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 360, -1, -1));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel9.setText("Número de tarjeta");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, -1, 20));

        txtNumTajeta.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtNumTajeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumTajetaActionPerformed(evt);
            }
        });
        getContentPane().add(txtNumTajeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, 110, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 50, 180, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtApActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApActionPerformed

    private void radioMasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioMasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioMasActionPerformed

    private void txtNumEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumEmpActionPerformed
        //Se hace un random para tener el número de empleado
    }//GEN-LAST:event_txtNumEmpActionPerformed

    private void radioMatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioMatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioMatActionPerformed

    public String seleSexo()
    {
        String sex="";
        if(radioFem.isSelected()){sex="Femenino";}
        else if(radioMas.isSelected()){sex="Masculino";}
        else{JOptionPane.showMessageDialog(this,"No selecciono una sexualidad","ERROR",JOptionPane.WARNING_MESSAGE);}
        return sex;
    }
    
    public String seleTurno()
    {
        String turno="";
        if(radioMat.isSelected()){turno="Matutino";}
        else if(radioMix.isSelected()){turno="Mixto";}
        else if(radioVes.isSelected()){turno="Vespertino";}
        else{JOptionPane.showMessageDialog(this,"No selecciono un turno de trabajo","ERROR",JOptionPane.WARNING_MESSAGE);}
        return turno;
    }
    
    public boolean seleEmp()
    {
        boolean emp=false;
        if(radGeneral.isSelected()){emp=false;}
        else if (radRecur.isSelected()){emp=true;}
        else{JOptionPane.showMessageDialog(this,"No selecciono un tipo de trabajador","ERROR",JOptionPane.WARNING_MESSAGE);}
        return emp;
    }
    
    public String fechaNacimiento()
    {
        String f="",d,m,a;
        d=Integer.toString(jfeNac.getCalendar().get(Calendar.DAY_OF_MONTH));
        m=Integer.toString(jfeNac.getCalendar().get(Calendar.MONTH)+1);
        a=Integer.toString(jfeNac.getCalendar().get(Calendar.YEAR));
        f=a+"-"+m+"-"+d;
        return f;
    }
    
    public void TarjetaDisponible()
    {
        String [] cabeza={"Tarjeta Disponible"};
        DefaultTableModel m=new DefaultTableModel(null,cabeza);
        int ca=0,i=0;
        LinkedList ppp=new LinkedList();
        boolean hu;
        try
        {
            String []yoyo=new String[50];
            //Creación de la conexión a la base de datos
            Connection con;
            con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/sae","root","");
            // Creación de instancia
            Statement stant=con.createStatement();
            //Ejecutar sql
            ResultSet re=stant.executeQuery("select * from EMPLEADO");
            while(re.next())
            {yoyo[i]=re.getString("idTarjeta");ppp.add(re.getString("idTarjeta"));i++;}
            //{empp.add(re.getString("idTarjeta"));}
            re=stant.executeQuery("select * from Tarjeta_NFC");
            String []mos=new String[2];
            while(re.next())
            {
                hu=true;
                for(i=0;i<ppp.size();i++)
                {
                    if(yoyo[i].equals(re.getString("idTarjeta"))){hu=false;break;}
                    //if(empp.get(i).equals(re.getString("idTarjeta"))){hu=false;break;}
                }
                if(hu){mos[0]=re.getString("idTarjeta");m.addRow(mos);}
            }
            jTable1.setModel(m);
        }catch(Exception ex){}
    }
    
    private void addBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBotonActionPerformed
        String nom=txtNom.getText(),app=txtAp.getText(),apm=txtAm.getText();
        String numEmp=txtNumEmp.getText();
        int numTar=Integer.parseInt(txtNumTajeta.getText());
        boolean emp=seleEmp();
        String sex=seleSexo(),turno=seleTurno();
        String instruc="",instruc1="";
        String feNac=fechaNacimiento();
        boolean seg=false;
        try
        {
            Connection con;
            con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/sae","root","");
            // Creación de instancia
            Statement stant=con.createStatement();
            //Ejecutar sql
            ResultSet resul=stant.executeQuery("select * from EMPLEADO");
            while(resul.next())
            {if(resul.getString("noEmp").equals(numEmp) || resul.getString("idTarjeta").equals(""+numTar)){seg=true;break;}}
            if(seg)
            {
                int nuNum=aleatorio();
                JOptionPane.showMessageDialog(this,"Número de empleado existente, el nuevmo número es: "+nuNum,"ERROR",JOptionPane.WARNING_MESSAGE);
                txtNumEmp.setText(""+nuNum);
            }
            int numEmp1=Integer.parseInt(txtNumEmp.getText());
            instruc="insert into EMPLEADO values("+numEmp1+",'"+app+"','"+apm+"','"+nom+"','"+sex+"','"+feNac+"','"+turno+"',"+numTar+")";
            if(emp)
            {
                String us="",pass="";
                //Solicita nombre y usuario al empleado si es de recursos humanos
                JOptionPane.showMessageDialog(this,"Por ser empleado de recursos humanos, es necesario un usuario y una contraseña",null,JOptionPane.INFORMATION_MESSAGE);
                us=JOptionPane.showInputDialog(null,"Introduzca el nombre de usuario con el que ingresará");
                pass=JOptionPane.showInputDialog(null,"Introduzca una contraseña");
                instruc1="insert into RECURSOS_HUMANOS values("+numEmp1+",'"+us+"','"+pass+"')";
            }
            else{instruc1="insert into GENERAL values("+numEmp1+")";}
            stant.executeUpdate(instruc);
            stant.executeUpdate(instruc1);
            JOptionPane.showMessageDialog(this,"Nuevo empleado registrado","REALIZADO",JOptionPane.INFORMATION_MESSAGE);
            this.setVisible(false);
        }
        catch(Exception ex){JOptionPane.showMessageDialog(this,"Error al intentar agregar","ERROR",JOptionPane.WARNING_MESSAGE);};
    }//GEN-LAST:event_addBotonActionPerformed

    private void cancelBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBotonActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_cancelBotonActionPerformed

    private void txtNumTajetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumTajetaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumTajetaActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBoton;
    private javax.swing.JButton cancelBoton;
    private javax.swing.JLabel jLabel1;
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
    private com.toedter.calendar.JDateChooser jfeNac;
    private javax.swing.JRadioButton radGeneral;
    private javax.swing.JRadioButton radRecur;
    private javax.swing.JRadioButton radioFem;
    private javax.swing.JRadioButton radioMas;
    private javax.swing.JRadioButton radioMat;
    private javax.swing.JRadioButton radioMix;
    private javax.swing.JRadioButton radioVes;
    private javax.swing.ButtonGroup sexo;
    private javax.swing.ButtonGroup tipoEmp;
    private javax.swing.ButtonGroup turno;
    private javax.swing.JTextField txtAm;
    private javax.swing.JTextField txtAp;
    private javax.swing.JTextField txtNom;
    private javax.swing.JTextField txtNumEmp;
    private javax.swing.JTextField txtNumTajeta;
    // End of variables declaration//GEN-END:variables

    private void setExtendedState(int MAXIMIZED_BOTH) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
