/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package joy;

/**
 *
 * @author admin
 */

import java.sql.*;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.Date;

public class orders extends javax.swing.JFrame {

    /**
     * Creates new form orders
     */
    
    Connection cn;
    PreparedStatement pst;
    ResultSet rs;
    
    public orders() {
        initComponents();
        myconnection();
        getsum();
        Fill_date();
        
        String url = "jdbc:mysql://localhost/cateringdatabase";
        String user ="root";
        String pass = "";
        try {
            cn = DriverManager.getConnection(url,user,pass);
            
        }
        catch (Exception ex)
        {
            System.out.println("Error :" +ex.getMessage());
        }
        
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
        breakfast = new javax.swing.JButton();
        lunch = new javax.swing.JButton();
        dinner = new javax.swing.JButton();
        dessert = new javax.swing.JButton();
        drinks = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        menutable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtusername = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        myorder = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        txtsubtotal = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtfoodname = new javax.swing.JTextField();
        txtquantity = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtprice = new javax.swing.JTextField();
        Date = new javax.swing.JLabel();
        txtdate = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        txtlocation = new javax.swing.JTextField();
        submit = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        order = new javax.swing.JButton();
        txttotal = new javax.swing.JTextField();
        txtcalctotal = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        breakfast.setText("Breakfast");
        breakfast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                breakfastActionPerformed(evt);
            }
        });

        lunch.setText("Lunch");
        lunch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lunchActionPerformed(evt);
            }
        });

        dinner.setText("Dinner");
        dinner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dinnerActionPerformed(evt);
            }
        });

        dessert.setText("Dessert");
        dessert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dessertActionPerformed(evt);
            }
        });

        drinks.setText("Drinks");
        drinks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drinksActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(breakfast)
                .addGap(57, 57, 57)
                .addComponent(lunch)
                .addGap(74, 74, 74)
                .addComponent(dinner)
                .addGap(97, 97, 97)
                .addComponent(dessert)
                .addGap(92, 92, 92)
                .addComponent(drinks)
                .addContainerGap(58, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(breakfast)
                    .addComponent(lunch)
                    .addComponent(dinner)
                    .addComponent(drinks)
                    .addComponent(dessert))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        menutable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Meal ID", "Meal Name", "Description", "Price"
            }
        ));
        menutable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menutableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(menutable);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("MENU");

        jLabel2.setText("Hello");

        txtusername.setText("UserName");

        myorder.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "FoodName", "Price", "Quantity", "DeliveryDate", "Location", "Total"
            }
        ));
        myorder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                myorderMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(myorder);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel9.setText("     SUB-TOTAL");

        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel5.setText("Food Name");

        txtfoodname.setEditable(false);

        jLabel6.setText("Price");

        jLabel7.setText("Quantity");

        txtprice.setEditable(false);

        Date.setText("Delivery Date");

        txtdate.setDateFormatString("yyyy-MM-dd");

        jLabel4.setText("Location");

        txtlocation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtlocationActionPerformed(evt);
            }
        });

        submit.setText("Submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        jButton7.setText("Clear");

        order.setText("My Order");
        order.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderActionPerformed(evt);
            }
        });

        txttotal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txttotalMouseClicked(evt);
            }
        });
        txttotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttotalActionPerformed(evt);
            }
        });

        txtcalctotal.setText("Get Total");
        txtcalctotal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtcalctotalMouseClicked(evt);
            }
        });
        txtcalctotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcalctotalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(submit)
                        .addGap(57, 57, 57)
                        .addComponent(jButton7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(order))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(34, 34, 34)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtlocation, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtfoodname, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                                        .addComponent(txtprice))
                                    .addComponent(txtquantity, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(Date)
                                .addGap(36, 36, 36)
                                .addComponent(txtdate, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtcalctotal)
                                .addGap(29, 29, 29)
                                .addComponent(txttotal)))
                        .addGap(0, 18, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtfoodname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtquantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Date)
                    .addComponent(txtdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtlocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txttotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcalctotal))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submit)
                    .addComponent(jButton7)
                    .addComponent(order))
                .addContainerGap())
        );

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel10.setText(" MY ORDER");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 884, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(txtsubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel2)
                        .addGap(82, 82, 82)
                        .addComponent(txtusername, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 718, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel8))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(82, 82, 82)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(426, 426, 426)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(341, 341, 341)
                        .addComponent(jLabel1)))
                .addContainerGap(986, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtusername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(jLabel8))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtsubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void breakfastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_breakfastActionPerformed
        // TODO add your handling code here:
        breakfast();
    }//GEN-LAST:event_breakfastActionPerformed

    private void lunchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lunchActionPerformed
        // TODO add your handling code here:
        lunch();
    }//GEN-LAST:event_lunchActionPerformed

    private void dessertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dessertActionPerformed
        // TODO add your handling code here:
        dessert();
    }//GEN-LAST:event_dessertActionPerformed

    private void dinnerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dinnerActionPerformed
        // TODO add your handling code here:
        dinner();
    }//GEN-LAST:event_dinnerActionPerformed

    private void drinksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drinksActionPerformed
        // TODO add your handling code here:
        drinks();
    }//GEN-LAST:event_drinksActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        // TODO add your handling code here:
        insertrecord();
        clear();
    }//GEN-LAST:event_submitActionPerformed

    private void txtlocationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtlocationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtlocationActionPerformed

    private void menutableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menutableMouseClicked
        // TODO add your handling code here:
        gettabledetails();
    }//GEN-LAST:event_menutableMouseClicked

    private void orderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderActionPerformed
        // TODO add your handling code here:
        displayorder();
    }//GEN-LAST:event_orderActionPerformed

    private void txttotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttotalActionPerformed

    private void txttotalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txttotalMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txttotalMouseClicked

    private void txtcalctotalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtcalctotalMouseClicked
        // TODO add your handling code here:
       
    }//GEN-LAST:event_txtcalctotalMouseClicked

    private void txtcalctotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcalctotalActionPerformed
        // TODO add your handling code here:
        totalcalculation();
    }//GEN-LAST:event_txtcalctotalActionPerformed

    private void myorderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_myorderMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_myorderMouseClicked

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
            java.util.logging.Logger.getLogger(orders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(orders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(orders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(orders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new orders().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Date;
    private javax.swing.JButton breakfast;
    private javax.swing.JButton dessert;
    private javax.swing.JButton dinner;
    private javax.swing.JButton drinks;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton lunch;
    private javax.swing.JTable menutable;
    private javax.swing.JTable myorder;
    private javax.swing.JButton order;
    private javax.swing.JButton submit;
    private javax.swing.JButton txtcalctotal;
    private com.toedter.calendar.JDateChooser txtdate;
    private javax.swing.JTextField txtfoodname;
    private javax.swing.JTextField txtlocation;
    private javax.swing.JTextField txtprice;
    private javax.swing.JTextField txtquantity;
    private javax.swing.JTextField txtsubtotal;
    private javax.swing.JTextField txttotal;
    private javax.swing.JTextField txtusername;
    // End of variables declaration//GEN-END:variables

    private void myconnection() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    try{
                     
           cn=DriverManager.getConnection("jdbc:mysql://localhost/cateringdatabase", "root", null);
                      
          pst=cn.prepareStatement("select * from myorders", ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
          rs=pst.executeQuery();
           
           //JOptionPane.showMessageDialog(null, "Successfully Connected!");
       }
       catch(Exception ex)
       {
           //System.out.print(e);
           ex.printStackTrace();
       }
    }

    private void breakfast() //the following are buttons which when clicked 
    {
      //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody 
    String sql="select * from breakfasttable"; 
      try
    {
      PreparedStatement pst = cn.prepareStatement(sql);
      ResultSet rs = pst.executeQuery();
      DefaultTableModel model = (DefaultTableModel) menutable.getModel();
      model.setRowCount(0);
      
      while(rs.next())
      {
          model.addRow(new String[] {rs.getString(1), rs.getString(2),rs.getString(3), rs.getString(4)});
      }
      
    }
    
    catch (Exception ex)
            {
              System.out.println("Error" +ex.getMessage());
            }
    }

    private void lunch() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void dinner() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
   
    }

    private void dessert() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    
    }

    private void drinks() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
       }

    private void insertrecord() //we're inserting into myorders table 
    {
       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
       try{
       Class.forName("com.mysql.cj.jdbc.Driver");
       cn=DriverManager.getConnection("jdbc:mysql://localhost/cateringdatabase", "root", null);
       
       //double a = Double.parseDouble(txtprice.getText());
        //int b = Integer.parseInt(txtquantity.getText());
        //double total = a * b;
        
       String sql = "insert into myorders values(?,?,?,?,?,?)";
       PreparedStatement pstmt = cn.prepareStatement(sql);
       pstmt.setString(1, txtfoodname.getText());
       pstmt.setString(2,txtprice.getText());
       pstmt.setString(3,txtquantity.getText());
       pstmt.setString(4, txtdate.getDateFormatString());
       pstmt.setString(5,txtlocation.getText());
       pstmt.setString(6, txttotal.getText());
    
      pstmt.executeUpdate();
      JOptionPane.showMessageDialog(null, "insertion successful");
      
    }
       catch (Exception e)
       {
           JOptionPane.showMessageDialog(null, e);
       }
       //SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        //String date = sdf.format(txtdate.getDate());
        //String sql1 = "select * from myorders"; 
      //try
    //{
      
      //DefaultTableModel model = (DefaultTableModel) myorder.getModel();
      //model.setRowCount(0);
      
      //while(rs.next())
      //{
       //   model.addRow(new String[] {rs.getString(1), rs.getString(2),rs.getString(3), rs.getString(4),rs.getString(5),rs.getString(6)});
     // }
      
   // }
    
    //catch (Exception ex)
      //      {
        //      System.out.println("Error" +ex.getMessage());
          //  }
       // double a = Double.parseDouble(txtprice.getText());
        //int b = Integer.parseInt(txtquantity.getText());
        //double total = a * b;
        
        
      
  //     DefaultTableModel model = (DefaultTableModel) myorder.getModel();
//       model.addRow(new Object[] {txtfoodname.getText(),txtprice.getText(),txtquantity.getText(),date,txtlocation.getText(),total});
      
    //   JOptionPane.showMessageDialog(null, "Record Successfully Added");
          
    }
    private void clear() //clear text fields
    {
       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
       txtfoodname.setText(null);
       txtprice.setText(null);
       txtquantity.setText(null);
       txtdate.setDate(null);
       txtlocation.setText(null);
       txttotal.setText(null);
    }

    private void gettabledetails() //allow for display on the text fields 
    {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    DefaultTableModel model = (DefaultTableModel) menutable.getModel();
    int n=menutable.getSelectedRow();
    txtfoodname.setText(model.getValueAt(n, 1).toString());
    txtprice.setText(model.getValueAt(n, 3).toString());
    }

    private void getsum() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    
        int sum = 0;
        for (int i =0; i<myorder.getRowCount();i++)
        {
            sum = sum + Integer.parseInt(myorder.getValueAt(i, 5).toString());
        }
    
        txtsubtotal.setText(Integer.toString(sum));
    
    }

    private void displayorder() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String date = sdf.format(txtdate.getDate());
        System.out.print(date);
      String sql1 = "select * from myorders";
      
      try
    {
      
      DefaultTableModel model = (DefaultTableModel) myorder.getModel();
      model.setRowCount(0);
      
      while(rs.next())
      {
          model.addRow(new String[] {rs.getString(1), rs.getString(2),rs.getString(3), rs.getString(4),rs.getString(5),rs.getString(6)});
      }
      
    }
    
    catch (Exception ex)
            {
              System.out.println("Error" +ex.getMessage());
            }
        double a = Double.parseDouble(txtprice.getText());
    int b = Integer.parseInt(txtquantity.getText());
    double total = a * b;
        
        
      
       DefaultTableModel model = (DefaultTableModel) myorder.getModel();
    model.addRow(new Object[] {txtfoodname.getText(),txtprice.getText(),txtquantity.getText(),date,txtlocation.getText(),total});
      
    //   JOptionPane.showMessageDialog(null, "Record Successfully Added");
    
    }

    private void totalcalculation() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    
    double a = Double.parseDouble(txtprice.getText());
    int b = Integer.parseInt(txtquantity.getText());
    double total = a * b;
    
    txttotal.setText(""+total);
    
    
    }

    private void Fill_date() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    
    
    
    
    }
}

