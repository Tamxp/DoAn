/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

import java.awt.Image;
import javax.swing.ImageIcon;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

/**
 *
 * @author Le Chuong
 */
public class FThanhToan extends javax.swing.JFrame {

    /**
     * Creates new form FThanhToan
     */
    public FThanhToan() {
        initComponents();
        jTextField1.setEditable(false);
        setLocationRelativeTo(null);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setTitle("PHẦN MỀN QUẢN LÝ BÃI GỬI XE");
        ImageIcon icon = new ImageIcon(getClass().getResource("/UI/Image/Logo_PTIT.jpg")); // Sử dụng đường dẫn tương đối
        Image newImage = icon.getImage().getScaledInstance(45, 45, Image.SCALE_SMOOTH);
        this.setIconImage(newImage);
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
        jTextField1 = new javax.swing.JTextField();
        btnYeuCau = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Số tiền bạn phải thanh toán là:");

        jTextField1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 0, 51));

        btnYeuCau.setBackground(new java.awt.Color(102, 102, 255));
        btnYeuCau.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnYeuCau.setText("Thanh Toán");
        btnYeuCau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnYeuCauActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(btnYeuCau, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(btnYeuCau, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(89, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnYeuCauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnYeuCauActionPerformed
        // TODO add your handling code here:
        //        try {
            //            String hoTen = txtNgay.getText();
            //            //String gt = GioiTinh.getSelectedItem().toString();
            //            //String diaChi = Diachi.getText();
            //            String sdt = txtBSX.getText();
            //            //String cccd= CCCD.getText();
            //            if (txtNgay.getText().equals("")) {
                //                lbHoTen.setText("*Chưa nhập họ tên.");
                //                lbHoTen.setForeground(Color.red);
                //                Border RedLine = BorderFactory.createLineBorder(Color.red);
                //                txtNgay.setBorder(RedLine);
                //            }
            //            else if (Diachi.getText().equals("")) {
                //                lbDiachi.setText("*Chưa nhập địa chỉ.");
                //                lbDiachi.setForeground(Color.red);
                //                Border RedLine = BorderFactory.createLineBorder(Color.red);
                //                Diachi.setBorder(RedLine);
                //            }
            //            else if (txtBSX.getText().equals("")) {
                //                lbSDT.setText("*Chưa nhập số điện thoại.");
                //                lbSDT.setForeground(Color.red);
                //                Border RedLine = BorderFactory.createLineBorder(Color.red);
                //                txtBSX.setBorder(RedLine);
                //            }
            //            else if (CCCD.getText().equals("")) {
                //                lbCCCD.setText("*Chưa nhập số CCCD.");
                //                lbCCCD.setForeground(Color.red);
                //                Border RedLine = BorderFactory.createLineBorder(Color.red);
                //                CCCD.setBorder(RedLine);
                //            }
            //            else if (!txtNgay.getText().equals("") && !Diachi.getText().equals("") && !txtBSX.getText().equals("") && !CCCD.getText().equals("")) {
                //                DangNhapDAO dn = new DangNhapDAO();
                //                if (dn.CheckPhone1(sdt)==false){
                    //                    lbSDT.setText("*Số điện thoại đã được sử dụng.");
                    //                    lbSDT.setForeground(Color.red);
                    //                    Border RedLine = BorderFactory.createLineBorder(Color.red);
                    //                    txtBSX.setBorder(RedLine);
                    //                }
                //                else{
                    //                    if (dn.ThemCD(hoTen,diaChi, sdt, cccd)> 0) {
                        //                        JOptionPane.showMessageDialog(this, "Thêm cư dân thành công!");
                        //                        txtNgay.setText("");
                        //                        Diachi.setText("");
                        //                        txtBSX.setText("");
                        //                        CCCD.setText("");
                        //                    } else {
                        //                        JOptionPane.showMessageDialog(this, "Thêm cư dân không thành công!");
                        //                    }
                    //                }
                //            }
            //        } catch (Exception e) {
            //            e.printStackTrace();
            //        }
    }//GEN-LAST:event_btnYeuCauActionPerformed

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
            java.util.logging.Logger.getLogger(FThanhToan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FThanhToan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FThanhToan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FThanhToan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FThanhToan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnYeuCau;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
