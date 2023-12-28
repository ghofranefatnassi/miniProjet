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
public class Employee extends javax.swing.JPanel {

    /**
     * Creates new form Customers
     */
    public Employee() {
        initComponents();
        tb_load();
    }
    public static String filename = "";
    public void tb_load(){
    try{
        DefaultTableModel dt = (DefaultTableModel) Etable.getModel();
        dt.setRowCount(0);
        Statement s = Bd.mycon().createStatement();
        ResultSet rs = s.executeQuery(" SELECT * FROM employee ");
        while (rs.next()){
            Vector v = new Vector ();
            v.add(rs.getString(1));
            v.add(rs.getString(2));
            v.add(rs.getString(3));
            v.add(rs.getString(4));
            v.add(rs.getString(5));
            v.add(rs.getString(6));
            v.add(rs.getString(7));
            v.add(rs.getString(8));
            
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
        Ename = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        Etpn = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        Bsave = new javax.swing.JButton();
        Search = new javax.swing.JButton();
        Bupdate = new javax.swing.JButton();
        Bdelete = new javax.swing.JButton();
        Eadd = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        Ety = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        Ecp = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        Emo = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        Epw = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        Ecpw = new javax.swing.JPasswordField();
        jSeparator10 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        Etable = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        Esid = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        Est = new javax.swing.JTextField();
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

        Ename.setFont(new java.awt.Font("Segoe UI Black", 0, 13)); // NOI18N
        Ename.setForeground(new java.awt.Color(190, 156, 199));
        Ename.setText("Name");
        Ename.setToolTipText("");
        Ename.setBorder(null);
        Ename.setDisabledTextColor(new java.awt.Color(151, 153, 155));
        Ename.setDragEnabled(true);
        Ename.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnameActionPerformed(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        Etpn.setFont(new java.awt.Font("Segoe UI Black", 0, 13)); // NOI18N
        Etpn.setForeground(new java.awt.Color(190, 156, 199));
        Etpn.setText("Phone number");
        Etpn.setToolTipText("");
        Etpn.setBorder(null);
        Etpn.setDisabledTextColor(new java.awt.Color(151, 153, 155));
        Etpn.setDragEnabled(true);
        Etpn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EtpnActionPerformed(evt);
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

        Search.setBackground(new java.awt.Color(190, 156, 199));
        Search.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Search.setText("Search");
        Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchActionPerformed(evt);
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

        Eadd.setFont(new java.awt.Font("Segoe UI Black", 0, 13)); // NOI18N
        Eadd.setForeground(new java.awt.Color(190, 156, 199));
        Eadd.setText("Address");
        Eadd.setToolTipText("");
        Eadd.setBorder(null);
        Eadd.setDisabledTextColor(new java.awt.Color(151, 153, 155));
        Eadd.setDragEnabled(true);
        Eadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EaddActionPerformed(evt);
            }
        });

        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));

        Ety.setFont(new java.awt.Font("Segoe UI Black", 0, 13)); // NOI18N
        Ety.setForeground(new java.awt.Color(190, 156, 199));
        Ety.setText("Type:");
        Ety.setToolTipText("");
        Ety.setBorder(null);
        Ety.setDisabledTextColor(new java.awt.Color(151, 153, 155));
        Ety.setDragEnabled(true);
        Ety.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EtyActionPerformed(evt);
            }
        });

        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));

        Ecp.setFont(new java.awt.Font("Segoe UI Black", 0, 13)); // NOI18N
        Ecp.setForeground(new java.awt.Color(190, 156, 199));
        Ecp.setText("Email");
        Ecp.setToolTipText("");
        Ecp.setBorder(null);
        Ecp.setDisabledTextColor(new java.awt.Color(151, 153, 155));
        Ecp.setDragEnabled(true);
        Ecp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EcpActionPerformed(evt);
            }
        });

        jSeparator7.setForeground(new java.awt.Color(0, 0, 0));

        Emo.setFont(new java.awt.Font("Segoe UI Black", 0, 13)); // NOI18N
        Emo.setForeground(new java.awt.Color(190, 156, 199));
        Emo.setText("Mobiel");
        Emo.setToolTipText("");
        Emo.setBorder(null);
        Emo.setDisabledTextColor(new java.awt.Color(151, 153, 155));
        Emo.setDragEnabled(true);
        Emo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmoActionPerformed(evt);
            }
        });

        jSeparator8.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator9.setForeground(new java.awt.Color(0, 0, 0));

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 0, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(190, 156, 199));
        jLabel6.setText("Password");

        Epw.setBorder(null);

        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 0, 13)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(190, 156, 199));
        jLabel7.setText("Confirm password");

        Ecpw.setBorder(null);

        jSeparator10.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Epw, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Emo, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Ecp, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Ety, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Eadd, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Etpn, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Ename, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 457, Short.MAX_VALUE)
                                .addComponent(jSeparator1)
                                .addComponent(jSeparator5)
                                .addComponent(jSeparator6)
                                .addComponent(jSeparator7)
                                .addComponent(jSeparator8)
                                .addComponent(jSeparator9)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Ecpw, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jSeparator10))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(Bsave)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Search)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Bupdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Bdelete)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(Ename, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Etpn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Eadd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Ety, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Ecp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Emo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(Epw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(Ecpw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Bsave)
                    .addComponent(Search)
                    .addComponent(Bupdate)
                    .addComponent(Bdelete))
                .addGap(30, 30, 30))
        );

        Ename.getAccessibleContext().setAccessibleName("");

        Etable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Etable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Employee name", "Phone number", "Address", "Type", "Email", "Mobiel per", "Password"
            }
        ));
        Etable.setGridColor(new java.awt.Color(0, 0, 0));
        Etable.setSelectionBackground(new java.awt.Color(255, 255, 255));
        Etable.setShowHorizontalLines(true);
        Etable.setSurrendersFocusOnKeystroke(true);
        Etable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EtableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Etable);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Employee", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 3, 16), new java.awt.Color(190, 156, 199))); // NOI18N

        Esid.setFont(new java.awt.Font("Segoe UI Black", 0, 13)); // NOI18N
        Esid.setForeground(new java.awt.Color(190, 156, 199));
        Esid.setText("Search ID");
        Esid.setToolTipText("");
        Esid.setBorder(null);
        Esid.setDisabledTextColor(new java.awt.Color(151, 153, 155));
        Esid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EsidActionPerformed(evt);
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
                    .addComponent(Esid, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(Esid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));

        Est.setFont(new java.awt.Font("Segoe UI Black", 0, 13)); // NOI18N
        Est.setForeground(new java.awt.Color(151, 153, 155));
        Est.setToolTipText("");
        Est.setBorder(null);
        Est.setDisabledTextColor(new java.awt.Color(151, 153, 155));
        Est.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EstActionPerformed(evt);
            }
        });
        Est.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                EstKeyReleased(evt);
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
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 468, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(550, 550, 550))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(12, 12, 12)
                                            .addComponent(jLabel1))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel2)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                                            .addComponent(jLabel3)
                                            .addGap(3, 3, 3)))
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Est, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 521, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Est, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(287, 287, 287))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BdeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BdeleteActionPerformed
        // Delete customer is here :
        String id = Esid.getText();
        try {
            Statement s = Bd.mycon().createStatement();
            s.executeUpdate(" DELETE FROM employee WHERE Eid = '"+id+"' ");
            JOptionPane.showMessageDialog(null,("Data deleted"));
            
        }catch (Exception e){
            System.out.println(e);
        }
        tb_load();
    }//GEN-LAST:event_BdeleteActionPerformed

    private void EtpnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EtpnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EtpnActionPerformed

    private void EnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EnameActionPerformed

    private void EsidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EsidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EsidActionPerformed

    private void BsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BsaveActionPerformed
        // Bsave here:
        String name = Ename.getText();
        String tp = Etpn.getText();
        String ad = Eadd.getText();
        String ty = Ety.getText();
        String cp = Ecp.getText();
        String mo = Emo.getText();
        String pw = Epw.getText();
        String cpw = Ecpw.getText();
        if (pw.equals(cpw)){
         try{
             Statement s = Bd.mycon().createStatement();
             s.executeUpdate(" INSERT INTO employee (Employee_name,ETp_Number,Eaddress,Etype,Econtact_per,Emobiel_per,Epassword) VALUES ('"+name+"','"+tp+"','"+ad+"','"+ty+"','"+cp+"','"+mo+"','"+pw+"')");
             JOptionPane.showMessageDialog(null,("Data saved"));
         }catch(SQLException e ){
             System.out.println(e);
         }
        }else{
            JOptionPane.showMessageDialog(null,("Password and Confirm password are diffrent please try agin "));
        }
         tb_load();
    }//GEN-LAST:event_BsaveActionPerformed

    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed
        // search id for customer:
        String search = Esid.getText();
        try{
            Statement s = Bd.mycon().createStatement();
            ResultSet rs = s.executeQuery(" SELECT * FROM employee WHERE Eid = '"+search+"' ");
            
            if (rs.next()){
                Ename.setText(rs.getString("Employee_name"));
                Etpn.setText(rs.getString("ETp_Number"));
                Eadd.setText(rs.getString("Eaddress"));
                Ety.setText(rs.getString("Etype"));
                Ecp.setText(rs.getString("Econtact_per"));
                Emo.setText(rs.getString("Emobiel_per"));
                Epw.setText(rs.getString("Epaswword"));
            }else{
                JOptionPane.showMessageDialog(null,("there is no employee with this ID"));
            }
        }catch(SQLException e){
            System.out.println(e);
        }
        tb_load();
    }//GEN-LAST:event_SearchActionPerformed

    private void BupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BupdateActionPerformed
        // Update customer is here:
        String name = Ename.getText();
        String tp = Etpn.getText();
        String id = Esid.getText();
        String ad = Eadd.getText();
        String ty = Ety.getText();
        String cp = Ecp.getText();
        String mo = Emo.getText();
        String pw = Epw.getText();
        String cpw = Ecpw.getText();
        if (pw.equals(cpw)){
        try {
            
            Statement s = Bd.mycon().createStatement();
            s.executeUpdate(" UPDATE employee SET Employee_name = '"+name+"' , ETp_Number = '"+tp+"', Eaddress = '"+ad+"', Etype = '"+ty+"', Econtact_per = '"+cp+"', Emobiel_per = '"+mo+"',Epassword='"+pw+"' WHERE Eid = '"+id+"' ");
            JOptionPane.showMessageDialog(null,("Data updated"));
        }catch(Exception e){
            System.out.println(e);
        }
        }else{
            JOptionPane.showMessageDialog(null,("Password and Confirm password are diffrent please try agin"));
        }
        tb_load();
    }//GEN-LAST:event_BupdateActionPerformed

    private void EtableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EtableMouseClicked
        // table here mouse clk :
        int r = Etable.getSelectedRow();
         String id = Etable.getValueAt(r,0).toString();
         String name = Etable.getValueAt(r,1).toString();
         String tp = Etable.getValueAt(r,2).toString();
         String ad = Etable.getValueAt(r,3).toString();
         String ty = Etable.getValueAt(r,4).toString();
         String cp = Etable.getValueAt(r,5).toString();
         String mo = Etable.getValueAt(r,6).toString();
         String pw = Etable.getValueAt(r,7).toString();
         Esid.setText(id);
         Ename.setText(name);
         Etpn.setText(tp);
         Eadd.setText(ad);
         Ety.setText(ty);
         Ecp.setText(cp);
         Emo.setText(mo);
         Epw.setText(pw);
         Ecpw.setText(pw);
        
    }//GEN-LAST:event_EtableMouseClicked

    private void EstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EstActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EstActionPerformed

    private void EstKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EstKeyReleased
        // search in table here :
         String name = Est.getText();
         try{
             DefaultTableModel dt = (DefaultTableModel) Etable.getModel();
             Statement s = Bd.mycon().createStatement();
             dt.setRowCount(0);
             ResultSet rs = s.executeQuery(" SELECT * FROM employee WHERE Employee_name LIKE ='%"+name+"%'  ");
             while (rs.next()){
                 Vector v = new Vector ();
                 v.add(rs.getString(1));
                 v.add(rs.getString(2));
                 v.add(rs.getString(3));
                 v.add(rs.getString(4));
                 v.add(rs.getString(5));
                 v.add(rs.getString(6));
                 v.add(rs.getString(7));
                 v.add(rs.getString(8));
                 
                 dt.addRow(v);
             }
         }catch (Exception e){
             tb_load();
         }
    }//GEN-LAST:event_EstKeyReleased

    private void EaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EaddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EaddActionPerformed

    private void EtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EtyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EtyActionPerformed

    private void EcpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EcpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EcpActionPerformed

    private void EmoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bdelete;
    private javax.swing.JButton Bsave;
    private javax.swing.JButton Bupdate;
    private javax.swing.JTextField Eadd;
    private javax.swing.JTextField Ecp;
    private javax.swing.JPasswordField Ecpw;
    private javax.swing.JTextField Emo;
    private javax.swing.JTextField Ename;
    private javax.swing.JPasswordField Epw;
    private javax.swing.JTextField Esid;
    private javax.swing.JTextField Est;
    private javax.swing.JTable Etable;
    private javax.swing.JTextField Etpn;
    private javax.swing.JTextField Ety;
    private javax.swing.JButton Search;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    // End of variables declaration//GEN-END:variables
}
