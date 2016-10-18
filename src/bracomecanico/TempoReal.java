/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bracomecanico;

import javax.swing.JSlider;

/**
 *
 * @author Mateus
 */
public class TempoReal extends javax.swing.JFrame {
    private int linha = 0;
    /**
     * Creates new form TelaInicial
     */
    public TempoReal() {
        initComponents();
        
        
        
    }
    
    public TempoReal(int a) {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        btnRadio10 = new javax.swing.JRadioButton();
        btnRadio50 = new javax.swing.JRadioButton();
        btnRadio100 = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        sliderGarra = new javax.swing.JSlider();
        sliderPulsoS = new javax.swing.JSlider();
        textFieldPulsoS = new javax.swing.JTextField();
        sliderPulsoG = new javax.swing.JSlider();
        textFieldPulsoG = new javax.swing.JTextField();
        sliderCotovelo = new javax.swing.JSlider();
        textFieldCotovelo = new javax.swing.JTextField();
        sliderOmbro = new javax.swing.JSlider();
        textFieldOmbro = new javax.swing.JTextField();
        sliderCintura = new javax.swing.JSlider();
        textFieldCintura = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        textFieldGarra1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        buttonGroup1.add(btnRadio10);
        btnRadio10.setText("10ms");
        btnRadio10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRadio10ActionPerformed(evt);
            }
        });

        buttonGroup1.add(btnRadio50);
        btnRadio50.setText("50ms");

        buttonGroup1.add(btnRadio100);
        btnRadio100.setText("100ms");
        btnRadio100.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRadio100ActionPerformed(evt);
            }
        });

        jLabel2.setText("Pulso_S");

        jLabel3.setText("Garra");

        jLabel4.setText("Pulso_G");

        jLabel5.setText("Cotovelo");

        jLabel6.setText("Ombro");

        jLabel7.setText("Cintura");

        sliderGarra = new JSlider(JSlider.HORIZONTAL, 90, 140, 125);
        sliderGarra.setMajorTickSpacing(10);
        sliderGarra.setMinorTickSpacing(1);
        sliderGarra.setPaintTicks(true);
        sliderGarra.setPaintLabels(true);
        sliderGarra.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderGarraStateChanged(evt);
            }
        });
        sliderGarra.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                sliderGarraMouseDragged(evt);
            }
        });
        sliderGarra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sliderGarraMouseExited(evt);
            }
        });
        sliderGarra.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                sliderGarraPropertyChange(evt);
            }
        });

        sliderPulsoS = new JSlider(JSlider.HORIZONTAL, 30, 120, 75);
        sliderPulsoS.setMajorTickSpacing(10);
        sliderPulsoS.setMinorTickSpacing(1);
        sliderPulsoS.setPaintTicks(true);
        sliderPulsoS.setPaintLabels(true);
        sliderPulsoS.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderPulsoSStateChanged(evt);
            }
        });

        textFieldPulsoS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldPulsoSActionPerformed(evt);
            }
        });

        sliderPulsoG = new JSlider(JSlider.HORIZONTAL, 60, 150, 105);
        sliderPulsoG.setMajorTickSpacing(10);
        sliderPulsoG.setMinorTickSpacing(1);
        sliderPulsoG.setPaintTicks(true);
        sliderPulsoG.setPaintLabels(true);
        sliderPulsoG.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderPulsoGStateChanged(evt);
            }
        });

        textFieldPulsoG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldPulsoGActionPerformed(evt);
            }
        });

        sliderCotovelo = new JSlider(JSlider.HORIZONTAL, 40, 130, 85);
        sliderCotovelo.setMajorTickSpacing(10);
        sliderCotovelo.setMinorTickSpacing(1);
        sliderCotovelo.setPaintTicks(true);
        sliderCotovelo.setPaintLabels(true);
        sliderCotovelo.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderCotoveloStateChanged(evt);
            }
        });

        textFieldCotovelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldCotoveloActionPerformed(evt);
            }
        });

        sliderOmbro = new JSlider(JSlider.HORIZONTAL, 50, 110, 80);
        sliderOmbro.setMajorTickSpacing(10);
        sliderOmbro.setMinorTickSpacing(1);
        sliderOmbro.setPaintTicks(true);
        sliderOmbro.setPaintLabels(true);
        sliderOmbro.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderOmbroStateChanged(evt);
            }
        });

        textFieldOmbro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldOmbroActionPerformed(evt);
            }
        });

        sliderCintura  = new JSlider(JSlider.HORIZONTAL, 10, 110, 60);
        sliderCintura.setMajorTickSpacing(10);
        sliderCintura.setMinorTickSpacing(1);
        sliderCintura.setPaintTicks(true);
        sliderCintura.setPaintLabels(true);
        sliderCintura.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderCinturaStateChanged(evt);
            }
        });

        textFieldCintura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldCinturaActionPerformed(evt);
            }
        });

        jButton1.setText("Voltar");

        textFieldGarra1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldGarra1ActionPerformed(evt);
            }
        });

        jLabel8.setText("Velocidade");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnRadio10)
                                .addGap(2, 2, 2)
                                .addComponent(btnRadio50)
                                .addGap(18, 18, 18)
                                .addComponent(btnRadio100)
                                .addContainerGap(191, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(sliderPulsoG, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(sliderPulsoS, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                                        .addComponent(sliderGarra, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textFieldPulsoG, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textFieldGarra1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textFieldPulsoS, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(29, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jButton1)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel7))
                                    .addGap(32, 32, 32)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(sliderCintura, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(textFieldCintura, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(sliderOmbro, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(textFieldOmbro, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(sliderCotovelo, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(textFieldCotovelo, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel8))
                    .addComponent(btnRadio10)
                    .addComponent(btnRadio50)
                    .addComponent(btnRadio100))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sliderGarra, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(textFieldGarra1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textFieldPulsoS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sliderPulsoS, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textFieldPulsoG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sliderPulsoG, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(sliderCotovelo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldCotovelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel6))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textFieldOmbro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sliderOmbro, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(sliderCintura, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldCintura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(42, 42, 42))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRadio10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRadio10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRadio10ActionPerformed

    private void btnRadio100ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRadio100ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRadio100ActionPerformed

    private void textFieldPulsoSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldPulsoSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldPulsoSActionPerformed

    private void textFieldPulsoGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldPulsoGActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldPulsoGActionPerformed

    private void textFieldCotoveloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldCotoveloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldCotoveloActionPerformed

    private void textFieldOmbroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldOmbroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldOmbroActionPerformed

    private void textFieldCinturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldCinturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldCinturaActionPerformed

    private void sliderGarraStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderGarraStateChanged
       JSlider jSlider = (JSlider)evt.getSource(); 
       int iValue = jSlider.getValue(); 
       textFieldNome.setText (""+iValue); 
    }//GEN-LAST:event_sliderGarraStateChanged

    private void sliderGarraMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sliderGarraMouseDragged
  
    }//GEN-LAST:event_sliderGarraMouseDragged

    private void sliderGarraPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_sliderGarraPropertyChange
      // TODO add your handling code here:
    }//GEN-LAST:event_sliderGarraPropertyChange

    private void sliderGarraMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sliderGarraMouseExited
  // TODO add your handling code here:
    }//GEN-LAST:event_sliderGarraMouseExited

    private void sliderPulsoSStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderPulsoSStateChanged
        JSlider jSlider = (JSlider)evt.getSource(); 
        int iValue = jSlider.getValue(); 
        textFieldPulsoS.setText (""+iValue);         // TODO add your handling code here:
    }//GEN-LAST:event_sliderPulsoSStateChanged

    private void sliderPulsoGStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderPulsoGStateChanged
        JSlider jSlider = (JSlider)evt.getSource(); 
        int iValue = jSlider.getValue(); 
        textFieldPulsoG.setText (""+iValue);         // TODO add your handling code here:
    }//GEN-LAST:event_sliderPulsoGStateChanged

    private void sliderCotoveloStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderCotoveloStateChanged
        JSlider jSlider = (JSlider)evt.getSource(); 
        int iValue = jSlider.getValue(); 
        textFieldCotovelo.setText (""+iValue);         // TODO add your handling code here:
    }//GEN-LAST:event_sliderCotoveloStateChanged

    private void sliderOmbroStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderOmbroStateChanged
        JSlider jSlider = (JSlider)evt.getSource(); 
        int iValue = jSlider.getValue(); 
        textFieldOmbro.setText (""+iValue);         // TODO add your handling code here:
    }//GEN-LAST:event_sliderOmbroStateChanged

    private void sliderCinturaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderCinturaStateChanged
        JSlider jSlider = (JSlider)evt.getSource(); 
        int iValue = jSlider.getValue(); 
        textFieldCintura.setText (""+iValue);         // TODO add your handling code here:
    }//GEN-LAST:event_sliderCinturaStateChanged

    private void textFieldGarra1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldGarra1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldGarra1ActionPerformed

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
            java.util.logging.Logger.getLogger(TempoReal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TempoReal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TempoReal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TempoReal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TempoReal().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton btnRadio10;
    private javax.swing.JRadioButton btnRadio100;
    private javax.swing.JRadioButton btnRadio50;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSlider sliderCintura;
    private javax.swing.JSlider sliderCotovelo;
    private javax.swing.JSlider sliderGarra;
    private javax.swing.JSlider sliderOmbro;
    private javax.swing.JSlider sliderPulsoG;
    private javax.swing.JSlider sliderPulsoS;
    private javax.swing.JTextField textFieldCintura;
    private javax.swing.JTextField textFieldCotovelo;
    private javax.swing.JTextField textFieldGarra1;
    private javax.swing.JTextField textFieldOmbro;
    private javax.swing.JTextField textFieldPulsoG;
    private javax.swing.JTextField textFieldPulsoS;
    // End of variables declaration//GEN-END:variables
}
