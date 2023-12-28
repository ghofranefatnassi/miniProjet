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

public class Supplier extends javax.swing.JPanel {
public static String filename = "";
    public Supplier() {
        initComponents();
        tb_load();
    }
    
    public void tb_load(){
    try{
        DefaultTableModel dt = (DefaultTableModel) Stable.getModel();
        dt.setRowCount(0);
        Statement s = Bd.mycon().createStatement();
        ResultSet rs = s.executeQuery(" SELECT * FROM supplier ");
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
        Sname = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        Stpn = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        Bsave = new javax.swing.JButton();
        Bsearch = new javax.swing.JButton();
        Bupdate = new javax.swing.JButton();
        Bdelete = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JSeparator();
        Sadd = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        Sty = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        Scp = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        Smo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Stable = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        Ssid = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        Sst = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(238, 237, 255));
        setPreferredSize(new java.awt.Dimension(763, 0));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        Sname.setFont(new java.awt.Font("Segoe UI Black", 0, 13)); // NOI18N
        Sname.setForeground(new java.awt.Color(190, 156, 199));
        Sname.setText("Name");
        Sname.setToolTipText("");
        Sname.setBorder(null);
        Sname.setDisabledTextColor(new java.awt.Color(151, 153, 155));
        Sname.setDragEnabled(true);
        Sname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SnameActionPerformed(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        Stpn.setFont(new java.awt.Font("Segoe UI Black", 0, 13)); // NOI18N
        Stpn.setForeground(new java.awt.Color(190, 156, 199));
        Stpn.setText("Phone number");
        Stpn.setToolTipText("");
        Stpn.setBorder(null);
        Stpn.setDisabledTextColor(new java.awt.Color(151, 153, 155));
        Stpn.setDragEnabled(true);
        Stpn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StpnActionPerformed(evt);
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

        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));

        Sadd.setFont(new java.awt.Font("Segoe UI Black", 0, 13)); // NOI18N
        Sadd.setForeground(new java.awt.Color(190, 156, 199));
        Sadd.setText("Address:");
        Sadd.setToolTipText("");
        Sadd.setBorder(null);
        Sadd.setDisabledTextColor(new java.awt.Color(151, 153, 155));
        Sadd.setDragEnabled(true);
        Sadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaddActionPerformed(evt);
            }
        });

        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));

        Sty.setFont(new java.awt.Font("Segoe UI Black", 0, 13)); // NOI18N
        Sty.setForeground(new java.awt.Color(190, 156, 199));
        Sty.setText("Type:");
        Sty.setToolTipText("");
        Sty.setBorder(null);
        Sty.setDisabledTextColor(new java.awt.Color(151, 153, 155));
        Sty.setDragEnabled(true);
        Sty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StyActionPerformed(evt);
            }
        });

        jSeparator7.setForeground(new java.awt.Color(0, 0, 0));

        Scp.setFont(new java.awt.Font("Segoe UI Black", 0, 13)); // NOI18N
        Scp.setForeground(new java.awt.Color(190, 156, 199));
        Scp.setText("Email");
        Scp.setToolTipText("");
        Scp.setBorder(null);
        Scp.setDisabledTextColor(new java.awt.Color(151, 153, 155));
        Scp.setDragEnabled(true);
        Scp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ScpActionPerformed(evt);
            }
        });

        jSeparator8.setForeground(new java.awt.Color(0, 0, 0));

        Smo.setFont(new java.awt.Font("Segoe UI Black", 0, 13)); // NOI18N
        Smo.setForeground(new java.awt.Color(190, 156, 199));
        Smo.setText("Mobiel:");
        Smo.setToolTipText("");
        Smo.setBorder(null);
        Smo.setDisabledTextColor(new java.awt.Color(151, 153, 155));
        Smo.setDragEnabled(true);
        Smo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SmoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Smo, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Scp, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Sty, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Sadd, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Stpn, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Sname, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 457, Short.MAX_VALUE)
                            .addComponent(jSeparator1)
                            .addComponent(jSeparator5)
                            .addComponent(jSeparator6)
                            .addComponent(jSeparator7)
                            .addComponent(jSeparator8)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(Bsave)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Bsearch)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Bupdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Bdelete)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(Sname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Stpn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Sadd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Sty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Scp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Smo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Bsave)
                    .addComponent(Bsearch)
                    .addComponent(Bupdate)
                    .addComponent(Bdelete))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        Sname.getAccessibleContext().setAccessibleName("");

        Stable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Stable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Supplier name", "Phone number", "Address", "Type", "Email", "Mobiel "
            }
        ));
        Stable.setGridColor(new java.awt.Color(0, 0, 0));
        Stable.setSelectionBackground(new java.awt.Color(255, 255, 255));
        Stable.setShowHorizontalLines(true);
        Stable.setSurrendersFocusOnKeystroke(true);
        Stable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                StableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Stable);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Supplier:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 3, 16), new java.awt.Color(190, 156, 199))); // NOI18N

        Ssid.setFont(new java.awt.Font("Segoe UI Black", 0, 13)); // NOI18N
        Ssid.setForeground(new java.awt.Color(190, 156, 199));
        Ssid.setText("Search ID");
        Ssid.setToolTipText("");
        Ssid.setBorder(null);
        Ssid.setDisabledTextColor(new java.awt.Color(151, 153, 155));
        Ssid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SsidActionPerformed(evt);
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
                    .addComponent(Ssid, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(96, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(Ssid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        Sst.setFont(new java.awt.Font("Segoe UI Black", 0, 13)); // NOI18N
        Sst.setForeground(new java.awt.Color(151, 153, 155));
        Sst.setToolTipText("");
        Sst.setBorder(null);
        Sst.setDisabledTextColor(new java.awt.Color(151, 153, 155));
        Sst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SstActionPerformed(evt);
            }
        });
        Sst.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                SstKeyReleased(evt);
            }
        });

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel4)
                                        .addGap(3, 3, 3)))
                                .addComponent(jSeparator4))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                                .addComponent(jLabel6)
                                .addGap(544, 544, 544))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jLabel5)
                                .addGap(2, 2, 2)
                                .addComponent(Sst, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 346, Short.MAX_VALUE)))
                        .addContainerGap())))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(jLabel3)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel2)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                                    .addComponent(jLabel1)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Sst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addGap(358, 358, 358))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(120, 120, 120)))
                .addComponent(jLabel3)
                .addGap(0, 0, Short.MAX_VALUE))
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 483, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BdeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BdeleteActionPerformed
        // Delete customer is here :
        String id = Ssid.getText();
        try {
            Statement s = Bd.mycon().createStatement();
            s.executeUpdate(" DELETE FROM supplier WHERE Sid = '"+id+"' ");
            JOptionPane.showMessageDialog(null,("Data deleted"));
            
        }catch (Exception e){
            System.out.println(e);
        }
        tb_load();
    }//GEN-LAST:event_BdeleteActionPerformed

    private void StpnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StpnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StpnActionPerformed

    private void SnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SnameActionPerformed

    private void SsidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SsidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SsidActionPerformed

    
    
    private void BsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BsaveActionPerformed
        // Bsave here:
        String name = Sname.getText();
        String tp = Stpn.getText();
        String ad = Sadd.getText();
        String ty = Sty.getText();
        String cp = Scp.getText();
        String mo = Smo.getText();
         try{
             Statement s = Bd.mycon().createStatement();
             s.executeUpdate(" INSERT INTO supplier (Supplier_name,STp_Number,Saddress,Stype,Scontact_per,Smobiel_pe) VALUES ('"+name+"','"+tp+"','"+ad+"','"+ty+"','"+cp+"','"+mo+"')");
             JOptionPane.showMessageDialog(null,("Data saved"));
         }catch(SQLException e ){
             System.out.println(e);
         }
         tb_load();
    }//GEN-LAST:event_BsaveActionPerformed

    private void BsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BsearchActionPerformed
        // search id for customer:
        String search = Ssid.getText();
        try{
            Statement s = Bd.mycon().createStatement();
            ResultSet rs = s.executeQuery(" SELECT * FROM supplier WHERE Sid = '"+search+"' ");
            
            if (rs.next()){
                Sname.setText(rs.getString("Supplier_name"));
                Stpn.setText(rs.getString("STp_Number"));
                Sadd.setText(rs.getString("Saddress"));
                Sty.setText(rs.getString("Stype"));
                Scp.setText(rs.getString("Scontact_per"));
                Smo.setText(rs.getString("Smobiel_pe"));
            }
        }catch(SQLException e){
            System.out.println(e);
        }
        tb_load();
    }//GEN-LAST:event_BsearchActionPerformed

    private void BupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BupdateActionPerformed
        // Update customer is here:
        String name = Sname.getText();
        String tp = Stpn.getText();
        String ad = Sadd.getText();
        String ty = Sty.getText();
        String cp = Scp.getText();
        String mo = Smo.getText();
        String id = Ssid.getText();
        
        try {
            
            Statement s = Bd.mycon().createStatement();
            s.executeUpdate(" UPDATE supplier SET Supplier_name = '"+name+"' , STp_Number = '"+tp+"' , Saddress = '"+ad+"' , Stype = '"+ty+"' , Scontact_per = '"+cp+"' , Smobiel_pe = '"+mo+"' WHERE Sid = '"+id+"' ");
            JOptionPane.showMessageDialog(null,("Data updated"));
        }catch(Exception e){
            System.out.println(e);
        }
        tb_load();
    }//GEN-LAST:event_BupdateActionPerformed

    private void StableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StableMouseClicked
        // table here mouse clk :
        int r = Stable.getSelectedRow();
         String id = Stable.getValueAt(r,0).toString();
         String name = Stable.getValueAt(r,1).toString();
         String tp = Stable.getValueAt(r,2).toString();
         String ad = Stable.getValueAt(r,3).toString();
         String ty = Stable.getValueAt(r,4).toString();
         String cp = Stable.getValueAt(r,5).toString();
         String mo = Stable.getValueAt(r,6).toString();
         
         Ssid.setText(id);
         Sname.setText(name);
         Stpn.setText(tp);
         Sadd.setText(ad);
         Sty.setText(ty);
         Scp.setText(cp);
         Smo.setText(mo);
        
    }//GEN-LAST:event_StableMouseClicked

    private void SstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SstActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SstActionPerformed

    private void SstKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SstKeyReleased
        // search in table here :
         String name = Sst.getText();
         try{
             DefaultTableModel dt = (DefaultTableModel) Stable.getModel();
             Statement s = Bd.mycon().createStatement();
             dt.setRowCount(0);
             ResultSet rs = s.executeQuery(" SELECT * FROM supplier WHERE Supplier_name LIKE '%"+name+"%'  ");
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
         }catch (Exception e){
             tb_load();
         }
    }//GEN-LAST:event_SstKeyReleased

    private void SaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SaddActionPerformed

    private void StyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StyActionPerformed

    private void ScpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ScpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ScpActionPerformed

    private void SmoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SmoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SmoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bdelete;
    private javax.swing.JButton Bsave;
    private javax.swing.JButton Bsearch;
    private javax.swing.JButton Bupdate;
    private javax.swing.JTextField Sadd;
    private javax.swing.JTextField Scp;
    private javax.swing.JTextField Smo;
    private javax.swing.JTextField Sname;
    private javax.swing.JTextField Ssid;
    private javax.swing.JTextField Sst;
    private javax.swing.JTable Stable;
    private javax.swing.JTextField Stpn;
    private javax.swing.JTextField Sty;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
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
