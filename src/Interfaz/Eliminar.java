/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaz;

/**
 *
 * @author Nicolle
 */
public class Eliminar extends javax.swing.JFrame {

    /**
     * Creates new form Eliminar
     */
    public Eliminar() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        ElimCedula = new javax.swing.JTextField();
        ElimNombres = new javax.swing.JTextField();
        ElimApellidos = new javax.swing.JTextField();
        ElimCelular = new javax.swing.JTextField();
        ElimGenero = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        ElimDepto = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        ElimDireccion = new javax.swing.JTextField();
        ElimTelFijo = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        ElimEmail = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        ElimSalBase = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        ElimHED = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        ElimHEN = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        ElimValorHED = new javax.swing.JTextField();
        ElimValorHEN = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        ElimSubTras = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        ElimSalFinal = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        ElimPension = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        ElimSalud = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        ElimTotalApo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        ElimLimpiar = new javax.swing.JButton();
        ElimMenú = new javax.swing.JButton();
        ElimGuardar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(1034, 577));
        jPanel1.setPreferredSize(new java.awt.Dimension(1034, 577));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Palatino Linotype", 2, 36)); // NOI18N
        jLabel1.setText("Eliminar Empleado");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, 310, 60));

        jLabel2.setFont(new java.awt.Font("Segoe UI Symbol", 2, 14)); // NOI18N
        jLabel2.setText("Cedula:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 60, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Symbol", 2, 14)); // NOI18N
        jLabel3.setText("Nombres:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 70, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI Symbol", 2, 14)); // NOI18N
        jLabel4.setText("Apellidos:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 70, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI Symbol", 2, 14)); // NOI18N
        jLabel5.setText("Celular:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 50, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI Symbol", 2, 14)); // NOI18N
        jLabel6.setText("Genero:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 60, -1));
        jPanel1.add(ElimCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 100, -1));

        ElimNombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ElimNombresActionPerformed(evt);
            }
        });
        jPanel1.add(ElimNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 100, -1));
        jPanel1.add(ElimApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 100, -1));
        jPanel1.add(ElimCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 100, -1));

        ElimGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ElimGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ElimGeneroActionPerformed(evt);
            }
        });
        jPanel1.add(ElimGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 100, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI Symbol", 2, 14)); // NOI18N
        jLabel7.setText("Departamento:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 80, 100, -1));

        ElimDepto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ElimDepto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ElimDeptoActionPerformed(evt);
            }
        });
        jPanel1.add(ElimDepto, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 80, 100, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI Symbol", 2, 14)); // NOI18N
        jLabel8.setText("Dirección:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 160, 80, -1));
        jPanel1.add(ElimDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 160, 110, -1));
        jPanel1.add(ElimTelFijo, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 190, 110, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI Symbol", 2, 14)); // NOI18N
        jLabel9.setText("Teléfono Fijo:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 190, 80, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI Symbol", 2, 14)); // NOI18N
        jLabel10.setText("E-mail:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 220, 80, -1));
        jPanel1.add(ElimEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 220, 110, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI Symbol", 2, 14)); // NOI18N
        jLabel11.setText("Saliro Base:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 240, 80, -1));
        jPanel1.add(ElimSalBase, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 240, 110, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI Symbol", 2, 14)); // NOI18N
        jLabel12.setText("Horas extras D:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, 100, -1));
        jPanel1.add(ElimHED, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, 110, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI Symbol", 2, 14)); // NOI18N
        jLabel13.setText("Horas extras N:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, 100, -1));
        jPanel1.add(ElimHEN, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, 110, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI Symbol", 2, 14)); // NOI18N
        jLabel14.setText("Valor H.E.D:");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 290, 100, -1));
        jPanel1.add(ElimValorHED, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 290, 110, -1));
        jPanel1.add(ElimValorHEN, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 320, 110, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI Symbol", 3, 14)); // NOI18N
        jLabel15.setText("Aportes");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 360, 100, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI Symbol", 2, 14)); // NOI18N
        jLabel16.setText(" Subsidio de trasnporte:");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 160, -1));
        jPanel1.add(ElimSubTras, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 340, 110, -1));

        jLabel17.setFont(new java.awt.Font("Segoe UI Symbol", 2, 14)); // NOI18N
        jLabel17.setText("Saliro Final:");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 360, 80, -1));
        jPanel1.add(ElimSalFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 360, 110, -1));

        jLabel18.setFont(new java.awt.Font("Segoe UI Symbol", 2, 14)); // NOI18N
        jLabel18.setText("Valor H.E.N:");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 320, 100, -1));
        jPanel1.add(ElimPension, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 390, 110, -1));

        jLabel19.setFont(new java.awt.Font("Segoe UI Symbol", 2, 14)); // NOI18N
        jLabel19.setText("Pensión:");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 390, 100, -1));

        jLabel20.setFont(new java.awt.Font("Segoe UI Symbol", 2, 14)); // NOI18N
        jLabel20.setText("Salud:");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 420, 100, -1));
        jPanel1.add(ElimSalud, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 420, 110, -1));

        jLabel21.setFont(new java.awt.Font("Segoe UI Symbol", 2, 14)); // NOI18N
        jLabel21.setText("Total Aportes:");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 450, 100, -1));
        jPanel1.add(ElimTotalApo, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 450, 110, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Cedula", "Nombre", "Apellido", "Celular", "Genero", "Dep/to", "Direccion", "Telefono Fijo", "E-mail", "Salario Base", "Aportes", "Salario Final"
            }
        ));
        jTable1.setShowGrid(true);
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 500, 960, 120));

        ElimLimpiar.setFont(new java.awt.Font("Segoe UI Symbol", 2, 18)); // NOI18N
        ElimLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/limpiar.png"))); // NOI18N
        ElimLimpiar.setText("Limpiar");
        ElimLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ElimLimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(ElimLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 650, 141, -1));

        ElimMenú.setFont(new java.awt.Font("Segoe UI Symbol", 2, 18)); // NOI18N
        ElimMenú.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/casa.png"))); // NOI18N
        ElimMenú.setText("Menú principal");
        ElimMenú.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ElimMenúActionPerformed(evt);
            }
        });
        jPanel1.add(ElimMenú, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 650, 190, -1));

        ElimGuardar.setFont(new java.awt.Font("Segoe UI Symbol", 2, 18)); // NOI18N
        ElimGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/disquete.png"))); // NOI18N
        ElimGuardar.setText("Guardar");
        ElimGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ElimGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(ElimGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 650, 141, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 980, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 980, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 709, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 709, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ElimNombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ElimNombresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ElimNombresActionPerformed

    private void ElimGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ElimGeneroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ElimGeneroActionPerformed

    private void ElimDeptoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ElimDeptoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ElimDeptoActionPerformed

    private void ElimLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ElimLimpiarActionPerformed
        Ingresar v= new Ingresar();
        v.setVisible(true);
        v.setSize(1034,577);
        this.setVisible(false);
        this.setLocationRelativeTo(null);
    }//GEN-LAST:event_ElimLimpiarActionPerformed

    private void ElimMenúActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ElimMenúActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ElimMenúActionPerformed

    private void ElimGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ElimGuardarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ElimGuardarActionPerformed

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
            java.util.logging.Logger.getLogger(Eliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Eliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Eliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Eliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Eliminar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ElimApellidos;
    private javax.swing.JTextField ElimCedula;
    private javax.swing.JTextField ElimCelular;
    private javax.swing.JComboBox<String> ElimDepto;
    private javax.swing.JTextField ElimDireccion;
    private javax.swing.JTextField ElimEmail;
    private javax.swing.JComboBox<String> ElimGenero;
    private javax.swing.JButton ElimGuardar;
    private javax.swing.JTextField ElimHED;
    private javax.swing.JTextField ElimHEN;
    private javax.swing.JButton ElimLimpiar;
    private javax.swing.JButton ElimMenú;
    private javax.swing.JTextField ElimNombres;
    private javax.swing.JTextField ElimPension;
    private javax.swing.JTextField ElimSalBase;
    private javax.swing.JTextField ElimSalFinal;
    private javax.swing.JTextField ElimSalud;
    private javax.swing.JTextField ElimSubTras;
    private javax.swing.JTextField ElimTelFijo;
    private javax.swing.JTextField ElimTotalApo;
    private javax.swing.JTextField ElimValorHED;
    private javax.swing.JTextField ElimValorHEN;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
