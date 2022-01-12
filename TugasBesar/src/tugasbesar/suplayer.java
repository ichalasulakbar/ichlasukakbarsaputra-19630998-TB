/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasbesar;

/**
 *
 * @author User
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;
public class suplayer extends javax.swing.JFrame {

    /**
     * Creates new form suplayer
     */
    DefaultTableModel model;
    public suplayer() {
        initComponents();
        String [] judul = {"Kode Suplayer","Nama Suplayer","Alamat","No Order", "Telepon"};
        model = new DefaultTableModel(judul, 0);
        tabelsuplayer.setModel(model);
        tampil_data();   
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Kode_Suplayer = new javax.swing.JTextField();
        Alamat = new javax.swing.JTextField();
        Nama_Suplayer = new javax.swing.JTextField();
        Telepon = new javax.swing.JTextField();
        NoOrder = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelsuplayer = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("Kode Suplayer");

        jLabel3.setText("Nama Suplayer");

        jLabel4.setText("Alamat");

        jLabel5.setText("No Order");

        jLabel6.setText("Telepon");

        Kode_Suplayer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Kode_SuplayerActionPerformed(evt);
            }
        });

        Alamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlamatActionPerformed(evt);
            }
        });

        Nama_Suplayer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Nama_SuplayerActionPerformed(evt);
            }
        });

        Telepon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TeleponActionPerformed(evt);
            }
        });

        NoOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NoOrderActionPerformed(evt);
            }
        });

        jButton1.setText("TAMBAH");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
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

        jButton4.setText("CETAK");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        tabelsuplayer.setModel(new javax.swing.table.DefaultTableModel(
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
        tabelsuplayer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelsuplayerMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelsuplayer);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(47, 47, 47)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Telepon, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Alamat, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Kode_Suplayer, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Nama_Suplayer, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(NoOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(jButton1)
                                .addGap(30, 30, 30)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(Kode_Suplayer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(Nama_Suplayer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(Alamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(NoOrder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(Telepon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4)
                    .addComponent(jButton3)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addContainerGap(61, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Kode_SuplayerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Kode_SuplayerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Kode_SuplayerActionPerformed

    private void AlamatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlamatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AlamatActionPerformed

    private void Nama_SuplayerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Nama_SuplayerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Nama_SuplayerActionPerformed

    private void TeleponActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TeleponActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TeleponActionPerformed

    private void NoOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NoOrderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NoOrderActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    try {
            // TODO add your handling code here:
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/gudang","root","");
            cn.createStatement().executeUpdate("insert into suplayer values"+"('"+Kode_Suplayer.getText()+"','"+Nama_Suplayer.getText()+"','"+Alamat.getText()+"','"+NoOrder.getText()+"','"+Telepon.getText()+"')");
            tampil_data();
            hapus();
            JOptionPane.showMessageDialog(null, "Data Berhasil DiTambahkan");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Data Gagal DiTambahkan ");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tabelsuplayerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelsuplayerMouseClicked
        // TODO add your handling code here:
        int i = tabelsuplayer.getSelectedRow();
        
        if(i>-1){
            Kode_Suplayer.setText(model.getValueAt(i, 0).toString());
            Nama_Suplayer.setText(model.getValueAt(i, 1).toString());
            Alamat.setText(model.getValueAt(i, 2).toString());
            NoOrder.setText(model.getValueAt(i, 3).toString());
            Telepon.setText(model.getValueAt(i, 4).toString());
        }
    }//GEN-LAST:event_tabelsuplayerMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    try {
            // TODO add your handling code here:
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/gudang","root","");
            cn.createStatement().executeUpdate("update suplayer set nama_sup ='"+Nama_Suplayer.getText()+"',alamat ='"+Alamat.getText()+"',no_order ='"+NoOrder.getText()+"',telepon ='"+Telepon.getText()+"' where kd_sup = '"+Kode_Suplayer.getText()+"'");
            tampil_data();
            hapus();
            JOptionPane.showMessageDialog(null, "Data Berhasil DiUbah");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Data Gagal Di Ubah");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    try {
            // TODO add your handling code here:
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/gudang","root","");
            cn.createStatement().executeUpdate("delete from suplayer where kd_sup ='"+Kode_Suplayer.getText()+"'");
            tampil_data();
            hapus();
            JOptionPane.showMessageDialog(null, "Data berhasil di Hapus");
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Data gagal di Hapus");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        try {
        JasperPrint jp = JasperFillManager.fillReport(getClass().getResourceAsStream("/laporan/LaporanSuplayer.jasper"), null, Koneksi.getConnection());
        JasperViewer.viewReport(jp, false);
        } catch(Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    
    private void hapus() {
     Kode_Suplayer.setText("");
     Nama_Suplayer.setText("");
     Alamat.setText("");   
     NoOrder.setText("");
     Telepon.setText("");


    }
    

private void tampil_data() {
        int row = tabelsuplayer.getRowCount();
        for(int a= 0; a<row;a++){
            model.removeRow(0);
        }
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/gudang","root","");;
            ResultSet rs = cn.createStatement().executeQuery("SELECT * FROM suplayer");
            while(rs.next()){
                String data []= {rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5)};
                model.addRow(data);
            }
                } catch (SQLException ex) {
            Logger.getLogger(suplayer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }



    
    
    
    
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
            java.util.logging.Logger.getLogger(suplayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(suplayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(suplayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(suplayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new suplayer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Alamat;
    private javax.swing.JTextField Kode_Suplayer;
    private javax.swing.JTextField Nama_Suplayer;
    private javax.swing.JTextField NoOrder;
    private javax.swing.JTextField Telepon;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelsuplayer;
    // End of variables declaration//GEN-END:variables
}
