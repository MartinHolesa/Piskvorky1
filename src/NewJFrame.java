
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class NewJFrame extends javax.swing.JFrame {

    private String startHry = "X";
    private int PocetX = 0;
    private int PocetO = 0;
    boolean kontroler;
    
    public NewJFrame()
    {
        initComponents();
    }
    
    private void SkoreHry()
    {
        jlblPlayerX.setText(String.valueOf(PocetX));
        jlblPlayerO.setText(String.valueOf(PocetO));
    }
     private void VyberSiHraca()
    {
       if(startHry.equalsIgnoreCase("X"))
       {
           startHry = "O";
       }
       else
       {
            startHry = "X";
       }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        tic1 = new javax.swing.JButton();
        tic3 = new javax.swing.JButton();
        tic4 = new javax.swing.JButton();
        tic5 = new javax.swing.JButton();
        tic6 = new javax.swing.JButton();
        tic7 = new javax.swing.JButton();
        tic8 = new javax.swing.JButton();
        tic9 = new javax.swing.JButton();
        tic2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jlblPlayerX = new javax.swing.JLabel();
        jlblPlayerO = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        jFrame1.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 415, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 297, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        tic1.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        tic1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tic1ActionPerformed(evt);
            }
        });

        tic3.setFont(new java.awt.Font("Tahoma", 0, 96)); // NOI18N
        tic3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tic3ActionPerformed(evt);
            }
        });

        tic4.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N

        tic5.setFont(new java.awt.Font("Tahoma", 0, 96)); // NOI18N

        tic6.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N

        tic7.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N

        tic8.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N

        tic9.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N

        tic2.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        tic2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tic2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tic7, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                    .addComponent(tic4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tic1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(tic8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                    .addComponent(tic5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tic2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tic9, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                    .addComponent(tic6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tic3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tic3, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                    .addComponent(tic2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tic1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tic4, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                    .addComponent(tic5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tic6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(tic8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                    .addComponent(tic9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tic7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 143, 626, -1));

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton10.setFont(new java.awt.Font("Tahoma", 1, 65)); // NOI18N
        jButton10.setText("Koniec");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(292, 160, 259, 120));

        jButton11.setFont(new java.awt.Font("Tahoma", 1, 70)); // NOI18N
        jButton11.setText("Nová hra");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, 539, 141));

        jButton12.setFont(new java.awt.Font("Tahoma", 1, 65)); // NOI18N
        jButton12.setText("Reset");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 160, 268, 120));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 272, 560, 290));

        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 66)); // NOI18N
        jLabel1.setText(" Hráč O:");
        jPanel5.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 145, 268, 108));

        jlblPlayerX.setFont(new java.awt.Font("Tahoma", 1, 66)); // NOI18N
        jlblPlayerX.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblPlayerX.setText("0");
        jlblPlayerX.setOpaque(true);
        jPanel5.add(jlblPlayerX, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, 230, 108));

        jlblPlayerO.setFont(new java.awt.Font("Tahoma", 1, 66)); // NOI18N
        jlblPlayerO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblPlayerO.setText("0");
        jlblPlayerO.setOpaque(true);
        jPanel5.add(jlblPlayerO, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 160, 240, 80));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 66)); // NOI18N
        jLabel5.setText(" Hráč X:");
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 269, 113));

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, 560, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 140, 580, 570));

        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Sylfaen", 1, 70)); // NOI18N
        jLabel4.setText("Hra - Piškvorky");
        jPanel6.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 30, -1, 100));

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 1230, 120));

        pack();
    }// </editor-fold>//GEN-END:initComponents
private JFrame frame;
    private void tic2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tic2ActionPerformed
      
    }//GEN-LAST:event_tic2ActionPerformed

    private void tic3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tic3ActionPerformed
       
    }//GEN-LAST:event_tic3ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        tic1.setEnabled(true);      
        tic2.setEnabled(true);
        tic3.setEnabled(true);
        tic4.setEnabled(true);
        tic5.setEnabled(true);      
        tic6.setEnabled(true);
        tic7.setEnabled(true);
        tic8.setEnabled(true);
        tic9.setEnabled(true);
        
        jlblPlayerX.setText("0");
        jlblPlayerO.setText("0");
        
        tic1.setText("");
        tic2.setText("");
        tic3.setText("");
        tic4.setText("");
        tic5.setText("");
        tic6.setText("");
        tic7.setText("");
        tic8.setText("");
        tic9.setText("");
        
        tic1.setBackground(Color.WHITE);
        tic2.setBackground(Color.WHITE);
        tic3.setBackground(Color.WHITE);
        tic4.setBackground(Color.WHITE);
        tic5.setBackground(Color.WHITE);
        tic6.setBackground(Color.WHITE);
        tic7.setBackground(Color.WHITE);
        tic8.setBackground(Color.WHITE);
        tic9.setBackground(Color.WHITE);
        
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
     frame = new JFrame("Exit");
     if(JOptionPane.showConfirmDialog(frame, "Potvrd ak chces ukoncit hru", "Piskvorky",
             
             JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION)
             {
                 System.exit(0);
             }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
            
        tic1.setEnabled(true);      
        tic2.setEnabled(true);
        tic3.setEnabled(true);
        tic4.setEnabled(true);
        tic5.setEnabled(true);      
        tic6.setEnabled(true);
        tic7.setEnabled(true);
        tic8.setEnabled(true);
        tic9.setEnabled(true);
        
        
        tic1.setText("");
        tic2.setText("");
        tic3.setText("");
        tic4.setText("");
        tic5.setText("");
        tic6.setText("");
        tic7.setText("");
        tic8.setText("");
        tic9.setText("");
        
        tic1.setBackground(Color.WHITE);
        tic2.setBackground(Color.WHITE);
        tic3.setBackground(Color.WHITE);
        tic4.setBackground(Color.WHITE);
        tic5.setBackground(Color.WHITE);
        tic6.setBackground(Color.WHITE);
        tic7.setBackground(Color.WHITE);
        tic8.setBackground(Color.WHITE);
        tic9.setBackground(Color.WHITE);
        
        
        
    }//GEN-LAST:event_jButton12ActionPerformed

    private void tic1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tic1ActionPerformed
        
    }//GEN-LAST:event_tic1ActionPerformed

    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(() -> {
            new NewJFrame().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel jlblPlayerO;
    private javax.swing.JLabel jlblPlayerX;
    private javax.swing.JButton tic1;
    private javax.swing.JButton tic2;
    private javax.swing.JButton tic3;
    private javax.swing.JButton tic4;
    private javax.swing.JButton tic5;
    private javax.swing.JButton tic6;
    private javax.swing.JButton tic7;
    private javax.swing.JButton tic8;
    private javax.swing.JButton tic9;
    // End of variables declaration//GEN-END:variables
}
