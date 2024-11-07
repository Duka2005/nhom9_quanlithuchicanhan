/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package main.java.qlct.view;

import java.util.List;
import javax.swing.table.DefaultTableModel;
import main.java.qlct.bangct.BangThuChi;

/**
 *
 * @author dovie_000
 */
public class BangTheoNgay extends javax.swing.JFrame {

    /**
     * Creates new form BangTheoTuan
     */
    public BangTheoNgay() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    public int rowsize = 0;
    public int sumthungay = 0;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        closebutton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        daydisplay = new javax.swing.JTextField();
        yeardisplay = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        totalthudisplaymaster = new javax.swing.JTextField();
        totalthudisplaymaster.setEditable(false);
        jLabel4 = new javax.swing.JLabel();
        showbutton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(845, 750));

        closebutton.setText("Tắt");
        closebutton.setMaximumSize(new java.awt.Dimension(75, 40));
        closebutton.setMinimumSize(new java.awt.Dimension(75, 40));
        closebutton.setPreferredSize(new java.awt.Dimension(75, 40));
        closebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closebuttonActionPerformed(evt);
            }
        });

        jLabel1.setText("Nhập Ngày và Năm muốn thống kê:");

        jLabel2.setText("Ngày:");

        jLabel3.setText("Năm:");

        daydisplay.setMaximumSize(new java.awt.Dimension(72, 40));
        daydisplay.setMinimumSize(new java.awt.Dimension(72, 40));
        daydisplay.setPreferredSize(new java.awt.Dimension(72, 40));

        yeardisplay.setMaximumSize(new java.awt.Dimension(72, 40));
        yeardisplay.setMinimumSize(new java.awt.Dimension(72, 40));
        yeardisplay.setPreferredSize(new java.awt.Dimension(72, 40));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tuần", "Tháng", "Ngày", "Năm", "Thông tin thu chi", "Loại", "Số tiền"
            }
        ));
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTable1.setMaximumSize(new java.awt.Dimension(732, 450));
        jTable1.setPreferredSize(new java.awt.Dimension(732, 450));
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(30);
        jTable1.getColumnModel().getColumn(1).setPreferredWidth(50);
        jTable1.getColumnModel().getColumn(2).setPreferredWidth(50);
        jTable1.getColumnModel().getColumn(3).setPreferredWidth(50);
        jTable1.getColumnModel().getColumn(4).setPreferredWidth(200);
        jTable1.getColumnModel().getColumn(5).setPreferredWidth(90);
        jTable1.getColumnModel().getColumn(6).setPreferredWidth(120);
        jScrollPane1.setViewportView(jTable1);

        jLabel4.setText("Tổng số tiền thu hiện tại:");

        showbutton.setText("Thống kê");
        showbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(286, 286, 286)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(closebutton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 732, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(249, 249, 249)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(daydisplay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(yeardisplay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(showbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 91, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(totalthudisplaymaster, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(daydisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yeardisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(showbutton, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(totalthudisplaymaster, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addComponent(closebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closebuttonActionPerformed
        dispose();
    }//GEN-LAST:event_closebuttonActionPerformed

    private void showbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showbuttonActionPerformed
       TableView l = new TableView();
        List<BangThuChi> list = l.getdata();
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        Object rowData[] = new Object[7];
        for (int i = 0;i < rowsize;i++){
            if (jTable1.getValueAt(0,5).toString().trim().equals("thu")){
                sumthungay -= Integer.parseInt(model.getValueAt(0,6).toString());
            } else {
                sumthungay += Integer.parseInt(model.getValueAt(0,6).toString());
            }
            model.removeRow(0);
        }
        for(int i = 0;i < list.size();i++){
            if(Integer.parseInt(daydisplay.getText()) == list.get(i).ngay && Integer.parseInt(yeardisplay.getText()) == list.get(i).nam){
                rowData[0] = list.get(i).tuan;
                rowData[1] = list.get(i).thang;
                rowData[2] = list.get(i).ngay;
                rowData[3] = list.get(i).nam;
                rowData[4] = list.get(i).ndtc;
                rowData[5] = list.get(i).type;
                rowData[6] = list.get(i).value;
                if (rowData[5].equals("thu")){
                    sumthungay += list.get(i).value;
                } else {
                    sumthungay -= list.get(i).value;
                }
                model.addRow(rowData);
                totalthudisplaymaster.setText(Integer.toString(sumthungay));
            }
        }
        rowsize = model.getRowCount();
    }//GEN-LAST:event_showbuttonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton closebutton;
    private javax.swing.JTextField daydisplay;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton showbutton;
    private javax.swing.JTextField totalthudisplaymaster;
    private javax.swing.JTextField yeardisplay;
    // End of variables declaration//GEN-END:variables
}
