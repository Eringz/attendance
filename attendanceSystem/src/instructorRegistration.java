
import java.awt.Color;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author E-rinGZ
 */
public class instructorRegistration extends javax.swing.JFrame {

    /**
     * Creates new form instructorRegistration
     */
    public instructorRegistration() {
        initComponents();
        jPanel1.setFocusable(true);
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
        jPanel2 = new javax.swing.JPanel();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jlabel12 = new javax.swing.JLabel();
        jlabel11 = new javax.swing.JLabel();
        jlabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        gitna = new javax.swing.JTextField();
        pangalan = new javax.swing.JTextField();
        apelido = new javax.swing.JTextField();
        instructorID = new javax.swing.JTextField();
        passWord = new javax.swing.JPasswordField();
        subject = new javax.swing.JComboBox<>();
        sumite = new javax.swing.JButton();
        contact = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
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
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 90));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, 310, 20));
        jPanel2.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, 310, 10));
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, 270, 20));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 370, 20));

        jSeparator2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jSeparator2FocusLost(evt);
            }
        });
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 370, 20));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 370, 10));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("INSTRUCTOR ID");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 130, 40));

        jlabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlabel12.setText("CONTACT");
        jPanel2.add(jlabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 130, 40));

        jlabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlabel11.setText("EMAIL");
        jPanel2.add(jlabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 130, 40));

        jlabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlabel10.setText("SUBJECT");
        jPanel2.add(jlabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 130, 40));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("PANGALAN");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 130, 40));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("REHISTRAYON");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 650, 40));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("PASSWORD");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 130, 40));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("INSTRUCTOR ID");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 130, 40));

        gitna.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        gitna.setForeground(new java.awt.Color(153, 153, 153));
        gitna.setText("GITNA");
        gitna.setToolTipText("");
        gitna.setBorder(null);
        gitna.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                gitnaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                gitnaFocusLost(evt);
            }
        });
        gitna.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                gitnaPropertyChange(evt);
            }
        });
        jPanel2.add(gitna, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 170, 80, 30));

        pangalan.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        pangalan.setForeground(new java.awt.Color(153, 153, 153));
        pangalan.setText("PANGALAN");
        pangalan.setToolTipText("");
        pangalan.setBorder(null);
        pangalan.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pangalanFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                pangalanFocusLost(evt);
            }
        });
        pangalan.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                pangalanPropertyChange(evt);
            }
        });
        jPanel2.add(pangalan, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, 160, 30));

        apelido.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        apelido.setForeground(new java.awt.Color(153, 153, 153));
        apelido.setText("APELIDO");
        apelido.setToolTipText("");
        apelido.setBorder(null);
        apelido.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                apelidoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                apelidoFocusLost(evt);
            }
        });
        apelido.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                apelidoPropertyChange(evt);
            }
        });
        jPanel2.add(apelido, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 110, 30));

        instructorID.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        instructorID.setForeground(new java.awt.Color(153, 153, 153));
        instructorID.setText("MAGSIMULA PO DITO");
        instructorID.setToolTipText("");
        instructorID.setBorder(null);
        instructorID.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                instructorIDFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                instructorIDFocusLost(evt);
            }
        });
        instructorID.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                instructorIDPropertyChange(evt);
            }
        });
        jPanel2.add(instructorID, new org.netbeans.lib.awtextra.AbsoluteConstraints(179, 90, 360, 30));

        passWord.setForeground(new java.awt.Color(153, 153, 153));
        passWord.setText("ENTER PASSWORD");
        passWord.setBorder(null);
        passWord.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passWordFocusGained(evt);
            }
        });
        passWord.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                passWordMousePressed(evt);
            }
        });
        passWord.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                passWordPropertyChange(evt);
            }
        });
        jPanel2.add(passWord, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 300, 50));

        subject.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        subject.setForeground(new java.awt.Color(153, 153, 153));
        subject.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT", "DATA STRUCTURE AND ALGORITHM" }));
        subject.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                subjectFocusGained(evt);
            }
        });
        subject.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                subjectPropertyChange(evt);
            }
        });
        jPanel2.add(subject, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 290, -1));

        sumite.setBackground(new java.awt.Color(2, 39, 2));
        sumite.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        sumite.setForeground(new java.awt.Color(153, 196, 236));
        sumite.setText("SUMITE");
        jPanel2.add(sumite, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 440, 90, 30));

        contact.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        contact.setBorder(null);
        contact.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                contactPropertyChange(evt);
            }
        });
        jPanel2.add(contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, 300, 40));

        email.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        email.setBorder(null);
        email.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                emailPropertyChange(evt);
            }
        });
        jPanel2.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, 300, 40));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(58, 57, 75));
        jLabel10.setText("PINDUTIN ANG LOGO UPANG MAKABALIK SA HOMEPAGE");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 490, 390, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/formbackground1.jpg"))); // NOI18N
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 650, 530));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/headbackground2.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 90));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/registerbackground1.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 700));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void instructorIDPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_instructorIDPropertyChange
        instructorID.setBackground(new Color(0,0,0,0));
    }//GEN-LAST:event_instructorIDPropertyChange

    private void passWordMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passWordMousePressed
        
    }//GEN-LAST:event_passWordMousePressed

    private void passWordPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_passWordPropertyChange
        passWord.setBackground(new Color(0,0,0,0));
    }//GEN-LAST:event_passWordPropertyChange

    private void apelidoPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_apelidoPropertyChange
        apelido.setBackground(new Color(0,0,0,0));
    }//GEN-LAST:event_apelidoPropertyChange

    private void instructorIDFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_instructorIDFocusGained
          if(instructorID.getText().trim().equals("MAGSIMULA PO DITO")){
            instructorID.setText(null);
            instructorID.setForeground(new Color(1,32,1)); 
        } 
    }//GEN-LAST:event_instructorIDFocusGained

    private void instructorIDFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_instructorIDFocusLost
            if(instructorID.getText().trim().equals("")){
            instructorID.setText("MAGSIMULA PO DITO");
            instructorID.setForeground(new Color(153,153,153)); 
        } 
    }//GEN-LAST:event_instructorIDFocusLost

    private void passWordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passWordFocusGained
        if(passWord.getText().equals("ENTER PASSWORD")){
            passWord.setText(null);
            passWord.setForeground(new Color(1,32,1)); 
        }
    }//GEN-LAST:event_passWordFocusGained

    private void apelidoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_apelidoFocusGained
        if(apelido.getText().trim().equals("APELIDO")){
            apelido.setText(null);
            apelido.setForeground(new Color(1,32,1)); 
        } 
    }//GEN-LAST:event_apelidoFocusGained

    private void jSeparator2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jSeparator2FocusLost
        
    }//GEN-LAST:event_jSeparator2FocusLost

    private void apelidoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_apelidoFocusLost
        if(apelido.getText().trim().equals("")){
            apelido.setText("APELIDO");
            apelido.setForeground(new Color(153,153,153)); 
        } 
    }//GEN-LAST:event_apelidoFocusLost

    private void pangalanFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pangalanFocusGained
        if(pangalan.getText().trim().equals("PANGALAN")){
            pangalan.setText(null);
            pangalan.setForeground(new Color(1,32,1)); 
        } 
    }//GEN-LAST:event_pangalanFocusGained

    private void pangalanFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pangalanFocusLost
        if(pangalan.getText().trim().equals("")){
            pangalan.setText("PANGALAN");
            pangalan.setForeground(new Color(153,153,153)); 
        } 
    }//GEN-LAST:event_pangalanFocusLost

    private void pangalanPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_pangalanPropertyChange
        pangalan.setBackground(new Color(0,0,0,0));
    }//GEN-LAST:event_pangalanPropertyChange

    private void gitnaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_gitnaFocusGained
        if(gitna.getText().trim().equals("GITNA")){
            gitna.setText(null);
            gitna.setForeground(new Color(1,32,1)); 
        } 
    }//GEN-LAST:event_gitnaFocusGained

    private void gitnaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_gitnaFocusLost
        if(gitna.getText().trim().equals("")){
            gitna.setText("GITNA");
            gitna.setForeground(new Color(153,153,153)); 
        }    
    }//GEN-LAST:event_gitnaFocusLost

    private void gitnaPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_gitnaPropertyChange
        gitna.setBackground(new Color(0,0,0,0));
    }//GEN-LAST:event_gitnaPropertyChange

    private void subjectPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_subjectPropertyChange
        subject.setBackground(new Color(0,0,0,0));
    }//GEN-LAST:event_subjectPropertyChange

    private void subjectFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_subjectFocusGained
       
        if(subject.toString().contains("DATA STRUCTURE AND ALGORITHM")){
            subject.setForeground(new Color(1,32,1));
            
        }
     
    }//GEN-LAST:event_subjectFocusGained

    private void emailPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_emailPropertyChange
       email.setBackground(new Color(0,0,0,0));
    }//GEN-LAST:event_emailPropertyChange

    private void contactPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_contactPropertyChange
        contact.setBackground(new Color(0,0,0,0));
    }//GEN-LAST:event_contactPropertyChange

    private void jLabel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MousePressed
        new HomePage().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel3MousePressed

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
            java.util.logging.Logger.getLogger(instructorRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(instructorRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(instructorRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(instructorRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new instructorRegistration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apelido;
    private javax.swing.JTextField contact;
    private javax.swing.JTextField email;
    private javax.swing.JTextField gitna;
    private javax.swing.JTextField instructorID;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel jlabel10;
    private javax.swing.JLabel jlabel11;
    private javax.swing.JLabel jlabel12;
    private javax.swing.JTextField pangalan;
    private javax.swing.JPasswordField passWord;
    private javax.swing.JComboBox<String> subject;
    private javax.swing.JButton sumite;
    // End of variables declaration//GEN-END:variables
}
