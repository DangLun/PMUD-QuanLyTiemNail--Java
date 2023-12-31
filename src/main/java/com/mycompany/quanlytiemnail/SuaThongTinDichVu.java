/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.quanlytiemnail;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author trand
 */
public class SuaThongTinDichVu extends javax.swing.JFrame {
    Connection conn = connectdata.getConnection();
    PreparedStatement pst = null;
    ResultSet rs = null;
    String tennd1;
    String id1;
    /**
     * Creates new form SuaThongTinDichVu
     */
    public SuaThongTinDichVu() {
        initComponents();
        setLocationRelativeTo(null);
    }
    public SuaThongTinDichVu(String tennd, String id) {
        initComponents();
        tennd1 = tennd;
        id1 = id;
        setLocationRelativeTo(null);
        jid.setText(id);
    }
    public SuaThongTinDichVu(String tennd, String id, String tendv, String giadv) {
        initComponents();
        tennd1 = tennd;
        id1 = id;
        jtendv.setText(tendv);
        jgiadv.setText(giadv);
        setLocationRelativeTo(null);
        jid.setText(id);
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
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jid = new javax.swing.JTextField();
        jtendv = new javax.swing.JTextField();
        jgiadv = new javax.swing.JTextField();
        jb_thaydoi = new javax.swing.JButton();
        jb_back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sửa thông tin dịch vụ");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(31, 40, 51));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 255, 255));
        jLabel1.setText("SỬA THÔNG TIN DỊCH VỤ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addComponent(jLabel1)
                .addContainerGap(142, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel1)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("ID DỊCH VỤ: ");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Tên Dịch vụ:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Giá dịch vụ:");

        jid.setFocusable(false);

        jgiadv.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jgiadvKeyPressed(evt);
            }
        });

        jb_thaydoi.setBackground(new java.awt.Color(40, 167, 69));
        jb_thaydoi.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jb_thaydoi.setForeground(new java.awt.Color(255, 255, 255));
        jb_thaydoi.setText("THAY ĐỔI");
        jb_thaydoi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jb_thaydoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_thaydoiActionPerformed(evt);
            }
        });

        jb_back.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jb_back.setForeground(new java.awt.Color(0, 123, 255));
        jb_back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/back.png"))); // NOI18N
        jb_back.setText("TRỞ VỀ");
        jb_back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jb_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jid, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                            .addComponent(jtendv)
                            .addComponent(jgiadv)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jb_back)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 142, Short.MAX_VALUE)
                        .addComponent(jb_thaydoi)))
                .addContainerGap(87, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtendv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jgiadv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_thaydoi)
                    .addComponent(jb_back))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb_thaydoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_thaydoiActionPerformed
        // TODO add your handling code here:

        if(jtendv.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Không được để trống tên dịch vụ !", "Thông báo", JOptionPane.WARNING_MESSAGE);
            jtendv.requestFocus();
        }else if(jgiadv.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Không được để trống giá dịch vụ !", "Thông báo", JOptionPane.WARNING_MESSAGE);
            jgiadv.requestFocus();
        }else{
            
            try{
                String query = """
                call updateTableDichVu(?, ?, ?);
                """;
                pst = conn.prepareStatement(query);
                pst.setInt(1, Integer.parseInt(id1));
                pst.setString(2, jtendv.getText());
                pst.setInt(3, Integer.parseInt(jgiadv.getText()));
                pst.executeQuery();
                JOptionPane.showMessageDialog(this, "Sửa thông tin thành công !");
                jtendv.setText("");
                jgiadv.setText("");
                jtendv.requestFocus();
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_jb_thaydoiActionPerformed

    private void jb_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_backActionPerformed
        // TODO add your handling code here:
        new QLTN(tennd1).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jb_backActionPerformed

    private void jgiadvKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jgiadvKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyChar() == '.' || evt.getKeyChar() == '-') {
            JOptionPane.showMessageDialog(this, "Lương phải là một số nguyên dương !");
            jgiadv.setText("");
            jgiadv.requestFocus();
        } else if (Character.isLetter(evt.getKeyChar())) {
            JOptionPane.showMessageDialog(this, "Không được nhập kí tự !");
            jgiadv.setText("");
            jgiadv.requestFocus();
        }
    }//GEN-LAST:event_jgiadvKeyPressed

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
            java.util.logging.Logger.getLogger(SuaThongTinDichVu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SuaThongTinDichVu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SuaThongTinDichVu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SuaThongTinDichVu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SuaThongTinDichVu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jb_back;
    private javax.swing.JButton jb_thaydoi;
    private javax.swing.JTextField jgiadv;
    private javax.swing.JTextField jid;
    private javax.swing.JTextField jtendv;
    // End of variables declaration//GEN-END:variables
}
