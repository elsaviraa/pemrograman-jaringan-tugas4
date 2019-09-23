/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Elsa
 */
public class Tgs_Praktikum4Frame extends javax.swing.JFrame {

    /**
     * Creates new form Tgs_Praktikum4Frame
     */
    private Tgs_Praktikum4 controller;
    public Tgs_Praktikum4Frame() {
        initComponents();
        this.controller = new Tgs_Praktikum4(this);
    }

    public JButton getBtnBersihkan() {
        return btHapus;
    }

    public void setBtnBersihkan(JButton btnBersihkan) {
        this.btHapus = btnBersihkan;
    }

    public JButton getBtnHitung() {
        return btHitung;
    }

    public void setBtnHitung(JButton btnHitung) {
        this.btHitung = btnHitung;
    }

    public JTextField getHasilKeliling() {
        return tvKeliling;
    }

    public void setHasilKeliling(JTextField hasilKeliling) {
        this.tvKeliling = hasilKeliling;
    }

    public JTextField getHasilLuas() {
        return tvLuas;
    }

    public void setHasilLuas(JTextField hasilLuas) {
        this.tvLuas = hasilLuas;
    }

    public JTextField getLebar() {
        return tvLebar;
    }

    public void setLebar(JTextField lebar) {
        this.tvLebar = lebar;
    }

    public JFileChooser getLoadFile() {
        return loadFile;
    }

    public void setLoadFile(JFileChooser loadFile) {
        this.loadFile = loadFile;
    }

    public JTextField getPanjang() {
        return tvPanjang;
    }

    public void setPanjang(JTextField panjang) {
        this.tvPanjang = panjang;
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loadFile = new javax.swing.JFileChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tvPanjang = new javax.swing.JTextField();
        tvLebar = new javax.swing.JTextField();
        btHitung = new javax.swing.JButton();
        btHapus = new javax.swing.JButton();
        tvLuas = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tvKeliling = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("TUGAS PRAKTIKUM 4");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Lebar");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Panjang");

        tvPanjang.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tvPanjangKeyTyped(evt);
            }
        });

        tvLebar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tvLebarActionPerformed(evt);
            }
        });
        tvLebar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tvLebarKeyTyped(evt);
            }
        });

        btHitung.setText("Hitung");
        btHitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btHitungActionPerformed(evt);
            }
        });

        btHapus.setText("Hapus");
        btHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btHapusActionPerformed(evt);
            }
        });

        tvLuas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tvLuasActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("Luas");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("Keliling");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(tvLuas))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(tvPanjang))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(tvLebar))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(29, 29, 29)
                            .addComponent(btHitung)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                            .addComponent(btHapus)
                            .addGap(16, 16, 16)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tvKeliling, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel1)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tvPanjang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tvLebar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btHitung)
                    .addComponent(btHapus))
                .addGap(27, 27, 27)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tvLuas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tvKeliling, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tvLebarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tvLebarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tvLebarActionPerformed

    private void btHitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btHitungActionPerformed
    if (tvPanjang.getText().equals("") || tvLebar.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Panjang dan Lebar Tidak Boleh Kosong","ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        } else{
        controller.hitung();
        }
    }//GEN-LAST:event_btHitungActionPerformed

    private void tvLuasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tvLuasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tvLuasActionPerformed

    private void btHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btHapusActionPerformed
        controller.hapus();
    }//GEN-LAST:event_btHapusActionPerformed

    private void tvPanjangKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tvPanjangKeyTyped
        char enter=evt.getKeyChar();

        if(!(Character.isDigit(enter)))

        {

            evt.consume();
        }
    }//GEN-LAST:event_tvPanjangKeyTyped

    private void tvLebarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tvLebarKeyTyped
        char enter=evt.getKeyChar();

        if(!(Character.isDigit(enter)))

        {

            evt.consume();
        }
    }//GEN-LAST:event_tvLebarKeyTyped

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
            java.util.logging.Logger.getLogger(Tgs_Praktikum4Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tgs_Praktikum4Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tgs_Praktikum4Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tgs_Praktikum4Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tgs_Praktikum4Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btHapus;
    private javax.swing.JButton btHitung;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JFileChooser loadFile;
    private javax.swing.JTextField tvKeliling;
    private javax.swing.JTextField tvLebar;
    private javax.swing.JTextField tvLuas;
    private javax.swing.JTextField tvPanjang;
    // End of variables declaration//GEN-END:variables
}
