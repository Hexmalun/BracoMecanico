/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bracomecanico;

/**
 *
 * @author Mateus
 */
public class Sequencia extends javax.swing.JFrame {

    /**
     * Creates new form Sequencia
     */
    public Sequencia() {
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

        btnRadio10 = new javax.swing.JRadioButton();
        btnRadio50 = new javax.swing.JRadioButton();
        btnRadio100 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        textFieldNome = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnRadio11 = new javax.swing.JRadioButton();
        btnRadio51 = new javax.swing.JRadioButton();
        btnRadio101 = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        textFieldNome1 = new javax.swing.JTextField();
        btnParar = new javax.swing.JButton();

        btnRadio10.setText("10ms");
        btnRadio10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRadio10ActionPerformed(evt);
            }
        });

        btnRadio50.setText("50ms");

        btnRadio100.setText("100ms");
        btnRadio100.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRadio100ActionPerformed(evt);
            }
        });

        jLabel1.setText("Velocidade");

        jLabel3.setText("Nome:");

        textFieldNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldNomeActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Braço Mecânico");

        jButton1.setText("Voltar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Garra", "Pulso S", "Pulso G", "Cotovelo", "Ombro", "Cintura"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        btnRadio11.setText("10ms");
        btnRadio11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRadio11ActionPerformed(evt);
            }
        });

        btnRadio51.setText("50ms");

        btnRadio101.setText("100ms");
        btnRadio101.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRadio101ActionPerformed(evt);
            }
        });

        jLabel2.setText("Velocidade");

        jButton2.setText("Buscar Sequencia");
        jButton2.setActionCommand("BuscarSequencia");

        jLabel4.setText("Nome:");

        textFieldNome1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldNome1ActionPerformed(evt);
            }
        });

        btnParar.setText("Salvar");
        btnParar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPararMouseClicked(evt);
            }
        });
        btnParar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPararActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 521, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(btnRadio11)
                        .addGap(2, 2, 2)
                        .addComponent(btnRadio51)
                        .addGap(18, 18, 18)
                        .addComponent(btnRadio101))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(95, 95, 95)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(textFieldNome1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(btnParar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textFieldNome1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton2)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel2))
                    .addComponent(btnRadio11)
                    .addComponent(btnRadio51)
                    .addComponent(btnRadio101))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(btnParar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRadio10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRadio10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRadio10ActionPerformed

    private void btnRadio100ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRadio100ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRadio100ActionPerformed

    private void btnRadio11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRadio11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRadio11ActionPerformed

    private void btnRadio101ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRadio101ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRadio101ActionPerformed

    private void textFieldNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldNomeActionPerformed

    private void textFieldNome1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldNome1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldNome1ActionPerformed

    private void btnPararActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPararActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPararActionPerformed

    private void btnPararMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPararMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPararMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        MenuPrincipal mp = new MenuPrincipal();
        this.dispose();
        mp.setVisible(true);
    }//GEN-LAST:event_jButton1MouseClicked

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
            java.util.logging.Logger.getLogger(Sequencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sequencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sequencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sequencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sequencia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnParar;
    private javax.swing.JRadioButton btnRadio10;
    private javax.swing.JRadioButton btnRadio100;
    private javax.swing.JRadioButton btnRadio101;
    private javax.swing.JRadioButton btnRadio11;
    private javax.swing.JRadioButton btnRadio50;
    private javax.swing.JRadioButton btnRadio51;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField textFieldNome;
    private javax.swing.JTextField textFieldNome1;
    // End of variables declaration//GEN-END:variables
}
