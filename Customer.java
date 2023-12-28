/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package miniprojet;

/**
 *
 * @author DellGhofrane
 */
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Customer extends javax.swing.JPanel {

    /**
     * Creates new form Customers
     */
    public Customer() {
        initComponents();
        tb_load();
    }
    public static String filename = "";
    public void tb_load(){
    try{
        DefaultTableModel dt = (DefaultTableModel) Ctable.getModel();
        dt.setRowCount(0);
        Statement s = Bd.mycon().createStatement();
        ResultSet rs = s.executeQuery(" SELECT * FROM customer ");
        while (rs.next()){
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
        
    
    } catch(Exception e){
    System.out.println(e);
     }
    }


    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        Cname = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        Ctpn = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        Bsave = new javax.swing.JButton();
        Bsearch = new javax.swing.JButton();
        Bupdate = new javax.swing.JButton();
        Bdelete = new javax.swing.JButton();
        Cadd = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        Cty = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        Ccp = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        Cmo = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        Ctable = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        Csid = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        Cst = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(763, 0));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        Cname.setFont(new java.awt.Font("Segoe UI Black", 0, 13)); // NOI18N
        Cname.setForeground(new java.awt.Color(190, 156, 199));
        Cname.setText("Name:");
        Cname.setToolTipText("");
        Cname.setBorder(null);
        Cname.setDisabledTextColor(new java.awt.Color(151, 153, 155));
        Cname.setDragEnabled(true);
        Cname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CnameActionPerformed(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        Ctpn.setFont(new java.awt.Font("Segoe UI Black", 0, 13)); // NOI18N
        Ctpn.setForeground(new java.awt.Color(190, 156, 199));
        Ctpn.setText("Phone number:");
        Ctpn.setToolTipText("");
        Ctpn.setBorder(null);
        Ctpn.setDisabledTextColor(new java.awt.Color(151, 153, 155));
        Ctpn.setDragEnabled(true);
        Ctpn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CtpnActionPerformed(evt);
            }
        });

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        Bsave.setBackground(new java.awt.Color(190, 156, 199));
        Bsave.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Bsave.setText("Save");
        Bsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BsaveActionPerformed(evt);
            }
        });

        Bsearch.setBackground(new java.awt.Color(190, 156, 199));
        Bsearch.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Bsearch.setText("Search");
        Bsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BsearchActionPerformed(evt);
            }
        });

        Bupdate.setBackground(new java.awt.Color(190, 156, 199));
        Bupdate.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Bupdate.setText("Update");
        Bupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BupdateActionPerformed(evt);
            }
        });

        Bdelete.setBackground(new java.awt.Color(190, 156, 199));
        Bdelete.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Bdelete.setText("Delete");
        Bdelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BdeleteActionPerformed(evt);
            }
        });

        Cadd.setFont(new java.awt.Font("Segoe UI Black", 0, 13)); // NOI18N
        Cadd.setForeground(new java.awt.Color(190, 156, 199));
        Cadd.setText("Address:");
        Cadd.setToolTipText("");
        Cadd.setBorder(null);
        Cadd.setDisabledTextColor(new java.awt.Color(151, 153, 155));
        Cadd.setDragEnabled(true);
        Cadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CaddActionPerformed(evt);
            }
        });

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));

        Cty.setFont(new java.awt.Font("Segoe UI Black", 0, 13)); // NOI18N
        Cty.setForeground(new java.awt.Color(190, 156, 199));
        Cty.setText("Type:");
        Cty.setToolTipText("");
        Cty.setBorder(null);
        Cty.setDisabledTextColor(new java.awt.Color(151, 153, 155));
        Cty.setDragEnabled(true);
        Cty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CtyActionPerformed(evt);
            }
        });

        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));

        Ccp.setFont(new java.awt.Font("Segoe UI Black", 0, 13)); // NOI18N
        Ccp.setForeground(new java.awt.Color(190, 156, 199));
        Ccp.setText("Personal contact:");
        Ccp.setToolTipText("");
        Ccp.setBorder(null);
        Ccp.setDisabledTextColor(new java.awt.Color(151, 153, 155));
        Ccp.setDragEnabled(true);
        Ccp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CcpActionPerformed(evt);
            }
        });

        jSeparator7.setForeground(new java.awt.Color(0, 0, 0));

        Cmo.setFont(new java.awt.Font("Segoe UI Black", 0, 13)); // NOI18N
        Cmo.setForeground(new java.awt.Color(190, 156, 199));
        Cmo.setText("Mobiel:");
        Cmo.setToolTipText("");
        Cmo.setBorder(null);
        Cmo.setDisabledTextColor(new java.awt.Color(151, 153, 155));
        Cmo.setDragEnabled(true);
        Cmo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CmoActionPerformed(evt);
            }
        });

        jSeparator8.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Ccp, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cty, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cadd, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ctpn, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cname, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 457, Short.MAX_VALUE)
                    .addComponent(jSeparator1)
                    .addComponent(jSeparator4)
                    .addComponent(jSeparator6)
                    .addComponent(jSeparator7)
                    .addComponent(jSeparator8)
                    .addComponent(Cmo, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Bsave)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Bsearch)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Bupdate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Bdelete)
                .addGap(89, 89, 89))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Cname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Ctpn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Cadd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Cty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Ccp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Cmo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Bsave)
                    .addComponent(Bsearch)
                    .addComponent(Bupdate)
                    .addComponent(Bdelete))
                .addGap(58, 58, 58))
        );

        Cname.getAccessibleContext().setAccessibleName("");

        Ctable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Ctable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Phone number", "Address", "Type", "Personal contact", "Mobiel per"
            }
        ));
        Ctable.setGridColor(new java.awt.Color(0, 0, 0));
        Ctable.setSelectionBackground(new java.awt.Color(255, 255, 255));
        Ctable.setShowHorizontalLines(true);
        Ctable.setSurrendersFocusOnKeystroke(true);
        Ctable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CtableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Ctable);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Customer:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 3, 16), new java.awt.Color(190, 156, 199))); // NOI18N

        Csid.setFont(new java.awt.Font("Segoe UI Black", 0, 13)); // NOI18N
        Csid.setForeground(new java.awt.Color(190, 156, 199));
        Csid.setText("Search ID:");
        Csid.setToolTipText("");
        Csid.setBorder(null);
        Csid.setDisabledTextColor(new java.awt.Color(151, 153, 155));
        Csid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CsidActionPerformed(evt);
            }
        });

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Csid, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(96, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(Csid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));

        Cst.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        Cst.setForeground(new java.awt.Color(151, 153, 155));
        Cst.setBorder(null);
        Cst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CstActionPerformed(evt);
            }
        });
        Cst.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                CstKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator5)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(544, 544, 544))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(262, 262, 262)
                                .addComponent(jLabel2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Cst, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Cst, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addGap(292, 292, 292)))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BdeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BdeleteActionPerformed
        // Delete customer is here :
        String id = Csid.getText();
        try {
            Statement s = Bd.mycon().createStatement();
            s.executeUpdate(" DELETE FROM customer WHERE Cid = '"+id+"' ");
            JOptionPane.showMessageDialog(null,("Data deleted"));
            
        }catch (Exception e){
            System.out.println(e);
        }
        tb_load();
    }//GEN-LAST:event_BdeleteActionPerformed

    private void CtpnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CtpnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CtpnActionPerformed

    private void CnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CnameActionPerformed

    
    
    private void BsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BsaveActionPerformed
        // Bsave here:
        String name = Cname.getText();
        String tp = Ctpn.getText();
        String ad = Cadd.getText();
        String ty = Cty.getText();
        String cp = Ccp.getText();
        String mo = Cmo.getText();
         try{
             Statement s = Bd.mycon().createStatement();
             s.executeUpdate(" INSERT INTO Customer (Customer_name,Tp_Number,Address,Type,Contact_per,Mobiel_per) VALUES ('"+name+"','"+tp+"','"+ad+"','"+ty+"','"+cp+"','"+mo+"')");
             JOptionPane.showMessageDialog(null,("Data saved"));
         }catch(SQLException e ){
             System.out.println(e);
         }
         tb_load();
    }//GEN-LAST:event_BsaveActionPerformed

    private void BsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BsearchActionPerformed
        // search id for customer:
        String search = Csid.getText();
        try{
            Statement s = Bd.mycon().createStatement();
            ResultSet rs = s.executeQuery(" SELECT * FROM customer WHERE Cid = '"+search+"' ");
            
            if (rs.next()){
                Cname.setText(rs.getString("Customer_name"));
                Ctpn.setText(rs.getString("Tp_Number"));
                Cadd.setText(rs.getString("Address"));
                Cty.setText(rs.getString("Type"));
                Ccp.setText(rs.getString("Contact_per"));
                Cmo.setText(rs.getString("Mobiel_per"));
                
            }
        }catch(SQLException e){
            System.out.println(e);
        }
        tb_load();
    }//GEN-LAST:event_BsearchActionPerformed

    private void BupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BupdateActionPerformed
        // Update customer is here:
        String name = Cname.getText();
        String tp = Ctpn.getText();
        String ad = Cadd.getText();
        String ty = Cty.getText();
        String cp = Ccp.getText();
        String mo = Cmo.getText();
        String id = Csid.getText();
        
        try {
            
            Statement s = Bd.mycon().createStatement();
            s.executeUpdate(" UPDATE customer SET Customer_name = '"+name+"' , Tp_Number = '"+tp+"', Address ='"+ad+"', Type ='"+ty+"', Contact_per ='"+cp+"', Mobiel_per ='"+mo+"' WHERE Cid = '"+id+"' ");
            JOptionPane.showMessageDialog(null,("Data updated"));
        }catch(Exception e){
            System.out.println(e);
        }
        tb_load();
    }//GEN-LAST:event_BupdateActionPerformed

    private void CtableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CtableMouseClicked
        // table here mouse clk :
        int r = Ctable.getSelectedRow();
         String id = Ctable.getValueAt(r,0).toString();
         String name = Ctable.getValueAt(r,1).toString();
         String tp = Ctable.getValueAt(r,2).toString();
         String ad = Ctable.getValueAt(r,3).toString();
         String ty = Ctable.getValueAt(r,4).toString();
         String cp = Ctable.getValueAt(r,5).toString();
         String mo = Ctable.getValueAt(r,6).toString();
         Csid.setText(id);
         Cname.setText(name);
         Ctpn.setText(tp);
         Cadd.setText(ad);
         Cty.setText(ty);
         Ccp.setText(cp);
         Cmo.setText(mo);
        
    }//GEN-LAST:event_CtableMouseClicked

    private void CstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CstActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CstActionPerformed

    private void CstKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CstKeyReleased
        // search table:
        String name = Cst.getText();
        try {
            DefaultTableModel dt = (DefaultTableModel) Ctable.getModel(); 
            dt.setRowCount(0);
            Statement s= Bd.mycon().createStatement();
            ResultSet rs = s.executeQuery(" SELECT * FROM customer WHERE Customer_name LIKE '%"+name+"%'");
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
            
            
        }catch (Exception e){
            tb_load();
        }
        
    }//GEN-LAST:event_CstKeyReleased

    private void CsidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CsidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CsidActionPerformed

    private void CaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CaddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CaddActionPerformed

    private void CtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CtyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CtyActionPerformed

    private void CcpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CcpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CcpActionPerformed

    private void CmoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CmoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bdelete;
    private javax.swing.JButton Bsave;
    private javax.swing.JButton Bsearch;
    private javax.swing.JButton Bupdate;
    private javax.swing.JTextField Cadd;
    private javax.swing.JTextField Ccp;
    private javax.swing.JTextField Cmo;
    private javax.swing.JTextField Cname;
    private javax.swing.JTextField Csid;
    private javax.swing.JTextField Cst;
    private javax.swing.JTable Ctable;
    private javax.swing.JTextField Ctpn;
    private javax.swing.JTextField Cty;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    // End of variables declaration//GEN-END:variables
}
