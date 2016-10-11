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
public class TelaInicial extends javax.swing.JFrame {

    /**
     * Creates new form TelaInicial
     */
    public TelaInicial() {
        initComponents();
        
        
        
    }
    
    public TelaInicial(int a) {
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
        jLabel1 = new javax.swing.JLabel();
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
        textFieldGarra = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnDownGarra = new javax.swing.JButton();
        btnUpGarra = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        sliderPulsoS = new javax.swing.JSlider();
        jLabel11 = new javax.swing.JLabel();
        textFieldPulsoS = new javax.swing.JTextField();
        btnUpPulsoS = new javax.swing.JButton();
        btnDownPulsoS = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        sliderPulsoG = new javax.swing.JSlider();
        jLabel13 = new javax.swing.JLabel();
        textFieldPulsoG = new javax.swing.JTextField();
        btnUpPulsoG = new javax.swing.JButton();
        btnDownPulsoG = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        sliderCotovelo = new javax.swing.JSlider();
        jLabel15 = new javax.swing.JLabel();
        textFieldCotovelo = new javax.swing.JTextField();
        btnUpCotovelo = new javax.swing.JButton();
        btnDownCotovelo = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        sliderOmbro = new javax.swing.JSlider();
        jLabel17 = new javax.swing.JLabel();
        textFieldOmbro = new javax.swing.JTextField();
        btnUpOmbro = new javax.swing.JButton();
        btnDownOmbro = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        sliderCintura = new javax.swing.JSlider();
        jLabel19 = new javax.swing.JLabel();
        textFieldCintura = new javax.swing.JTextField();
        btnUpCintura = new javax.swing.JButton();
        btnDownCintura = new javax.swing.JButton();
        btnAbrirSequencias = new javax.swing.JButton();
        btnParar = new javax.swing.JButton();
        btnGravar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Velocidade");

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

        textFieldGarra.setText("Valor");
        textFieldGarra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldGarraActionPerformed(evt);
            }
        });

        jLabel8.setText("140");

        jLabel9.setText("90");

        btnDownGarra.setText("v");
        btnDownGarra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDownGarraActionPerformed(evt);
            }
        });

        btnUpGarra.setText("^");

        jLabel10.setText("120");

        jLabel11.setText("30");

        textFieldPulsoS.setText("Valor");
        textFieldPulsoS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldPulsoSActionPerformed(evt);
            }
        });

        btnUpPulsoS.setText("^");

        btnDownPulsoS.setText("v");
        btnDownPulsoS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDownPulsoSActionPerformed(evt);
            }
        });

        jLabel12.setText("5");

        jLabel13.setText("60");

        textFieldPulsoG.setText("Valor");
        textFieldPulsoG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldPulsoGActionPerformed(evt);
            }
        });

        btnUpPulsoG.setText("^");

        btnDownPulsoG.setText("v");
        btnDownPulsoG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDownPulsoGActionPerformed(evt);
            }
        });

        jLabel14.setText("9");

        jLabel15.setText("130");

        textFieldCotovelo.setText("Valor");
        textFieldCotovelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldCotoveloActionPerformed(evt);
            }
        });

        btnUpCotovelo.setText("^");

        btnDownCotovelo.setText("v");
        btnDownCotovelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDownCotoveloActionPerformed(evt);
            }
        });

        jLabel16.setText("11");

        jLabel17.setText("110");

        textFieldOmbro.setText("Valor");
        textFieldOmbro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldOmbroActionPerformed(evt);
            }
        });

        btnUpOmbro.setText("^");

        btnDownOmbro.setText("v");
        btnDownOmbro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDownOmbroActionPerformed(evt);
            }
        });

        jLabel18.setText("3");

        jLabel19.setText("110");

        textFieldCintura.setText("Valor");
        textFieldCintura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldCinturaActionPerformed(evt);
            }
        });

        btnUpCintura.setText("^");

        btnDownCintura.setText("v");
        btnDownCintura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDownCinturaActionPerformed(evt);
            }
        });

        btnAbrirSequencias.setText("Abrir Sequências");
        btnAbrirSequencias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirSequenciasActionPerformed(evt);
            }
        });

        btnParar.setText("Parar");
        btnParar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPararActionPerformed(evt);
            }
        });

        btnGravar.setText("Gravar Posição");
        btnGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGravarActionPerformed(evt);
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAbrirSequencias)
                            .addComponent(btnParar)
                            .addComponent(btnGravar))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(sliderGarra, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(textFieldGarra, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(sliderPulsoS, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel11)
                                        .addGap(18, 18, 18)
                                        .addComponent(textFieldPulsoS, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(4, 4, 4))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel14)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(sliderCotovelo, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel15)
                                        .addGap(18, 18, 18)
                                        .addComponent(textFieldCotovelo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(21, 21, 21)
                                        .addComponent(jLabel12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(sliderPulsoG, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel13)
                                        .addGap(18, 18, 18)
                                        .addComponent(textFieldPulsoG, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnUpGarra)
                                    .addComponent(btnUpPulsoS))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnDownGarra)
                                    .addComponent(btnDownPulsoS))
                                .addGap(47, 47, 47))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnUpPulsoG)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnDownPulsoG))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnUpCotovelo)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnDownCotovelo))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnUpOmbro)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnDownOmbro))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnUpCintura)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnDownCintura)))
                                .addContainerGap())))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(btnRadio10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnRadio50)
                                .addGap(18, 18, 18)
                                .addComponent(btnRadio100))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel16))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel18)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(15, 15, 15)
                                        .addComponent(sliderCintura, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(8, 8, 8)
                                        .addComponent(jLabel19))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(sliderOmbro, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel17)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(textFieldCintura, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                                    .addComponent(textFieldOmbro))))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btnRadio10)
                    .addComponent(btnRadio50)
                    .addComponent(btnRadio100))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(textFieldGarra)
                        .addComponent(btnUpGarra)
                        .addComponent(btnDownGarra))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(jLabel8))
                            .addComponent(sliderGarra, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel2))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel11)
                                .addComponent(textFieldPulsoS)
                                .addComponent(btnUpPulsoS)
                                .addComponent(btnDownPulsoS)))
                        .addGap(5, 5, 5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(sliderPulsoS, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnUpPulsoG)
                            .addComponent(btnDownPulsoG))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(textFieldCotovelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnUpCotovelo)
                            .addComponent(btnDownCotovelo)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(sliderPulsoG, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel13)
                                        .addComponent(textFieldPulsoG)))
                                .addGap(19, 19, 19))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel12))
                                .addGap(27, 27, 27)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sliderCotovelo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel5)
                                .addComponent(jLabel14)))))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel17)
                        .addComponent(textFieldOmbro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnUpOmbro)
                        .addComponent(btnDownOmbro))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(sliderOmbro, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel16))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(textFieldCintura)
                            .addComponent(btnUpCintura)
                            .addComponent(btnDownCintura))
                        .addGap(58, 58, 58))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sliderCintura, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel7)
                                .addComponent(jLabel18)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(btnAbrirSequencias)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnParar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnGravar)
                .addGap(59, 59, 59))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRadio10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRadio10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRadio10ActionPerformed

    private void btnRadio100ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRadio100ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRadio100ActionPerformed

    private void textFieldGarraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldGarraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldGarraActionPerformed

    private void btnDownGarraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDownGarraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDownGarraActionPerformed

    private void textFieldPulsoSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldPulsoSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldPulsoSActionPerformed

    private void btnDownPulsoSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDownPulsoSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDownPulsoSActionPerformed

    private void textFieldPulsoGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldPulsoGActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldPulsoGActionPerformed

    private void btnDownPulsoGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDownPulsoGActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDownPulsoGActionPerformed

    private void textFieldCotoveloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldCotoveloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldCotoveloActionPerformed

    private void btnDownCotoveloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDownCotoveloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDownCotoveloActionPerformed

    private void textFieldOmbroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldOmbroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldOmbroActionPerformed

    private void btnDownOmbroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDownOmbroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDownOmbroActionPerformed

    private void textFieldCinturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldCinturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldCinturaActionPerformed

    private void btnDownCinturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDownCinturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDownCinturaActionPerformed

    private void btnAbrirSequenciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirSequenciasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAbrirSequenciasActionPerformed

    private void btnPararActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPararActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPararActionPerformed

    private void btnGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGravarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGravarActionPerformed

    private void sliderGarraStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderGarraStateChanged
      JSlider jSlider = (JSlider)evt.getSource(); 
     int iValue = jSlider.getValue(); 
     textFieldGarra.setText (""+iValue); 
    }//GEN-LAST:event_sliderGarraStateChanged

    private void sliderGarraMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sliderGarraMouseDragged
  
    }//GEN-LAST:event_sliderGarraMouseDragged

    private void sliderGarraPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_sliderGarraPropertyChange
      // TODO add your handling code here:
    }//GEN-LAST:event_sliderGarraPropertyChange

    private void sliderGarraMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sliderGarraMouseExited
  // TODO add your handling code here:
    }//GEN-LAST:event_sliderGarraMouseExited

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
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicial().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbrirSequencias;
    private javax.swing.JButton btnDownCintura;
    private javax.swing.JButton btnDownCotovelo;
    private javax.swing.JButton btnDownGarra;
    private javax.swing.JButton btnDownOmbro;
    private javax.swing.JButton btnDownPulsoG;
    private javax.swing.JButton btnDownPulsoS;
    private javax.swing.JButton btnGravar;
    private javax.swing.JButton btnParar;
    private javax.swing.JRadioButton btnRadio10;
    private javax.swing.JRadioButton btnRadio100;
    private javax.swing.JRadioButton btnRadio50;
    private javax.swing.JButton btnUpCintura;
    private javax.swing.JButton btnUpCotovelo;
    private javax.swing.JButton btnUpGarra;
    private javax.swing.JButton btnUpOmbro;
    private javax.swing.JButton btnUpPulsoG;
    private javax.swing.JButton btnUpPulsoS;
    private javax.swing.ButtonGroup buttonGroup1;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSlider sliderCintura;
    private javax.swing.JSlider sliderCotovelo;
    private javax.swing.JSlider sliderGarra;
    private javax.swing.JSlider sliderOmbro;
    private javax.swing.JSlider sliderPulsoG;
    private javax.swing.JSlider sliderPulsoS;
    private javax.swing.JTextField textFieldCintura;
    private javax.swing.JTextField textFieldCotovelo;
    private javax.swing.JTextField textFieldGarra;
    private javax.swing.JTextField textFieldOmbro;
    private javax.swing.JTextField textFieldPulsoG;
    private javax.swing.JTextField textFieldPulsoS;
    // End of variables declaration//GEN-END:variables
}
