/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

/**
 *
 * @author nacho
 */
public class OrderView extends javax.swing.JFrame {

    /**
     * Creates new form OrderView
     */
    public OrderView(String name) {
        initComponents();
        setSize(1400, 800);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        
        this.jLabel1.setText("Welcome "+name+"!");
        
        this.BigKingButton.setOpaque(false);
        this.BigKingButton.setContentAreaFilled(false);
        this.BigKingButton.setBorderPainted(false);
        
        this.ChickenNuggetsButton.setOpaque(false);
        this.ChickenNuggetsButton.setContentAreaFilled(false);
        this.ChickenNuggetsButton.setBorderPainted(false);
        
        this.RodeoBurgerButton.setOpaque(false);
        this.RodeoBurgerButton.setContentAreaFilled(false);
        this.RodeoBurgerButton.setBorderPainted(false);
        
        this.SaladButton.setOpaque(false);
        this.SaladButton.setContentAreaFilled(false);
        this.SaladButton.setBorderPainted(false);
        
        this.TexasTenderCrispButton.setOpaque(false);
        this.TexasTenderCrispButton.setContentAreaFilled(false);
        this.TexasTenderCrispButton.setBorderPainted(false);
        
        this.WhopperButton.setOpaque(false);
        this.WhopperButton.setContentAreaFilled(false);
        this.WhopperButton.setBorderPainted(false);
        
        this.WhopperJrButton.setOpaque(false);
        this.WhopperJrButton.setContentAreaFilled(false);
        this.WhopperJrButton.setBorderPainted(false);
        
        this.WhopperTexanButton.setOpaque(false);
        this.WhopperTexanButton.setContentAreaFilled(false);
        this.WhopperTexanButton.setBorderPainted(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        AddSider = new javax.swing.JButton();
        ConfirmButton = new javax.swing.JButton();
        ViewOrder = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        RodeoBurgerButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        WhopperButton = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        WhopperTexanButton = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        WhopperJrButton = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        SaladButton = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        ChickenNuggetsButton = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        TexasTenderCrispButton = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        BigKingButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(null);

        jPanel6.setBackground(new java.awt.Color(60, 60, 60));
        jPanel6.setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ResizedLogo.png"))); // NOI18N
        jPanel6.add(jLabel2);
        jLabel2.setBounds(10, 50, 160, 150);

        jPanel5.setBackground(new java.awt.Color(255, 140, 0));
        jPanel5.setLayout(null);
        jPanel6.add(jPanel5);
        jPanel5.setBounds(-20, 0, 1390, 120);

        AddSider.setBackground(new java.awt.Color(40, 40, 40));
        AddSider.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        AddSider.setForeground(new java.awt.Color(255, 255, 255));
        AddSider.setText("Add Sider");
        AddSider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddSiderActionPerformed(evt);
            }
        });
        jPanel6.add(AddSider);
        AddSider.setBounds(10, 460, 150, 70);

        ConfirmButton.setBackground(new java.awt.Color(40, 40, 40));
        ConfirmButton.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        ConfirmButton.setForeground(new java.awt.Color(255, 255, 255));
        ConfirmButton.setText("Confirm Order");
        jPanel6.add(ConfirmButton);
        ConfirmButton.setBounds(10, 680, 150, 70);

        ViewOrder.setBackground(new java.awt.Color(40, 40, 40));
        ViewOrder.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        ViewOrder.setForeground(new java.awt.Color(255, 255, 255));
        ViewOrder.setText("View Order");
        ViewOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewOrderActionPerformed(evt);
            }
        });
        jPanel6.add(ViewOrder);
        ViewOrder.setBounds(10, 570, 150, 70);

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("and a beverage");
        jPanel6.add(jLabel10);
        jLabel10.setBounds(-10, 280, 200, 50);

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("All combos");
        jPanel6.add(jLabel14);
        jLabel14.setBounds(10, 240, 150, 50);

        jLabel15.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("contain fries");
        jPanel6.add(jLabel15);
        jLabel15.setBounds(10, 260, 150, 50);

        jPanel4.add(jPanel6);
        jPanel6.setBounds(0, -20, 180, 790);

        jPanel1.setBackground(new java.awt.Color(255, 140, 0));
        jPanel1.setLayout(null);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel1.setText("Welcome Nacho!");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(830, 20, 390, 50);

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("COMBO MENU             SELECT YOUR COMBO");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(70, 10, 840, 70);

        jPanel4.add(jPanel1);
        jPanel1.setBounds(150, 0, 1240, 100);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(null);

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 140, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Rodeo Burger");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(23, 19, 210, 50);

        RodeoBurgerButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/RodeoBurger.png"))); // NOI18N
        RodeoBurgerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RodeoBurgerButtonActionPerformed(evt);
            }
        });
        jPanel2.add(RodeoBurgerButton);
        RodeoBurgerButton.setBounds(10, 80, 240, 180);

        jPanel4.add(jPanel2);
        jPanel2.setBounds(210, 120, 260, 270);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 140, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Whopper ");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(23, 19, 210, 50);

        WhopperButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Whopper.png"))); // NOI18N
        WhopperButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WhopperButtonActionPerformed(evt);
            }
        });
        jPanel3.add(WhopperButton);
        WhopperButton.setBounds(10, 80, 240, 180);

        jPanel4.add(jPanel3);
        jPanel3.setBounds(500, 120, 260, 270);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel7.setLayout(null);

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 140, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Whopper Texan ");
        jPanel7.add(jLabel7);
        jLabel7.setBounds(20, 20, 210, 50);

        WhopperTexanButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/WhopperTejano.png"))); // NOI18N
        WhopperTexanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WhopperTexanButtonActionPerformed(evt);
            }
        });
        jPanel7.add(WhopperTexanButton);
        WhopperTexanButton.setBounds(10, 80, 240, 180);

        jPanel4.add(jPanel7);
        jPanel7.setBounds(790, 120, 260, 270);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel8.setLayout(null);

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 140, 0));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Whopper Jr.");
        jPanel8.add(jLabel9);
        jLabel9.setBounds(20, 20, 230, 50);

        WhopperJrButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/WhopperJr.png"))); // NOI18N
        WhopperJrButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WhopperJrButtonActionPerformed(evt);
            }
        });
        jPanel8.add(WhopperJrButton);
        WhopperJrButton.setBounds(10, 80, 240, 180);

        jPanel4.add(jPanel8);
        jPanel8.setBounds(1090, 120, 260, 270);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel9.setLayout(null);

        SaladButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Salad.png"))); // NOI18N
        SaladButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaladButtonActionPerformed(evt);
            }
        });
        jPanel9.add(SaladButton);
        SaladButton.setBounds(10, 80, 240, 180);

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 140, 0));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Salad");
        jPanel9.add(jLabel13);
        jLabel13.setBounds(10, 20, 230, 50);

        jPanel4.add(jPanel9);
        jPanel9.setBounds(210, 440, 260, 270);

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel10.setLayout(null);

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 140, 0));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Chicken Nuggets");
        jPanel10.add(jLabel11);
        jLabel11.setBounds(10, 20, 230, 50);

        ChickenNuggetsButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ChickenNuggets.png"))); // NOI18N
        ChickenNuggetsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChickenNuggetsButtonActionPerformed(evt);
            }
        });
        jPanel10.add(ChickenNuggetsButton);
        ChickenNuggetsButton.setBounds(10, 80, 240, 180);

        jPanel4.add(jPanel10);
        jPanel10.setBounds(500, 440, 260, 270);

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel11.setLayout(null);

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 140, 0));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Tendercrisp Texan");
        jPanel11.add(jLabel12);
        jLabel12.setBounds(10, 20, 230, 50);

        TexasTenderCrispButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/TendercrispTejano.png"))); // NOI18N
        TexasTenderCrispButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TexasTenderCrispButtonActionPerformed(evt);
            }
        });
        jPanel11.add(TexasTenderCrispButton);
        TexasTenderCrispButton.setBounds(10, 80, 240, 180);

        jPanel4.add(jPanel11);
        jPanel11.setBounds(790, 440, 260, 270);

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel12.setLayout(null);

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 140, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Big King");
        jPanel12.add(jLabel6);
        jLabel6.setBounds(10, 20, 230, 50);

        BigKingButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/BigKing.png"))); // NOI18N
        BigKingButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BigKingButtonActionPerformed(evt);
            }
        });
        jPanel12.add(BigKingButton);
        BigKingButton.setBounds(10, 80, 240, 180);

        jPanel4.add(jPanel12);
        jPanel12.setBounds(1080, 440, 260, 270);

        getContentPane().add(jPanel4);
        jPanel4.setBounds(0, 0, 1400, 760);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RodeoBurgerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RodeoBurgerButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RodeoBurgerButtonActionPerformed

    private void WhopperButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WhopperButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_WhopperButtonActionPerformed

    private void WhopperTexanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WhopperTexanButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_WhopperTexanButtonActionPerformed

    private void BigKingButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BigKingButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BigKingButtonActionPerformed

    private void TexasTenderCrispButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TexasTenderCrispButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TexasTenderCrispButtonActionPerformed

    private void ChickenNuggetsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChickenNuggetsButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChickenNuggetsButtonActionPerformed

    private void SaladButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaladButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SaladButtonActionPerformed

    private void WhopperJrButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WhopperJrButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_WhopperJrButtonActionPerformed

    private void AddSiderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddSiderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddSiderActionPerformed

    private void ViewOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewOrderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ViewOrderActionPerformed

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
            java.util.logging.Logger.getLogger(OrderView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OrderView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OrderView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OrderView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OrderView("Admin").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton AddSider;
    public javax.swing.JButton BigKingButton;
    public javax.swing.JButton ChickenNuggetsButton;
    public javax.swing.JButton ConfirmButton;
    public javax.swing.JButton RodeoBurgerButton;
    public javax.swing.JButton SaladButton;
    public javax.swing.JButton TexasTenderCrispButton;
    public javax.swing.JButton ViewOrder;
    public javax.swing.JButton WhopperButton;
    public javax.swing.JButton WhopperJrButton;
    public javax.swing.JButton WhopperTexanButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    public javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    // End of variables declaration//GEN-END:variables
}
