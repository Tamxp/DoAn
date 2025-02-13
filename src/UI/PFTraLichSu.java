/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import DAO.TraXeDAO;
import DTO.NhapXeDTO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.Timer;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Admin
 */
public class PFTraLichSu extends javax.swing.JPanel {

    /**
     * Creates new form PFGiveCarBack
     */
    private Timer timer;
    public PFTraLichSu() {
        initComponents();
        setSize(1040, 545);
        
    }


    public void loadTable() {
        ArrayList<NhapXeDTO> list = TraXeDAO.veXe();
        DefaultTableModel tblModel = (DefaultTableModel) TableTTXe.getModel();
        Object[] row = new Object[7];
        for (int i = 0; i < list.size(); i++) {
            row[0] = list.get(i).getMaVe();
            row[1] = list.get(i).getBienSo();
            row[2] = list.get(i).getLoaiXe();
            row[3] = list.get(i).getViTri();
            row[4] = list.get(i).getNgayGui();
            row[5] = list.get(i).getGioGui();
            row[6] = list.get(i).getID_phi();
            tblModel.addRow(row);
        }
        
    }

    public void search(String str) {
        DefaultTableModel tblModel;
        tblModel = (DefaultTableModel) TableTTXe.getModel();
        TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(tblModel);
        TableTTXe.setRowSorter(trs);
        trs.setRowFilter(RowFilter.regexFilter(str));
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TableTTXe = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtTimKiem = new javax.swing.JTextField();
        cbxTimKiem = new javax.swing.JComboBox<>();
        btnTimKiem = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(204, 204, 255));

        TableTTXe.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã vé", "Biển Số Xe", "Loại xe", "Thời điểm vào", "Thời điểm ra"
            }
        ));
        jScrollPane1.setViewportView(TableTTXe);
        if (TableTTXe.getColumnModel().getColumnCount() > 0) {
            TableTTXe.getColumnModel().getColumn(0).setPreferredWidth(100);
            TableTTXe.getColumnModel().getColumn(0).setMaxWidth(100);
            TableTTXe.getColumnModel().getColumn(1).setPreferredWidth(150);
            TableTTXe.getColumnModel().getColumn(1).setMaxWidth(150);
            TableTTXe.getColumnModel().getColumn(2).setPreferredWidth(100);
            TableTTXe.getColumnModel().getColumn(2).setMaxWidth(100);
        }

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Thông tin:");

        txtTimKiem.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtTimKiem.setName("txtTimKiem"); // NOI18N
        txtTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTimKiemActionPerformed(evt);
            }
        });
        txtTimKiem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTimKiemKeyPressed(evt);
            }
        });

        cbxTimKiem.setBackground(new java.awt.Color(102, 102, 255));
        cbxTimKiem.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbxTimKiem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Theo biển số", "Theo mã vé" }));
        cbxTimKiem.setBorder(null);
        cbxTimKiem.setFocusable(false);
        cbxTimKiem.setName("cbxTImKiemItem"); // NOI18N
        cbxTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxTimKiemActionPerformed(evt);
            }
        });

        btnTimKiem.setBackground(new java.awt.Color(102, 102, 255));
        btnTimKiem.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnTimKiem.setText("Tra lịch sử");
        btnTimKiem.setBorder(null);
        btnTimKiem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTimKiem.setFocusPainted(false);
        btnTimKiem.setName("btnTimKiem"); // NOI18N
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel10.setText("Tra lịch sử thẻ tháng");

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbxTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 739, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(92, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(110, 110, 110)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cbxTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
     public void loadTable1(String bienso) {
        ArrayList<NhapXeDTO> list = TraXeDAO.traTTTheoBienSo(bienso);
        DefaultTableModel tblModel = (DefaultTableModel) TableTTXe.getModel();
        Object[] row = new Object[5];
        for (int i = 0; i < list.size(); i++) {
            row[0] = list.get(i).getMaVe();
            row[1] = list.get(i).getBienSo();
            row[2] = list.get(i).getLoaiXe();
            row[3] = list.get(i).getNgayGui()+" "+list.get(i).getGioGui();
            if (list.get(i).getGioNhan()==""){
                row[4]="";
            }
            else row[4] = list.get(i).getNgayNhan()+" "+list.get(i).getGioNhan();
            tblModel.addRow(row);
        }
     }
     
      public void loadTable2(String ma) {
        ArrayList<NhapXeDTO> list = TraXeDAO.traTTTheoMaVe(ma);
        DefaultTableModel tblModel = (DefaultTableModel) TableTTXe.getModel();
        Object[] row = new Object[5];
        for (int i = 0; i < list.size(); i++) {
            row[0] = list.get(i).getMaVe();
            row[1] = list.get(i).getBienSo();
            row[2] = list.get(i).getLoaiXe();
            row[3] = list.get(i).getNgayGui()+" "+list.get(i).getGioGui();
            if (list.get(i).getGioNhan()==""){
                row[4]="";
            }
            else row[4] = list.get(i).getNgayNhan()+" "+list.get(i).getGioNhan();
            tblModel.addRow(row);
        }
     }
    private void txtTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimKiemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTimKiemActionPerformed

    private void cbxTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxTimKiemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxTimKiemActionPerformed

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
        DefaultTableModel tblModel = (DefaultTableModel) TableTTXe.getModel();
        Object[] row = new Object[5];
        if (cbxTimKiem.getSelectedItem().toString().equals("Theo biển số")) {
            for (int i = tblModel.getRowCount() - 1; i >= 0; i--) {
                tblModel.removeRow(i);
            }
            loadTable1(txtTimKiem.getText().toString());
        } else {
            for (int i = tblModel.getRowCount() - 1; i >= 0; i--) {
                tblModel.removeRow(i);
            }
            loadTable2(txtTimKiem.getText().toString());
        }
    }//GEN-LAST:event_btnTimKiemActionPerformed
   
    private void txtTimKiemKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimKiemKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
             DefaultTableModel tblModel = (DefaultTableModel) TableTTXe.getModel();
            Object[] row = new Object[5];
            if (cbxTimKiem.getSelectedItem().toString().equals("Theo biển số")) {
                for (int i = tblModel.getRowCount() - 1; i >= 0; i--) {
                    tblModel.removeRow(i);
                }
                loadTable1(txtTimKiem.getText().toString());
            } else {
                for (int i = tblModel.getRowCount() - 1; i >= 0; i--) {
                    tblModel.removeRow(i);
                }
                loadTable2(txtTimKiem.getText().toString());
            }
        }
    }//GEN-LAST:event_txtTimKiemKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TableTTXe;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JComboBox<String> cbxTimKiem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables
}
