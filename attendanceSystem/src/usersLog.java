import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.Action;
import javax.swing.Timer;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author E-rinGZ
 */
public class usersLog extends javax.swing.JFrame {

    /**
     * Creates new form usersLog
     */
    Connection myconObj = null;
    Statement mystatObj = null;
    ResultSet myresObj = null;

    public usersLog() {
        initComponents();
        petsaPakita();
        orasPakita();
        setBackground(new Color(0, 0, 0, 0));
        report.setVisible(false);
        connect();

    }

    public void connect() {
        try {
            myconObj = DriverManager.getConnection("jdbc:derby://localhost:1527/studentregistraion", "ron",
                    "123456789");
            mystatObj = myconObj.createStatement();
            myresObj = mystatObj.executeQuery("Select * from ron.studentinfo");
            // studentTable.setModel(DbUtils.resultSetToTableModel(myresObj));
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    void petsaPakita() {
        SimpleDateFormat format = new SimpleDateFormat("MM.dd.yyyy");
        Date datenow = new Date();
        date.setText(format.format(datenow));

    }

    void orasPakita() {
        new Timer(0, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                SimpleDateFormat format = new SimpleDateFormat("hh:mm:ss a");
                Date datenow = new Date();
                time.setText(format.format(datenow));
            }

        }).start();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        report = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        date = new javax.swing.JLabel();
        time = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        search = new javax.swing.JLabel();
        studentid = new javax.swing.JTextField();
        login = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        section = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        subject = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        attendance = new javax.swing.JTable();
        save = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                formPropertyChange(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1x/asset2.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel1MousePressed(evt);
            }
        });
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 70, -1));

        report.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        report.setForeground(new java.awt.Color(6, 57, 4));
        report.setText("REPORT");
        getContentPane().add(report, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 20, 150, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(
                "C:\\Users\\E-rinGZ\\Documents\\NetBeansProjects\\attendanceSystem\\src\\img\\background16.jpg")); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 70));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        date.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        date.setForeground(new java.awt.Color(153, 153, 153));
        date.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        date.setText("date");
        jPanel1.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 210, 40));

        time.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        time.setForeground(new java.awt.Color(210, 211, 224));
        time.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        time.setText("time");
        jPanel1.add(time, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 210, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/registerbackground1.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 100));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 210, 100));

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(248, 248, 248));
        jLabel5.setText("ENTER STUDENT NO");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 150, -1));

        search.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1x/findAsset 1.png"))); // NOI18N
        search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                searchMousePressed(evt);
            }
        });
        jPanel2.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, 30, 30));

        studentid.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        studentid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                studentidKeyPressed(evt);
            }

            public void keyTyped(java.awt.event.KeyEvent evt) {
                studentidKeyTyped(evt);
            }
        });
        jPanel2.add(studentid, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 290, 30));

        login.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        login.setText("IN");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        jPanel2.add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 20, 70, -1));

        logout.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        logout.setText("OUT");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        jPanel2.add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 60, 70, -1));

        section.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        section.setForeground(new java.awt.Color(248, 248, 248));
        section.setText("COURSE YEAR AND SECTION");
        jPanel2.add(section, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 310, -1));

        name.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        name.setForeground(new java.awt.Color(248, 248, 248));
        name.setText("STUDENT NAME");
        jPanel2.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 310, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/background16.jpg"))); // NOI18N
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 100));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 650, -1));

        subject.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        subject.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DATA STRUCTURE AND ALGORITHM" }));
        subject.setBorder(null);
        getContentPane().add(subject, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 250, -1));

        jPanel3.setBackground(new java.awt.Color(0, 153, 51));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        attendance.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        attendance.setModel(new javax.swing.table.DefaultTableModel(new Object[][] {

        }, new String[] { "STUDENT NAME", "COURSE", "SUBJECT", "DATE", "TIME", "LOG" }) {
            Class[] types = new Class[] { java.lang.String.class, java.lang.String.class, java.lang.Object.class,
                    java.lang.Object.class, java.lang.Object.class, java.lang.String.class };

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }
        });
        jScrollPane2.setViewportView(attendance);
        if (attendance.getColumnModel().getColumnCount() > 0) {
            attendance.getColumnModel().getColumn(0).setPreferredWidth(140);
            attendance.getColumnModel().getColumn(1).setPreferredWidth(45);
            attendance.getColumnModel().getColumn(2).setPreferredWidth(140);
            attendance.getColumnModel().getColumn(3).setPreferredWidth(45);
            attendance.getColumnModel().getColumn(4).setPreferredWidth(45);
            attendance.getColumnModel().getColumn(5).setPreferredWidth(45);
        }

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 610, 540));

        save.setBackground(new java.awt.Color(18, 96, 15));
        save.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        save.setForeground(new java.awt.Color(186, 200, 239));
        save.setText("EXPORT");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        jPanel3.add(save, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 590, 90, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/userlogback2.jpg"))); // NOI18N
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 840));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 650, 640));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formPropertyChange(java.beans.PropertyChangeEvent evt) {// GEN-FIRST:event_formPropertyChange
        // this.setBackground(new Color(0,0,0,0));
    }// GEN-LAST:event_formPropertyChange

    private void jLabel1MousePressed(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jLabel1MousePressed
        /*
         * new HomePage().setVisible(true); this.setVisible(false);
         */
    }// GEN-LAST:event_jLabel1MousePressed

    private void studentidKeyPressed(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_studentidKeyPressed

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            try {

                String sql = "SELECT * FROM ron.studentinfo WHERE studentno=" + studentid.getText();
                Statement add = myconObj.createStatement();
                // Connection con =
                // DriverManager.getConnection("jdbc:derby://localhost:1527/studentregistraion",
                // "ron", "123456789");
                // Statement add = con.prepareStatement(sql);
                // add.executeUpdate(sql);
                ResultSet rs = add.executeQuery(sql);
                if (rs.next()) {
                    String lastname = rs.getString(3);
                    String firstname = rs.getString(4);
                    String middlename = rs.getString(5);
                    String course = rs.getString(8);
                    String fullname = lastname + " , " + firstname + " " + middlename;
                    name.setText(fullname);
                    section.setText(course);
                } else {
                    JOptionPane.showMessageDialog(null,
                            "Wala sa Record ang ID NO na ito. Maaring subukan muli o magparehistro.", "Error",
                            JOptionPane.ERROR_MESSAGE);
                }

            } catch (SQLException e) {
                e.printStackTrace();
                name.setText("Plese Check");
                section.setText("");
            }
            connect();
        }

    }// GEN-LAST:event_studentidKeyPressed

    private void studentidKeyTyped(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_studentidKeyTyped
        char c = evt.getKeyChar();
        String text = studentid.getText();
        if (!Character.isDigit(c)) {
            evt.consume();

        }

        String studentlength = studentid.getText();
        int length = studentlength.length();

        if (length < 7)
            if (length < 7) {
                studentid.setEditable(true);

            } else {
                studentid.setEditable(false);

            }
        else {
            if (evt.getExtendedKeyCode() == KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode() == KeyEvent.VK_DELETE) {
                studentid.setEditable(true);
            } else {
                studentid.setEditable(true);
            }
        }

    }// GEN-LAST:event_studentidKeyTyped

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_loginActionPerformed
        DefaultTableModel model = (DefaultTableModel) attendance.getModel();

        int studentnumber = Integer.parseInt(studentid.getText());
        if (studentnumber < 190000) {
            JOptionPane.showMessageDialog(null, "IMBALIDO", "ERRORMAN", JOptionPane.ERROR_MESSAGE);
            studentid.setText(null);
            name.setText("STUDENT NAME");
            section.setText("COURSE YEAR AND SECTION");
        } else {
            model.addRow(new Object[] { name.getText(), section.getText(), subject.getSelectedItem().toString(),
                    date.getText(), time.getText(), "IN" });
            studentid.setText("");
            name.setText("STUDENT NAME");
            section.setText("COURSE YEAR AND SECTION");
        }
    }// GEN-LAST:event_loginActionPerformed

    private void searchMousePressed(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_searchMousePressed
        try {

            String sql = "SELECT * FROM ron.studentinfo WHERE studentno=" + studentid.getText();
            Statement add = myconObj.createStatement();
            // Connection con =
            // DriverManager.getConnection("jdbc:derby://localhost:1527/studentregistraion",
            // "ron", "123456789");
            // Statement add = con.prepareStatement(sql);
            // add.executeUpdate(sql);
            ResultSet rs = add.executeQuery(sql);
            if (rs.next()) {
                String lastname = rs.getString(3);
                String firstname = rs.getString(4);
                String middlename = rs.getString(5);
                String course = rs.getString(8);
                String fullname = lastname + " , " + firstname + " " + middlename;
                name.setText(fullname);
                section.setText(course);
            } else {
                JOptionPane.showMessageDialog(null,
                        "Wala sa Record ang ID NO na ito. Maaring subukan muli o magparehistro.", "Error",
                        JOptionPane.ERROR_MESSAGE);
            }

        } catch (SQLException e) {
            e.printStackTrace();
            name.setText("Plese Check");
            section.setText("");
        }
        connect();
    }// GEN-LAST:event_searchMousePressed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_saveActionPerformed
        FileOutputStream excelFOU = null;
        BufferedOutputStream excelBOU = null;
        XSSFWorkbook excelJTableExporter = null;

        JFileChooser excelFileChooser = new JFileChooser("C:\\Users\\E-rinGZ\\Desktop\\ATTENDANCE SUMMARY");
        excelFileChooser.setDialogTitle("Save As");
        FileNameExtensionFilter filextension = new FileNameExtensionFilter("EXCEL FILES", "xls", "xlsx", "xlsm");
        excelFileChooser.setFileFilter(filextension);
        int excelChooser = excelFileChooser.showSaveDialog(null);
        if (excelChooser == JFileChooser.APPROVE_OPTION) {

            try {
                // XSSFWorkbook excelJTableExprorter = new XSSFWorkB
                excelJTableExporter = new XSSFWorkbook();
                XSSFSheet excelSheet = excelJTableExporter.createSheet("JTable Shhet");
                for (int i = 0; i < attendance.getRowCount(); i++) {
                    XSSFRow excelRow = excelSheet.createRow(i);
                    for (int j = 0; j < attendance.getColumnCount(); j++) {
                        XSSFCell excelCell = excelRow.createCell(j);
                        excelCell.setCellValue(attendance.getValueAt(i, j).toString());

                    }
                }
                excelFOU = new FileOutputStream(excelFileChooser.getSelectedFile() + ".xlsx");
                excelBOU = new BufferedOutputStream(excelFOU);
                excelJTableExporter.write(excelBOU);
                JOptionPane.showMessageDialog(null, "Ang Attendance ay naEXORT!!");
            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
            } catch (IOException ex) {
                ex.printStackTrace();
            } finally {
                try {
                    if (excelBOU != null) {
                        excelBOU.close();
                    }
                    if (excelFOU != null) {
                        excelFOU.close();
                    }
                    if (excelJTableExporter != null) {
                        excelJTableExporter.close();
                    }

                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
            System.exit(0);
        }

    }// GEN-LAST:event_saveActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_logoutActionPerformed
        DefaultTableModel model = (DefaultTableModel) attendance.getModel();

        int studentnumber = Integer.parseInt(studentid.getText());
        if (studentnumber < 190000) {
            JOptionPane.showMessageDialog(null, "IMBALIDO", "ERRORMAN", JOptionPane.ERROR_MESSAGE);
            studentid.setText("");
            name.setText("STUDENT NAME");
            section.setText("COURSE YEAR AND SECTION");
        } else {
            model.addRow(new Object[] { name.getText(), section.getText(), subject.getSelectedItem().toString(),
                    date.getText(), time.getText(), "OUT" });
            studentid.setText(null);
            name.setText("STUDENT NAME");
            section.setText("COURSE YEAR AND SECTION");
        }
    }// GEN-LAST:event_logoutActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(usersLog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(usersLog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(usersLog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(usersLog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new usersLog().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable attendance;
    private javax.swing.JLabel date;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton login;
    private javax.swing.JButton logout;
    private javax.swing.JLabel name;
    private javax.swing.JButton report;
    private javax.swing.JButton save;
    private javax.swing.JLabel search;
    private javax.swing.JLabel section;
    private javax.swing.JTextField studentid;
    private javax.swing.JComboBox<String> subject;
    private javax.swing.JLabel time;
    // End of variables declaration//GEN-END:variables
}
