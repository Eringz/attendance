
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author E-rinGZ
 */
public class adminLog extends javax.swing.JFrame {

    /**
     * Creates new form adminLog
     */
    public adminLog() {
        initComponents();
        jPanel1.setFocusable(true);
        itago.setVisible(false);
        error.setVisible(false);
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
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        userName = new javax.swing.JTextField();
        itago = new javax.swing.JLabel();
        ilabas = new javax.swing.JLabel();
        passWord = new javax.swing.JPasswordField();
        error = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1x/asset2.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel3MousePressed(evt);
            }
        });
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 110, 90));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/headbackground2.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 90));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 340, 20));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 340, 20));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/password-50.png"))); // NOI18N
        jLabel5.setText("jLabel5");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 50, 40));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/username-50.png"))); // NOI18N
        jLabel6.setText("jLabel5");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 50, 40));

        jButton1.setBackground(new java.awt.Color(2, 39, 2));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(153, 196, 236));
        jButton1.setText("LOG");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 90, 30));

        userName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        userName.setForeground(new java.awt.Color(153, 153, 153));
        userName.setText("ENTER USERNAME");
        userName.setBorder(null);
        userName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                userNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                userNameFocusLost(evt);
            }
        });
        userName.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                userNamePropertyChange(evt);
            }
        });
        jPanel2.add(userName, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 320, 40));

        itago.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        itago.setForeground(new java.awt.Color(6, 45, 5));
        itago.setText("ITAGO");
        itago.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                itagoMousePressed(evt);
            }
        });
        jPanel2.add(itago, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 120, 60, 20));

        ilabas.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ilabas.setForeground(new java.awt.Color(6, 45, 5));
        ilabas.setText("ILABAS");
        ilabas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ilabasMousePressed(evt);
            }
        });
        jPanel2.add(ilabas, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 120, 60, 20));

        passWord.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        passWord.setForeground(new java.awt.Color(153, 153, 153));
        passWord.setText("ENTER PASSWORD");
        passWord.setBorder(null);
        passWord.setEchoChar('\u0398');
        passWord.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passWordFocusGained(evt);
            }
        });
        passWord.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                passWordPropertyChange(evt);
            }
        });
        jPanel2.add(passWord, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 280, 50));

        error.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        error.setForeground(new java.awt.Color(198, 17, 17));
        error.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1x/errorAsset 2.png"))); // NOI18N
        error.setText("HINDI TUGMA ANG DATOS. SUBUKAN MULI");
        jPanel2.add(error, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 330, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/formbackground1.jpg"))); // NOI18N
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 270));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 490, 270));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/newadmin1.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 440));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void userNamePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_userNamePropertyChange
        userName.setBackground(new Color(0,0,0,0));
    }//GEN-LAST:event_userNamePropertyChange

    private void passWordPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_passWordPropertyChange
        passWord.setBackground(new Color(0,0,0,0));
    }//GEN-LAST:event_passWordPropertyChange

    private void userNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_userNameFocusGained
        if(userName.getText().trim().equals("ENTER USERNAME")){
            userName.setText(null);
            userName.setForeground(new Color(1,32,1)); 
        }
    }//GEN-LAST:event_userNameFocusGained

    private void userNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_userNameFocusLost
        if(userName.getText().trim().equals("")){
            userName.setText("ENTER USERNAME");
            userName.setForeground(new Color(153,153,153)); 
        }
    }//GEN-LAST:event_userNameFocusLost

    private void passWordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passWordFocusGained
             if(passWord.getText().equals("ENTER PASSWORD")){
            passWord.setText(null);
            passWord.setForeground(new Color(1,32,1)); 
        }
    }//GEN-LAST:event_passWordFocusGained

    private void ilabasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ilabasMousePressed
        ilabas.setVisible(false);
        itago.setVisible(true);
        passWord.setEchoChar((char)0);
    }//GEN-LAST:event_ilabasMousePressed

    private void itagoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itagoMousePressed
        ilabas.setVisible(true);
        itago.setVisible(false);
        passWord.setEchoChar((char)920);
    }//GEN-LAST:event_itagoMousePressed

    private void jLabel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MousePressed
        new HomePage().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel3MousePressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String username = userName.getText();
        String password = passWord.getText();
        ImageIcon icon = new ImageIcon("cdmlogocrop.jpg");
        JOptionPane.showOptionDialog(null,"Gusto mo bang ituloy?","Administrator", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, icon, null, 0);
        if(username.contains("admin") && (password.contains("admin"))){
            JOptionPane.showMessageDialog(null, "Ikaw ay binibigyan ng permiso","Administrator", JOptionPane.OK_OPTION, icon);
            new adminControlPage().setVisible(true);
            this.setVisible(false);                             
        }else{
            error.setVisible(true);
            userName.setText(null);
            passWord.setText(null);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(adminLog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminLog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminLog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminLog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminLog().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel error;
    private javax.swing.JLabel ilabas;
    private javax.swing.JLabel itago;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPasswordField passWord;
    private javax.swing.JTextField userName;
    // End of variables declaration//GEN-END:variables
}
