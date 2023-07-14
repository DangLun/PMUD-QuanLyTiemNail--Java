/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.quanlytiemnail;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;

/**
 *
 * @author trand
 */
public class ThemThongTinKhachHang extends javax.swing.JFrame {
    Connection conn = connectdata.getConnection();
    PreparedStatement pst = null;
    ResultSet rs = null;
    String tennd;
    /**
     * Creates new form ThemThongTinKhachHang
     */
    public ThemThongTinKhachHang() {
        initComponents();
        ButtonGroup bg = new ButtonGroup();
        bg.add(jrb_nam);
        bg.add(jrb_nu);
        jrb_nam.setSelected(true);
        jtext_tenkh.requestFocus();
        setLocationRelativeTo(null);
    }
    public ThemThongTinKhachHang(String tennguoidung) {
        initComponents();
        ButtonGroup bg = new ButtonGroup();
        bg.add(jrb_nam);
        bg.add(jrb_nu);
        jrb_nam.setSelected(true);
        jtext_tenkh.requestFocus();
        tennd = tennguoidung;
        setLocationRelativeTo(null);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jb_trove = new javax.swing.JButton();
        jb_add = new javax.swing.JButton();
        jtext_tenkh = new javax.swing.JTextField();
        jtext_sdt = new javax.swing.JTextField();
        jtext_email = new javax.swing.JTextField();
        jtext_diachi = new javax.swing.JTextField();
        jrb_nam = new javax.swing.JRadioButton();
        jrb_nu = new javax.swing.JRadioButton();

        jLabel62.setText("jLabel62");

        jLabel63.setText("jLabel63");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Thêm thông tin khách hàng");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(31, 40, 51));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 255, 255));
        jLabel1.setText("THÊM THÔNG TIN KHÁCH HÀNG");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(jLabel1)
                .addContainerGap(67, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jLabel64.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel64.setText("Tên khách hàng:");

        jLabel65.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel65.setText("Số điện thoại:");

        jLabel66.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel66.setText("Email:");

        jLabel67.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel67.setText("Giới tính:");

        jLabel68.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel68.setText("Địa chỉ");

        jb_trove.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jb_trove.setForeground(new java.awt.Color(0, 123, 255));
        jb_trove.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/back.png"))); // NOI18N
        jb_trove.setText("TRỞ VỀ");
        jb_trove.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jb_trove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_troveActionPerformed(evt);
            }
        });

        jb_add.setBackground(new java.awt.Color(40, 167, 69));
        jb_add.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jb_add.setForeground(new java.awt.Color(255, 255, 255));
        jb_add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/add-button.png"))); // NOI18N
        jb_add.setText("Thêm");
        jb_add.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jb_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_addActionPerformed(evt);
            }
        });

        jtext_sdt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtext_sdtKeyPressed(evt);
            }
        });

        jrb_nam.setText("Nam");
        jrb_nam.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jrb_nu.setText("Nữ");
        jrb_nu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jb_trove)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jb_add))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel64, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel65, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel66, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel67, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel68, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtext_tenkh)
                            .addComponent(jtext_sdt)
                            .addComponent(jtext_email)
                            .addComponent(jtext_diachi, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addComponent(jrb_nam, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jrb_nu, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel64)
                    .addComponent(jtext_tenkh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel65)
                    .addComponent(jtext_sdt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel66)
                    .addComponent(jtext_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel67)
                    .addComponent(jrb_nam)
                    .addComponent(jrb_nu))
                .addGap(18, 18, 18)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel68)
                    .addComponent(jtext_diachi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_trove)
                    .addComponent(jb_add))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb_troveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_troveActionPerformed
        // TODO add your handling code here:
        new QLTN(tennd).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jb_troveActionPerformed

    private void jtext_sdtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtext_sdtKeyPressed
        // TODO add your handling code here:
        if(Character.isLetter(evt.getKeyChar())){
            JOptionPane.showMessageDialog(this, "Không được nhập kí tự !");
            jtext_sdt.setText("");
            jtext_sdt.requestFocus();
        }
    }//GEN-LAST:event_jtext_sdtKeyPressed

    private void jb_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_addActionPerformed
        // TODO add your handling code here:
        if (jtext_tenkh.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Không được để trống tên khách hàng !", "thông báo", JOptionPane.WARNING_MESSAGE);
            jtext_tenkh.requestFocus();
        } else if(jtext_sdt.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Không được để trống số điện thoại !", "thông báo", JOptionPane.WARNING_MESSAGE);
            jtext_sdt.requestFocus();
        }else if(jtext_email.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Không được để trống email !", "thông báo", JOptionPane.WARNING_MESSAGE);
            jtext_email.requestFocus();
        } 
        else if(jtext_diachi.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Không được để trống Địa chỉ !", "thông báo", JOptionPane.WARNING_MESSAGE);
            jtext_diachi.requestFocus();
        }
        else if (jtext_sdt.getText().length() != 10) {
            JOptionPane.showMessageDialog(this, "Độ dài số điện thoại không hợp lệ !", "thông báo", JOptionPane.WARNING_MESSAGE);
        }else{
            try {
                String tenkh = jtext_tenkh.getText();
                String sdt = jtext_sdt.getText();
                String gioitinh = "";
                if (jrb_nam.isSelected()) {
                    gioitinh += "Nam";
                }else {
                    gioitinh += "Nữ";
                }
                String email = jtext_email.getText();
                String diachi = jtext_diachi.getText();
                
                String query = "call addKhachHang(?,?,?,?,?)";
                pst = conn.prepareStatement(query);
                pst.setString(1, tenkh);
                pst.setString(2, sdt);
                pst.setString(3, email);
                pst.setString(4, gioitinh);
                pst.setString(5, diachi);
                rs = pst.executeQuery();
                JOptionPane.showMessageDialog(this, "Thêm Thông tin Khách hàng thành công !");
                jtext_tenkh.setText("");
                jtext_sdt.setText("");
                jrb_nam.setSelected(true);
                jtext_email.setText("");
                jtext_diachi.setText("");
                jtext_tenkh.requestFocus();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
        
    }//GEN-LAST:event_jb_addActionPerformed

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
            java.util.logging.Logger.getLogger(ThemThongTinKhachHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThemThongTinKhachHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThemThongTinKhachHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThemThongTinKhachHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ThemThongTinKhachHang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JButton jb_add;
    private javax.swing.JButton jb_trove;
    private javax.swing.JRadioButton jrb_nam;
    private javax.swing.JRadioButton jrb_nu;
    private javax.swing.JTextField jtext_diachi;
    private javax.swing.JTextField jtext_email;
    private javax.swing.JTextField jtext_sdt;
    private javax.swing.JTextField jtext_tenkh;
    // End of variables declaration//GEN-END:variables
}
