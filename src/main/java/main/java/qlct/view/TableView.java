/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package main.java.qlct.view;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import static java.lang.Double.NaN;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import main.java.qlct.bangct.BangThuChi;
import main.java.qlct.bangct.DataThuChi;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 *
 * @author dovie_000
 */
public class TableView extends javax.swing.JFrame {
    /**
     * Creates new form TableView
     */
    public TableView() {
        initComponents();
        addRowToJTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    DataThuChi datathuchi = new DataThuChi();
    public String month;
    public String day;
    public String year;
    public String thongtin;
    public String loai;
    public String money;
    public int sumthu;
    public void addRowToJTable(){
        try{    
            DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
            File xmlFile = new File("data.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(xmlFile);

            doc.getDocumentElement().normalize();

            NodeList nList = doc.getElementsByTagName("Data");
            for (int i = 0; i < nList.getLength(); i++) {
                Node node = nList.item(i);

                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;

                    month = element.getElementsByTagName("month").item(0).getTextContent();
                    day = element.getElementsByTagName("day").item(0).getTextContent();
                    year = element.getElementsByTagName("year").item(0).getTextContent();
                    thongtin = element.getElementsByTagName("thongtin").item(0).getTextContent();
                    loai = element.getElementsByTagName("loai").item(0).getTextContent();
                    money = element.getElementsByTagName("money").item(0).getTextContent();
                }
                datathuchi.addbang(new BangThuChi(Integer.parseInt(month),Integer.parseInt(day),Integer.parseInt(year),thongtin,loai,Integer.parseInt(money)));
                if (loai.equals("thu")){
                    sumthu += Integer.parseInt(money);
                } else {
                    sumthu -= Integer.parseInt(money);
                }
                model.addRow(new Object[]{month, day, year, thongtin,loai,money});
                totalthudisplaymaster.setText(Integer.toString(sumthu));
            }
            updatebutton.setEnabled(false);
            removebutton.setEnabled(false);
        } catch (Exception e) {
            e.printStackTrace();
        } 
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        displaymonth = new javax.swing.JTextField();
        displayday = new javax.swing.JTextField();
        displayyear = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        displaythuchi = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        displaytype = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        displaymoney = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        addbutton = new javax.swing.JButton();
        updatebutton = new javax.swing.JButton();
        removebutton = new javax.swing.JButton();
        clearbutton = new javax.swing.JButton();
        savebutton = new javax.swing.JButton();
        totalthudisplaymaster = new javax.swing.JTextField();
        totalthudisplaymaster.setEditable(false);
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1084, 800));

        jLabel1.setText("Tháng");

        jLabel2.setText("Ngày");

        jLabel3.setText("Năm");

        displaymonth.setMaximumSize(new java.awt.Dimension(64, 30));
        displaymonth.setMinimumSize(new java.awt.Dimension(64, 30));
        displaymonth.setPreferredSize(new java.awt.Dimension(64, 30));
        displaymonth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displaymonthActionPerformed(evt);
            }
        });

        displayday.setMaximumSize(new java.awt.Dimension(64, 30));
        displayday.setMinimumSize(new java.awt.Dimension(64, 30));
        displayday.setPreferredSize(new java.awt.Dimension(64, 30));

        displayyear.setMaximumSize(new java.awt.Dimension(64, 30));
        displayyear.setMinimumSize(new java.awt.Dimension(64, 30));
        displayyear.setPreferredSize(new java.awt.Dimension(64, 30));

        jLabel4.setText("Nội dung thu chi");

        displaythuchi.setMaximumSize(new java.awt.Dimension(175, 30));
        displaythuchi.setMinimumSize(new java.awt.Dimension(175, 30));
        displaythuchi.setPreferredSize(new java.awt.Dimension(175, 30));

        jLabel5.setText("Loại (thu/chi)");

        displaytype.setMaximumSize(new java.awt.Dimension(64, 30));
        displaytype.setMinimumSize(new java.awt.Dimension(64, 30));
        displaytype.setPreferredSize(new java.awt.Dimension(64, 30));

        jLabel6.setText("Số tiền");

        displaymoney.setMaximumSize(new java.awt.Dimension(140, 30));
        displaymoney.setMinimumSize(new java.awt.Dimension(140, 30));
        displaymoney.setPreferredSize(new java.awt.Dimension(140, 30));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tháng", "Ngày", "Năm", "Nội dung thu chi", "Loại", "Số tiền"
            }
        ));
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTable1.setMaximumSize(new java.awt.Dimension(732, 450));
        jTable1.setMinimumSize(new java.awt.Dimension(732, 450));
        jTable1.setPreferredSize(new java.awt.Dimension(732, 450));
        jTable1.setShowGrid(false);

        jTable1.getColumnModel().getColumn(0).setPreferredWidth(50);
        jTable1.getColumnModel().getColumn(1).setPreferredWidth(50);
        jTable1.getColumnModel().getColumn(2).setPreferredWidth(50);
        jTable1.getColumnModel().getColumn(3).setPreferredWidth(200);
        jTable1.getColumnModel().getColumn(4).setPreferredWidth(90);
        jTable1.getColumnModel().getColumn(5).setPreferredWidth(120);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        addbutton.setText("Thêm");
        addbutton.setMaximumSize(new java.awt.Dimension(76, 40));
        addbutton.setMinimumSize(new java.awt.Dimension(76, 40));
        addbutton.setPreferredSize(new java.awt.Dimension(76, 40));
        addbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbuttonActionPerformed(evt);
            }
        });

        updatebutton.setText("Sửa");
        updatebutton.setMaximumSize(new java.awt.Dimension(76, 40));
        updatebutton.setMinimumSize(new java.awt.Dimension(76, 40));
        updatebutton.setPreferredSize(new java.awt.Dimension(76, 40));
        updatebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebuttonActionPerformed(evt);
            }
        });

        removebutton.setText("Xóa");
        removebutton.setMaximumSize(new java.awt.Dimension(76, 40));
        removebutton.setMinimumSize(new java.awt.Dimension(76, 40));
        removebutton.setPreferredSize(new java.awt.Dimension(76, 40));
        removebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removebuttonActionPerformed(evt);
            }
        });

        clearbutton.setText("Clear");
        clearbutton.setMaximumSize(new java.awt.Dimension(76, 40));
        clearbutton.setMinimumSize(new java.awt.Dimension(76, 40));
        clearbutton.setPreferredSize(new java.awt.Dimension(76, 40));
        clearbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearbuttonActionPerformed(evt);
            }
        });

        savebutton.setText("Save");
        savebutton.setMaximumSize(new java.awt.Dimension(76, 40));
        savebutton.setMinimumSize(new java.awt.Dimension(76, 40));
        savebutton.setPreferredSize(new java.awt.Dimension(76, 40));
        savebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savebuttonActionPerformed(evt);
            }
        });

        totalthudisplaymaster.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalthudisplaymasterActionPerformed(evt);
            }
        });

        jLabel7.setText("Tổng số tiền thu hiện tại:");

        jButton1.setText("Tìm kiếm");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(addbutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(clearbutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(updatebutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(savebutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(removebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(displaythuchi, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(displayyear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(displaytype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(displaymoney, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(displaymonth, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(displayday, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(totalthudisplaymaster, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(displaymonth, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(displayday, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(displayyear, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(displaythuchi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(displaytype, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(displaymoney, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(removebutton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updatebutton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(clearbutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(savebutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(115, 115, 115))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totalthudisplaymaster, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void displaymonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displaymonthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_displaymonthActionPerformed

    private void addbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbuttonActionPerformed
        try{
            if (Integer.parseInt(displaymonth.getText()) != NaN && Integer.parseInt(displayday.getText()) != NaN && Integer.parseInt(displayyear.getText()) != NaN && Integer.parseInt(displaymoney.getText()) != NaN){
                if (displaytype.getText().trim().equals("thu") || displaytype.getText().trim().equals("chi")){    
                    DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
                    if (displaytype.getText().trim().equals("thu")){
                        sumthu += Integer.parseInt(displaymoney.getText());
                        model.addRow(new Object[]{displaymonth.getText(),displayday.getText(),displayyear.getText(),displaythuchi.getText(),displaytype.getText(),displaymoney.getText()});
                        datathuchi.addbang(new BangThuChi(Integer.parseInt(displaymonth.getText()),Integer.parseInt(displayday.getText()),Integer.parseInt(displayyear.getText()),displaythuchi.getText(),displaytype.getText(),Integer.parseInt(displaymoney.getText())));
                    } else {
                        if (sumthu - Integer.parseInt(displaymoney.getText()) < 0){
                            JOptionPane.showMessageDialog(null,"Số tiền phần 'chi' đang quá so với thu");
                        } else {
                            sumthu -= Integer.parseInt(displaymoney.getText());
                            model.addRow(new Object[]{displaymonth.getText(),displayday.getText(),displayyear.getText(),displaythuchi.getText(),displaytype.getText(),displaymoney.getText()});
                            datathuchi.addbang(new BangThuChi(Integer.parseInt(displaymonth.getText()),Integer.parseInt(displayday.getText()),Integer.parseInt(displayyear.getText()),displaythuchi.getText(),displaytype.getText(),Integer.parseInt(displaymoney.getText())));
                        }
                    }
                    totalthudisplaymaster.setText(Integer.toString(sumthu));
                } else {
                    JOptionPane.showMessageDialog(null,"Phần Loại chỉ được nhập 'thu' hoặc 'chi'");
                }
            }
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Phần Tháng/Ngày/Năm hoặc Tiền không phải là số");
        }
    }//GEN-LAST:event_addbuttonActionPerformed

    
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        updatebutton.setEnabled(true);
        removebutton.setEnabled(true);
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        int selectedRowIndex = jTable1.getSelectedRow();
        displaymonth.setText(model.getValueAt(selectedRowIndex, 0).toString());
        displayday.setText(model.getValueAt(selectedRowIndex, 1).toString());
        displayyear.setText(model.getValueAt(selectedRowIndex, 2).toString());
        displaythuchi.setText(model.getValueAt(selectedRowIndex, 3).toString());
        displaytype.setText(model.getValueAt(selectedRowIndex, 4).toString());
        displaymoney.setText(model.getValueAt(selectedRowIndex, 5).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    private void updatebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebuttonActionPerformed
        try{
            int i = jTable1.getSelectedRow();
            DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
            if (i >= 0){
                if (Integer.parseInt(displaymonth.getText()) != NaN && Integer.parseInt(displayday.getText()) != NaN && Integer.parseInt(displayyear.getText()) != NaN && Integer.parseInt(displaymoney.getText()) != NaN){
                    if (displaytype.getText().trim().equals("thu") || displaytype.getText().trim().equals("chi")){
                        if (jTable1.getValueAt(i,4).toString().trim().equals("thu")){
                            if (sumthu - Integer.parseInt(model.getValueAt(i,5).toString()) + Integer.parseInt(displaymoney.getText()) < 0){
                                JOptionPane.showMessageDialog(null,"Số tiền phần 'chi' đang quá so với thu");
                            } else {
                                sumthu -= Integer.parseInt(model.getValueAt(i,5).toString());
                                model.setValueAt(displaymonth.getText(),i,0);
                                model.setValueAt(displayday.getText(),i,1);
                                model.setValueAt(displayyear.getText(),i,2);
                                model.setValueAt(displaythuchi.getText(),i,3);
                                model.setValueAt(displaytype.getText(),i,4);
                                model.setValueAt(displaymoney.getText(),i,5);
                                if (jTable1.getValueAt(i,4).toString().trim().equals("thu")){
                                    sumthu += Integer.parseInt(model.getValueAt(i,5).toString());
                                } else {
                                    sumthu -= Integer.parseInt(model.getValueAt(i,5).toString());
                                }
                                datathuchi.setbang(i,new BangThuChi(Integer.parseInt(displaymonth.getText()),Integer.parseInt(displayday.getText()),Integer.parseInt(displayyear.getText()),displaythuchi.getText(),displaytype.getText(),Integer.parseInt(displaymoney.getText())));
                            }
                        } else {
                            sumthu += Integer.parseInt(model.getValueAt(i,5).toString());
                            model.setValueAt(displaymonth.getText(),i,0);
                            model.setValueAt(displayday.getText(),i,1);
                            model.setValueAt(displayyear.getText(),i,2);
                            model.setValueAt(displaythuchi.getText(),i,3);
                            model.setValueAt(displaytype.getText(),i,4);
                            model.setValueAt(displaymoney.getText(),i,5);
                            if (jTable1.getValueAt(i,4).toString().trim().equals("thu")){
                                sumthu += Integer.parseInt(model.getValueAt(i,5).toString());
                            } else {
                                sumthu -= Integer.parseInt(model.getValueAt(i,5).toString());
                            }
                            datathuchi.setbang(i,new BangThuChi(Integer.parseInt(displaymonth.getText()),Integer.parseInt(displayday.getText()),Integer.parseInt(displayyear.getText()),displaythuchi.getText(),displaytype.getText(),Integer.parseInt(displaymoney.getText())));
                        }
                        
                        totalthudisplaymaster.setText(Integer.toString(sumthu));
                    } else {
                        JOptionPane.showMessageDialog(null,"Phần Loại chỉ được nhập 'thu' hoặc 'chi'");
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null,"Bạn chưa chọn hàng để sửa");
            }
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Phần Tháng/Ngày/Năm hoặc Tiền không phải là số");
        }
    }//GEN-LAST:event_updatebuttonActionPerformed

    private void removebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removebuttonActionPerformed
        try{
            DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
            int SelectedRowIndex = jTable1.getSelectedRow();
            if (jTable1.getValueAt(SelectedRowIndex,4).toString().trim().equals("thu")){
                if (sumthu - Integer.parseInt(model.getValueAt(SelectedRowIndex,5).toString()) < 0){
                    JOptionPane.showMessageDialog(null,"Số tiền phần 'chi' đang quá so với thu");
                } else {
                    sumthu -= Integer.parseInt(model.getValueAt(SelectedRowIndex,5).toString());
                    totalthudisplaymaster.setText(Integer.toString(sumthu));
                    model.removeRow(SelectedRowIndex);
                    datathuchi.removebang(SelectedRowIndex);
                    displaymonth.setText("");
                    displayday.setText("");
                    displayyear.setText("");
                    displaythuchi.setText("");
                    displaytype.setText("");
                    displaymoney.setText("");
                }
            } else {
                sumthu += Integer.parseInt(model.getValueAt(SelectedRowIndex,5).toString());
                totalthudisplaymaster.setText(Integer.toString(sumthu));
                model.removeRow(SelectedRowIndex);
                datathuchi.removebang(SelectedRowIndex);
                displaymonth.setText("");
                displayday.setText("");
                displayyear.setText("");
                displaythuchi.setText("");
                displaytype.setText("");
                displaymoney.setText("");
            }
            
        } catch (Exception ex){
            JOptionPane.showMessageDialog(null,"Bạn chưa chọn hàng để xóa");
        }
    }//GEN-LAST:event_removebuttonActionPerformed

    private void clearbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearbuttonActionPerformed
        displaymonth.setText("");
        displayday.setText("");
        displayyear.setText("");
        displaythuchi.setText("");
        displaytype.setText("");
        displaymoney.setText("");
        updatebutton.setEnabled(false);
        removebutton.setEnabled(false);
    }//GEN-LAST:event_clearbuttonActionPerformed

    private void savebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savebuttonActionPerformed
        createXml(jTable1,"data");
    }//GEN-LAST:event_savebuttonActionPerformed

    private void totalthudisplaymasterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalthudisplaymasterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalthudisplaymasterActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Search().setVisible(true);
            }
        });
    }//GEN-LAST:event_jButton1ActionPerformed

    protected DocumentBuilder domFactory = null;
    protected DocumentBuilder domBuilder = null;
    
    public void createXml(JTable table,String name){
        try{
            String file = name;
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
            
            Document doc = docBuilder.newDocument();
            Element rootElement = doc.createElement("Datas");
            doc.appendChild(rootElement);
            
            int i = 0;
            
            while(i < table.getRowCount()){
                Element row = doc.createElement("Data");
                rootElement.appendChild(row);

                Element elementmonth = doc.createElement("month");
                elementmonth.appendChild(doc.createTextNode(table.getModel().getValueAt(i,0)+""));
                row.appendChild(elementmonth);
                
                Element elementday = doc.createElement("day");
                elementday.appendChild(doc.createTextNode(table.getModel().getValueAt(i,1)+""));
                row.appendChild(elementday);
                
                Element elementyear = doc.createElement("year");
                elementyear.appendChild(doc.createTextNode(table.getModel().getValueAt(i,2)+""));
                row.appendChild(elementyear);
                
                Element elementthongtin = doc.createElement("thongtin");
                elementthongtin.appendChild(doc.createTextNode(table.getModel().getValueAt(i,3)+""));
                row.appendChild(elementthongtin);
                
                Element elementtype = doc.createElement("loai");
                elementtype.appendChild(doc.createTextNode(table.getModel().getValueAt(i,4)+""));
                row.appendChild(elementtype);
                
                Element elementmoney = doc.createElement("money");
                elementmoney.appendChild(doc.createTextNode(table.getModel().getValueAt(i,5)+""));
                row.appendChild(elementmoney);
                
                i++;
            }
            
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            
            DOMSource source = new DOMSource(doc);
            StreamResult result;
            
            try{
                FileOutputStream fileOutputStream = null;
                
                fileOutputStream = new FileOutputStream(new File(file+".xml"));
                
                result = new StreamResult(fileOutputStream);
                transformer.setOutputProperty(OutputKeys.INDENT, "yes");
                transformer.transform(source, result);
                try{
                    fileOutputStream.close();
                } catch(IOException e){
                    e.printStackTrace();
                }
            } catch(FileNotFoundException e){
                e.printStackTrace();
            }
        } catch(ParserConfigurationException pce){
            pce.printStackTrace();
        } catch(TransformerException te){
            te.printStackTrace();
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addbutton;
    private javax.swing.JButton clearbutton;
    private javax.swing.JTextField displayday;
    private javax.swing.JTextField displaymoney;
    private javax.swing.JTextField displaymonth;
    private javax.swing.JTextField displaythuchi;
    private javax.swing.JTextField displaytype;
    private javax.swing.JTextField displayyear;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton removebutton;
    private javax.swing.JButton savebutton;
    private javax.swing.JTextField totalthudisplaymaster;
    private javax.swing.JButton updatebutton;
    // End of variables declaration//GEN-END:variables
}