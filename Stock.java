
package miniprojet;

import java.sql.Statement;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class Stock extends javax.swing.JPanel {
    

 
    public Stock() {
        initComponents();
        
        tbload ();
    }

    public void tbload (){
        try{
            DefaultTableModel dt = (DefaultTableModel) Tstock.getModel();
            dt.setRowCount(0);
            
            Statement s = Bd.mycon().createStatement();
            ResultSet rs = s.executeQuery(" SELECT * FROM product ");
            
            while (rs.next()){
                Vector v = new Vector();
                v.add(rs.getString(1));
                v.add(rs.getString(2));
                v.add(rs.getString(3));
                v.add(rs.getString(4));
                v.add(rs.getString(6));
                v.add(rs.getString(8));
                v.add(rs.getString(9));
                
                dt.addRow(v);
            }
            
        }catch(SQLException e){
            
        }
       
    }
    
    public void paras(){
        
        String bcode = Skbc.getText();
        String pname = Skpn.getText();
        String sid = Sksid.getText();
        try{
            DefaultTableModel dt = (DefaultTableModel) Tstock.getModel();
            dt.setRowCount(0);
            Statement s = Bd.mycon().createStatement();
            ResultSet rs = s.executeQuery(" SELECT * FROM product WHERE Product_name LIKE '%"+pname+"%' AND Bar_code LIKE '%"+bcode+"%' AND SID LIKE '%"+sid+"%'  ");
            
            while(rs.next()){
                Vector v = new Vector ();
                v.add(rs.getString(1));
                v.add(rs.getString(2));
                v.add(rs.getString(3));
                v.add(rs.getString(4));
                v.add(rs.getString(5));
                v.add(rs.getString(6));
                v.add(rs.getString(7));
                dt.addRow(v);
            }
            
        }catch(SQLException e){
            System.out.println(e);
        }
        
        
    } 
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        Skbc = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Skpn = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Sksid = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tstock = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        pn = new javax.swing.JTextField();
        bc = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        stqty = new javax.swing.JTextField();
        addqty = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        Bsavee = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(238, 237, 255));

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTabbedPane1.setForeground(new java.awt.Color(190, 156, 199));
        jTabbedPane1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(190, 156, 199));
        jLabel4.setText("BAR CODE");

        Skbc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SkbcActionPerformed(evt);
            }
        });
        Skbc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                SkbcKeyReleased(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(190, 156, 199));
        jLabel5.setText("PRODUCT NAME");

        Skpn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SkpnActionPerformed(evt);
            }
        });
        Skpn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                SkpnKeyReleased(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(190, 156, 199));
        jLabel6.setText("SUPPLIER ID");

        Sksid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SksidActionPerformed(evt);
            }
        });
        Sksid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                SksidKeyReleased(evt);
            }
        });

        Tstock.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Product name", "Bar code", "Cost price", "Stock Qty", "Supplier ID", "Supplier name"
            }
        ));
        Tstock.setFocusable(false);
        Tstock.setGridColor(new java.awt.Color(0, 0, 0));
        Tstock.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(Tstock);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Skbc)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE))
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Skpn)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Sksid)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 896, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(209, 209, 209))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Sksid, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Skpn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Skbc, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("View stock", jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(190, 156, 199));
        jLabel7.setText("Stock qty:");

        jLabel8.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(190, 156, 199));
        jLabel8.setText("Product name");

        pn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pnActionPerformed(evt);
            }
        });
        pn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pnKeyReleased(evt);
            }
        });

        bc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcActionPerformed(evt);
            }
        });
        bc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                bcKeyReleased(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(190, 156, 199));
        jLabel9.setText("Bar code");

        stqty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stqtyActionPerformed(evt);
            }
        });
        stqty.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                stqtyKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pn, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(stqty, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bc, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(363, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stqty, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );

        addqty.setFont(new java.awt.Font("Segoe UI Black", 0, 13)); // NOI18N
        addqty.setForeground(new java.awt.Color(151, 153, 155));
        addqty.setToolTipText("");
        addqty.setBorder(null);
        addqty.setDisabledTextColor(new java.awt.Color(151, 153, 155));
        addqty.setDragEnabled(true);
        addqty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addqtyActionPerformed(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        Bsavee.setBackground(new java.awt.Color(190, 156, 199));
        Bsavee.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Bsavee.setText("Save");
        Bsavee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BsaveeActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(190, 156, 199));
        jLabel10.setText("Add/less Qty :  ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator1)
                            .addComponent(addqty, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(Bsavee)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addqty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(Bsavee))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(369, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Add stock", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 912, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        jTabbedPane1.getAccessibleContext().setAccessibleName("Voir le stock");
    }// </editor-fold>//GEN-END:initComponents

    private void SkbcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SkbcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SkbcActionPerformed

    private void SkbcKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SkbcKeyReleased
       paras();
    }//GEN-LAST:event_SkbcKeyReleased

    private void SkpnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SkpnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SkpnActionPerformed

    private void SkpnKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SkpnKeyReleased
       paras();
    }//GEN-LAST:event_SkpnKeyReleased

    private void SksidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SksidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SksidActionPerformed

    private void SksidKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SksidKeyReleased
        paras();
    }//GEN-LAST:event_SksidKeyReleased

    private void stqtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stqtyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stqtyActionPerformed

    private void stqtyKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_stqtyKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_stqtyKeyReleased

    private void bcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcActionPerformed

             String  bcr = bc.getText();
        try {
            
            Statement s = Bd.mycon().createStatement();
            ResultSet rs = s.executeQuery("SELECT Product_name,SUM(Qty) FROM product  WHERE Bar_code ='"+bcr+"'  ");
            if (rs.next()) { 
                
                pn.setText(rs.getString("Product_name"));
                stqty.setText(rs.getString("SUM(Qty)"));
                
            }
         
        } catch (SQLException e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_bcActionPerformed

    private void bcKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bcKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_bcKeyReleased

    private void pnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pnActionPerformed

    private void pnKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pnKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_pnKeyReleased

    private void addqtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addqtyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addqtyActionPerformed

    private void BsaveeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BsaveeActionPerformed
        // Update qty :
        String bcode = bc.getText();
        Double add =Double.valueOf(addqty.getText());
        Double qty = Double.valueOf(stqty.getText());
        Double newqty = add + qty ;

        try {

            Statement s = Bd.mycon().createStatement();
            s.executeUpdate(" UPDATE product SET Qty = '"+newqty+"'WHERE Bar_code = '"+bcode+"' ");
            JOptionPane.showMessageDialog(null,("Data updated"));
        }catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_BsaveeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bsavee;
    private javax.swing.JTextField Skbc;
    private javax.swing.JTextField Skpn;
    private javax.swing.JTextField Sksid;
    private javax.swing.JTable Tstock;
    private javax.swing.JTextField addqty;
    private javax.swing.JTextField bc;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField pn;
    private javax.swing.JTextField stqty;
    // End of variables declaration//GEN-END:variables
}
