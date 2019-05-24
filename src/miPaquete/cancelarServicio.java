/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miPaquete;

import static java.awt.image.ImageObserver.WIDTH;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import static miPaquete.buscarServicio.mostrarMensajeEmergente;

/**
 *
 * @author jaime
 */
public class cancelarServicio extends javax.swing.JFrame {

    /**
     * Creates new form cancelarServicio
     */
    public cancelarServicio() {
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

        jButtonAtras = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        buscarIdjTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        MarcaIdjTextField1 = new javax.swing.JTextField();
        subMarcajTextField2 = new javax.swing.JTextField();
        modelojTextField3 = new javax.swing.JTextField();
        matriculajTextField4 = new javax.swing.JTextField();
        idServiciojTextField5 = new javax.swing.JTextField();
        dueñojTextField6 = new javax.swing.JTextField();
        eliminarjButton = new javax.swing.JButton();
        buscarjButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonAtras.setText("Atrás");
        jButtonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtrasActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Marca");

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel25.setText("Id de servicio:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Submarca");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Modelo");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Id de servicio");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Matricula");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Dueño");

        MarcaIdjTextField1.setEditable(false);

        subMarcajTextField2.setEditable(false);

        modelojTextField3.setEditable(false);

        matriculajTextField4.setEditable(false);

        idServiciojTextField5.setEditable(false);

        dueñojTextField6.setEditable(false);

        eliminarjButton.setText("Eliminar");
        eliminarjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarjButtonActionPerformed(evt);
            }
        });

        buscarjButton1.setText("Buscar");
        buscarjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarjButton1ActionPerformed(evt);
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
                        .addComponent(jButtonAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(eliminarjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(idServiciojTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(dueñojTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(MarcaIdjTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(subMarcajTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(modelojTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(matriculajTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buscarIdjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(buscarjButton1)))
                        .addGap(0, 34, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buscarIdjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscarjButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MarcaIdjTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(subMarcajTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modelojTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(matriculajTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idServiciojTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dueñojTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eliminarjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtrasActionPerformed

        new VistaPrincipal().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonAtrasActionPerformed

    private void eliminarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarjButtonActionPerformed
      String idDeServicio = buscarIdjTextField.getText();
        if(!buscarIdjTextField.getText().equals("")){

       try {

        File file = new File ("miArchivo2.txt");
        File newFile = new File("tempFile.txt");
        BufferedReader reader = null;
        boolean found = false;
       

        try {
        // FileReader reads text files in the default encoding.
        FileReader fl = new FileReader(file);
        String ID = ""; 
        // Always wrap FileReader in BufferedReader.
        reader = new BufferedReader(fl);
        String text;
        FileWriter fw = new FileWriter(newFile, true);
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter pw = new PrintWriter(bw);

        while((text = reader.readLine()) != null) {

        StringTokenizer st1 = new StringTokenizer(text, "%");

        while(st1.hasMoreElements()){
        ID = (String) st1.nextElement();
        String NOMBREDELSERVICIO = (String) st1.nextElement(); String COSTO = (String) st1.nextElement();  String MECANICOASIGNADO = (String) st1.nextElement();
        String FECHALLE = (String) st1.nextElement(); String FECHAENTR = (String) st1.nextElement(); String MODELO = (String) st1.nextElement(); 
        String MARCA = (String) st1.nextElement(); String COLOR = (String) st1.nextElement(); String SUBMARCA = (String) st1.nextElement(); 
        String PLACAS = (String) st1.nextElement(); String KILOMMETRAJE = (String) st1.nextElement(); 
        String NUMEROSERIE = (String) st1.nextElement();
        String NOMBRECLIENTE = (String) st1.nextElement(); String DIRECCION = (String) st1.nextElement(); String TELEFONO = (String) st1.nextElement(); String CORREO = (String) st1.nextElement();
        String ULTVISITA = (String) st1.nextElement(); String OBSMEC  = (String) st1.nextElement(); String OBSCLI  = (String) st1.nextElement(); 
       

        if (!ID.equals(idDeServicio + "RM")) {
        pw.println(ID+ "%"+ NOMBREDELSERVICIO +"%"+ COSTO +"%"+ MECANICOASIGNADO +"%"+ 
        FECHALLE +"%"+ FECHAENTR +"%"+ MODELO +"%"+ MARCA +"%"+ COLOR +"%"+ 
        SUBMARCA +"%"+ PLACAS +"%"+ KILOMMETRAJE +"%"+ NUMEROSERIE +"%"+ NOMBRECLIENTE +"%"+ 
        DIRECCION +"%"+ TELEFONO +"%"+ CORREO +"%"+ ULTVISITA +"%"+ OBSMEC+ "%"+ 
        OBSCLI+ "%");
        }
        
       
            }
        
        
        
                }
        reader.close();
        pw.flush();
        pw.close();
        file.delete();
        File dump = new File("miArchivo2.txt");
        newFile.renameTo(dump);
        mostrarMensajeEmergente("Exito", "Registro Eliminado");
        
        
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

    }//GEN-LAST:event_eliminarjButtonActionPerformed

    private void buscarjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarjButton1ActionPerformed
         if(!buscarIdjTextField.getText().equals("")){

        try {

        String codigoBuscado = buscarIdjTextField.getText();


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
       

        if (ID.equals(codigoBuscado+"RM")) {
        String NOMBREDELSERVICIO = (String) st1.nextElement(); String COSTO = (String) st1.nextElement();  String MECANICOASIGNADO = (String) st1.nextElement();
        String FECHALLE = (String) st1.nextElement(); String FECHAENTR = (String) st1.nextElement(); String MODELO = (String) st1.nextElement(); 
        String MARCA = (String) st1.nextElement(); String COLOR = (String) st1.nextElement(); String SUBMARCA = (String) st1.nextElement(); 
        String PLACAS = (String) st1.nextElement(); String KILOMMETRAJE = (String) st1.nextElement(); 
        String NUMEROSERIE = (String) st1.nextElement();
        String NOMBRECLIENTE = (String) st1.nextElement(); String DIRECCION = (String) st1.nextElement(); String TELEFONO = (String) st1.nextElement(); String CORREO = (String) st1.nextElement();
        String ULTVISITA = (String) st1.nextElement(); String OBSMEC = ""; String OBSCLI = "";  
        found = true;
        MarcaIdjTextField1.setText(MARCA);
        subMarcajTextField2.setText(SUBMARCA);
        modelojTextField3.setText(MODELO);
        matriculajTextField4.setText(PLACAS);
        idServiciojTextField5.setText(ID);
        dueñojTextField6.setText(NOMBRECLIENTE);
        
        
        
        
        

        }
            }
                }
        
        if (found) {
            
            
            
        
        System.out.println("Numero Encontrado");

        }else{
            System.out.println("Numero no Encontrado");
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

        mostrarMensajeEmergente("Error", "Introduce un código para buscar");

        }


    }//GEN-LAST:event_buscarjButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(cancelarServicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cancelarServicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cancelarServicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cancelarServicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cancelarServicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField MarcaIdjTextField1;
    private javax.swing.JTextField buscarIdjTextField;
    private javax.swing.JButton buscarjButton1;
    private javax.swing.JTextField dueñojTextField6;
    private static javax.swing.JButton eliminarjButton;
    private javax.swing.JTextField idServiciojTextField5;
    private javax.swing.JButton jButtonAtras;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField matriculajTextField4;
    private javax.swing.JTextField modelojTextField3;
    private javax.swing.JTextField subMarcajTextField2;
    // End of variables declaration//GEN-END:variables
}
