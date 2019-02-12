package Ventana;

public class Interfaz extends javax.swing.JFrame {

    public Interfaz() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabelReal = new javax.swing.JLabel();
        jLabel2aprox = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jtxtREAL = new javax.swing.JTextField();
        jtxtAPROX = new javax.swing.JTextField();
        Calcular = new javax.swing.JButton();
        jCheckBoxRedon = new javax.swing.JCheckBox();
        jCheckBoxAprox = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtxtERR_ABSO = new javax.swing.JTextField();
        jtxtERR_REL = new javax.swing.JTextField();
        ButtonRegresar = new javax.swing.JButton();
        JLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, -1, -1));

        jLabelReal.setBackground(new java.awt.Color(255, 255, 255));
        jLabelReal.setFont(new java.awt.Font("Oswald", 0, 14)); // NOI18N
        jLabelReal.setForeground(new java.awt.Color(255, 255, 255));
        jLabelReal.setText("Valor Real:");
        getContentPane().add(jLabelReal, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, -1, -1));

        jLabel2aprox.setFont(new java.awt.Font("Oswald", 0, 14)); // NOI18N
        jLabel2aprox.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2aprox.setText("Valor aproximado:");
        getContentPane().add(jLabel2aprox, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jLabel1.setFont(new java.awt.Font("Oswald", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("INGRESAR LOS VALORES");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, -1, 20));

        jtxtREAL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtREALActionPerformed(evt);
            }
        });
        getContentPane().add(jtxtREAL, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 200, -1));
        getContentPane().add(jtxtAPROX, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 200, -1));

        Calcular.setText("Calcular");
        Calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalcularActionPerformed(evt);
            }
        });
        getContentPane().add(Calcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, -1, -1));

        jCheckBoxRedon.setFont(new java.awt.Font("Oswald", 0, 12)); // NOI18N
        jCheckBoxRedon.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBoxRedon.setText("Redondeo");
        jCheckBoxRedon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxRedonActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBoxRedon, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, -1, -1));

        jCheckBoxAprox.setFont(new java.awt.Font("Oswald", 0, 12)); // NOI18N
        jCheckBoxAprox.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBoxAprox.setText("Truncamiento");
        getContentPane().add(jCheckBoxAprox, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, -1, -1));

        jCheckBox2.setFont(new java.awt.Font("Oswald", 0, 12)); // NOI18N
        jCheckBox2.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox2.setText("Solo Resultado");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, -1, -1));

        jLabel3.setText("Error Absoluto: ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, -1, -1));

        jLabel4.setText("Error Relativo: ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, -1, -1));

        jtxtERR_ABSO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtERR_ABSOActionPerformed(evt);
            }
        });
        getContentPane().add(jtxtERR_ABSO, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 410, 240, -1));
        getContentPane().add(jtxtERR_REL, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 440, 240, -1));

        ButtonRegresar.setText("Menu Principal");
        ButtonRegresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonRegresarMouseClicked(evt);
            }
        });
        ButtonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(ButtonRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 590, -1, -1));

        JLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/verd.jpg"))); // NOI18N
        getContentPane().add(JLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-8, 0, 390, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jtxtREALActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtREALActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtREALActionPerformed

    private void jCheckBoxRedonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxRedonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxRedonActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void CalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalcularActionPerformed

        String dato1, dato2;
        float res_abs, res_apro;
        float result_abs = 0, result_apro = 0;

        dato1 = jtxtREAL.getText();
        dato2 = jtxtAPROX.getText();

        float flotante = Float.parseFloat(dato1);
        float flotante1 = Float.parseFloat(dato2);

        res_abs = flotante - flotante1;
        res_apro = res_abs / flotante;

        if (res_abs < 0) {

            res_abs = res_abs * -1;

            String totales = Float.toString(res_abs);
            String totaless = Float.toString(res_apro);

            jtxtERR_ABSO.setText(totales);
            jtxtERR_REL.setText(totaless);
        }

        if (res_apro < 0) {

            res_apro = res_apro * -1;

            String totales = Float.toString(res_abs);
            String totaless = Float.toString(res_apro);

            jtxtERR_ABSO.setText(totales);
            jtxtERR_REL.setText(totaless);

        } else {

            String totales = Float.toString(res_abs);
            String totaless = Float.toString(res_apro);

            jtxtERR_ABSO.setText(totales);
            jtxtERR_REL.setText(totaless);

        }


    }//GEN-LAST:event_CalcularActionPerformed

    private void ButtonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonRegresarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonRegresarActionPerformed

    private void ButtonRegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonRegresarMouseClicked
        TemasMetodo temasmetodo = new TemasMetodo();
        temasmetodo.setVisible(true);
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonRegresarMouseClicked

    private void jtxtERR_ABSOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtERR_ABSOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtERR_ABSOActionPerformed

    public static void main(String args[]) {

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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonRegresar;
    private javax.swing.JButton Calcular;
    private javax.swing.JLabel JLabelFondo;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBoxAprox;
    private javax.swing.JCheckBox jCheckBoxRedon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2aprox;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelReal;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jtxtAPROX;
    private javax.swing.JTextField jtxtERR_ABSO;
    private javax.swing.JTextField jtxtERR_REL;
    private javax.swing.JTextField jtxtREAL;
    // End of variables declaration//GEN-END:variables
}
