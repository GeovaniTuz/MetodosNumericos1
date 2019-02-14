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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtxtRedo_ABSO = new javax.swing.JTextField();
        jtxtERR_REL = new javax.swing.JTextField();
        ButtonRegresar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        NumDec = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        RedonRela = new javax.swing.JTextField();
        redonabs = new javax.swing.JTextField();

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
        getContentPane().add(Calcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        jLabel3.setText("Error Absoluto: ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 500, -1, -1));

        jLabel4.setText("Error Relativo: ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, -1, -1));

        jtxtRedo_ABSO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtRedo_ABSOActionPerformed(evt);
            }
        });
        getContentPane().add(jtxtRedo_ABSO, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 240, 30));
        getContentPane().add(jtxtERR_REL, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 240, -1));

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

        jLabel2.setText("Ingresa cantidad de decimales.");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, -1, -1));

        jLabel5.setText("Cantidad decimal:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, 30));
        getContentPane().add(NumDec, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, 90, -1));

        jButton2.setText("Redondeo");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, -1, -1));

        jButton3.setText("Truncamiento");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 380, -1, -1));
        getContentPane().add(RedonRela, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 450, 170, 30));
        getContentPane().add(redonabs, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 500, 170, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jtxtREALActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtREALActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtREALActionPerformed
double resu1,resu2;
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

            jtxtRedo_ABSO.setText(totales);
            jtxtERR_REL.setText(totaless);
        }

        if (res_apro < 0) {

            res_apro = res_apro * -1;

            String totales = Float.toString(res_abs);
            String totaless = Float.toString(res_apro);

            jtxtRedo_ABSO.setText(totales);
            jtxtERR_REL.setText(totaless);

        } else {

            String totales = Float.toString(res_abs);
            String totaless = Float.toString(res_apro);

            jtxtRedo_ABSO.setText(totales);
            jtxtERR_REL.setText(totaless);

        }
        resu1 = res_abs;//resultado de primera fase
        resu2 = res_apro;


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

    private void jtxtRedo_ABSOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtRedo_ABSOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtRedo_ABSOActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
 String dato1;
 double rec,rec2;
        dato1 = NumDec.getText();//dato igual a decimal ingresada
       
        int decima = Integer.parseInt(dato1); //decima absorve el valor de dato1 en tipo int
       
        rec = redondearDecimal(resu1,decima);
        rec2 = redondearDecimal(resu2,decima);
        if (rec < 0)
        {rec = rec*(-1);}
        if (rec2 < 0)
        {rec2 = rec2*(-1);}
        
     String total1 = Double.toString(rec);
     String total2 = Double.toString(rec2);
     
        RedonRela.setText(total1);
        redonabs.setText(total2);
        
        
        

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
     //codigo para el truncamiento del resultado
     String dato1;
 double rec,rec2;
 
        dato1 = NumDec.getText();
       
        int decima = Integer.parseInt(dato1); 
        
        rec = truncarDecimal(resu1,decima);
        rec2 = truncarDecimal(resu2,decima);
        if (rec < 0)
        {rec = rec*(-1);}
        
        if (rec2 < 0)
        {rec2 = rec2*(-1);}
        
     String total1 = Double.toString(rec);
     String total2 = Double.toString(rec2);
     
        RedonRela.setText(total1);
        redonabs.setText(total2);
        
       
    }//GEN-LAST:event_jButton3ActionPerformed

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
    private javax.swing.JTextField NumDec;
    private javax.swing.JTextField RedonRela;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel2aprox;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelReal;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jtxtAPROX;
    private javax.swing.JTextField jtxtERR_REL;
    private javax.swing.JTextField jtxtREAL;
    private javax.swing.JTextField jtxtRedo_ABSO;
    private javax.swing.JTextField redonabs;
    // End of variables declaration//GEN-END:variables

    private double redondearDecimal(double res, int dec) {
       double parteEntera=0,resultado=0;
    resultado = res;//1.123
    parteEntera =Math.floor(resultado);
    
                      //0.123        *   10 a la (4)
    resultado=(resultado-parteEntera)*Math.pow(10,dec);
    
    resultado=Math.round(resultado);
    
    resultado=(resultado/Math.pow(10,dec))+parteEntera;
    return resultado;
    }

    private double truncarDecimal(double res, int dec) {
        double parteEntera,truncado;
        truncado=res;
        parteEntera =Math.floor(truncado);
        truncado=(truncado-parteEntera)*Math.pow(10,dec-1);
        truncado=Math.floor(truncado);
         truncado=(truncado/Math.pow(10,dec-1))+parteEntera;
        
        
        
        return truncado;
    }
}
