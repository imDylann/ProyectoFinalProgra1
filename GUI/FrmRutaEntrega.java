/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package GUI;

import Empleados.Empleado;
import RutasEntrega.ListaRutasEntrega;
import RutasEntrega.RutaEntrega;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JOptionPane;
import javax.swing.JTextField;



/**
 *
 * @author PC
 */
public class FrmRutaEntrega extends javax.swing.JInternalFrame {

    /**
     * Creates new form FrmRutaEntrega
     */
    private ListaRutasEntrega listR;
    public FrmRutaEntrega() {
        initComponents();
         DisableorActiveAll(false);
          listR= ListaRutasEntrega.getInstance();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        AddLbl = new javax.swing.JLabel();
        buscarLbl = new javax.swing.JLabel();
        DeleteLbl = new javax.swing.JLabel();
        ActualizarLbl = new javax.swing.JLabel();
        ListoLbl = new javax.swing.JButton();
        CancelLbl = new javax.swing.JButton();
        DeleteDestinoLbl = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        CodigoLbl = new javax.swing.JLabel();
        CodigoTxt = new javax.swing.JTextField();
        NombreLbl = new javax.swing.JLabel();
        DescripcionLbl = new javax.swing.JLabel();
        NombreTxt = new javax.swing.JTextField();
        DestinosLbl = new javax.swing.JLabel();
        agregarDestinoLbl = new javax.swing.JLabel();
        addDestinoTxt = new javax.swing.JTextField();
        DestinoBox = new javax.swing.JComboBox<>();
        DescripcionTxt = new javax.swing.JTextField();

        setPreferredSize(new java.awt.Dimension(840, 421));
        setRequestFocusEnabled(false);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        jPanel2.setBackground(new java.awt.Color(255, 51, 51));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/imagenes/icons8-ruta-24.png"))); // NOI18N
        jLabel1.setText("                                                            Administrar Ruta de Entrega");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 830, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 16, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(46, 62, 78));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Opciones");

        AddLbl.setBackground(new java.awt.Color(255, 255, 255));
        AddLbl.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        AddLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/imagenes/icons8-new-24.png"))); // NOI18N
        AddLbl.setText(" Agregar ");
        AddLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddLblMouseClicked(evt);
            }
        });

        buscarLbl.setBackground(new java.awt.Color(255, 255, 255));
        buscarLbl.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        buscarLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/imagenes/icons8-google-web-search-24.png"))); // NOI18N
        buscarLbl.setText("Buscar");
        buscarLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buscarLblMouseClicked(evt);
            }
        });

        DeleteLbl.setBackground(new java.awt.Color(255, 255, 255));
        DeleteLbl.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        DeleteLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/imagenes/icons8-cancelar-24.png"))); // NOI18N
        DeleteLbl.setText("Eliminar");
        DeleteLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteLblMouseClicked(evt);
            }
        });

        ActualizarLbl.setBackground(new java.awt.Color(255, 255, 255));
        ActualizarLbl.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        ActualizarLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/imagenes/icons8-crear-nuevo-24.png"))); // NOI18N
        ActualizarLbl.setText("Actualizar");
        ActualizarLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ActualizarLblMouseClicked(evt);
            }
        });

        ListoLbl.setBackground(new java.awt.Color(46, 62, 78));
        ListoLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/imagenes/icons8-casilla-de-verificación-marcada-24.png"))); // NOI18N
        ListoLbl.setBorderPainted(false);
        ListoLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ListoLblMouseClicked(evt);
            }
        });

        CancelLbl.setBackground(new java.awt.Color(46, 62, 78));
        CancelLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/imagenes/icons8-delete-24.png"))); // NOI18N
        CancelLbl.setBorderPainted(false);
        CancelLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CancelLblMouseClicked(evt);
            }
        });

        DeleteDestinoLbl.setBackground(new java.awt.Color(255, 255, 255));
        DeleteDestinoLbl.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        DeleteDestinoLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/imagenes/icons8-cancelar-24.png"))); // NOI18N
        DeleteDestinoLbl.setText("Borrar Destino");
        DeleteDestinoLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteDestinoLblMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(buscarLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(DeleteLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ActualizarLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(AddLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(ListoLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CancelLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(DeleteDestinoLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AddLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buscarLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(DeleteLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ActualizarLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(DeleteDestinoLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 130, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ListoLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CancelLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 715, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        CodigoLbl.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        CodigoLbl.setForeground(new java.awt.Color(255, 255, 255));
        CodigoLbl.setText("Codigo:");

        CodigoTxt.setBackground(new java.awt.Color(204, 204, 204));
        CodigoTxt.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        CodigoTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CodigoTxtActionPerformed(evt);
            }
        });

        NombreLbl.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        NombreLbl.setForeground(new java.awt.Color(255, 255, 255));
        NombreLbl.setText("Nombre:");

        DescripcionLbl.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        DescripcionLbl.setForeground(new java.awt.Color(255, 255, 255));
        DescripcionLbl.setText("Descripcion:");

        NombreTxt.setBackground(new java.awt.Color(204, 204, 204));
        NombreTxt.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        NombreTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreTxtActionPerformed(evt);
            }
        });

        DestinosLbl.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        DestinosLbl.setForeground(new java.awt.Color(255, 255, 255));
        DestinosLbl.setText("Destinos:");

        agregarDestinoLbl.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        agregarDestinoLbl.setForeground(new java.awt.Color(255, 255, 255));
        agregarDestinoLbl.setText("Agregar Destino:");

        addDestinoTxt.setBackground(new java.awt.Color(204, 204, 204));
        addDestinoTxt.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        addDestinoTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDestinoTxtActionPerformed(evt);
            }
        });

        DestinoBox.setBackground(new java.awt.Color(204, 204, 204));
        DestinoBox.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        DestinoBox.setForeground(new java.awt.Color(51, 51, 51));

        DescripcionTxt.setBackground(new java.awt.Color(204, 204, 204));
        DescripcionTxt.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        DescripcionTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DescripcionTxtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(CodigoLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(DestinosLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(CodigoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(85, 85, 85)
                        .addComponent(DestinoBox, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(NombreLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(144, 144, 144)
                        .addComponent(agregarDestinoLbl))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NombreTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DescripcionLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(85, 85, 85)
                        .addComponent(addDestinoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(DescripcionTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CodigoLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DestinosLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CodigoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DestinoBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NombreLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(agregarDestinoLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(2, 2, 2)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(NombreTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(DescripcionLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(addDestinoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(6, 6, 6)
                        .addComponent(DescripcionTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CodigoTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CodigoTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CodigoTxtActionPerformed

    private void NombreTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreTxtActionPerformed

    private void addDestinoTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addDestinoTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addDestinoTxtActionPerformed

    private void AddLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddLblMouseClicked
        DisableorActiveAll(true);
        DestinosLbl.setEnabled(false);
        DestinosLbl.setVisible(false);
         DestinoBox.setEnabled(false);
        DestinoBox.setVisible(false);
    }//GEN-LAST:event_AddLblMouseClicked

    private void buscarLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarLblMouseClicked
       DisableorActiveAll(false);
       CodigoLbl.setText("Ingrese Codigo para buscar:");
       this.CodigoLbl.setEnabled(true);
         this.CodigoLbl.setVisible(true);
         CodigoTxt.setEnabled(true);
           this.CodigoTxt.setText("");
        this.CodigoTxt.setVisible(true);
    }//GEN-LAST:event_buscarLblMouseClicked

    private void DeleteLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteLblMouseClicked
     clearTxt();
        DisableorActiveAll(false);
        this.DestinoBox.setEnabled(false);
        this.DestinoBox.setVisible(false);
       CodigoLbl.setText("Ingrese Codigo para eliminar:");
       this.CodigoLbl.setEnabled(true);
         this.CodigoLbl.setVisible(true);
         CodigoTxt.setEnabled(true);
           this.CodigoTxt.setText("");
        this.CodigoTxt.setVisible(true);
    }//GEN-LAST:event_DeleteLblMouseClicked

    private void ActualizarLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ActualizarLblMouseClicked
       clearTxt();
               DisableorActiveAll(false);
        this.CodigoLbl.setEnabled(true);
        this.CodigoLbl.setVisible(true);
         this.CodigoTxt.setEnabled(true);
        this.CodigoTxt.setVisible(true);
        this.agregarDestinoLbl.setEnabled(true);
        this.agregarDestinoLbl.setVisible(true);
           this.addDestinoTxt.setEnabled(true);
        this.addDestinoTxt.setVisible(true);
        this.NombreLbl.setText("Descripcion:");
         this.NombreLbl.setEnabled(true);
        this.NombreLbl.setVisible(true);
                this.NombreTxt.setEnabled(true);
        this.NombreTxt.setVisible(true);
               
    }//GEN-LAST:event_ActualizarLblMouseClicked

    private void DeleteDestinoLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteDestinoLblMouseClicked
       clearTxt();
               DisableorActiveAll(false);
                   this.CodigoLbl.setVisible(true);
                   this.CodigoLbl.setEnabled(true);
         CodigoTxt.setEnabled(true);
           this.CodigoTxt.setText("");
        this.CodigoTxt.setVisible(true);
                this.DestinosLbl.setText("Seleccione el destino a borrar:");
                 this.DestinosLbl.setEnabled(true);
         this.DestinosLbl.setVisible(true);
                this.DestinoBox.setEnabled(true);
         this.DestinoBox.setVisible(true);
    }//GEN-LAST:event_DeleteDestinoLblMouseClicked

    private void CancelLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CancelLblMouseClicked
DisableorActiveAll(false);
        clearTxt();    }//GEN-LAST:event_CancelLblMouseClicked

    private void ListoLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListoLblMouseClicked
         if(!this.CodigoTxt.getText().isEmpty()&&!this.NombreTxt.getText().isEmpty()&&!this.DescripcionTxt.getText().isEmpty()){
           
            
            RutaEntrega emp = new RutaEntrega(this.CodigoTxt.getText(),
           this.NombreTxt.getText(),this.DescripcionTxt.getText());
            listR.agregarRuta(emp);
             System.out.println( emp.getDescripcion());
            emp.agregarDestino(addDestinoTxt.getText());
            DestinoBox.addItem(addDestinoTxt.getText());
               clearTxt();
                DisableorActiveAll(false);
             
        }else if(this.NombreLbl.getText().equals("Descripcion:")){
               if(!NombreTxt.getText().equals("")){
               listR.buscarRuta(this.CodigoTxt.getText()).setDescripcion(this.NombreTxt.getText());
               }
               if(!addDestinoTxt.getText().equals("")){
              listR.buscarRuta(this.CodigoTxt.getText()).agregarDestino(addDestinoTxt.getText());
                DestinoBox.addItem(addDestinoTxt.getText());
               }
                DisableorActiveAll(false);
                clearTxt();
                
        }else if(this.CodigoLbl.getText().equals("Ingrese Codigo para buscar:")){
           
            if(listR.buscarRuta(this.CodigoTxt.getText())!=null){
            RutaEntrega emp = listR.buscarRuta(this.CodigoTxt.getText());
            actualizarComboBox(emp.getDestinos());
            this.CodigoTxt.setText(emp.getCodigo());
            this.NombreTxt.setText(emp.getNombre());
            this.DescripcionTxt.setText(emp.getDescripcion());
            DisableorActiveAll(true);
            agregarDestinoLbl.setEnabled(false);
            agregarDestinoLbl.setVisible(false);
            addDestinoTxt.setEnabled(false);
            addDestinoTxt.setVisible(false);          
            
}else{
                  JOptionPane.showMessageDialog(null, "Codigo correcto o inexistente intente ", "informacion incorrecta", JOptionPane.WARNING_MESSAGE); 
              }
          
        }else if(this.CodigoLbl.getText().equals("Ingrese Codigo para eliminar:")){
          
            if(listR.buscarRuta(this.CodigoTxt.getText())!=null){
            listR.eliminarRuta(this.CodigoTxt.getText());
            }else{
                JOptionPane.showMessageDialog(null, "La ruta no existe", "informacion incorrecta", JOptionPane.WARNING_MESSAGE); 
            }
        }else{
               if(listR.buscarRuta(this.CodigoTxt.getText())!=null){
                   listR.buscarRuta(this.CodigoTxt.getText()).borrarDestinoString(String.valueOf(DestinoBox.getSelectedItem()));
                    }else{
                    JOptionPane.showMessageDialog(null, "La ruta no existe", "informacion incorrecta", JOptionPane.WARNING_MESSAGE); 
               }
        }
    }//GEN-LAST:event_ListoLblMouseClicked

    private void DescripcionTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DescripcionTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DescripcionTxtActionPerformed

public void DisableorActiveAll(boolean x){
    this.CodigoLbl.setText("Codigo:");
    this.NombreLbl.setText("Nombre:");
    this.CodigoLbl.setEnabled(x);
    this.CodigoLbl.setVisible(x);
    this.CodigoTxt.setEnabled(x);
    this.CodigoTxt.setVisible(x);
    this.NombreLbl.setEnabled(x);
    this.NombreLbl.setVisible(x);
    this.NombreTxt.setEnabled(x);
    this.NombreTxt.setVisible(x);
    this.DescripcionLbl.setEnabled(x);
    this.DescripcionLbl.setVisible(x);
    this.DescripcionTxt.setEnabled(x);
    this.DescripcionTxt.setVisible(x);
     this.DestinosLbl.setEnabled(x);
    this.DestinosLbl.setVisible(x);
    this.DestinoBox.setEnabled(x);
    this.DestinoBox.setVisible(x);
    this.agregarDestinoLbl.setEnabled(x);
    this.agregarDestinoLbl.setVisible(x);
    this.addDestinoTxt.setEnabled(x);
    this.addDestinoTxt.setVisible(x);
    DestinosLbl.setEnabled(x);
    DestinosLbl.setVisible(x);
  
}
 public void actualizarComboBox(Set<String> destinos) {
        // Limpiar el combo box
        this.DestinoBox.removeAllItems();

        // Recorrer la lista de destinos y agregarlos al combo box
        for (String destino : destinos) {
            DestinoBox.addItem(destino);
        }
    }
public void clearTxt(){
    CodigoTxt.setText("");
    NombreTxt.setText("");
    DescripcionTxt.setText("");
    addDestinoTxt.setText("");
   
   
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ActualizarLbl;
    private javax.swing.JLabel AddLbl;
    private javax.swing.JButton CancelLbl;
    private javax.swing.JLabel CodigoLbl;
    private javax.swing.JTextField CodigoTxt;
    private javax.swing.JLabel DeleteDestinoLbl;
    private javax.swing.JLabel DeleteLbl;
    private javax.swing.JLabel DescripcionLbl;
    private javax.swing.JTextField DescripcionTxt;
    private javax.swing.JComboBox<String> DestinoBox;
    private javax.swing.JLabel DestinosLbl;
    private javax.swing.JButton ListoLbl;
    private javax.swing.JLabel NombreLbl;
    private javax.swing.JTextField NombreTxt;
    private javax.swing.JTextField addDestinoTxt;
    private javax.swing.JLabel agregarDestinoLbl;
    private javax.swing.JLabel buscarLbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    // End of variables declaration//GEN-END:variables
}
