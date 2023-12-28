/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package miniprojet;
import java.awt.HeadlessException;
import java.lang.*;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.lang.Integer;
import java.util.HashMap;


public class Sale extends javax.swing.JPanel {
    
    public static String cus_id = "0";
    public static String cart_id = "0";
    public Double stcok_qty = 0.0;
    
    public Sale() {
        initComponents();
        data_load();
        stockup ();
    }
    
    public void data_load(){
        
        // load customer:
        try{
            
            Statement s = Bd.mycon().createStatement();
            ResultSet rs = s.executeQuery(" SELECT * FROM customer ");
            Vector v = new Vector ();
            while (rs.next()){
                v.add(rs.getString("Customer_name"));
                DefaultComboBoxModel com = new DefaultComboBoxModel(v) ;
                Scus.setModel(com);
                
            }
        }catch (SQLException e){
            System.out.println(e);
        }
   
    }
    
    public void stockup (){
        
        DefaultTableModel dt = (DefaultTableModel) Tsale.getModel();
        int rc = dt.getRowCount();
        
        for (int i = 0; i<rc; i++){
            
            String bcode = dt.getValueAt(i,2).toString();
            String sell_qty = dt.getValueAt(i,3).toString();
            
            System.out.println(bcode);
            System.out.println(sell_qty);
            
            try{
                
                Statement s = Bd.mycon().createStatement();
                ResultSet rs = s.executeQuery(" SELECT Qty FROM product WHERE Bar_code = '"+bcode+"' ");
                
                while (rs.next()){
                    
                    stcok_qty = Double.valueOf(rs.getString(("Qty")));
                    
                }
                
            } catch(Exception e){
                System.out.println(e);
            }  
            
            Double st_qty = stcok_qty ;
            Double sel_qty = Double.valueOf(sell_qty);
            Double new_qty = st_qty - sel_qty ;
            
            String nqty = String.valueOf(new_qty);
            
            try{
                
                Statement ss = Bd.mycon().createStatement();
                ss.executeUpdate(" UPDATE product SET Qty = '"+nqty+"' WHERE Bar_code = '"+bcode+"' ");
                
            }catch(Exception e){
                System.out.println(e);
            }
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        inid = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Scus = new javax.swing.JComboBox<>();
        Tqy = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        tp = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        br_code = new javax.swing.JLabel();
        up = new javax.swing.JLabel();
        Spro = new javax.swing.JLabel();
        stlab = new javax.swing.JLabel();
        Stqty = new javax.swing.JLabel();
        stlab1 = new javax.swing.JLabel();
        Pcat = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tsale = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        Tpaid = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        t_amount = new javax.swing.JLabel();
        bl = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        t_qty = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        Badd = new javax.swing.JButton();
        Brev = new javax.swing.JButton();
        Brevall = new javax.swing.JButton();
        pp = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        barcode_read = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(238, 237, 255));

        jPanel1.setBackground(new java.awt.Color(238, 237, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Basket:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 3, 16), new java.awt.Color(190, 156, 199))); // NOI18N

        jLabel1.setBackground(new java.awt.Color(238, 237, 255));
        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 3, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(190, 156, 199));
        jLabel1.setText("INVOICE №:");

        inid.setBackground(new java.awt.Color(238, 237, 255));
        inid.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        inid.setForeground(new java.awt.Color(151, 153, 155));
        inid.setText("01");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inid, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(inid))
                .addGap(124, 124, 124))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(151, 153, 155));
        jLabel2.setText("Client");

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(151, 153, 155));
        jLabel3.setText("Product:");

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(151, 153, 155));
        jLabel4.setText("Qty:");

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(151, 153, 155));
        jLabel5.setText("Unit price");

        Scus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Client" }));
        Scus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ScusActionPerformed(evt);
            }
        });

        Tqy.setText("00");
        Tqy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TqyActionPerformed(evt);
            }
        });
        Tqy.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TqyKeyReleased(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(151, 153, 155));
        jLabel9.setText("Total price");

        tp.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        tp.setText("00.00");

        jLabel10.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(151, 153, 155));
        jLabel10.setText("Bar code");

        br_code.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        br_code.setText("...");

        up.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        up.setText("00.00");

        Spro.setText("..");

        stlab.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        stlab.setForeground(new java.awt.Color(151, 153, 155));
        stlab.setText("Stock Qty :");

        Stqty.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        Stqty.setText("00.00");

        stlab1.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        stlab1.setForeground(new java.awt.Color(151, 153, 155));
        stlab1.setText("Category");

        Pcat.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        Pcat.setText(".");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Scus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Spro, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Tqy, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(stlab)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Stqty)
                        .addGap(18, 18, 18)
                        .addComponent(stlab1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Pcat, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(up)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tp)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(br_code)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(Scus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(up)
                    .addComponent(Spro)
                    .addComponent(jLabel9)
                    .addComponent(tp)
                    .addComponent(jLabel10)
                    .addComponent(br_code))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(stlab1)
                        .addComponent(Pcat))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(stlab)
                        .addComponent(Stqty))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(Tqy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        Tsale.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "INID", "Product", "Bar code", "Qty", "Unit price", "Prix totale"
            }
        ));
        Tsale.setGridColor(new java.awt.Color(0, 0, 0));
        Tsale.setRowSelectionAllowed(false);
        Tsale.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(Tsale);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(151, 153, 155));
        jLabel6.setText("Amount paied:");

        Tpaid.setText("0");
        Tpaid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TpaidActionPerformed(evt);
            }
        });
        Tpaid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TpaidKeyReleased(evt);
            }
        });

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(151, 153, 155));
        jLabel7.setText("Total amount");

        jLabel8.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(151, 153, 155));
        jLabel8.setText("Balance");

        t_amount.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        t_amount.setText("00.00");

        bl.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        bl.setText("00.00");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(t_amount)
                    .addComponent(bl))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(t_amount))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(bl))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jLabel11.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(151, 153, 155));
        jLabel11.setText("Total qty:");

        t_qty.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        t_qty.setText("00.00");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Tpaid, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 196, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(t_qty)
                .addGap(141, 141, 141)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(Tpaid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(t_qty)
                            .addComponent(jLabel11))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(0, 12, Short.MAX_VALUE)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        Badd.setBackground(new java.awt.Color(190, 156, 199));
        Badd.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Badd.setText("Add to basket");
        Badd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BaddActionPerformed(evt);
            }
        });

        Brev.setBackground(new java.awt.Color(190, 156, 199));
        Brev.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Brev.setText("Delete");
        Brev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BrevActionPerformed(evt);
            }
        });

        Brevall.setBackground(new java.awt.Color(190, 156, 199));
        Brevall.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Brevall.setText("Delete all");
        Brevall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BrevallActionPerformed(evt);
            }
        });

        pp.setBackground(new java.awt.Color(33, 26, 68));
        pp.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        pp.setForeground(new java.awt.Color(255, 255, 255));
        pp.setText("Pay&print");
        pp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ppActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(pp, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Badd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Brev, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Brevall, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Badd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Brev)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Brevall)
                .addGap(174, 174, 174)
                .addComponent(pp, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        barcode_read.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                barcode_readActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(151, 153, 155));
        jLabel13.setText("Bar code:");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(barcode_read, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(barcode_read, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void TqyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TqyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TqyActionPerformed

    private void TpaidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TpaidActionPerformed
        // paid amount :

    }//GEN-LAST:event_TpaidActionPerformed

    private void TqyKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TqyKeyReleased
        pro_tot_cal();
    }//GEN-LAST:event_TqyKeyReleased

    private void TpaidKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TpaidKeyReleased
        // TODO add your handling code here:
        total ();
    }//GEN-LAST:event_TpaidKeyReleased

    private void ppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ppActionPerformed
        
        try{
            
            
            DefaultTableModel dt = (DefaultTableModel) Tsale.getModel();
            int rc = dt.getRowCount();
            
            for (int i =0; i < rc ; i++){
                
                String inid = dt.getValueAt(i, 0).toString();
                String P_name = dt.getValueAt(i, 1).toString();
                String bar_code = dt.getValueAt(i, 2).toString();
                String qty = dt.getValueAt(i, 3).toString();
                String un_price = dt.getValueAt(i, 4).toString();
                String tot_price = dt.getValueAt(i, 5).toString();
                

                Statement s = Bd.mycon().createStatement();
                s.executeUpdate(" INSERT INTO cart (  INDI,    Product_name, Bar_code, Qty, Unit_price, Total_price ) VALUES ('"+inid+"','"+P_name+"','"+bar_code+"','"+qty+"','"+un_price+"','"+tot_price+"')  ");
            
            }
            JOptionPane.showMessageDialog(null, "Data saved");
        }catch( HeadlessException | SQLException e ){
            System.out.println(e);
        }
        //sales db:
        try{
            String p = Tpaid.getText();
            String in_vo = inid.getText();
            String cuname = Scus.getSelectedItem().toString();
            String totqty = t_qty.getText();
            String totbill = t_amount.getText();
            String balance = bl.getText();
            // paid check :            
            Double tot = Double.valueOf(t_amount.getText());
            Double paid = Double.valueOf(Tpaid.getText());
            String status = null;            
            if (paid.equals(0.0)){
                status="Unpaid";
            }else if (tot>paid){
                status="Partial";
            }else if (tot <= paid ){
                status="Paid";
            }
            
            Statement s = Bd.mycon().createStatement();
            s.executeUpdate(" INSERT INTO sales ( INDI, Cid, Customer_name, Total_qty, Total_bill, Status, Balance,Paid) VALUES ('"+in_vo+"','"+cus_id+"','"+cuname+"','"+totqty+"','"+totbill+"','"+status+"','"+balance+"','"+p+"') ");
            
            
        }catch(NumberFormatException | SQLException e){
            System.out.println(e);
        }
      
          //load last invoice number:
          try{
              String id = inid.getText();
              Statement s = Bd.mycon().createStatement();
              s.executeUpdate("UPDATE extra SET Val ='"+id+"' WHERE Exid = 1 ");
          }catch(SQLException e){
              System.out.println(e);
          }
       
        try{
            
            Statement s = Bd.mycon().createStatement();
            ResultSet rs = s.executeQuery(" SELECT * FROM extra WHERE Exid = 1  ");
            if (rs.next()){
                inid.setText(rs.getString("Val"));
            }
            
        }catch(SQLException e){
            
        }
        
        DefaultTableModel dt = (DefaultTableModel) Tsale.getModel();
        dt.setRowCount(0);

        cart_total();
        total ();
        
        int i = Integer.valueOf(inid.getText());
        i++;
        inid.setText(String.valueOf(i));
 
        stockup ();
    }//GEN-LAST:event_ppActionPerformed

    private void ScusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ScusActionPerformed
        // get customer id :
                
        String name = Scus.getSelectedItem().toString();
        try{
            
            Statement s = Bd.mycon().createStatement();
            ResultSet rs = s.executeQuery(" SELECT Cid FROM customer WHERE Customer_name = '"+name+"' ");
            
            if (rs.next()){
               cus_id = rs.getString("Cid");
            }
            
            
        }catch (SQLException e){
            System.out.println(e);
        }
        
    }//GEN-LAST:event_ScusActionPerformed

    private void barcode_readActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_barcode_readActionPerformed
        String  bcr = barcode_read.getText();
        try {
            
            Statement s = Bd.mycon().createStatement();
            ResultSet rs = s.executeQuery("SELECT Category, Bar_code, Product_name,Price,Qty FROM product  WHERE Bar_code ='"+bcr+"'  ");
            if (rs.next()) {
                 
               
                up.setText(rs.getString("Price"));
                Spro.setText(rs.getString("Product_name"));
                br_code.setText(rs.getString("Bar_code"));
                Stqty.setText(rs.getString("Qty"));
                Pcat.setText(rs.getString("Category"));
            }
          
        
        
             pro_tot_cal();
            
            
        } catch (SQLException e) {
            System.out.println(e);
        }
        
    }//GEN-LAST:event_barcode_readActionPerformed

    private void BrevallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BrevallActionPerformed
        //remove all :

        DefaultTableModel dt = (DefaultTableModel) Tsale.getModel();
        dt.setRowCount(0);

        cart_total();
        total ();
    }//GEN-LAST:event_BrevallActionPerformed

    private void BrevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BrevActionPerformed
        // selected remove:
        try{
            DefaultTableModel dt = (DefaultTableModel) Tsale.getModel();
            int rw = Tsale.getSelectedRow();
            dt.removeRow(rw);

        }catch (Exception e){
            cart_total();
        }

        total ();
    }//GEN-LAST:event_BrevActionPerformed

    private void BaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BaddActionPerformed
        // add to cart:
        Double sell_qty = Double.valueOf(Tqy.getText());
        Double stk_qty = Double.valueOf(Stqty.getText());

        if (sell_qty <= stk_qty){
            DefaultTableModel dt = (DefaultTableModel) Tsale.getModel();

            Vector v = new Vector ();
            v.add(inid.getText());
            v.add(Spro.getText());
            v.add(br_code.getText());
            v.add(Tqy.getText());
            v.add(up.getText());
            v.add(tp.getText());

            dt.addRow(v);

            cart_total();
            total ();
        }else{
            JOptionPane.showMessageDialog(null, "There is only "+stk_qty+" in Stock ");
        }
        

    }//GEN-LAST:event_BaddActionPerformed

    public void pro_tot_cal(){
                    
            Double qty = Double.valueOf(Tqy.getText());
            Double price = Double.valueOf(up.getText());
            
            Double p_tot ;
            
            p_tot = qty*price;
            tp.setText(String.valueOf(p_tot));
    }
    public void cart_total(){
        int numofrow = Tsale.getRowCount();
        double total=0;
        double totqty=0;
        for(int i = 0 ; i<numofrow ; i++ ){
            double value = Double.valueOf(Tsale.getValueAt(i, 5).toString());
            total+= value;
    
        }

        t_amount.setText(Double.toString(total));
        
         for(int i = 0 ; i<numofrow ; i++ ){
            double value = Double.valueOf(Tsale.getValueAt(i, 3).toString());
            totqty+= value;
        }
        t_qty.setText(Double.toString(totqty));
        
    }
    
    public void total (){
        Double paid = Double.valueOf(Tpaid.getText());
        Double tot = Double.valueOf(t_amount.getText());
        Double due;
        due = paid - tot ;
        bl.setText(String.valueOf(due));
        
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Badd;
    private javax.swing.JButton Brev;
    private javax.swing.JButton Brevall;
    private javax.swing.JLabel Pcat;
    private javax.swing.JComboBox<String> Scus;
    private javax.swing.JLabel Spro;
    private javax.swing.JLabel Stqty;
    private javax.swing.JTextField Tpaid;
    private javax.swing.JTextField Tqy;
    private javax.swing.JTable Tsale;
    private javax.swing.JTextField barcode_read;
    private javax.swing.JLabel bl;
    private javax.swing.JLabel br_code;
    private javax.swing.JLabel inid;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton pp;
    private javax.swing.JLabel stlab;
    private javax.swing.JLabel stlab1;
    private javax.swing.JLabel t_amount;
    private javax.swing.JLabel t_qty;
    private javax.swing.JLabel tp;
    private javax.swing.JLabel up;
    // End of variables declaration//GEN-END:variables

    private void valueOF(String text) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
