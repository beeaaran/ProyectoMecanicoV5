/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miPaquete;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static miPaquete.buscarServicio.mostrarMensajeEmergente;

/**
 *
 * @author jaime
 */
public class vistaRegistrar extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public vistaRegistrar() {
        initComponents();
        cargarElementosAComboBox();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        correoClienteTextField = new javax.swing.JTextField();
        nombreClienteTextField = new javax.swing.JTextField();
        direccionClienteTextField = new javax.swing.JTextField();
        ultimaVisitaTextField = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        modeloComboBox = new javax.swing.JComboBox<>();
        colorComboBox = new javax.swing.JComboBox<>();
        registrarjButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        marcaComboBox = new javax.swing.JComboBox<>();
        placasTextField = new javax.swing.JTextField();
        kilometrajeTextField = new javax.swing.JTextField();
        numeroSerieTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        submarcaComboBox = new javax.swing.JComboBox<>();
        numeroTelefonicoTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        nombreServiciojComboBox = new javax.swing.JComboBox<>();
        costojTextField = new javax.swing.JTextField();
        mecanicoAsignadojComboBox = new javax.swing.JComboBox<>();
        jLabel21 = new javax.swing.JLabel();
        idDeServiciojTextField = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        observacionesMecanicojText = new javax.swing.JTextField();
        observacionesClientejTextField = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jButtonAtras1 = new javax.swing.JButton();
        fechaEntregajTextField = new javax.swing.JTextField();
        fechaLLegadajTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(850, 450));
        setResizable(false);

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane2.setPreferredSize(new java.awt.Dimension(1819, 800));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setMinimumSize(new java.awt.Dimension(800, 500));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 800));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setText("Direccion");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 339, -1, -1));

        jLabel9.setText("Correo");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(454, 342, -1, -1));
        jPanel1.add(correoClienteTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 340, 210, -1));
        jPanel1.add(nombreClienteTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(202, 298, 180, -1));
        jPanel1.add(direccionClienteTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(202, 339, 180, -1));
        jPanel1.add(ultimaVisitaTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(202, 386, 90, -1));

        jLabel16.setText("Color");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 95, -1, -1));

        jLabel10.setText("Kilometraje");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 161, -1, -1));

        jLabel11.setText("Numero de Serie");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 212, -1, -1));

        jLabel12.setText("Ultima Visita");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 386, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("Registro Automovil");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("Registro Dueño");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 260, -1, -1));

        jPanel1.add(modeloComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 38, 144, -1));

        jPanel1.add(colorComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(451, 92, 113, -1));

        registrarjButton.setText("Registrar");
        registrarjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarjButtonActionPerformed(evt);
            }
        });
        jPanel1.add(registrarjButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 710, 83, 36));

        jLabel1.setText("Modelo");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 41, -1, -1));

        jLabel4.setText("Fecha de llegada");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(538, 480, -1, -1));

        jLabel17.setText("Fecha de entrega");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(538, 519, -1, -1));

        jPanel1.add(marcaComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(451, 38, 113, -1));
        jPanel1.add(placasTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 149, 144, -1));
        jPanel1.add(kilometrajeTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(454, 158, 110, -1));
        jPanel1.add(numeroSerieTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, 250, -1));

        jLabel2.setText("Marca");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 41, -1, -1));

        jLabel3.setText("Submarca");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 95, -1, -1));

        jPanel1.add(submarcaComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 92, 142, -1));
        jPanel1.add(numeroTelefonicoTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 300, 120, -1));

        jLabel5.setText("Placas");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 152, -1, -1));

        jLabel6.setText("Nombre del Cliente");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 298, -1, -1));

        jLabel7.setText("Numero Telefonico");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(454, 301, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Registro Servicio");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 450, -1, -1));

        jLabel18.setText("Nombre del Servicio");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 480, -1, -1));

        jLabel19.setText("Costo");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 525, -1, -1));

        jLabel20.setText("Mecanico Asignado");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 563, -1, -1));

        jPanel1.add(nombreServiciojComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 480, 90, -1));
        jPanel1.add(costojTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 520, 90, -1));

        jPanel1.add(mecanicoAsignadojComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 560, 90, -1));

        jLabel21.setText("Id Servicio");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(538, 557, -1, -1));
        jPanel1.add(idDeServiciojTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 554, 90, -1));

        jLabel22.setText("Observaciones del cliente:");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 599, -1, -1));

        jLabel23.setText("Observaciones del mecanico:");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(538, 599, -1, -1));
        jPanel1.add(observacionesMecanicojText, new org.netbeans.lib.awtextra.AbsoluteConstraints(538, 634, 231, 60));
        jPanel1.add(observacionesClientejTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 634, 231, 60));
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 40, 190, 150));

        jButtonAtras1.setText("Atrás");
        jButtonAtras1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtras1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonAtras1, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 712, 83, 36));
        jPanel1.add(fechaEntregajTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 520, 90, -1));
        jPanel1.add(fechaLLegadajTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 480, 90, -1));

        jScrollPane2.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 830, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registrarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarjButtonActionPerformed
    String placas = placasTextField.getText();
    String submarca = submarcaComboBox.getItemAt(WIDTH);
    String nombreCliente = nombreClienteTextField.getText();
    String idDeServicio = idDeServiciojTextField.getText();
    String direccion = direccionClienteTextField.getText();
    String correo = correoClienteTextField.getText();
    String ultimaVisita = ultimaVisitaTextField.getText();
    String nombreDelServicio = nombreServiciojComboBox.getItemAt(WIDTH);
    String observacionesCliente = observacionesClientejTextField.getText();
    
    String mecanicoAsignado = mecanicoAsignadojComboBox.getItemAt(WIDTH);
    String fechaLLegada = fechaLLegadajTextField.getText();
    String fechaEntrega = fechaEntregajTextField.getText();
    String modelo = (String)modeloComboBox.getSelectedItem();
    String marca = marcaComboBox.getItemAt(WIDTH);
    String color = colorComboBox.getItemAt(WIDTH);
    
    
    double costo = 0;
    String telefono = numeroTelefonicoTextField.getText();
    String kilometraje = kilometrajeTextField.getText();
    String numeroDeSerie = numeroSerieTextField.getText();
    String observacionesMecanico = observacionesMecanicojText.getText();

        try {
           
             costo = Double.parseDouble(costojTextField.getText());
                       
           
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Problema al convertir de String a int o double");
        }
        
       if(!idDeServiciojTextField.getText().equals("")&&!placasTextField.getText().equals("")
               &&!direccionClienteTextField.getText().equals("")&&!kilometrajeTextField.getText().equals("")
               &&!nombreClienteTextField.getText().equals("")&&!numeroSerieTextField.getText().equals("")
               &&!numeroTelefonicoTextField.getText().equals("")&&!correoClienteTextField.getText().equals("")
               &&!ultimaVisitaTextField.getText().equals("")&&!costojTextField.getText().equals("")
               &&!fechaEntregajTextField.getText().equals("")&&!fechaLLegadajTextField.getText().equals("")
               
               ){
          try {

        


        File file = new File ("miArchivo2.txt");
        BufferedReader reader = null;
        boolean found = false;
       

        try {
        // FileReader reads text files in the default encoding.
        FileReader fl = new FileReader(file);
        String ID = ""; 
        // Always wrap FileReader in BufferedReader.
        reader = new BufferedReader(fl);
        String text;

        while((text = reader.readLine()) != null) {

        StringTokenizer st1 = new StringTokenizer(text, "%");

        while(st1.hasMoreElements() &&! found ){
        ID = (String) st1.nextElement();
       

        if (ID.equals(idDeServicio + "R") ) {
        
        
        found = true;
        
        
        
        
        

        }
            }
                }
        
        if (found) {
        System.out.println("Numero Encontrado Dentro De (Repetido)");
        mostrarMensajeEmergente("Error", "Registro repetido");

        }else{
            System.out.println("Numero no Encontrado DENTRO (Unico)");
            
            try {
            Controlador.registrarServicio(idDeServicio, nombreDelServicio, costo, mecanicoAsignado, observacionesCliente, fechaLLegada, fechaEntrega, modelo, marca, color, submarca, placas, kilometraje, numeroDeSerie, nombreCliente, direccion, telefono, correo, ultimaVisita, observacionesMecanico);
            Scanner scan = new  Scanner(file);
            String filecontent = (idDeServicio + "R" + "%" + nombreDelServicio + "%" + costo + "%" + mecanicoAsignado + "%" + fechaLLegada + "%" + fechaEntrega + "%" + modelo + "%" +marca + "%" + color + "%" + submarca + "%" + placas + "%" + kilometraje + "%" + numeroDeSerie + "%" + nombreCliente + "%" + direccion + "%" + telefono + "%" + correo + "%" + ultimaVisita + "%" + observacionesMecanico + "%" + observacionesCliente + "%" + "\n" );
            while (scan.hasNextLine()) {
                filecontent = filecontent.concat(scan.nextLine() + "\n");
            }
        try {
            FileWriter writer = new FileWriter("miArchivo2.txt");
            writer.write(filecontent);
            writer.close();;
            
        } catch (IOException ex) {
            Logger.getLogger(vistaRegistrar.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(vistaRegistrar.class.getName()).log(Level.SEVERE, null, ex);
        }
            
           mostrarMensajeEmergente("Registro", "Registro exitoso");
            
            
        
        
        
            }
        }finally{
            try{
            if(reader!= null){

            reader.close();}

            }catch (IOException e){}
            }

            } catch (Exception e) {
            mostrarMensajeEmergente("Error", "El código debe de ser un número ");
            }

        }else{

        mostrarMensajeEmergente("Error", "No puedes tener espacios en Blanco");

        }


    }                                               

    private void buscarjButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                               
    
    }//GEN-LAST:event_registrarjButtonActionPerformed
  
    private void jButtonAtras1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtras1ActionPerformed
        new VistaPrincipal().setVisible(true);
       dispose();
    }//GEN-LAST:event_jButtonAtras1ActionPerformed
      
     public static void mostrarMensajeEmergente(String titulo, String mensaje){
    
        JOptionPane.showMessageDialog(null, mensaje, titulo, JOptionPane.OK_OPTION);
        
    }
    /**
     * @param args the command line arguments
     */
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(vistaRegistrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vistaRegistrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vistaRegistrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vistaRegistrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vistaRegistrar().setVisible(true);
            }
        });
    }
    
    private void cargarElementosAComboBox(){
    
    
    for (int i = 1995; i<2020;i++){
    modeloComboBox.addItem(Integer.toString(i));
    }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> colorComboBox;
    private javax.swing.JTextField correoClienteTextField;
    private javax.swing.JTextField costojTextField;
    private javax.swing.JTextField direccionClienteTextField;
    private javax.swing.JTextField fechaEntregajTextField;
    private javax.swing.JTextField fechaLLegadajTextField;
    private javax.swing.JTextField idDeServiciojTextField;
    private javax.swing.JButton jButtonAtras1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField kilometrajeTextField;
    private javax.swing.JComboBox<String> marcaComboBox;
    private javax.swing.JComboBox<String> mecanicoAsignadojComboBox;
    private javax.swing.JComboBox<String> modeloComboBox;
    private javax.swing.JTextField nombreClienteTextField;
    private javax.swing.JComboBox<String> nombreServiciojComboBox;
    private javax.swing.JTextField numeroSerieTextField;
    private javax.swing.JTextField numeroTelefonicoTextField;
    private javax.swing.JTextField observacionesClientejTextField;
    private javax.swing.JTextField observacionesMecanicojText;
    private javax.swing.JTextField placasTextField;
    private javax.swing.JButton registrarjButton;
    private javax.swing.JComboBox<String> submarcaComboBox;
    private javax.swing.JTextField ultimaVisitaTextField;
    // End of variables declaration//GEN-END:variables
}
