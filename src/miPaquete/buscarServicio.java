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
import static miPaquete.vistaRegistrar.mostrarMensajeEmergente;

/**
 *
 * @author jaime
 */
public class buscarServicio extends javax.swing.JFrame {

    /**
     * Creates new form buscarServicio
     */
    public buscarServicio() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        correoClienteTextField2 = new javax.swing.JTextField();
        nombreClienteTextField2 = new javax.swing.JTextField();
        direccionClienteTextField2 = new javax.swing.JTextField();
        ultimaVisitaTextField2 = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jButtonAtras3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        kilometrajeTextField = new javax.swing.JTextField();
        numeroSerieTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        numeroTelefonicoTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        fechaLLegadajFormattedTextField = new javax.swing.JFormattedTextField();
        fechaEntregajFormattedTextField = new javax.swing.JFormattedTextField();
        jLabel21 = new javax.swing.JLabel();
        idServiciojTextField = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        observacionesMecanicojTextField = new javax.swing.JTextField();
        observacionesClientejTextField = new javax.swing.JTextField();
        facturaButton = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        placasTextField1 = new javax.swing.JTextField();
        costojTextField = new javax.swing.JTextField();
        nombreDelServiciojComboBox = new javax.swing.JComboBox<>();
        mecanicoAsignadojComboBox2 = new javax.swing.JComboBox<>();
        modeloComboBox = new javax.swing.JComboBox<>();
        submarcaComboBox = new javax.swing.JComboBox<>();
        colorComboBox = new javax.swing.JComboBox<>();
        marcaComboBox = new javax.swing.JComboBox<>();
        jLabel25 = new javax.swing.JLabel();
        buscarIdjTextField = new javax.swing.JTextField();
        buscarjButton = new javax.swing.JButton();
        editarjButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setMinimumSize(new java.awt.Dimension(800, 500));
        jPanel3.setPreferredSize(new java.awt.Dimension(800, 800));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel33.setText("Direccion");
        jPanel3.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 339, -1, -1));

        jLabel34.setText("Correo");
        jPanel3.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(454, 342, -1, -1));

        correoClienteTextField2.setEditable(false);
        jPanel3.add(correoClienteTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 340, 210, -1));

        nombreClienteTextField2.setEditable(false);
        jPanel3.add(nombreClienteTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(202, 298, 180, -1));

        direccionClienteTextField2.setEditable(false);
        jPanel3.add(direccionClienteTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(202, 339, 180, -1));

        ultimaVisitaTextField2.setEditable(false);
        jPanel3.add(ultimaVisitaTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(202, 386, 90, -1));

        jLabel35.setText("Color");
        jPanel3.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 95, -1, -1));

        jLabel36.setText("Kilometraje");
        jPanel3.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 161, -1, -1));

        jLabel37.setText("Numero de Serie");
        jPanel3.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 212, -1, -1));

        jLabel38.setText("Ultima Visita");
        jPanel3.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 386, -1, -1));

        jLabel39.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel39.setText("Registro Automovil");
        jPanel3.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, -1, -1));

        jLabel40.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel40.setText("Registro Dueño");
        jPanel3.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 260, -1, -1));

        jButtonAtras3.setText("Atrás");
        jButtonAtras3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtras3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonAtras3, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 712, 83, 36));

        jLabel1.setText("Modelo");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 41, -1, -1));

        jLabel4.setText("Fecha de llegada");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(538, 480, -1, -1));

        jLabel17.setText("Fecha de entrega");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(538, 519, -1, -1));

        kilometrajeTextField.setEditable(false);
        jPanel3.add(kilometrajeTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(454, 158, 110, -1));

        numeroSerieTextField.setEditable(false);
        jPanel3.add(numeroSerieTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, 250, -1));

        jLabel2.setText("Marca");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 41, -1, -1));

        jLabel3.setText("Submarca");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 95, -1, -1));

        numeroTelefonicoTextField.setEditable(false);
        jPanel3.add(numeroTelefonicoTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 300, 120, -1));

        jLabel5.setText("Placas");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 152, -1, -1));

        jLabel6.setText("Nombre del Cliente");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 298, -1, -1));

        jLabel7.setText("Numero Telefonico");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(454, 301, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Registro Servicio");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 450, -1, -1));

        jLabel18.setText("Nombre del Servicio");
        jPanel3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 480, -1, -1));

        jLabel19.setText("Costo");
        jPanel3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 525, -1, -1));

        jLabel20.setText("Mecanico Asignado");
        jPanel3.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 563, -1, -1));

        fechaLLegadajFormattedTextField.setEditable(false);
        fechaLLegadajFormattedTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));
        fechaLLegadajFormattedTextField.setToolTipText("");
        jPanel3.add(fechaLLegadajFormattedTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 477, 90, -1));

        fechaEntregajFormattedTextField.setEditable(false);
        fechaEntregajFormattedTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));
        fechaEntregajFormattedTextField.setToolTipText("");
        jPanel3.add(fechaEntregajFormattedTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 516, 90, -1));

        jLabel21.setText("Id Servicio");
        jPanel3.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(538, 557, -1, -1));

        idServiciojTextField.setEditable(false);
        jPanel3.add(idServiciojTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 554, 90, -1));

        jLabel22.setText("Observaciones del cliente:");
        jPanel3.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 599, -1, -1));

        jLabel23.setText("Observaciones del mecanico:");
        jPanel3.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(538, 599, -1, -1));

        observacionesMecanicojTextField.setEditable(false);
        jPanel3.add(observacionesMecanicojTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(538, 634, 231, 60));

        observacionesClientejTextField.setEditable(false);
        jPanel3.add(observacionesClientejTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 634, 231, 60));

        facturaButton.setText("Factura");
        facturaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                facturaButtonActionPerformed(evt);
            }
        });
        jPanel3.add(facturaButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(538, 712, 83, 36));
        jPanel3.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 40, 190, 150));

        placasTextField1.setEditable(false);
        jPanel3.add(placasTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 144, -1));

        costojTextField.setEditable(false);
        jPanel3.add(costojTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 520, 90, -1));

        jPanel3.add(nombreDelServiciojComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 480, 90, -1));

        jPanel3.add(mecanicoAsignadojComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 560, 90, -1));

        jPanel3.add(modeloComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 38, 144, -1));

        jPanel3.add(submarcaComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 92, 142, -1));

        jPanel3.add(colorComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(451, 92, 113, -1));

        jPanel3.add(marcaComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(451, 38, 113, -1));

        jScrollPane1.setViewportView(jPanel3);

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel25.setText("Id de servicio:");

        buscarIdjTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarIdjTextFieldActionPerformed(evt);
            }
        });

        buscarjButton.setText("Buscar");
        buscarjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarjButtonActionPerformed(evt);
            }
        });

        editarjButton.setText("Editar");
        editarjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarjButtonActionPerformed(evt);
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
                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buscarIdjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(buscarjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(editarjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 791, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buscarIdjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscarjButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(editarjButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAtras3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtras3ActionPerformed
        new VistaPrincipal().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonAtras3ActionPerformed

    private void buscarIdjTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarIdjTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buscarIdjTextFieldActionPerformed

    private void facturaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_facturaButtonActionPerformed
       new facturaVista().setVisible(true);
       dispose();
    }//GEN-LAST:event_facturaButtonActionPerformed

    private void editarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarjButtonActionPerformed
       kilometrajeTextField.setEditable(true);
       ultimaVisitaTextField2.setEditable(true);
       submarcaComboBox.setEditable(true);
       placasTextField1.setEditable(true);
       observacionesClientejTextField.setEditable(true);
       nombreClienteTextField2.setEditable(true);
       numeroSerieTextField.setEditable(true);
       numeroTelefonicoTextField.setEditable(true);
       correoClienteTextField2.setEditable(true);
       fechaEntregajFormattedTextField.setEditable(true);
       fechaLLegadajFormattedTextField.setEditable(true);
       modeloComboBox.setEditable(true);
       marcaComboBox.setEditable(true);
       submarcaComboBox.setEditable(true);
       colorComboBox.setEditable(true);
      
       
       
    }//GEN-LAST:event_editarjButtonActionPerformed

    
    
    
    private void buscarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarjButtonActionPerformed
        String idDeServicio = buscarIdjTextField.getText();
        if(!buscarIdjTextField.getText().equals("")){

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
       

        if (ID.equals(idDeServicio + "RM")) {
        String NOMBREDELSERVICIO = (String) st1.nextElement(); String COSTO = (String) st1.nextElement();  String MECANICOASIGNADO = (String) st1.nextElement();
        String FECHALLE = (String) st1.nextElement(); String FECHAENTR = (String) st1.nextElement(); String MODELO = (String) st1.nextElement(); 
        String MARCA = (String) st1.nextElement(); String COLOR = (String) st1.nextElement(); String SUBMARCA = (String) st1.nextElement(); 
        String PLACAS = (String) st1.nextElement(); String KILOMMETRAJE = (String) st1.nextElement(); 
        String NUMEROSERIE = (String) st1.nextElement();
        String NOMBRECLIENTE = (String) st1.nextElement(); String DIRECCION = (String) st1.nextElement(); String TELEFONO = (String) st1.nextElement(); String CORREO = (String) st1.nextElement();
        String ULTVISITA = (String) st1.nextElement(); String OBSMEC  = (String) st1.nextElement(); String OBSCLI  = (String) st1.nextElement(); 
        
        
        found = true;
        
        idServiciojTextField.setText(ID);
        nombreDelServiciojComboBox.getItemAt(WIDTH);
        costojTextField.setText(COSTO);
        mecanicoAsignadojComboBox2.getItemAt(WIDTH);
        fechaLLegadajFormattedTextField.setText(FECHALLE);
        fechaEntregajFormattedTextField.setText(FECHAENTR);
        modeloComboBox.getItemAt(WIDTH);
        marcaComboBox.getItemAt(WIDTH);
        colorComboBox.getItemAt(WIDTH);
        submarcaComboBox.getItemAt(WIDTH);
        placasTextField1.setText(PLACAS);
        kilometrajeTextField.setText(KILOMMETRAJE);
        numeroSerieTextField.setText(NUMEROSERIE);
        nombreClienteTextField2.setText(NOMBRECLIENTE);
        direccionClienteTextField2.setText(DIRECCION);
        numeroTelefonicoTextField.setText(TELEFONO);
        correoClienteTextField2.setText(CORREO);
        ultimaVisitaTextField2.setText(ULTVISITA);
        observacionesMecanicojTextField.setText(OBSMEC);
        observacionesClientejTextField.setText(OBSCLI);
        
        
        
        

        }
            }
                }
        
        if (found) {
        System.out.println("Numero Encontrado ");
        
        

        }else{
            System.out.println("Numero no Encontrado DENTRO (Unico)");
            
           
        
        
        
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



    }//GEN-LAST:event_buscarjButtonActionPerformed

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
            java.util.logging.Logger.getLogger(buscarServicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(buscarServicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(buscarServicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(buscarServicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new buscarServicio().setVisible(true);
            }
        });
    }
    
    
    
     public static int mostrarMensajeEmergente(String titulo, String mensaje){
        Object[] options = { "Aceptar", "Cancelar" };
        int resultadoDeLaPregunta = -1;
        
        if(titulo.equals("ALERTA")){
            resultadoDeLaPregunta = JOptionPane.showOptionDialog(null, "¿Estas seguro de eliminar al Alumno?", "Alerta",JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,null, options, options[0]);
           
            if(resultadoDeLaPregunta == JOptionPane.YES_OPTION){
                  
                
                return resultadoDeLaPregunta;
                
            }else{
                
                mostrarMensajeEmergente("Mensaje", "No se eliminó el usuario");
            }
        
        
        }else
            JOptionPane.showMessageDialog(null, mensaje, titulo, JOptionPane.OK_OPTION);
        return  resultadoDeLaPregunta;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField buscarIdjTextField;
    private javax.swing.JButton buscarjButton;
    private javax.swing.JComboBox<String> colorComboBox;
    private javax.swing.JTextField correoClienteTextField2;
    private javax.swing.JTextField costojTextField;
    private javax.swing.JTextField direccionClienteTextField2;
    private javax.swing.JButton editarjButton;
    private javax.swing.JButton facturaButton;
    private javax.swing.JFormattedTextField fechaEntregajFormattedTextField;
    private javax.swing.JFormattedTextField fechaLLegadajFormattedTextField;
    private javax.swing.JTextField idServiciojTextField;
    private javax.swing.JButton jButtonAtras3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField kilometrajeTextField;
    private javax.swing.JComboBox<String> marcaComboBox;
    private javax.swing.JComboBox<String> mecanicoAsignadojComboBox2;
    private javax.swing.JComboBox<String> modeloComboBox;
    private javax.swing.JTextField nombreClienteTextField2;
    private javax.swing.JComboBox<String> nombreDelServiciojComboBox;
    private javax.swing.JTextField numeroSerieTextField;
    private javax.swing.JTextField numeroTelefonicoTextField;
    private javax.swing.JTextField observacionesClientejTextField;
    private javax.swing.JTextField observacionesMecanicojTextField;
    private javax.swing.JTextField placasTextField1;
    private javax.swing.JComboBox<String> submarcaComboBox;
    private javax.swing.JTextField ultimaVisitaTextField2;
    // End of variables declaration//GEN-END:variables
}
