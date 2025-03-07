/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;
import configDatabase.configDB;
import javax.swing.JOptionPane;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ACER
 */
public class framePembayaran extends javax.swing.JFrame {
    private configDB crud;
    private String[] fieldSimpan={"ID_PEMBAYARAN","ID_PELANGGAN","ID_PENJUALAN","JML_HUTANG","JML_PEMBAYARAN"};
    private String[] fieldEdit={"ID_PELANGGAN","ID_PENJUALAN","JML_HUTANG","JML_PEMBAYARAN"};
    private String[] judulKolom={"ID PEMBAYARAN","ID PELANGGAN","ID PENJUALAN","JUMLAH HUTANG","JUMLAH PEMBAYARAN"};
    private int[] lebarKolom={100,100,100,100,130};
    private String sql = "SELECT * FROM pembayaran";
    
    private void refreshPembayaran(){
        crud.settingJudulTabel(tablePembayaran, judulKolom);
        crud.tampilTabel(tablePembayaran, sql, judulKolom);
        crud.settingLebarKolom(tablePembayaran, lebarKolom);
    }
    
    private void cariData(String cari){
        String sqlCari="";
        try {
            if (cari.isEmpty()){
                sqlCari="select*from pembayaran";
            } else {
                sqlCari="select*from pembayaran where ID_PEMBAYARAN='"+cari+"'"
                        + " or ID_PELANGGAN= '"+cari+"'"
                        + " or ID_PENJUALAN= '"+cari+"'"
                        + " or JML_HUTANG= '"+cari+"'"
                        + " or JML_PEMBAYARAN= '"+cari+"'";
            }
            crud.settingJudulTabel(tablePembayaran, judulKolom);
            crud.tampilTabel(tablePembayaran, sqlCari, judulKolom);
            crud.settingLebarKolom(tablePembayaran, lebarKolom);
        } catch (Exception e) {
        }
    }
    
    private void bersihForm() {
    txtIdPembayaran.setText("");
    txtIdPelanggan.setText("");
    txtIdPenjualan.setText("");
    txtJumlahHutang.setText("");
    txtJumlahPembayaran.setText("");
    txtIdPembayaran.requestFocus();
    }
    
    public framePembayaran() {
        initComponents();
        this.setLocationRelativeTo(null);
        crud = new configDB();
        refreshPembayaran();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        txtJumlahPembayaran = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtIdPembayaran = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txtIdPelanggan = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtIdPenjualan = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtJumlahHutang = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablePembayaran = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        txtLaporan = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLabel5.setText("JUMLAH PEMBAYARAN");

        txtJumlahPembayaran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtJumlahPembayaranActionPerformed(evt);
            }
        });

        jButton2.setText("UBAH");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("HAPUS");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel1.setText("ID PEMBAYARAN");

        txtIdPembayaran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdPembayaranActionPerformed(evt);
            }
        });

        jLabel2.setText("ID PELANGGAN");

        jButton1.setText("SIMPAN");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txtIdPelanggan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdPelangganActionPerformed(evt);
            }
        });

        jLabel3.setText("ID PENJUALAN");

        txtIdPenjualan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdPenjualanActionPerformed(evt);
            }
        });

        jLabel4.setText("JUMLAH HUTANG");

        txtJumlahHutang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtJumlahHutangActionPerformed(evt);
            }
        });

        tablePembayaran.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tablePembayaran.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablePembayaranMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablePembayaran);

        jLabel7.setText("FILTER DATA :");

        txtLaporan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLaporanActionPerformed(evt);
            }
        });
        txtLaporan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtLaporanKeyReleased(evt);
            }
        });

        jButton4.setText("CETAK LAPORAN");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("BERSIHKAN FORM");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Snap ITC", 0, 24)); // NOI18N
        jLabel9.setText("DATA PEMBAYARAN");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel1))
                                        .addGap(30, 30, 30)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtIdPembayaran, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtIdPelanggan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtIdPenjualan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtJumlahHutang, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtJumlahPembayaran, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton1)
                                        .addGap(55, 55, 55)
                                        .addComponent(jButton2)
                                        .addGap(49, 49, 49)
                                        .addComponent(jButton3)))
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(93, 93, 93)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(txtLaporan, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(62, 62, 62)
                                .addComponent(jButton4))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel9)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtIdPembayaran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtIdPelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtIdPenjualan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtJumlahHutang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtJumlahPembayaran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addComponent(jButton5)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2)
                            .addComponent(jButton3)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(txtLaporan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton4))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtJumlahPembayaranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtJumlahPembayaranActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtJumlahPembayaranActionPerformed

    private void txtIdPembayaranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdPembayaranActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdPembayaranActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            if (crud.DuplicateKey("pembayaran", "ID_PEMBAYARAN", txtIdPembayaran.getText()))
            {
                JOptionPane.showMessageDialog(null,"DATA PEMBAYARAN SUDAH ADA");
            } else {
                String[] isiField={txtIdPembayaran.getText(),txtIdPelanggan.getText(),txtIdPenjualan.getText(),txtJumlahHutang.getText(),txtJumlahPembayaran.getText()};
                crud.SimpanDinamis("pembayaran", fieldSimpan, isiField);
                JOptionPane.showMessageDialog(null,"DATA BERHASIL DISIMPAN");
            }
            
            refreshPembayaran();
            bersihForm();
        
        }   catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtIdPelangganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdPelangganActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdPelangganActionPerformed

    private void txtIdPenjualanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdPenjualanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdPenjualanActionPerformed

    private void txtJumlahHutangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtJumlahHutangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtJumlahHutangActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String isiField[]={txtIdPelanggan.getText(),txtIdPenjualan.getText(),txtJumlahHutang.getText(),txtJumlahPembayaran.getText()};
        
        crud.UbahDinamis("pembayaran","ID_PEMBAYARAN",txtIdPembayaran.getText(), fieldEdit, isiField);
        
        refreshPembayaran();
        bersihForm();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int confirm = JOptionPane.showConfirmDialog(this, 
        "Apakah anda yakin ingin menghapus data ini?", 
        "Konfirmasi Hapus", 
        JOptionPane.YES_NO_OPTION);
        
        if (confirm == JOptionPane.YES_OPTION) {
            crud.HapusDinamis("Pembayaran", "ID_PEMBAYARAN", txtIdPembayaran.getText());
            bersihForm();
        }
        
        refreshPembayaran();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {
        if (txtLaporan.getText().isEmpty()){
            crud.tampilLaporan("src/laporan/pembayaran.jrxml", "select*from pembayaran");
        } else {
            String sql="select*from pembayaran where ID_PEMBAYARAN='"+txtLaporan.getText()+"'"+
                    " or ID_PELANGGAN='"+txtLaporan.getText()+"'"+
                    " or ID_PENJUALAN='"+txtLaporan.getText()+"'"+
                    " or JML_HUTANG='"+txtLaporan.getText()+"'"+
                    " or JML_PEMBAYARAN='"+txtLaporan.getText()+"'";
            crud.tampilLaporan("src/laporan/pembayaran.jrxml",sql);
        }
    }   catch (Exception ex) {
            Logger.getLogger(framePelanggan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void txtLaporanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLaporanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLaporanActionPerformed

    private void txtLaporanKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLaporanKeyReleased
        cariData(txtLaporan.getText());
    }//GEN-LAST:event_txtLaporanKeyReleased

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        bersihForm();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void tablePembayaranMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablePembayaranMouseClicked
    int selectedRow = tablePembayaran.getSelectedRow();
        if (selectedRow != -1) {

            txtIdPembayaran.setText(tablePembayaran.getValueAt(selectedRow, 0).toString());
            txtIdPelanggan.setText(tablePembayaran.getValueAt(selectedRow, 1).toString());
            txtIdPenjualan.setText(tablePembayaran.getValueAt(selectedRow, 2).toString());
            txtJumlahHutang.setText(tablePembayaran.getValueAt(selectedRow, 3).toString());
            txtJumlahPembayaran.setText(tablePembayaran.getValueAt(selectedRow, 4).toString());
        }
    }//GEN-LAST:event_tablePembayaranMouseClicked

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
            java.util.logging.Logger.getLogger(framePembayaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(framePembayaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(framePembayaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(framePembayaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new framePembayaran().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablePembayaran;
    private javax.swing.JTextField txtIdPelanggan;
    private javax.swing.JTextField txtIdPembayaran;
    private javax.swing.JTextField txtIdPenjualan;
    private javax.swing.JTextField txtJumlahHutang;
    private javax.swing.JTextField txtJumlahPembayaran;
    private javax.swing.JTextField txtLaporan;
    // End of variables declaration//GEN-END:variables
}
