/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package GUI;

/**
 *
 * @author Saliim
 */
public class FrmPaquetes extends javax.swing.JInternalFrame {

    /**
     * Creates new form FrmEnvios
     */
    public FrmPaquetes() {
        initComponents();
         DisableAllP();
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
        jPanel6 = new javax.swing.JPanel();
        AddLbl = new javax.swing.JLabel();
        Deletelbl = new javax.swing.JLabel();
        ActualizarLbl = new javax.swing.JLabel();
        BuscarLbl = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        CancelLbl = new javax.swing.JLabel();
        listoLbl = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        CodigoLbl = new javax.swing.JLabel();
        CedulaRLbl = new javax.swing.JLabel();
        DescripcionLbl = new javax.swing.JLabel();
        PesoLbl = new javax.swing.JLabel();
        CedulaDlbl = new javax.swing.JLabel();
        CedulaRTxt = new javax.swing.JTextField();
        CodigoTxt = new javax.swing.JFormattedTextField();
        PesoTxt = new javax.swing.JFormattedTextField();
        DescripcionTxt = new javax.swing.JTextField();
        CedulaDTxt = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(840, 421));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(46, 62, 78));

        AddLbl.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        AddLbl.setForeground(new java.awt.Color(255, 255, 255));
        AddLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/imagenes/icons8-new-24.png"))); // NOI18N
        AddLbl.setText("Agregar");

        Deletelbl.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        Deletelbl.setForeground(new java.awt.Color(255, 255, 255));
        Deletelbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/imagenes/icons8-cancelar-24.png"))); // NOI18N
        Deletelbl.setText("Eliminar");

        ActualizarLbl.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        ActualizarLbl.setForeground(new java.awt.Color(255, 255, 255));
        ActualizarLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/imagenes/icons8-crear-nuevo-24.png"))); // NOI18N
        ActualizarLbl.setText("Actualizar");

        BuscarLbl.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        BuscarLbl.setForeground(new java.awt.Color(255, 255, 255));
        BuscarLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/imagenes/icons8-google-web-search-24.png"))); // NOI18N
        BuscarLbl.setText("Buscar");

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Opciones ");

        CancelLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CancelLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/imagenes/icons8-delete-24.png"))); // NOI18N

        listoLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        listoLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/imagenes/icons8-casilla-de-verificación-marcada-24.png"))); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AddLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Deletelbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BuscarLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ActualizarLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(listoLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CancelLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(AddLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Deletelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ActualizarLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BuscarLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(listoLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CancelLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, -1, 360));

        jPanel7.setBackground(new java.awt.Color(153, 153, 153));

        jLabel9.setBackground(new java.awt.Color(204, 204, 204));
        jLabel9.setOpaque(true);

        CodigoLbl.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        CodigoLbl.setForeground(new java.awt.Color(255, 255, 255));
        CodigoLbl.setText("Codigo:");

        CedulaRLbl.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        CedulaRLbl.setForeground(new java.awt.Color(255, 255, 255));
        CedulaRLbl.setText("Cedula de Remitente:");

        DescripcionLbl.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        DescripcionLbl.setForeground(new java.awt.Color(255, 255, 255));
        DescripcionLbl.setText("Descripcion:");

        PesoLbl.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        PesoLbl.setForeground(new java.awt.Color(255, 255, 255));
        PesoLbl.setText("Peso(kg):");

        CedulaDlbl.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        CedulaDlbl.setForeground(new java.awt.Color(255, 255, 255));
        CedulaDlbl.setText("Cedula del Destinatario:");

        CedulaRTxt.setEditable(false);
        CedulaRTxt.setBackground(new java.awt.Color(204, 204, 204));
        CedulaRTxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        CedulaRTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CedulaRTxtActionPerformed(evt);
            }
        });

        CodigoTxt.setBackground(new java.awt.Color(204, 204, 204));
        CodigoTxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        PesoTxt.setBackground(new java.awt.Color(204, 204, 204));
        PesoTxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        PesoTxt.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));

        DescripcionTxt.setEditable(false);
        DescripcionTxt.setBackground(new java.awt.Color(204, 204, 204));
        DescripcionTxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        DescripcionTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DescripcionTxtActionPerformed(evt);
            }
        });

        CedulaDTxt.setEditable(false);
        CedulaDTxt.setBackground(new java.awt.Color(204, 204, 204));
        CedulaDTxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        CedulaDTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CedulaDTxtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(PesoLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DescripcionLbl, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(PesoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(DescripcionTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(CedulaDlbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CedulaDTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(CedulaRLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CedulaRTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(CodigoLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CodigoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CodigoLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CodigoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DescripcionLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DescripcionTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PesoLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PesoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CedulaRLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CedulaRTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CedulaDlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CedulaDTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 91, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, -1, 360));

        jPanel2.setBackground(new java.awt.Color(255, 153, 0));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/imagenes/icons8-paquete-24_2.png"))); // NOI18N
        jLabel1.setText("                                                            Administrar Paquetes");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 840, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CedulaRTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CedulaRTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CedulaRTxtActionPerformed

    private void DescripcionTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DescripcionTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DescripcionTxtActionPerformed

    private void CedulaDTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CedulaDTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CedulaDTxtActionPerformed

public void DisableAllP(){
    
    this.CodigoLbl.setEnabled(false);
     this.CodigoLbl.setVisible(false);
    this.CodigoTxt.setEnabled(false);
    this.CodigoTxt.setVisible(false);
    this.DescripcionLbl.setEnabled(false);
    this.DescripcionLbl.setVisible(false);
    this.DescripcionTxt.setEnabled(false);
    this.DescripcionTxt.setVisible(false);
    this.DescripcionTxt.setEnabled(false);
    this.DescripcionTxt.setVisible(false);
     this.PesoLbl.setEnabled(false);
    this.PesoLbl.setVisible(false);
    this.PesoTxt.setEnabled(false);
    this.PesoTxt.setVisible(false);
    this.CedulaRLbl.setEnabled(false);
    this.CedulaRLbl.setVisible(false);
    this.CedulaRTxt.setEnabled(false);
    this.CedulaRTxt.setVisible(false);
    this.CedulaDlbl.setEnabled(false);
    this.CedulaDlbl.setVisible(false);
     this.CedulaDTxt.setEnabled(false);
    this.CedulaDTxt.setVisible(false);
  
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ActualizarLbl;
    private javax.swing.JLabel AddLbl;
    private javax.swing.JLabel BuscarLbl;
    private javax.swing.JLabel CancelLbl;
    private javax.swing.JTextField CedulaDTxt;
    private javax.swing.JLabel CedulaDlbl;
    private javax.swing.JLabel CedulaRLbl;
    private javax.swing.JTextField CedulaRTxt;
    private javax.swing.JLabel CodigoLbl;
    private javax.swing.JFormattedTextField CodigoTxt;
    private javax.swing.JLabel Deletelbl;
    private javax.swing.JLabel DescripcionLbl;
    private javax.swing.JTextField DescripcionTxt;
    private javax.swing.JLabel PesoLbl;
    private javax.swing.JFormattedTextField PesoTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JLabel listoLbl;
    // End of variables declaration//GEN-END:variables
}
