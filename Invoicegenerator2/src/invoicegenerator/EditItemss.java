/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package invoicegenerator;


import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import javax.swing.*;
import java.sql.*;
import java.sql.SQLException; 
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
public class EditItemss extends javax.swing.JFrame {

    /**
     * Creates new form EditItemss
     */
    public EditItemss() {
        initComponents();
        ShowProduct();
    }
    ResultSet rs=null,rs1=null;
    Connection con=null;
    Statement st=null,st1=null;
    @SuppressWarnings("unchecked")
     int Prnum;
    public void CountProd()
    {
       try
       {
         st1=con.createStatement();
         rs1=st1.executeQuery("select Max(PNo) from producttbl");
         rs1.next();
         Prnum=rs1.getInt(1)+1;
       }
       catch(Exception e)
               {
                   
               }
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        PrNametb = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Pricetb = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Prcat = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Filtercat = new javax.swing.JComboBox<>();
        Refreshbtn = new javax.swing.JButton();
        Deletebtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Itemlist = new javax.swing.JTable();
        Addbtn = new javax.swing.JButton();
        Home = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0,80));

        jLabel2.setFont(new java.awt.Font("Edwardian Script ITC", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 255, 255));
        jLabel2.setText("Edit Items");

        PrNametb.setBackground(new java.awt.Color(0, 0, 0));
        PrNametb.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        PrNametb.setForeground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 255, 255));
        jLabel3.setText("Name");

        Pricetb.setBackground(new java.awt.Color(0, 0, 0));
        Pricetb.setForeground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 255, 255));
        jLabel4.setText("Category");

        jLabel5.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 255, 255));
        jLabel5.setText("Price");

        Prcat.setBackground(new java.awt.Color(0, 0, 0));
        Prcat.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        Prcat.setForeground(new java.awt.Color(153, 255, 255));
        Prcat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Beverages", "Snacks", "Main Course", "Dessert", " " }));
        Prcat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrcatActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 255, 255));
        jLabel6.setText("Filter");

        jLabel7.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 255, 255));
        jLabel7.setText("Item List");

        Filtercat.setBackground(new java.awt.Color(0, 0, 0));
        Filtercat.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        Filtercat.setForeground(new java.awt.Color(153, 255, 255));
        Filtercat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Beverages", "Snacks", "Dessert", "Main course", " " }));
        Filtercat.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FiltercatItemStateChanged(evt);
            }
        });
        Filtercat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FiltercatActionPerformed(evt);
            }
        });

        Refreshbtn.setBackground(new java.awt.Color(0, 0, 0));
        Refreshbtn.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        Refreshbtn.setForeground(new java.awt.Color(102, 255, 255));
        Refreshbtn.setText("Refresh");
        Refreshbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefreshbtnActionPerformed(evt);
            }
        });

        Deletebtn.setBackground(new java.awt.Color(0, 0, 0));
        Deletebtn.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        Deletebtn.setForeground(new java.awt.Color(102, 255, 255));
        Deletebtn.setText("Delete");
        Deletebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeletebtnActionPerformed(evt);
            }
        });

        Itemlist.setBackground(new java.awt.Color(0, 0, 0));
        Itemlist.setForeground(new java.awt.Color(153, 255, 255));
        Itemlist.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Category", "Price"
            }
        ));
        Itemlist.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ItemlistMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Itemlist);

        Addbtn.setBackground(new java.awt.Color(0, 0, 0));
        Addbtn.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        Addbtn.setForeground(new java.awt.Color(102, 255, 255));
        Addbtn.setText("Add");
        Addbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddbtnActionPerformed(evt);
            }
        });

        Home.setBackground(new java.awt.Color(0, 0, 0));
        Home.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        Home.setForeground(new java.awt.Color(102, 255, 255));
        Home.setText("Home");
        Home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(226, 226, 226)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(PrNametb, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(54, 54, 54)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Prcat, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(70, 70, 70)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Pricetb, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(185, 185, 185))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Deletebtn))
                            .addGap(345, 345, 345)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addComponent(Home)
                        .addContainerGap())))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Filtercat, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(359, 359, 359)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Addbtn)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(Refreshbtn)
                .addGap(264, 264, 264))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Pricetb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Prcat)
                    .addComponent(PrNametb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Deletebtn)
                    .addComponent(Addbtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Filtercat)
                    .addComponent(Refreshbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(10, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Home, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(105, 105, 105))))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 890, 500));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/invc.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setPreferredSize(new java.awt.Dimension(1000, 800));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

      
    private void PrcatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrcatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PrcatActionPerformed

    private void FiltercatItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltercatItemStateChanged
        FilterProduct();
    }//GEN-LAST:event_FiltercatItemStateChanged

    private void FiltercatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FiltercatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FiltercatActionPerformed

    private void RefreshbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefreshbtnActionPerformed
        ShowProduct();
    }//GEN-LAST:event_RefreshbtnActionPerformed

     public void close(){
        WindowEvent closeWindow = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
    }
     
    private void DeletebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeletebtnActionPerformed
        if(PrNametb.getText().isEmpty()|| Pricetb.getText().isEmpty()|| Prcat.getSelectedIndex()==-1)
        {
            JOptionPane.showMessageDialog(this, "Missing Information");
        }
        else
        {
            try {
                CountProd();
                con= DriverManager.getConnection("jdbc:mysql://localhost:3306/invoicedb?zeroDateTimeBehavior=CONVERT_TO_NULL","root","sakshi");
                PreparedStatement pst=con.prepareStatement("delete from producttbl Where PNo= ?");
                pst.setInt(1,Key);

                int row=pst.executeUpdate();
                JOptionPane.showMessageDialog(this,"Item Deleted!!!");
                con.close();
                ShowProduct();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this,ex ) ;
            }
        }
    }//GEN-LAST:event_DeletebtnActionPerformed

        private void ShowProduct()
    {
        try{
            con= DriverManager.getConnection("jdbc:mysql://localhost:3306/invoicedb?zeroDateTimeBehavior=CONVERT_TO_NULL","root","sakshi"); 
            st= con.createStatement();
            rs=st.executeQuery("select * from producttbl");
            Itemlist.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch(Exception e)
        {
            
        }
    }
     private void FilterProduct()
    {
        try{
            con= DriverManager.getConnection("jdbc:mysql://localhost:3306/invoicedb?zeroDateTimeBehavior=CONVERT_TO_NULL","root","sakshi"); 
            st= con.createStatement();
            rs=st.executeQuery("select * from producttbl where Category='"+Filtercat.getSelectedItem().toString()+"'");
            Itemlist.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch(Exception e)
        {
          JOptionPane.showMessageDialog(this, e);
        }
    }
     int Key=0;
    private void ItemlistMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ItemlistMouseClicked
        DefaultTableModel model =(DefaultTableModel) Itemlist.getModel();
        int MyIndex=Itemlist.getSelectedRow();
        Key=Integer.valueOf(model.getValueAt(MyIndex,0).toString());
        PrNametb.setText(model.getValueAt(MyIndex,1).toString());
        //Prcat.setText(model.getValueAt(MyIndex,2).toString());
        Pricetb.setText(model.getValueAt(MyIndex,3).toString());

    }//GEN-LAST:event_ItemlistMouseClicked

    private void AddbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddbtnActionPerformed
        if(PrNametb.getText().isEmpty()|| Pricetb.getText().isEmpty()|| Prcat.getSelectedIndex()==-1)
        {
            JOptionPane.showMessageDialog(this, "Missing Information");
        }
        else
        {
            try {
                CountProd();
                con= DriverManager.getConnection("jdbc:mysql://localhost:3306/invoicedb?zeroDateTimeBehavior=CONVERT_TO_NULL","root","sakshi");
                PreparedStatement pst=con.prepareStatement("insert into producttbl values(?,?,?,?)");
                pst.setInt(1,Prnum );
                pst.setString(2, PrNametb.getText());
                pst.setString(3, Prcat.getSelectedItem().toString());
                pst.setInt(4, Integer.valueOf(Pricetb.getText()));
                int row=pst.executeUpdate();
                JOptionPane.showMessageDialog(this,"Item Added!!!");
                con.close();
                ShowProduct();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this,ex ) ;
            }
        }
    }//GEN-LAST:event_AddbtnActionPerformed

    private void HomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeActionPerformed
         close();
        home h= new home();
        h.setVisible(true); 
    }//GEN-LAST:event_HomeActionPerformed

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
            java.util.logging.Logger.getLogger(EditItemss.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditItemss.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditItemss.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditItemss.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditItemss().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Addbtn;
    private javax.swing.JButton Deletebtn;
    private javax.swing.JComboBox<String> Filtercat;
    private javax.swing.JButton Home;
    private javax.swing.JTable Itemlist;
    private javax.swing.JTextField PrNametb;
    private javax.swing.JComboBox<String> Prcat;
    private javax.swing.JTextField Pricetb;
    private javax.swing.JButton Refreshbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
