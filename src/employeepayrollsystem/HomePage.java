/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package employeepayrollsystem;

import DAO.ConnectionProvider;
import java.awt.Color;
import java.awt.*;
import com.itextpdf.text.Document;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

import java.text.SimpleDateFormat;

import java.util.Date;

import javax.swing.*;
import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.sql.Connection;
//import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.Border;
import net.proteanit.sql.DbUtils;
//import javax.swing.text.Document;

/**
 *
 * @author M. A. MUKTADEER
 */
public class HomePage extends javax.swing.JFrame {

    int i;
    String gender;

    /////news show
    void newsSow() {
        i = 1;
        if (i == 1) {
            Thread th = new Thread() {

                @Override
                public void run() {
                    int ii = i;
                    while (ii <= 3) {
                        if (ii == 1) {
                            try {
                                Thread.sleep(5000);
                                jPanel7.setVisible(false);
//                                JPanel n =new JPanel(jPanel9.setBounds(16, 243, 690, 178));
                                jPanel9.setVisible(true);
//                                System.out.println("x"+jPanel9.getX()+"y"+jPanel9.getY()+"hig"+jPanel6.getHeight()+"ei"+jPanel6.getWidth());

                            } catch (InterruptedException ex) {
                                Logger.getLogger(HomePage.class.getName()).log(Level.SEVERE, null, ex);
                            }

                        }
                        if (ii == 2) {
                            try {
                                Thread.sleep(5000);
                                jPanel9.setVisible(false);
                                jPanel8.setVisible(true);

                            } catch (InterruptedException ex) {
                                Logger.getLogger(HomePage.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                        if (ii == 3) {
                            try {
                                Thread.sleep(5000);
                                jPanel8.setVisible(false);
                                jPanel7.setVisible(true);

                            } catch (InterruptedException ex) {
                                Logger.getLogger(HomePage.class.getName()).log(Level.SEVERE, null, ex);
                            }
//                            newsSow();
                        }
//                        System.out.println(ii);
                        ii++;
                    }
                }

            };
            th.start();

        }
    }

    ////create border variable
    ///defualt border for the menue list
    Border defaultBorder = BorderFactory.createMatteBorder(1, 0, 1, 0, new Color(70, 73, 73));

    ////set menu list border
    Border setBorder = BorderFactory.createMatteBorder(1, 0, 1, 0, Color.YELLOW);

    ////create menu list array
    JLabel[] menuLabels = new JLabel[6];

    //create jPanel array
    JPanel[] panels = new JPanel[6];

    public HomePage() {
        
        initComponents();
        setBorder();
        jPanel7.setVisible(false);
        jPanel8.setVisible(false);
        jPanel9.setVisible(false);
        employee.setVisible(false);
        searchEmployee.setVisible(false);
        allowance.setVisible(false);
        updateSalary.setVisible(false);
        deduction.setVisible(false);
        payment.setVisible(false);

        newsSow();

        /////////////set menuLabel variable 
        menuLabels[0] = jLabelManu1;
        menuLabels[1] = jLabelManu2;
        menuLabels[2] = jLabelManu3;
        menuLabels[3] = jLabelManu4;
        menuLabels[4] = jLabelManu5;
        menuLabels[5] = jLabelManu6;

        ///Jpanel array
        panels[0] = employee;
        panels[1] = searchEmployee;
        panels[2] = allowance;
        panels[3] = updateSalary;
        panels[4] = deduction;
        panels[5] = payment;

        createMouseIntance();
        ///table Update
        Update_table();
        conn = ConnectionProvider.getConnectDatabase();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanelManu = new javax.swing.JPanel();
        jLabelManu2 = new javax.swing.JLabel();
        jLabelManu1 = new javax.swing.JLabel();
        jLabelManu4 = new javax.swing.JLabel();
        jLabelManu3 = new javax.swing.JLabel();
        jLabelManu6 = new javax.swing.JLabel();
        jLabelManu5 = new javax.swing.JLabel();
        jPanelLogoAndName = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanelHome = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        employee = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txt_tel = new javax.swing.JTextField();
        txt_email = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        r_male = new javax.swing.JRadioButton();
        r_female = new javax.swing.JRadioButton();
        txt_dob = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_surname = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txt_firstname = new javax.swing.JTextField();
        txt_id = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        img = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        txt_pc = new javax.swing.JTextField();
        txt_add2 = new javax.swing.JTextField();
        txt_address = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        txt_dep = new javax.swing.JTextField();
        txt_desig = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        txt_status = new javax.swing.JTextField();
        txt_doj = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        txt_salary = new javax.swing.JTextField();
        cmd_save = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        txt_job = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        txt_emp = new javax.swing.JLabel();
        btnAttachImage = new javax.swing.JButton();
        searchEmployee = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jLabel113 = new javax.swing.JLabel();
        txt_search = new javax.swing.JTextField();
        jLabel131 = new javax.swing.JLabel();
        txt_emp4 = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        jLabel114 = new javax.swing.JLabel();
        txt_tel2 = new javax.swing.JTextField();
        txt_email2 = new javax.swing.JTextField();
        jLabel115 = new javax.swing.JLabel();
        jLabel116 = new javax.swing.JLabel();
        r_male2 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        txt_dob6 = new javax.swing.JTextField();
        jLabel117 = new javax.swing.JLabel();
        txt_surname6 = new javax.swing.JTextField();
        jLabel118 = new javax.swing.JLabel();
        jLabel119 = new javax.swing.JLabel();
        txt_firstname6 = new javax.swing.JTextField();
        txt_id4 = new javax.swing.JTextField();
        jLabel120 = new javax.swing.JLabel();
        jLabel121 = new javax.swing.JLabel();
        jLabel122 = new javax.swing.JLabel();
        jLabel123 = new javax.swing.JLabel();
        jLabel124 = new javax.swing.JLabel();
        txt_pc2 = new javax.swing.JTextField();
        txt_apt = new javax.swing.JTextField();
        txt_add4 = new javax.swing.JTextField();
        txt_address2 = new javax.swing.JTextField();
        jDesktopPane3 = new javax.swing.JDesktopPane();
        lbl_img = new javax.swing.JLabel();
        txt_salary6 = new javax.swing.JTextField();
        jLabel125 = new javax.swing.JLabel();
        jLabel126 = new javax.swing.JLabel();
        txt_doj4 = new javax.swing.JTextField();
        jLabel127 = new javax.swing.JLabel();
        jLabel128 = new javax.swing.JLabel();
        txt_status4 = new javax.swing.JTextField();
        txt_desig4 = new javax.swing.JTextField();
        jLabel129 = new javax.swing.JLabel();
        jLabel130 = new javax.swing.JLabel();
        txt_dep4 = new javax.swing.JTextField();
        txt_job4 = new javax.swing.JTextField();
        cmd_delete = new javax.swing.JButton();
        txt_update = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        allowance = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        txt_empid = new javax.swing.JTextField();
        txt_dob2 = new javax.swing.JTextField();
        jLabel49 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        txt_salary2 = new javax.swing.JTextField();
        txt_dept = new javax.swing.JTextField();
        txt_surname2 = new javax.swing.JTextField();
        jLabel62 = new javax.swing.JLabel();
        txt_firstname2 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        txt_med = new javax.swing.JTextField();
        txt_bonus = new javax.swing.JTextField();
        txt_other = new javax.swing.JTextField();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        txt_hw = new javax.swing.JTextField();
        jLabel67 = new javax.swing.JLabel();
        txt_total_overtime = new javax.swing.JTextField();
        txt_per = new javax.swing.JTextField();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel70 = new javax.swing.JLabel();
        txt_search1 = new javax.swing.JTextField();
        txt_emp2 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_allowance = new javax.swing.JTable();
        btnSave = new javax.swing.JButton();
        txt_cal = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel71 = new javax.swing.JLabel();
        lbl_total = new javax.swing.JLabel();
        updateSalary = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jLabel73 = new javax.swing.JLabel();
        txt_search2 = new javax.swing.JTextField();
        jLabel83 = new javax.swing.JLabel();
        txt_emp3 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        txt_empid1 = new javax.swing.JTextField();
        txt_dob3 = new javax.swing.JTextField();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        txt_salary3 = new javax.swing.JTextField();
        txt_dept1 = new javax.swing.JTextField();
        txt_surname3 = new javax.swing.JTextField();
        jLabel79 = new javax.swing.JLabel();
        txt_firstname3 = new javax.swing.JTextField();
        r_percentage = new javax.swing.JRadioButton();
        r_amount = new javax.swing.JRadioButton();
        jLabel80 = new javax.swing.JLabel();
        txt_dept2 = new javax.swing.JTextField();
        txt_dept3 = new javax.swing.JTextField();
        jLabel81 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        deduction = new javax.swing.JPanel();
        txt_id3 = new javax.swing.JTextField();
        jPanel17 = new javax.swing.JPanel();
        jLabel95 = new javax.swing.JLabel();
        txt_search4 = new javax.swing.JTextField();
        txt_firstname5 = new javax.swing.JTextField();
        txt_surname5 = new javax.swing.JTextField();
        txt_dob5 = new javax.swing.JTextField();
        txt_dep3 = new javax.swing.JTextField();
        jLabel96 = new javax.swing.JLabel();
        jLabel97 = new javax.swing.JLabel();
        jLabel98 = new javax.swing.JLabel();
        jLabel99 = new javax.swing.JLabel();
        jLabel100 = new javax.swing.JLabel();
        txt_desig3 = new javax.swing.JTextField();
        txt_status3 = new javax.swing.JTextField();
        txt_doj3 = new javax.swing.JTextField();
        txt_job3 = new javax.swing.JTextField();
        txt_salary5 = new javax.swing.JTextField();
        jLabel101 = new javax.swing.JLabel();
        jLabel102 = new javax.swing.JLabel();
        jLabel103 = new javax.swing.JLabel();
        jLabel104 = new javax.swing.JLabel();
        jLabel105 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jLabel106 = new javax.swing.JLabel();
        jLabel107 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        txt_Save = new javax.swing.JButton();
        txt_reason = new javax.swing.JTextField();
        lbl_total1 = new javax.swing.JLabel();
        lbl_emp = new javax.swing.JLabel();
        jLabel108 = new javax.swing.JLabel();
        r_percentage1 = new javax.swing.JRadioButton();
        jLabel109 = new javax.swing.JLabel();
        r_amount2 = new javax.swing.JRadioButton();
        txt_deduction = new javax.swing.JTextField();
        txt_percentage = new javax.swing.JTextField();
        jLabel110 = new javax.swing.JLabel();
        jLabel111 = new javax.swing.JLabel();
        jLabel112 = new javax.swing.JLabel();
        lbl_sal = new javax.swing.JLabel();
        payment = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jLabel84 = new javax.swing.JLabel();
        txt_search3 = new javax.swing.JTextField();
        txt_dep2 = new javax.swing.JTextField();
        jLabel85 = new javax.swing.JLabel();
        txt_id2 = new javax.swing.JTextField();
        txt_firstname4 = new javax.swing.JTextField();
        jLabel86 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        txt_surname4 = new javax.swing.JTextField();
        txt_dob4 = new javax.swing.JTextField();
        jLabel88 = new javax.swing.JLabel();
        txt_desig2 = new javax.swing.JTextField();
        txt_status2 = new javax.swing.JTextField();
        txt_doj2 = new javax.swing.JTextField();
        txt_job2 = new javax.swing.JTextField();
        txt_salary4 = new javax.swing.JTextField();
        jLabel89 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(70, 73, 73));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/X.png"))); // NOI18N
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("employeepayrollsystem/Bundle"); // NOI18N
        jLabel11.setText(bundle.getString("HomePage.jLabel11.text")); // NOI18N
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 0, 25, 24));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 790, -1));

        jPanelManu.setBackground(new java.awt.Color(70, 73, 73));
        jPanelManu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelManuMouseEntered(evt);
            }
        });

        jLabelManu2.setBackground(new java.awt.Color(70, 73, 73));
        jLabelManu2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabelManu2.setForeground(new java.awt.Color(255, 255, 255));
        jLabelManu2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelManu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/search-16-24.png"))); // NOI18N
        jLabelManu2.setText(bundle.getString("HomePage.jLabelManu2.text")); // NOI18N
        jLabelManu2.setOpaque(true);

        jLabelManu1.setBackground(new java.awt.Color(70, 73, 73));
        jLabelManu1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelManu1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelManu1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelManu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/add-user-2-24.png"))); // NOI18N
        jLabelManu1.setText(bundle.getString("HomePage.jLabelManu1.text")); // NOI18N
        jLabelManu1.setOpaque(true);

        jLabelManu4.setBackground(new java.awt.Color(70, 73, 73));
        jLabelManu4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabelManu4.setForeground(new java.awt.Color(255, 255, 255));
        jLabelManu4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelManu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/refresh-24.png"))); // NOI18N
        jLabelManu4.setText(bundle.getString("HomePage.jLabelManu4.text")); // NOI18N
        jLabelManu4.setOpaque(true);

        jLabelManu3.setBackground(new java.awt.Color(70, 73, 73));
        jLabelManu3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabelManu3.setForeground(new java.awt.Color(255, 255, 255));
        jLabelManu3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelManu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/filled-box-24.png"))); // NOI18N
        jLabelManu3.setText(bundle.getString("HomePage.jLabelManu3.text")); // NOI18N
        jLabelManu3.setOpaque(true);

        jLabelManu6.setBackground(new java.awt.Color(70, 73, 73));
        jLabelManu6.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabelManu6.setForeground(new java.awt.Color(255, 255, 255));
        jLabelManu6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelManu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/paypal-24.png"))); // NOI18N
        jLabelManu6.setText(bundle.getString("HomePage.jLabelManu6.text")); // NOI18N
        jLabelManu6.setOpaque(true);

        jLabelManu5.setBackground(new java.awt.Color(70, 73, 73));
        jLabelManu5.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabelManu5.setForeground(new java.awt.Color(255, 255, 255));
        jLabelManu5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelManu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/minus-5-24.png"))); // NOI18N
        jLabelManu5.setText(bundle.getString("HomePage.jLabelManu5.text")); // NOI18N
        jLabelManu5.setOpaque(true);

        javax.swing.GroupLayout jPanelManuLayout = new javax.swing.GroupLayout(jPanelManu);
        jPanelManu.setLayout(jPanelManuLayout);
        jPanelManuLayout.setHorizontalGroup(
            jPanelManuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelManu1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabelManu2, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabelManu3, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabelManu4, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabelManu5, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabelManu6, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanelManuLayout.setVerticalGroup(
            jPanelManuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelManuLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabelManu1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jLabelManu2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelManu3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelManu4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelManu5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelManu6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanelManu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, -1, 369));

        jPanelLogoAndName.setBackground(new java.awt.Color(70, 73, 73));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/app-store-2-48 (1).png"))); // NOI18N
        jLabel7.setText(bundle.getString("HomePage.jLabel7.text")); // NOI18N
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(251, 188, 12));
        jLabel8.setText(bundle.getString("HomePage.jLabel8.text")); // NOI18N
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelLogoAndNameLayout = new javax.swing.GroupLayout(jPanelLogoAndName);
        jPanelLogoAndName.setLayout(jPanelLogoAndNameLayout);
        jPanelLogoAndNameLayout.setHorizontalGroup(
            jPanelLogoAndNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLogoAndNameLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel7)
                .addGap(6, 6, 6)
                .addComponent(jLabel8))
        );
        jPanelLogoAndNameLayout.setVerticalGroup(
            jPanelLogoAndNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLogoAndNameLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel7))
            .addGroup(jPanelLogoAndNameLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel8))
        );

        getContentPane().add(jPanelLogoAndName, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 153, 80));

        jPanelHome.setBackground(new java.awt.Color(153, 153, 153));
        jPanelHome.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(1, 152, 115));

        jLabel12.setBackground(new java.awt.Color(15, 180, 125));
        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText(bundle.getString("HomePage.jLabel12.text")); // NOI18N
        jLabel12.setOpaque(true);

        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText(bundle.getString("HomePage.jLabel22.text")); // NOI18N

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText(bundle.getString("HomePage.jLabel23.text")); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel22)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(jLabel22)
                .addGap(15, 15, 15))
        );

        jPanelHome.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(538, 18, -1, -1));

        jPanel5.setBackground(new java.awt.Color(211, 84, 0));

        jLabel13.setBackground(new java.awt.Color(230, 124, 34));
        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText(bundle.getString("HomePage.jLabel13.text")); // NOI18N
        jLabel13.setOpaque(true);

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText(bundle.getString("HomePage.jLabel18.text")); // NOI18N

        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText(bundle.getString("HomePage.jLabel19.text")); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(jLabel19)
                .addGap(14, 14, 14))
        );

        jPanelHome.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 18, -1, -1));

        jPanel6.setBackground(new java.awt.Color(68, 108, 178));

        jLabel14.setBackground(new java.awt.Color(65, 131, 215));
        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText(bundle.getString("HomePage.jLabel14.text")); // NOI18N
        jLabel14.setOpaque(true);

        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText(bundle.getString("HomePage.jLabel20.text")); // NOI18N

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText(bundle.getString("HomePage.jLabel21.text")); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel20))
                    .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE))
                .addGap(12, 12, 12))
            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(jLabel20)
                .addGap(14, 14, 14))
        );

        jPanelHome.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, -1, -1));

        jPanel7.setBackground(new java.awt.Color(150, 56, 148));

        jLabel15.setBackground(new java.awt.Color(142, 70, 175));
        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText(bundle.getString("HomePage.jLabel15.text")); // NOI18N
        jLabel15.setOpaque(true);

        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText(bundle.getString("HomePage.jLabel28.text")); // NOI18N

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText(bundle.getString("HomePage.jLabel29.text")); // NOI18N

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel28)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(jLabel28)
                .addGap(14, 14, 14))
        );

        jPanelHome.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(538, 243, -1, -1));

        jPanel8.setBackground(new java.awt.Color(247, 202, 24));

        jLabel16.setBackground(new java.awt.Color(245, 230, 30));
        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText(bundle.getString("HomePage.jLabel16.text")); // NOI18N
        jLabel16.setOpaque(true);

        jLabel26.setText(bundle.getString("HomePage.jLabel26.text")); // NOI18N

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText(bundle.getString("HomePage.jLabel27.text")); // NOI18N

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel26)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(jLabel26)
                .addGap(15, 15, 15))
        );

        jPanelHome.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(277, 243, -1, -1));

        jPanel9.setBackground(new java.awt.Color(108, 122, 137));

        jLabel17.setBackground(new java.awt.Color(103, 128, 160));
        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText(bundle.getString("HomePage.jLabel17.text")); // NOI18N
        jLabel17.setOpaque(true);

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText(bundle.getString("HomePage.jLabel24.text")); // NOI18N

        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText(bundle.getString("HomePage.jLabel25.text")); // NOI18N

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel25)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(jLabel25)
                .addGap(15, 15, 15))
        );

        jPanelHome.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 243, -1, -1));

        getContentPane().add(jPanelHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 771, 430));

        employee.setBackground(new java.awt.Color(51, 51, 255));
        employee.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                employeeComponentShown(evt);
            }
        });

        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(null, bundle.getString("HomePage.jPanel10.border.title"), javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Adobe Arabic", 1, 14))); // NOI18N

        jLabel9.setText(bundle.getString("HomePage.jLabel9.text")); // NOI18N

        jLabel6.setText(bundle.getString("HomePage.jLabel6.text")); // NOI18N

        jLabel30.setText(bundle.getString("HomePage.jLabel30.text")); // NOI18N

        r_male.setText(bundle.getString("HomePage.r_male.text")); // NOI18N
        r_male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r_maleActionPerformed(evt);
            }
        });

        r_female.setText(bundle.getString("HomePage.r_female.text")); // NOI18N
        r_female.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r_femaleActionPerformed(evt);
            }
        });

        jLabel3.setText(bundle.getString("HomePage.jLabel3.text")); // NOI18N

        jLabel2.setText(bundle.getString("HomePage.jLabel2.text")); // NOI18N

        jLabel1.setText(bundle.getString("HomePage.jLabel1.text")); // NOI18N

        txt_firstname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_firstnameActionPerformed(evt);
            }
        });

        txt_id.setEditable(false);

        jLabel5.setText(bundle.getString("HomePage.jLabel5.text")); // NOI18N

        jDesktopPane1.setLayer(img, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(img, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                .addContainerGap())
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(img, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel10.setText(bundle.getString("HomePage.jLabel10.text")); // NOI18N

        jLabel31.setText(bundle.getString("HomePage.jLabel31.text")); // NOI18N

        jLabel33.setText(bundle.getString("HomePage.jLabel33.text")); // NOI18N

        jLabel34.setText(bundle.getString("HomePage.jLabel34.text")); // NOI18N

        jLabel35.setText(bundle.getString("HomePage.jLabel35.text")); // NOI18N

        jLabel36.setText(bundle.getString("HomePage.jLabel36.text")); // NOI18N

        jLabel37.setText(bundle.getString("HomePage.jLabel37.text")); // NOI18N

        jLabel38.setText(bundle.getString("HomePage.jLabel38.text")); // NOI18N

        txt_salary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_salaryActionPerformed(evt);
            }
        });

        cmd_save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Save-icon.png"))); // NOI18N
        cmd_save.setText(bundle.getString("HomePage.cmd_save.text")); // NOI18N
        cmd_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd_saveActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/erase-128.png"))); // NOI18N
        jButton1.setText(bundle.getString("HomePage.jButton1.text")); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txt_job.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_jobActionPerformed(evt);
            }
        });

        jLabel39.setText(bundle.getString("HomePage.jLabel39.text")); // NOI18N

        jLabel32.setText(bundle.getString("HomePage.jLabel32.text")); // NOI18N

        txt_emp.setText(bundle.getString("HomePage.txt_emp.text")); // NOI18N

        btnAttachImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/paper-clip-2-16.png"))); // NOI18N
        btnAttachImage.setText(bundle.getString("HomePage.btnAttachImage.text")); // NOI18N
        btnAttachImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAttachImageActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel6)
                        .addGap(91, 91, 91)
                        .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addComponent(jLabel9)
                        .addGap(54, 54, 54)
                        .addComponent(txt_tel))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel31))
                                .addGap(48, 48, 48)
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_address, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_add2, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(jLabel33)
                                .addGap(73, 73, 73)
                                .addComponent(txt_pc, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(33, 33, 33)
                        .addComponent(cmd_save, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel30))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(r_male)
                                .addGap(4, 4, 4)
                                .addComponent(r_female))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_firstname, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_surname, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_dob, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel34)
                            .addComponent(jLabel35)
                            .addComponent(jLabel36)
                            .addComponent(jLabel38)
                            .addComponent(jLabel37)
                            .addComponent(jLabel39))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_job, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_dep, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_desig, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_status, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_doj, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_salary, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel10Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel10Layout.createSequentialGroup()
                                                .addComponent(jLabel32)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(txt_emp))
                                            .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel10Layout.createSequentialGroup()
                                        .addGap(38, 38, 38)
                                        .addComponent(btnAttachImage)))))))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel32)
                    .addComponent(txt_emp))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(7, 7, 7)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_firstname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_surname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel36)
                            .addComponent(jLabel2))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_dob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel38)
                            .addComponent(jLabel3))
                        .addGap(17, 17, 17)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(r_male)
                                .addComponent(jLabel30))
                            .addComponent(r_female)))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel34))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(txt_dep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_desig, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel35))
                        .addGap(12, 12, 12)
                        .addComponent(txt_status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(txt_doj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_salary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel37)))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAttachImage)))
                .addGap(16, 16, 16)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel39))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_job, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(cmd_save, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel10Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel9))))
                                .addGap(5, 5, 5))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(txt_tel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel31))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(txt_address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(txt_add2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel33))
                            .addComponent(txt_pc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        javax.swing.GroupLayout employeeLayout = new javax.swing.GroupLayout(employee);
        employee.setLayout(employeeLayout);
        employeeLayout.setHorizontalGroup(
            employeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        employeeLayout.setVerticalGroup(
            employeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, employeeLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(employee, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 19, 770, 430));

        searchEmployee.setBackground(new java.awt.Color(102, 204, 0));
        searchEmployee.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                searchEmployeeComponentShown(evt);
            }
        });

        jPanel18.setBorder(javax.swing.BorderFactory.createTitledBorder(null, bundle.getString("HomePage.jPanel18.border.title"), javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Adobe Arabic", 1, 14))); // NOI18N

        jLabel113.setText(bundle.getString("HomePage.jLabel113.text")); // NOI18N

        txt_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_searchKeyReleased(evt);
            }
        });

        jLabel131.setText(bundle.getString("HomePage.jLabel131.text")); // NOI18N

        txt_emp4.setText(bundle.getString("HomePage.txt_emp4.text")); // NOI18N

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel113)
                .addGap(18, 18, 18)
                .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel131)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_emp4)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel113)
                    .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel131, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                        .addComponent(txt_emp4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel19.setBorder(javax.swing.BorderFactory.createTitledBorder(null, bundle.getString("HomePage.jPanel19.border.title"), javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Adobe Arabic", 0, 18))); // NOI18N

        jLabel114.setText(bundle.getString("HomePage.jLabel114.text")); // NOI18N

        jLabel115.setText(bundle.getString("HomePage.jLabel115.text")); // NOI18N

        jLabel116.setText(bundle.getString("HomePage.jLabel116.text")); // NOI18N

        r_male2.setText(bundle.getString("HomePage.r_male2.text")); // NOI18N
        r_male2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r_male2ActionPerformed(evt);
            }
        });

        jRadioButton2.setText(bundle.getString("HomePage.jRadioButton2.text")); // NOI18N
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jLabel117.setText(bundle.getString("HomePage.jLabel117.text")); // NOI18N

        jLabel118.setText(bundle.getString("HomePage.jLabel118.text")); // NOI18N

        jLabel119.setText(bundle.getString("HomePage.jLabel119.text")); // NOI18N

        txt_firstname6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_firstname6ActionPerformed(evt);
            }
        });

        txt_id4.setEditable(false);

        jLabel120.setText(bundle.getString("HomePage.jLabel120.text")); // NOI18N

        jLabel121.setText(bundle.getString("HomePage.jLabel121.text")); // NOI18N

        jLabel122.setText(bundle.getString("HomePage.jLabel122.text")); // NOI18N

        jLabel123.setText(bundle.getString("HomePage.jLabel123.text")); // NOI18N

        jLabel124.setText(bundle.getString("HomePage.jLabel124.text")); // NOI18N

        txt_apt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_aptActionPerformed(evt);
            }
        });

        jDesktopPane3.setLayer(lbl_img, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane3Layout = new javax.swing.GroupLayout(jDesktopPane3);
        jDesktopPane3.setLayout(jDesktopPane3Layout);
        jDesktopPane3Layout.setHorizontalGroup(
            jDesktopPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_img, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDesktopPane3Layout.setVerticalGroup(
            jDesktopPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_img, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        txt_salary6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_salary6ActionPerformed(evt);
            }
        });

        jLabel125.setText(bundle.getString("HomePage.jLabel125.text")); // NOI18N

        jLabel126.setText(bundle.getString("HomePage.jLabel126.text")); // NOI18N

        jLabel127.setText(bundle.getString("HomePage.jLabel127.text")); // NOI18N

        jLabel128.setText(bundle.getString("HomePage.jLabel128.text")); // NOI18N

        jLabel129.setText(bundle.getString("HomePage.jLabel129.text")); // NOI18N

        jLabel130.setText(bundle.getString("HomePage.jLabel130.text")); // NOI18N

        txt_job4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_job4ActionPerformed(evt);
            }
        });

        cmd_delete.setText(bundle.getString("HomePage.cmd_delete.text")); // NOI18N
        cmd_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd_deleteActionPerformed(evt);
            }
        });

        txt_update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/update icon.png"))); // NOI18N
        txt_update.setText(bundle.getString("HomePage.txt_update.text")); // NOI18N
        txt_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_updateActionPerformed(evt);
            }
        });

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/erase-128.png"))); // NOI18N
        jButton8.setText(bundle.getString("HomePage.jButton8.text")); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel123)
                            .addComponent(jLabel124)
                            .addComponent(jLabel121))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txt_pc2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_address2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_apt, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel19Layout.createSequentialGroup()
                                .addComponent(cmd_delete)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_update)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel19Layout.createSequentialGroup()
                                .addComponent(jLabel122)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_add4, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel19Layout.createSequentialGroup()
                                .addComponent(jLabel114)
                                .addGap(15, 15, 15)
                                .addComponent(txt_tel2, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel19Layout.createSequentialGroup()
                                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel19Layout.createSequentialGroup()
                                        .addComponent(jLabel116)
                                        .addGap(88, 88, 88)
                                        .addComponent(r_male2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jRadioButton2))
                                    .addGroup(jPanel19Layout.createSequentialGroup()
                                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel117)
                                            .addComponent(jLabel118)
                                            .addComponent(jLabel119)
                                            .addComponent(jLabel120))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txt_surname6, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txt_firstname6)
                                            .addComponent(txt_dob6, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txt_id4, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel19Layout.createSequentialGroup()
                                        .addComponent(jLabel115)
                                        .addGap(15, 15, 15)
                                        .addComponent(txt_email2)))
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel128)
                                    .addGroup(jPanel19Layout.createSequentialGroup()
                                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel127)
                                            .addComponent(jLabel125)
                                            .addComponent(jLabel129)
                                            .addComponent(jLabel130)
                                            .addComponent(jLabel126))
                                        .addGap(10, 10, 10)
                                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txt_doj4)
                                            .addComponent(txt_salary6)
                                            .addComponent(txt_status4)
                                            .addComponent(txt_dep4)
                                            .addComponent(txt_desig4)
                                            .addComponent(txt_job4, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDesktopPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jDesktopPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_id4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel120))
                        .addGroup(jPanel19Layout.createSequentialGroup()
                            .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel130)
                                .addComponent(txt_dep4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(0, 0, 0)
                            .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txt_desig4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel129)
                                .addComponent(jLabel119)
                                .addComponent(txt_firstname6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(0, 0, 0)
                            .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel128)
                                .addComponent(txt_status4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_surname6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel118))
                            .addGap(0, 0, 0)
                            .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel127)
                                .addComponent(txt_doj4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel117)
                                .addComponent(txt_dob6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(0, 0, 0)
                            .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel126)
                                .addComponent(txt_job4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(r_male2)
                                .addComponent(jRadioButton2)
                                .addComponent(jLabel116))
                            .addGap(0, 0, 0)
                            .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel125)
                                .addComponent(txt_salary6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_email2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel115)))))
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_tel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel114))
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_address2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel121)
                    .addComponent(txt_add4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel122))
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_apt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel123))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_update, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cmd_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel124)
                        .addComponent(txt_pc2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 5, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout searchEmployeeLayout = new javax.swing.GroupLayout(searchEmployee);
        searchEmployee.setLayout(searchEmployeeLayout);
        searchEmployeeLayout.setHorizontalGroup(
            searchEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        searchEmployeeLayout.setVerticalGroup(
            searchEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchEmployeeLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(searchEmployee, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 23, 770, 430));

        allowance.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                allowanceComponentShown(evt);
            }
        });

        txt_empid.setEditable(false);

        txt_dob2.setEditable(false);

        jLabel49.setText(bundle.getString("HomePage.jLabel49.text")); // NOI18N

        jLabel58.setText(bundle.getString("HomePage.jLabel58.text")); // NOI18N

        jLabel59.setText(bundle.getString("HomePage.jLabel59.text")); // NOI18N

        jLabel60.setText(bundle.getString("HomePage.jLabel60.text")); // NOI18N

        jLabel61.setText(bundle.getString("HomePage.jLabel61.text")); // NOI18N

        txt_salary2.setEditable(false);
        txt_salary2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_salary2ActionPerformed(evt);
            }
        });

        txt_dept.setEditable(false);

        txt_surname2.setEditable(false);

        jLabel62.setText(bundle.getString("HomePage.jLabel62.text")); // NOI18N

        txt_firstname2.setEditable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel62)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_dept, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel59)
                            .addComponent(jLabel58)
                            .addComponent(jLabel49)
                            .addComponent(jLabel60)
                            .addComponent(jLabel61))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_salary2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txt_firstname2)
                                .addComponent(txt_empid)
                                .addComponent(txt_surname2)
                                .addComponent(txt_dob2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel60)
                    .addComponent(txt_empid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel59)
                    .addComponent(txt_firstname2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel58)
                    .addComponent(txt_surname2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel49)
                    .addComponent(txt_dob2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_salary2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel61))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel62)
                    .addComponent(txt_dept, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        txt_med.setText(bundle.getString("HomePage.txt_med.text")); // NOI18N
        txt_med.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_medActionPerformed(evt);
            }
        });

        txt_bonus.setText(bundle.getString("HomePage.txt_bonus.text")); // NOI18N

        txt_other.setText(bundle.getString("HomePage.txt_other.text")); // NOI18N

        jLabel63.setText(bundle.getString("HomePage.jLabel63.text")); // NOI18N

        jLabel64.setText(bundle.getString("HomePage.jLabel64.text")); // NOI18N

        jLabel65.setText(bundle.getString("HomePage.jLabel65.text")); // NOI18N

        jLabel66.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel66.setText(bundle.getString("HomePage.jLabel66.text")); // NOI18N

        txt_hw.setText(bundle.getString("HomePage.txt_hw.text")); // NOI18N

        jLabel67.setText(bundle.getString("HomePage.jLabel67.text")); // NOI18N

        txt_total_overtime.setEditable(false);
        txt_total_overtime.setText(bundle.getString("HomePage.txt_total_overtime.text")); // NOI18N
        txt_total_overtime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_total_overtimeActionPerformed(evt);
            }
        });

        txt_per.setEditable(false);
        txt_per.setText(bundle.getString("HomePage.txt_per.text")); // NOI18N

        jLabel68.setText(bundle.getString("HomePage.jLabel68.text")); // NOI18N

        jLabel69.setText(bundle.getString("HomePage.jLabel69.text")); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel67)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel63)
                            .addComponent(jLabel64)
                            .addComponent(jLabel65))
                        .addGap(43, 43, 43)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_med, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                            .addComponent(txt_bonus)
                            .addComponent(txt_other)
                            .addComponent(txt_hw, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel68)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_total_overtime))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel69)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_per)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(206, Short.MAX_VALUE)
                .addComponent(jLabel66)
                .addGap(114, 114, 114))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel66)
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel67)
                            .addComponent(txt_hw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_med, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel63)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel68)
                            .addComponent(txt_total_overtime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel69)
                            .addComponent(txt_per, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel64)
                    .addComponent(txt_bonus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_other, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel65))
                .addGap(7, 7, 7))
        );

        jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder(null, bundle.getString("HomePage.jPanel13.border.title"), javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Adobe Arabic", 1, 14))); // NOI18N

        jLabel70.setText(bundle.getString("HomePage.jLabel70.text")); // NOI18N

        txt_search1.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentRemoved(java.awt.event.ContainerEvent evt) {
                txt_search1ComponentRemoved(evt);
            }
        });
        txt_search1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_search1ActionPerformed(evt);
            }
        });
        txt_search1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_search1KeyReleased(evt);
            }
        });

        txt_emp2.setText(bundle.getString("HomePage.txt_emp2.text")); // NOI18N

        jLabel72.setText(bundle.getString("HomePage.jLabel72.text")); // NOI18N

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel70)
                .addGap(18, 18, 18)
                .addComponent(txt_search1, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel72)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_emp2)
                .addGap(56, 56, 56))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel72, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                        .addComponent(txt_emp2))
                    .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_search1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel70)))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        table_allowance.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(table_allowance);

        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Save-icon.png"))); // NOI18N
        btnSave.setText(bundle.getString("HomePage.btnSave.text")); // NOI18N
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        txt_cal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Calculate.png"))); // NOI18N
        txt_cal.setText(bundle.getString("HomePage.txt_cal.text")); // NOI18N
        txt_cal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_calActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/erase-128.png"))); // NOI18N
        jButton4.setText(bundle.getString("HomePage.jButton4.text")); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel71.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel71.setText(bundle.getString("HomePage.jLabel71.text")); // NOI18N

        lbl_total.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbl_total.setText(bundle.getString("HomePage.lbl_total.text")); // NOI18N
        lbl_total.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                lbl_totalKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout allowanceLayout = new javax.swing.GroupLayout(allowance);
        allowance.setLayout(allowanceLayout);
        allowanceLayout.setHorizontalGroup(
            allowanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(allowanceLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
            .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(allowanceLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 543, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(allowanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(allowanceLayout.createSequentialGroup()
                        .addGroup(allowanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_cal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(12, 12, 12))
                    .addGroup(allowanceLayout.createSequentialGroup()
                        .addComponent(jLabel71)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_total, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        allowanceLayout.setVerticalGroup(
            allowanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, allowanceLayout.createSequentialGroup()
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(allowanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(allowanceLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(0, 0, 0)
                .addGroup(allowanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, allowanceLayout.createSequentialGroup()
                        .addGroup(allowanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel71)
                            .addComponent(lbl_total))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_cal, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        getContentPane().add(allowance, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 19, 770, 430));

        updateSalary.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                updateSalaryComponentShown(evt);
            }
        });

        jPanel14.setBorder(javax.swing.BorderFactory.createTitledBorder(null, bundle.getString("HomePage.jPanel14.border.title"), javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Adobe Arabic", 1, 14))); // NOI18N

        jLabel73.setText(bundle.getString("HomePage.jLabel73.text")); // NOI18N

        txt_search2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_search2KeyReleased(evt);
            }
        });

        jLabel83.setText(bundle.getString("HomePage.jLabel83.text")); // NOI18N

        txt_emp3.setText(bundle.getString("HomePage.txt_emp3.text")); // NOI18N

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel73)
                .addGap(18, 18, 18)
                .addComponent(txt_search2, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addComponent(jLabel83)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_emp3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel83, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_emp3))
                    .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_search2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel73)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txt_empid1.setEditable(false);

        txt_dob3.setEditable(false);

        jLabel74.setText(bundle.getString("HomePage.jLabel74.text")); // NOI18N

        jLabel75.setText(bundle.getString("HomePage.jLabel75.text")); // NOI18N

        jLabel76.setText(bundle.getString("HomePage.jLabel76.text")); // NOI18N

        jLabel77.setText(bundle.getString("HomePage.jLabel77.text")); // NOI18N

        jLabel78.setText(bundle.getString("HomePage.jLabel78.text")); // NOI18N

        txt_salary3.setEditable(false);
        txt_salary3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_salary3ActionPerformed(evt);
            }
        });

        txt_dept1.setEditable(false);

        txt_surname3.setEditable(false);

        jLabel79.setText(bundle.getString("HomePage.jLabel79.text")); // NOI18N

        txt_firstname3.setEditable(false);

        r_percentage.setText(bundle.getString("HomePage.r_percentage.text")); // NOI18N
        r_percentage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r_percentageActionPerformed(evt);
            }
        });

        r_amount.setText(bundle.getString("HomePage.r_amount.text")); // NOI18N
        r_amount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r_amountActionPerformed(evt);
            }
        });

        jLabel80.setText(bundle.getString("HomePage.jLabel80.text")); // NOI18N

        txt_dept2.setEditable(false);
        txt_dept2.setEnabled(false);

        txt_dept3.setEditable(false);
        txt_dept3.setEnabled(false);

        jLabel81.setText(bundle.getString("HomePage.jLabel81.text")); // NOI18N

        jLabel82.setText(bundle.getString("HomePage.jLabel82.text")); // NOI18N

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/update icon.png"))); // NOI18N
        jButton3.setText(bundle.getString("HomePage.jButton3.text")); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel76)
                            .addComponent(jLabel75)
                            .addComponent(jLabel77))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_firstname3, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                            .addComponent(txt_empid1)
                            .addComponent(txt_surname3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addComponent(jLabel79)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_dept1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel74)
                                    .addComponent(jLabel78))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_salary3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_dob3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel80)
                            .addComponent(jLabel81, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addComponent(r_percentage)
                                .addGap(18, 18, 18)
                                .addComponent(r_amount))
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addComponent(txt_dept2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel82)
                                .addGap(10, 10, 10)
                                .addComponent(txt_dept3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))))))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel74)
                            .addComponent(txt_dob3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_salary3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel78))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel79)
                            .addComponent(txt_dept1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel77)
                            .addComponent(txt_empid1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel76)
                            .addComponent(txt_firstname3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel75)
                            .addComponent(txt_surname3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel80)
                    .addComponent(r_percentage)
                    .addComponent(r_amount))
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_dept2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_dept3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel81)
                            .addComponent(jLabel82))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46))))
        );

        javax.swing.GroupLayout updateSalaryLayout = new javax.swing.GroupLayout(updateSalary);
        updateSalary.setLayout(updateSalaryLayout);
        updateSalaryLayout.setHorizontalGroup(
            updateSalaryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updateSalaryLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, updateSalaryLayout.createSequentialGroup()
                .addContainerGap(126, Short.MAX_VALUE)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(122, 122, 122))
        );
        updateSalaryLayout.setVerticalGroup(
            updateSalaryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updateSalaryLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(80, Short.MAX_VALUE))
        );

        getContentPane().add(updateSalary, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 19, 770, 430));

        deduction.setName(" "); // NOI18N
        deduction.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                deductionComponentShown(evt);
            }
        });

        txt_id3.setEditable(false);

        jPanel17.setBorder(javax.swing.BorderFactory.createTitledBorder(null, bundle.getString("HomePage.jPanel17.border.title"), javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Adobe Arabic", 1, 14))); // NOI18N

        jLabel95.setText(bundle.getString("HomePage.jLabel95.text")); // NOI18N

        txt_search4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_search4KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel95)
                .addGap(18, 18, 18)
                .addComponent(txt_search4, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_search4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel95))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txt_firstname5.setEditable(false);
        txt_firstname5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_firstname5ActionPerformed(evt);
            }
        });

        txt_surname5.setEditable(false);

        txt_dob5.setEditable(false);

        txt_dep3.setEditable(false);

        jLabel96.setText(bundle.getString("HomePage.jLabel96.text")); // NOI18N

        jLabel97.setText(bundle.getString("HomePage.jLabel97.text")); // NOI18N

        jLabel98.setText(bundle.getString("HomePage.jLabel98.text")); // NOI18N

        jLabel99.setText(bundle.getString("HomePage.jLabel99.text")); // NOI18N

        jLabel100.setText(bundle.getString("HomePage.jLabel100.text")); // NOI18N

        txt_desig3.setEditable(false);

        txt_status3.setEditable(false);

        txt_doj3.setEditable(false);

        txt_job3.setEditable(false);
        txt_job3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_job3ActionPerformed(evt);
            }
        });

        txt_salary5.setEditable(false);
        txt_salary5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_salary5ActionPerformed(evt);
            }
        });

        jLabel101.setText(bundle.getString("HomePage.jLabel101.text")); // NOI18N

        jLabel102.setText(bundle.getString("HomePage.jLabel102.text")); // NOI18N

        jLabel103.setText(bundle.getString("HomePage.jLabel103.text")); // NOI18N

        jLabel104.setText(bundle.getString("HomePage.jLabel104.text")); // NOI18N

        jLabel105.setText(bundle.getString("HomePage.jLabel105.text")); // NOI18N

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Calculate.png"))); // NOI18N
        jButton6.setText(bundle.getString("HomePage.jButton6.text")); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel106.setText(bundle.getString("HomePage.jLabel106.text")); // NOI18N

        jLabel107.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel107.setText(bundle.getString("HomePage.jLabel107.text")); // NOI18N

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/erase-128.png"))); // NOI18N
        jButton7.setText(bundle.getString("HomePage.jButton7.text")); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        txt_Save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Save-icon.png"))); // NOI18N
        txt_Save.setText(bundle.getString("HomePage.txt_Save.text")); // NOI18N
        txt_Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_SaveActionPerformed(evt);
            }
        });

        lbl_total1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_total1.setText(bundle.getString("HomePage.lbl_total1.text")); // NOI18N

        lbl_emp.setText(bundle.getString("HomePage.lbl_emp.text")); // NOI18N

        jLabel108.setText(bundle.getString("HomePage.jLabel108.text")); // NOI18N

        buttonGroup1.add(r_percentage1);
        r_percentage1.setText(bundle.getString("HomePage.r_percentage1.text")); // NOI18N
        r_percentage1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r_percentage1ActionPerformed(evt);
            }
        });

        jLabel109.setText(bundle.getString("HomePage.jLabel109.text")); // NOI18N

        buttonGroup1.add(r_amount2);
        r_amount2.setText(bundle.getString("HomePage.r_amount2.text")); // NOI18N
        r_amount2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r_amount2ActionPerformed(evt);
            }
        });

        txt_deduction.setEditable(false);
        txt_deduction.setEnabled(false);

        txt_percentage.setEditable(false);
        txt_percentage.setEnabled(false);

        jLabel110.setText(bundle.getString("HomePage.jLabel110.text")); // NOI18N

        jLabel111.setText(bundle.getString("HomePage.jLabel111.text")); // NOI18N

        jLabel112.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel112.setText(bundle.getString("HomePage.jLabel112.text")); // NOI18N

        lbl_sal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_sal.setText(bundle.getString("HomePage.lbl_sal.text")); // NOI18N

        javax.swing.GroupLayout deductionLayout = new javax.swing.GroupLayout(deduction);
        deduction.setLayout(deductionLayout);
        deductionLayout.setHorizontalGroup(
            deductionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deductionLayout.createSequentialGroup()
                .addGroup(deductionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(deductionLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(deductionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(deductionLayout.createSequentialGroup()
                                .addGroup(deductionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel106)
                                    .addGroup(deductionLayout.createSequentialGroup()
                                        .addComponent(jLabel109)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(r_percentage1)
                                        .addGap(35, 35, 35)
                                        .addComponent(r_amount2))
                                    .addGroup(deductionLayout.createSequentialGroup()
                                        .addComponent(jLabel110)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(deductionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txt_percentage, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_reason, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(deductionLayout.createSequentialGroup()
                                        .addGap(189, 189, 189)
                                        .addComponent(jLabel111)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_deduction, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(39, 39, 39)
                                .addGroup(deductionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(deductionLayout.createSequentialGroup()
                                        .addComponent(jLabel107)
                                        .addGap(18, 18, 18)
                                        .addComponent(lbl_total1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(deductionLayout.createSequentialGroup()
                                        .addComponent(jLabel112)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lbl_sal, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, deductionLayout.createSequentialGroup()
                                .addGroup(deductionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel102)
                                    .addComponent(jLabel103)
                                    .addComponent(jLabel104)
                                    .addComponent(jLabel105)
                                    .addComponent(jLabel101))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(deductionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txt_surname5, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_firstname5)
                                    .addComponent(txt_dob5, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_id3)
                                    .addComponent(txt_dep3, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(53, 53, 53)
                                .addGroup(deductionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel99)
                                    .addGroup(deductionLayout.createSequentialGroup()
                                        .addGroup(deductionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel98)
                                            .addComponent(jLabel96)
                                            .addComponent(jLabel100)
                                            .addComponent(jLabel97))
                                        .addGap(14, 14, 14)
                                        .addGroup(deductionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txt_doj3)
                                            .addComponent(txt_salary5)
                                            .addComponent(txt_status3)
                                            .addComponent(txt_desig3)
                                            .addComponent(txt_job3, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(18, 18, 18)
                        .addGroup(deductionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_Save, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(deductionLayout.createSequentialGroup()
                        .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel108)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_emp)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        deductionLayout.setVerticalGroup(
            deductionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deductionLayout.createSequentialGroup()
                .addGroup(deductionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(deductionLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(deductionLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(deductionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel108, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_emp))))
                .addGap(0, 0, 0)
                .addGroup(deductionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(deductionLayout.createSequentialGroup()
                        .addGroup(deductionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel105)
                            .addComponent(txt_id3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(deductionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel104)
                            .addComponent(txt_firstname5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(deductionLayout.createSequentialGroup()
                        .addGroup(deductionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_desig3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel100)
                            .addComponent(txt_Save, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addGroup(deductionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel99)
                            .addComponent(txt_status3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addGroup(deductionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel98)
                            .addComponent(txt_doj3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_surname5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel103)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addGroup(deductionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel97)
                            .addComponent(txt_job3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_dob5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel102))
                        .addGap(0, 0, 0)
                        .addGroup(deductionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel96)
                            .addComponent(txt_salary5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel101)
                            .addComponent(txt_dep3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(deductionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(deductionLayout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(deductionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel107)
                            .addComponent(lbl_total1))
                        .addGap(18, 18, 18)
                        .addGroup(deductionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel112)
                            .addComponent(lbl_sal)))
                    .addGroup(deductionLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(deductionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel109)
                            .addComponent(r_percentage1)
                            .addComponent(r_amount2))
                        .addGap(10, 10, 10)
                        .addGroup(deductionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_percentage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_deduction, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel110)
                            .addComponent(jLabel111))
                        .addGap(10, 10, 10)
                        .addGroup(deductionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel106)
                            .addComponent(txt_reason, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(38, 38, 38))
        );

        getContentPane().add(deduction, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 19, 770, 430));

        jPanel16.setBorder(javax.swing.BorderFactory.createTitledBorder(null, bundle.getString("HomePage.jPanel16.border.title"), javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Adobe Arabic", 1, 14))); // NOI18N

        jLabel84.setText(bundle.getString("HomePage.jLabel84.text")); // NOI18N

        txt_search3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_search3KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel84)
                .addGap(18, 18, 18)
                .addComponent(txt_search3)
                .addContainerGap())
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_search3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel84))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txt_dep2.setEditable(false);

        jLabel85.setText(bundle.getString("HomePage.jLabel85.text")); // NOI18N

        txt_id2.setEditable(false);

        txt_firstname4.setEditable(false);

        jLabel86.setText(bundle.getString("HomePage.jLabel86.text")); // NOI18N

        jLabel87.setText(bundle.getString("HomePage.jLabel87.text")); // NOI18N

        txt_surname4.setEditable(false);

        txt_dob4.setEditable(false);

        jLabel88.setText(bundle.getString("HomePage.jLabel88.text")); // NOI18N

        txt_desig2.setEditable(false);

        txt_status2.setEditable(false);

        txt_doj2.setEditable(false);

        txt_job2.setEditable(false);

        txt_salary4.setEditable(false);

        jLabel89.setText(bundle.getString("HomePage.jLabel89.text")); // NOI18N

        jLabel90.setText(bundle.getString("HomePage.jLabel90.text")); // NOI18N

        jLabel91.setText(bundle.getString("HomePage.jLabel91.text")); // NOI18N

        jLabel92.setText(bundle.getString("HomePage.jLabel92.text")); // NOI18N

        jLabel93.setText(bundle.getString("HomePage.jLabel93.text")); // NOI18N

        jLabel94.setText(bundle.getString("HomePage.jLabel94.text")); // NOI18N

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/slip.png"))); // NOI18N
        jButton5.setText(bundle.getString("HomePage.jButton5.text")); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout paymentLayout = new javax.swing.GroupLayout(payment);
        payment.setLayout(paymentLayout);
        paymentLayout.setHorizontalGroup(
            paymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paymentLayout.createSequentialGroup()
                .addGroup(paymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paymentLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(paymentLayout.createSequentialGroup()
                        .addGroup(paymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(paymentLayout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addGroup(paymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel88)
                                    .addComponent(jLabel87)
                                    .addComponent(jLabel86)
                                    .addComponent(jLabel85)
                                    .addComponent(jLabel94))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(paymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txt_surname4, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_firstname4)
                                    .addComponent(txt_dob4, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_id2)
                                    .addComponent(txt_dep2, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(111, 111, 111)
                                .addGroup(paymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel91)
                                    .addComponent(jLabel89)
                                    .addComponent(jLabel93)
                                    .addComponent(jLabel90)
                                    .addComponent(jLabel92))
                                .addGap(14, 14, 14)
                                .addGroup(paymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_doj2)
                                    .addComponent(txt_salary4)
                                    .addComponent(txt_status2)
                                    .addComponent(txt_desig2)
                                    .addComponent(txt_job2, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(paymentLayout.createSequentialGroup()
                                .addGap(299, 299, 299)
                                .addComponent(jButton5)))
                        .addGap(0, 65, Short.MAX_VALUE)))
                .addContainerGap())
        );
        paymentLayout.setVerticalGroup(
            paymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paymentLayout.createSequentialGroup()
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(paymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paymentLayout.createSequentialGroup()
                        .addGroup(paymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel85)
                            .addComponent(txt_id2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(paymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel86)
                            .addComponent(txt_firstname4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(paymentLayout.createSequentialGroup()
                        .addGroup(paymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_desig2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel93))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(paymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_status2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel92, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(paymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel91)
                            .addComponent(txt_doj2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_surname4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel87))
                        .addGap(12, 12, 12)
                        .addGroup(paymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel90)
                            .addComponent(txt_job2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_dob4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel88))
                        .addGap(12, 12, 12)
                        .addGroup(paymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel89)
                            .addComponent(txt_salary4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel94)
                            .addComponent(txt_dep2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(payment, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 19, 770, 430));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void setPanelShow(JPanel panel) {
        jPanelHome.setVisible(false);
        for (JPanel menuPanel : panels) {
            menuPanel.setVisible(false);
//            System.out.println("i am false");
        }
        panel.setVisible(true);
//        System.out.println("i am true");
    }

    public void setBorder() {
        ///set border
        //set logo border
        Border panelBorder = BorderFactory.createMatteBorder(0, 0, 2, 0, Color.lightGray);
        jPanelLogoAndName.setBorder(panelBorder);

    }

///create mathode for set label background    
    public void setBackgroundEfact(JLabel label) {

        ///////setSelect menulable backgrond
        for (JLabel menuItem : menuLabels) {
            menuItem.setBackground(new Color(70, 73, 73));
            menuItem.setForeground(Color.WHITE);
        }
        label.setBackground(new Color(15, 180, 125));
        label.setForeground(Color.blue);

    }

///ctreate mouse intnce mathode
    public void createMouseIntance() {
        Component[] components = jPanelManu.getComponents();
        for (Component component : components) {
            if (component instanceof JLabel) {
                JLabel label = (JLabel) component;
                label.addMouseListener(new MouseListener() {
                    @Override
                    public void mouseClicked(MouseEvent me) {
                        ////change background
                        setBackgroundEfact(label);
                        String name = label.getText().trim();
                        switch (name) {
                            case "Employee Manager":
                                setPanelShow(employee);
//                                System.out.println(name);
                                break;

                            case "Search":

                                setPanelShow(searchEmployee);
                                break;

                            case "Allowance":
                                setPanelShow(allowance);
                                break;

                            case "Update Salary":
                                setPanelShow(updateSalary);
                                break;

                            case "Deduction":
                                setPanelShow(deduction);
                                break;

                            case "Payment": {
                                setPanelShow(payment);
                                break;
                            }
                        }

                    }

                    @Override
                    public void mousePressed(MouseEvent me) {

                    }

                    @Override
                    public void mouseReleased(MouseEvent me) {

                    }

                    @Override
                    public void mouseEntered(MouseEvent me) {
                        label.setBorder(setBorder);
                    }

                    @Override
                    public void mouseExited(MouseEvent me) {
                        label.setBorder(defaultBorder);
                    }
                });
            }
        }
    }

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jPanelManuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelManuMouseEntered
        // TODO add your handling code here:

    }//GEN-LAST:event_jPanelManuMouseEntered

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // TODO add your handling code here:
        jPanelHome.setVisible(true);
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
        jPanelHome.setVisible(true);
    }//GEN-LAST:event_jLabel8MouseClicked

    private void r_maleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r_maleActionPerformed
        // TODO add your handling code here:
        gender = "Male";
        r_male.setSelected(true);
        r_female.setSelected(false);
    }//GEN-LAST:event_r_maleActionPerformed

    private void r_femaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r_femaleActionPerformed
        // TODO add your handling code here:
        gender = "Female";
        r_female.setSelected(true);
        r_male.setSelected(false);

    }//GEN-LAST:event_r_femaleActionPerformed

    private void txt_firstnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_firstnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_firstnameActionPerformed

    private void txt_salaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_salaryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_salaryActionPerformed

    //////
    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    byte[] person_image = null;
    private void cmd_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd_saveActionPerformed
        // TODO add your handling code here:
        int p = JOptionPane.showConfirmDialog(null, "Are you sure you want to add record?", "Add Record", JOptionPane.YES_NO_OPTION);
        if (p == 0) {

            try {
                conn = ConnectionProvider.getConnectDatabase();
                String sql = "insert into Staff_information "
                        + "(first_name,surname,Dob,Email,"
                        + "Telephone,Address,Department,"
                        + "Image,Salary,Gender,address2l,"
                        + "Post_code, Designation,Status,job_title,Apartment,Date_hired) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?) ";

                pst = conn.prepareStatement(sql);
                pst.setString(1, txt_firstname.getText());
                pst.setString(2, txt_surname.getText());
                pst.setString(3, txt_dob.getText());
                pst.setString(4, txt_email.getText());
                pst.setString(5, txt_tel.getText());
                pst.setString(6, txt_address.getText());
                pst.setString(7, txt_dep.getText());
                pst.setBytes(8, person_image);

                pst.setString(9, txt_salary.getText());
                pst.setString(10, gender);
                pst.setString(11, txt_add2.getText());
                pst.setString(12, txt_pc.getText());
                pst.setString(13, txt_desig.getText());
                pst.setString(14, txt_status.getText());
                pst.setString(15, txt_job.getText());
                pst.setString(16, txt_apt.getText());
                pst.setString(17, txt_doj.getText());

                pst.execute();
                JOptionPane.showMessageDialog(null, "Data is saved successfully");

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
//                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Data is not saved", "Error", JOptionPane.YES_NO_OPTION);
            }
            try {

                String sq = "select * from Staff_information where (employee_id) NOT IN (select employee_id from users)";
                pst = conn.prepareStatement(sq);
                rs = pst.executeQuery();

                while (rs.next()) {

                    String add1 = rs.getString("employee_id");
                    String add2 = rs.getString("first_name");
                    String add3 = rs.getString("dob");
                    String result = add3.replace("/", "");
//                    int pas = Integer.parseInt(result);
                    String add4 = rs.getString("department");

                    String sql = "insert into Users (division,username,password,employee_id) values ('" + add4 + "','" + add2 + "','" + result + "','" + add1 + "') ";
                    pst = conn.prepareStatement(sql);

                    pst.execute();
                    JOptionPane.showMessageDialog(null, "User account has been created successfully: " + " Username:  " + add2 + " Password:  " + result);
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
//                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "User Not Created", "Error", JOptionPane.YES_NO_OPTION);

            } finally {

                try {
                    rs.close();
                    pst.close();

                } catch (Exception e) {
//                    JOptionPane.showMessageDialog(null, e);
                }

                Date currentDate = GregorianCalendar.getInstance().getTime();
                DateFormat df = DateFormat.getDateInstance();
                String dateString = df.format(currentDate);

                Date d = new Date();
                SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
                String timeString = sdf.format(d);

                String value0 = timeString;
                String value1 = dateString;
                int val = Integer.parseInt(txt_emp.getText());
                try {

                    String reg = "insert into audit (employee_id, date, status) values ('" + val + "','" + value0 + " / " + value1 + "','Added Record')";
                    pst = conn.prepareStatement(reg);
                    pst.execute();
//                    JOptionPane.showMessageDialog(null, "Seve success");
                } catch (Exception e) {
//                    JOptionPane.showMessageDialog(null, "Data is not saved", "Error", JOptionPane.YES_NO_OPTION);
                } finally {

                    try {
                        rs.close();
                        pst.close();

                    } catch (Exception e) {
//                        JOptionPane.showMessageDialog(null, e);
                    }
                }
            }
        }
    }//GEN-LAST:event_cmd_saveActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        txt_id.setText("");
        txt_firstname.setText("");
        txt_surname.setText("");
        txt_tel.setText("");
        txt_dob.setText("");
        txt_email.setText("");
        txt_address.setText("");
        txt_dep.setText("");
        txt_status.setText("");
        txt_salary.setText("");
        txt_add2.setText("");
        txt_pc.setText("");
        txt_desig.setText("");
        txt_job.setText("");
//        txt_apt.setText("");
        txt_doj.setText("");
        img.setIcon(null);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txt_jobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_jobActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_jobActionPerformed

    private void txt_salary2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_salary2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_salary2ActionPerformed

    private void txt_medActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_medActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_medActionPerformed

    private void txt_total_overtimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_total_overtimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_total_overtimeActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        if (txt_empid.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Employee id Field is empty");
        } else if (txt_firstname2.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "First name Field is empty");

        } else if (txt_surname2.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Surname name Field is empty");

        } else if (txt_dob2.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Date of Birth name Field is empty");

        } else if (txt_salary2.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Salary Field is empty");

        } else if (txt_dept.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Department Field is empty");

        } else {

            int p = JOptionPane.showConfirmDialog(null, "Are you sure you want to save record?", "Add Record", JOptionPane.YES_NO_OPTION);
            if (p == 0) {
                try {

                    int value = EmployeePayrollSystem.empId;
                    String value1 = txt_salary2.getText();
                    String value2 = txt_bonus.getText();
                    String value3 = txt_med.getText();
                    String value4 = txt_other.getText();
                    String value5 = txt_per.getText();
                    String value6 = txt_hw.getText();
                    String value7 = lbl_total.getText();
                    String value8 = txt_empid.getText();
                    String value9 = txt_firstname2.getText();
                    String value10 = txt_surname2.getText();

                    String sql = "insert into Allowance (created_by,employee_id,overtime,medical,bonus,other,salary,rate,total_allowance,first_name,surname) values ('" + value + "','" + value8 + "','" + value6 + "','" + value3 + "','" + value2 + "','" + value4 + "','" + value1 + "','" + value5 + "','" + value7 + "','" + value9 + "','" + value10 + "')";

                    pst = conn.prepareStatement(sql);
                    pst.execute();
                    JOptionPane.showMessageDialog(null, "Allowance Added");

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e);
                }
                try {
                    Date currentDate = GregorianCalendar.getInstance().getTime();
                    DateFormat df = DateFormat.getDateInstance();
                    String dateString = df.format(currentDate);

                    Date d = new Date();
                    SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
                    String timeString = sdf.format(d);

                    String value0 = timeString;
                    String values = dateString;
                    int val = Integer.parseInt(txt_emp.getText());

                    String reg = "insert into Audit (employee_id, date, status) values ('" + val + "','" + value0 + " / " + values + "','Updated Allowance Record')";
                    pst = conn.prepareStatement(reg);
                    pst.execute();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e);
                } finally {
                    try {
                        rs.close();
                        pst.close();
                    } catch (Exception e) {
                    }
                }
            }
        }
        //////////see herer//////////////////////////////////
        Update_table();
    }//GEN-LAST:event_btnSaveActionPerformed
/////////table model

    void Update_table() {
        try {
            conn = ConnectionProvider.getConnectDatabase();
            String sql = "select * from allowance";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            table_allowance.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            e.printStackTrace();
        } finally {

            try {
                rs.close();
                pst.close();

            } catch (Exception e) {

            }
        }
    }


    private void txt_search1ComponentRemoved(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_txt_search1ComponentRemoved
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_search1ComponentRemoved

    private void txt_search1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_search1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_search1ActionPerformed

    private void txt_search1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_search1KeyReleased
        // TODO add your handling code here:
        try {
            int id = Integer.parseInt(txt_search1.getText());
            String sql = "select * from Staff_information where employee_id= '" + id + "'";
            Statement st = conn.createStatement();
//            pst = conn.prepareStatement(sql);
//            pst.setString(1, txt_search1.getText());
            rs = st.executeQuery(sql);
            while (rs.next()) {
                String add1 = rs.getString("employee_id");
                txt_empid.setText(add1);

                String add2 = rs.getString("first_name");
                txt_firstname2.setText(add2);

                String add3 = rs.getString("surname");
                txt_surname2.setText(add3);

                String add4 = rs.getString("Dob");
                txt_dob2.setText(add4);

                String add5 = rs.getString("Salary");
                txt_salary2.setText(add5);

                String add6 = rs.getString("Department");
                txt_dept.setText(add6);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {

            try {

                rs.close();
                pst.close();

            } catch (Exception e) {

            }
        }
    }//GEN-LAST:event_txt_search1KeyReleased

    private void txt_calActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_calActionPerformed
        // TODO add your handling code here:

        int salary = Integer.parseInt(txt_salary2.getText());
        int overtime = Integer.parseInt(txt_hw.getText());

        double eight = 8.0;
        double days = 25.0;
        double dbop;
        double overtimeRate = 1.5;

        //calculate the total hours of overtime
        double Total_Overtime = overtime * overtimeRate;
        String x = String.valueOf(Total_Overtime);
        txt_total_overtime.setText(x);

        //calculate overall overtime
        dbop = salary / (days * eight);
        String s = String.valueOf(dbop);
        txt_per.setText(s);

        int med = Integer.parseInt(txt_med.getText());
        int bonus = Integer.parseInt(txt_bonus.getText());
        int other = Integer.parseInt(txt_other.getText());
        int f = med + bonus + other;
        double calc = Total_Overtime * dbop + f;
        String c = String.valueOf(calc);
        lbl_total.setText(c);
    }//GEN-LAST:event_txt_calActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        txt_search1.setText("");
        txt_empid.setText("");
        txt_firstname2.setText("");
        txt_surname2.setText("");
        txt_salary2.setText("");
        txt_dob2.setText("");
        txt_dept.setText("");
        txt_med.setText("0");
        txt_bonus.setText("0");
        txt_other.setText("0");
        txt_hw.setText("0");
        txt_per.setText("0");
        txt_total_overtime.setText("0");
        lbl_total.setText("0.00");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void lbl_totalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lbl_totalKeyTyped
        // TODO add your handling code here:

    }//GEN-LAST:event_lbl_totalKeyTyped

    private void txt_search2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_search2KeyReleased
        // TODO add your handling code here:
        try {
            int id = Integer.parseInt(txt_search2.getText());
            String sql = "select * from Staff_information where employee_id= '" + id + "'";
            Statement st = conn.createStatement();
//            pst = conn.prepareStatement(sql);
//            pst.setString(1, txt_search2.getText());
            rs = st.executeQuery(sql);
            while (rs.next()) {
                String add1 = rs.getString("employee_id");
                txt_empid1.setText(add1);

                String add2 = rs.getString("first_name");
                txt_firstname3.setText(add2);

                String add3 = rs.getString("surname");
                txt_surname3.setText(add3);

                String add4 = rs.getString("Dob");
                txt_dob3.setText(add4);

                String add5 = rs.getString("Salary");
                txt_salary3.setText(add5);

                String add8 = rs.getString("Department");
                txt_dept1.setText(add8);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {

            try {

                rs.close();
                pst.close();

            } catch (Exception e) {

            }
        }
    }//GEN-LAST:event_txt_search2KeyReleased

    private void txt_salary3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_salary3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_salary3ActionPerformed

    private void r_percentageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r_percentageActionPerformed
        // TODO add your handling code here:
        r_percentage.setSelected(true);
        r_amount.setSelected(false);
        //r_amount.setEnabled(false);
        txt_dept3.setEnabled(false);
        txt_dept2.setEditable(true);
        txt_dept2.setEnabled(true);
        txt_dept3.setText("");

    }//GEN-LAST:event_r_percentageActionPerformed

    private void r_amountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r_amountActionPerformed
        // TODO add your handling code here:
        r_amount.setSelected(true);
        r_percentage.setSelected(false);
        //r_percentage.setEnabled(false);
        txt_dept2.setEnabled(false);
        txt_dept3.setEditable(true);
        txt_dept3.setEnabled(true);
        txt_dept2.setText("");
    }//GEN-LAST:event_r_amountActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        int p = JOptionPane.showConfirmDialog(null, "Are you sure you want to update salary?", "Update Record", JOptionPane.YES_NO_OPTION);
        if (p == 0) {
            int salary = Integer.parseInt(txt_salary3.getText());

            if (r_percentage.isSelected() == true) {
                double getPercentage = Double.parseDouble(txt_dept2.getText());
                double calcPercentage = salary / 100 * getPercentage + salary;
                int newSal = (int) calcPercentage;
                String xP = String.valueOf(newSal);
                txt_salary3.setText(xP);
            } else if (r_amount.isSelected() == true) {
                int getAmt = Integer.parseInt(txt_dept3.getText());
                int calcAmount = salary + getAmt;
                String xA = String.valueOf(calcAmount);
                txt_salary3.setText(xA);
            }
            try {
                Date currentDate = GregorianCalendar.getInstance().getTime();
                DateFormat df = DateFormat.getDateInstance();
                String dateString = df.format(currentDate);

                Date d = new Date();
                SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
                String timeString = sdf.format(d);

                String value0 = timeString;
                String values = dateString;
                int val = Integer.parseInt(txt_emp.getText());

                String reg = "insert into Audit (employee_id, date, status) values ('" + val + "','" + value0 + " / " + values + "','Updated Salary Record')";
                pst = conn.prepareStatement(reg);
                pst.execute();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
            try {

                String value1 = txt_empid1.getText();
                int value2 = Integer.parseInt(txt_salary3.getText());

                String sql = "update Staff_information set Salary='" + value2 + "' where employee_id='" + value1 + "'";

                pst = conn.prepareStatement(sql);
                pst.execute();
                JOptionPane.showMessageDialog(null, "Record Updated");

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            } finally {

                try {
                    rs.close();
                    pst.close();

                } catch (Exception e) {

                }
            }
        }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void txt_search4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_search4KeyReleased
        // TODO add your handling code here:
        try {
//            conn=ConnectionProvider.getConnectDatabase();
            String id = txt_search4.getText();
            String sql = "select * from Staff_information where employee_id= '" + id + "'";
            Statement st = conn.createStatement();
//            pst = conn.prepareStatement(sql);
//            pst.setString(1, txt_search.getText());
            rs = st.executeQuery(sql);
            while (rs.next()) {
                String add1 = rs.getString("employee_id");
                txt_id3.setText(add1);

                String add2 = rs.getString("first_name");
                txt_firstname5.setText(add2);

                String add3 = rs.getString("surname");
                txt_surname5.setText(add3);

                String add4 = rs.getString("Dob");
                txt_dob5.setText(add4);

                String add5 = rs.getString("Department");
                txt_dep3.setText(add5);

                String add7 = rs.getString("Salary");
                txt_salary5.setText(add7);

                String add8 = rs.getString("Status");
                txt_status3.setText(add8);

                String add9 = rs.getString("Date_hired");
                txt_doj3.setText(add9);

                String add10 = rs.getString("job_title");
                txt_job3.setText(add10);

                String add17 = rs.getString("Designation");
                txt_desig3.setText(add17);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {

            try {

                rs.close();
                pst.close();

            } catch (Exception e) {

            }
        }
    }//GEN-LAST:event_txt_search4KeyReleased

    private void txt_firstname5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_firstname5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_firstname5ActionPerformed

    private void txt_job3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_job3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_job3ActionPerformed

    private void txt_salary5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_salary5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_salary5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:

        int salary = Integer.parseInt(txt_salary5.getText());

        if (r_percentage1.isSelected() == true) {
            int percentage = Integer.parseInt(txt_percentage.getText());
            //calculate the total hours of overtime
            int total_percentage_deduction = salary / 100 * percentage;
            String x = String.valueOf(total_percentage_deduction);
            int sal = salary - total_percentage_deduction;
            lbl_total1.setText(x);
            lbl_sal.setText(String.valueOf(sal));
        }

        if (r_amount2.isSelected() == true) {
            int deduction = Integer.parseInt(txt_deduction.getText());
            //calculate the total hours of overtime
            int total_amount_deduction = salary - deduction;
            String s = String.valueOf(total_amount_deduction);

            lbl_sal.setText(s);
            lbl_total1.setText(String.valueOf(deduction));

        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:

        txt_id3.setText("");
        txt_firstname5.setText("");
        txt_surname5.setText("");
        txt_dob5.setText("");
        txt_dep3.setText("");
        txt_status3.setText("");
        txt_salary5.setText("");
        txt_desig3.setText("");
        txt_job3.setText("");
        txt_doj3.setText("");
        lbl_total1.setText("0.00");
        txt_percentage.setText("");
        txt_deduction.setText("");
        txt_reason.setText("");
        txt_search4.setText("");
        lbl_sal.setText("0.00");

    }//GEN-LAST:event_jButton7ActionPerformed

    private void txt_SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_SaveActionPerformed
        // TODO add your handling code here:

        int p = JOptionPane.showConfirmDialog(null, "Are you sure you want to add record?", "Add Record", JOptionPane.YES_NO_OPTION);
        if (p == 0) {

            String value3 = lbl_emp.getText();
            try {

                String sql = "insert into Deductions (first_name,surname,salary,deduction_amount,deduction_reason,employee_id,made_by) values (?,?,?,?,?,?,'" + value3 + "')";
                pst = conn.prepareStatement(sql);
                pst.setString(1, txt_firstname5.getText());
                pst.setString(2, txt_surname5.getText());
                pst.setInt(3, Integer.parseInt(txt_salary5.getText()));
                pst.setInt(4, Integer.parseInt(lbl_total1.getText()));
                pst.setString(5, txt_reason.getText());
                pst.setInt(6, Integer.parseInt(txt_id3.getText()));
//                pst.setString(7, lbl_emp.getText());

                pst.execute();
                JOptionPane.showMessageDialog(null, "Data is saved successfully");

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
                e.printStackTrace();
            }
            try {
                Date currentDate = GregorianCalendar.getInstance().getTime();
                DateFormat df = DateFormat.getDateInstance();
                String dateString = df.format(currentDate);

                Date d = new Date();
                SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
                String timeString = sdf.format(d);

                String value0 = timeString;
                String values = dateString;
                int val = Integer.parseInt(lbl_emp.getText());

                String reg = "insert into Audit (employee_id, date, status) values ('" + val + "','" + value0 + " / " + values + "','Updated Deduction Record')";
                pst = conn.prepareStatement(reg);
                pst.execute();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
                e.printStackTrace();
            } finally {

                try {
                    rs.close();
                    pst.close();

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e);
                }
            }
        }

    }//GEN-LAST:event_txt_SaveActionPerformed

    private void r_percentage1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r_percentage1ActionPerformed
        // TODO add your handling code here:
        r_percentage.setSelected(true);
        r_amount2.setSelected(false);
        //r_amount.setEnabled(false);
        txt_deduction.setEnabled(false);
        txt_percentage.setEditable(true);
        txt_percentage.setEnabled(true);
        txt_deduction.setText("");
    }//GEN-LAST:event_r_percentage1ActionPerformed

    private void r_amount2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r_amount2ActionPerformed
        // TODO add your handling code here:
        r_amount2.setSelected(true);
        r_percentage.setSelected(false);
        //r_percentage.setEnabled(false);
        txt_percentage.setEnabled(false);
        txt_deduction.setEditable(true);
        txt_deduction.setEnabled(true);
        txt_percentage.setText("");
    }//GEN-LAST:event_r_amount2ActionPerformed

    private void txt_search3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_search3KeyReleased
        // TODO add your handling code here:
        try {
            String id = txt_search3.getText();
            String sql = "select * from Staff_information where employee_id=' " + id + "'";
            Statement st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                String add1 = rs.getString("employee_id");
                txt_id2.setText(add1);

                String add2 = rs.getString("first_name");
                txt_firstname4.setText(add2);

                String add3 = rs.getString("surname");
                txt_surname4.setText(add3);

                String add4 = rs.getString("Dob");
                txt_dob4.setText(add4);

                String add5 = rs.getString("Department");
                txt_dep2.setText(add5);

                String add7 = rs.getString("Salary");
                txt_salary4.setText(add7);

                String add8 = rs.getString("Status");
                txt_status2.setText(add8);

                String add9 = rs.getString("Date_hired");
                txt_doj2.setText(add9);

                String add10 = rs.getString("job_title");
                txt_job2.setText(add10);

                String add17 = rs.getString("Designation");
                txt_desig2.setText(add17);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            e.printStackTrace();
        } finally {

            try {

                rs.close();
                pst.close();

            } catch (Exception e) {

            }
        }
    }//GEN-LAST:event_txt_search3KeyReleased

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        // TODO add your handling code here:
        String value = txt_firstname4.getText();
        String value0 = txt_surname4.getText();
        String value1 = txt_id2.getText();
        String value2 = txt_desig2.getText();
        String value3 = txt_desig2.getText();

        JFileChooser dialog = new JFileChooser();
        dialog.setSelectedFile(new File(value + " " + value0 + "-Salary Slip" + ".pdf"));
        int dialogResult = dialog.showSaveDialog(null);
        if (dialogResult == JFileChooser.APPROVE_OPTION) {
            String filePath = dialog.getSelectedFile().getPath();

            int v = 0;
            String reason = "";
            float x = 0;
            int overTime = 0, bonus = 0, other = 0, medical = 0;
            try {
                // TODO add your handling code here:
                conn = ConnectionProvider.getConnectDatabase();
                String sql = "select * from Deductions where employee_id = '" + value1 + "'";
                Statement st = conn.createStatement();
//                pst = conn.prepareStatement(sql);
                rs = st.executeQuery(sql);
                while (rs.next()) {
//                String val = rs.getString("deduction_amount");
                    v = rs.getInt("deduction_amount");
                    reason = rs.getString("deduction_reason");
                }
                rs.close();
                pst.close();

                String sq = "select * from Allowance where employee_id = '" + value1 + "'";
                Statement ts = conn.createStatement();
//                pst = conn.prepareStatement(sq);
                rs = ts.executeQuery(sq);
                while (rs.next()) {
                    overTime = rs.getInt("overtime");
                    medical = rs.getInt("medical");
                    bonus = rs.getInt("bonus");
                    other = rs.getInt("other");
                    x = Float.valueOf(rs.getInt("total_allowance"));

                }
                int calcTotal = Integer.parseInt(txt_salary4.getText());
//                int v = Integer.parseInt(val);
                float total = calcTotal + x - v;

                Document myDocument = new Document();
                PdfWriter myWriter = PdfWriter.getInstance(myDocument, new FileOutputStream(filePath));
                myDocument.open();

                myDocument.add(new Paragraph("PAY SLIP", FontFactory.getFont(FontFactory.TIMES_BOLD, 20, Font.BOLD)));
                myDocument.add(new Paragraph(new Date().toString()));
                myDocument.add(new Paragraph("-------------------------------------------------------------------------------------------"));
                myDocument.add((new Paragraph("EMPLOYEE DETAILS", FontFactory.getFont(FontFactory.TIMES_ROMAN, 15, Font.BOLD))));
                myDocument.add((new Paragraph("Name of Employee: " + value + " " + value0, FontFactory.getFont(FontFactory.TIMES_ROMAN, 10, Font.PLAIN))));
                myDocument.add((new Paragraph("Designation: " + value2, FontFactory.getFont(FontFactory.TIMES_ROMAN, 10, Font.PLAIN))));
                myDocument.add((new Paragraph("Department: " + value3, FontFactory.getFont(FontFactory.TIMES_ROMAN, 10, Font.PLAIN))));
                myDocument.add(new Paragraph("-------------------------------------------------------------------------------------------"));
                myDocument.add(new Paragraph("SALARY", FontFactory.getFont(FontFactory.TIMES_ROMAN, 15, Font.BOLD)));
                myDocument.add(new Paragraph("Basic Salary: " + calcTotal + "/-", FontFactory.getFont(FontFactory.TIMES_ROMAN, 10, Font.PLAIN)));
                myDocument.add(new Paragraph("Overtime: " + overTime + " Hours", FontFactory.getFont(FontFactory.TIMES_ROMAN, 10, Font.PLAIN)));
                myDocument.add(new Paragraph("Medical: " + medical + "/-", FontFactory.getFont(FontFactory.TIMES_ROMAN, 10, Font.PLAIN)));
                myDocument.add(new Paragraph("Bonus: " + bonus + "/-", FontFactory.getFont(FontFactory.TIMES_ROMAN, 10, Font.PLAIN)));
                myDocument.add(new Paragraph("Other: " + other + "/-", FontFactory.getFont(FontFactory.TIMES_ROMAN, 10, Font.PLAIN)));
                myDocument.add(new Paragraph("-------------------------------------------------------------------------------------------"));
                myDocument.add(new Paragraph("DEDUCTION", FontFactory.getFont(FontFactory.TIMES_ROMAN, 15, Font.BOLD)));
                myDocument.add(new Paragraph("Deduction Details: " + reason, FontFactory.getFont(FontFactory.TIMES_ROMAN, 10, Font.PLAIN)));
                myDocument.add(new Paragraph("Total Deductions : " + v + "/-", FontFactory.getFont(FontFactory.TIMES_ROMAN, 10, Font.PLAIN)));
                myDocument.add(new Paragraph("-------------------------------------------------------------------------------------------"));
                myDocument.add(new Paragraph("TOTAL PAYMENT", FontFactory.getFont(FontFactory.TIMES_ROMAN, 15, Font.BOLD)));
                myDocument.add(new Paragraph("Total Earnings: " + x + "/-", FontFactory.getFont(FontFactory.TIMES_ROMAN, 10, Font.PLAIN)));
                myDocument.add(new Paragraph("Net Pay : " + total + "/-", FontFactory.getFont(FontFactory.TIMES_ROMAN, 10, Font.PLAIN)));
                myDocument.add(new Paragraph("-------------------------------------------------------------------------------------------"));

                myDocument.newPage();
                myDocument.close();
                JOptionPane.showMessageDialog(null, "Report was successfully generated");

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
                e.printStackTrace();
            } finally {

                try {
                    rs.close();
                    pst.close();

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e);

                }
            }
        }

    }//GEN-LAST:event_jButton5ActionPerformed

    private void r_male2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r_male2ActionPerformed
        // TODO add your handling code here:

        gender = "Male";
    }//GEN-LAST:event_r_male2ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:

        gender = "Female";
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void txt_firstname6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_firstname6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_firstname6ActionPerformed

    private void txt_aptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_aptActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_aptActionPerformed

    private void txt_salary6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_salary6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_salary6ActionPerformed

    private void txt_job4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_job4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_job4ActionPerformed

    private void cmd_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd_deleteActionPerformed
        // TODO add your handling code here:

        int p = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete record?", "Delete", JOptionPane.YES_NO_OPTION);
        if (p == 0) {
            Date currentDate = GregorianCalendar.getInstance().getTime();
            DateFormat df = DateFormat.getDateInstance();
            String dateString = df.format(currentDate);

            Date d = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
            String timeString = sdf.format(d);

            String value0 = timeString;
            String value1 = dateString;
            int val = Integer.parseInt(txt_emp.getText());
            try {
                String reg = "insert into Audit (employee_id, date, status) values ('" + val + "','" + value0 + " / " + value1 + "','Deleted Record')";
                pst = conn.prepareStatement(reg);
                pst.execute();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
            String sql = "delete from Staff_information where employee_id=? ";
            try {
                pst = conn.prepareStatement(sql);
                pst.setString(1, txt_id4.getText());
                pst.execute();

                JOptionPane.showMessageDialog(null, "Record Deleted");

            } catch (Exception e) {

                JOptionPane.showMessageDialog(null, e);
            } finally {

                try {
                    rs.close();
                    pst.close();

                } catch (Exception e) {

                }
            }
            try {

                String sq = "delete from Users where employee_id =?";
                pst = conn.prepareStatement(sq);
                pst.setString(1, txt_id4.getText());
                pst.execute();
//                JOptionPane.showMessageDialog(null, "User Delete Done.");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }

        }
    }//GEN-LAST:event_cmd_deleteActionPerformed

    private void txt_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_updateActionPerformed
        // TODO add your handling code here:
        int p = JOptionPane.showConfirmDialog(null, "Are you sure you want to update?", "Update Record", JOptionPane.YES_NO_OPTION);
        if (p == 0) {

            try {

                String value1 = txt_firstname6.getText();
                String value2 = txt_surname6.getText();
                String value3 = txt_dob6.getText();
                String value4 = txt_id4.getText();
                String value5 = txt_email2.getText();
                String value6 = txt_tel2.getText();
                String value7 = txt_address2.getText();
                String value8 = txt_dep4.getText();
                String value9 = txt_add4.getText();
                String value10 = txt_apt.getText();
                String value11 = txt_pc2.getText();
                String value12 = txt_desig4.getText();
                String value13 = txt_status4.getText();
                String value14 = txt_salary6.getText();
                String value15 = txt_job4.getText();
                String value16 = txt_doj4.getText();

                String sql = "update Staff_information set employee_id='" + value4 + "',first_name='" + value1 + "', surname='" + value2 + "', "
                        + "Dob='" + value3 + "',Email='" + value5 + "',Telephone='" + value6 + "',"
                        + "Address='" + value7 + "',Department='" + value8 + "', address2l = '" + value9 + "', "
                        + "Apartment = '" + value10 + "', Post_code ='" + value11 + "', "
                        + "Designation ='" + value12 + "', Status ='" + value13 + "', Salary ='" + value14 + "', job_title ='" + value15 + "', Date_Hired ='" + value16 + "'   "
                        + " where employee_id='" + value4 + "' ";

                pst = conn.prepareStatement(sql);
                pst.execute();
                JOptionPane.showMessageDialog(null, "Record Updated");

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }

            Date currentDate = GregorianCalendar.getInstance().getTime();
            DateFormat df = DateFormat.getDateInstance();
            String dateString = df.format(currentDate);

            Date d = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
            String timeString = sdf.format(d);

            String value0 = timeString;
            String values = dateString;
            int val = Integer.parseInt(txt_emp.getText());
            try {
                String reg = "insert into Audit (employee_id, date, status) values ('" + val + "','" + value0 + " / " + values + "','Updated Record')";
                pst = conn.prepareStatement(reg);
                pst.execute();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            } finally {

                try {
                    rs.close();
                    pst.close();

                } catch (Exception e) {

                }
            }

        }
    }//GEN-LAST:event_txt_updateActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        txt_firstname6.setText("");
        txt_surname6.setText("");
        txt_dob6.setText("");
        txt_id4.setText("");
        txt_email2.setText("");
        txt_tel2.setText("");
        txt_address2.setText("");
        txt_dep4.setText("");
        txt_add4.setText("");
        txt_apt.setText("");
        txt_pc2.setText("");
        txt_desig4.setText("");
        txt_status4.setText("");
        txt_salary6.setText("");
        txt_job4.setText("");
        txt_doj4.setText("");
        lbl_img.setIcon(null);
        txt_search.setText("");
    }//GEN-LAST:event_jButton8ActionPerformed
///////////image attach bautton
    private ImageIcon format = null;
    //strin filename
    String filename = null;
//    byte[] person_image = null;    
//    private String gender;

    private void btnAttachImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAttachImageActionPerformed
        // TODO add your handling code here:
        JFileChooser jChooser = new JFileChooser();
        jChooser.showOpenDialog(null);
        File file = jChooser.getSelectedFile();
        filename = file.getAbsolutePath();
        Image icon = new ImageIcon(filename).getImage().getScaledInstance(img.getWidth(), img.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon imageIcon = new ImageIcon(icon);
        img.setIcon(imageIcon);

        //////image path byte code
        try {
            File imageFile = new File(filename);
            FileInputStream fos = new FileInputStream(imageFile);
            byte[] bs = new byte[1024];
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            for (int readNume; (readNume = fos.read(bs)) != -1;) {
                baos.write(bs, 0, readNume);
            }
            person_image = baos.toByteArray();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnAttachImageActionPerformed

    private void txt_searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_searchKeyReleased
        // TODO add your handling code here:
        try {
            String s = txt_search.getText();
            String sql = "select * from staff_information where employee_id=' " + s + "'";
//            conn = ConnectionProvider.getConnectDatabase();
            Statement st = conn.createStatement();

            rs = st.executeQuery(sql);
            while (rs.next()) {

                int add1 = rs.getInt("employee_id");
                txt_id4.setText(String.valueOf(add1));

                String add2 = rs.getString("first_name");
                txt_firstname6.setText(add2);

                String add3 = rs.getString("surname");
                txt_surname6.setText(add3);

                String add4 = rs.getString("Dob");
                txt_dob6.setText(add4);

                String add5 = rs.getString("Email");
                txt_email2.setText(add5);

                String add6 = rs.getString("Telephone");
                txt_tel2.setText(add6);

                String add7 = rs.getString("Address");
                txt_address2.setText(add7);

                String add8 = rs.getString("Department");
                txt_dep4.setText(add8);

                String add9 = rs.getString("Gender");
//                txt_dep.setText(add9);

                String add10 = rs.getString("Salary");
                txt_salary6.setText(add10);

                String add11 = rs.getString("address2l");
                txt_add4.setText(add11);

                String add12 = rs.getString("Apartment");
                txt_apt.setText(add12);

                String add13 = rs.getString("Post_code");
                txt_pc2.setText(add13);

                String add14 = rs.getString("Status");
                txt_status.setText(add14);

                String add15 = rs.getString("Date_hired");
                txt_doj4.setText(add15);

                String add16 = rs.getString("job_title");
                txt_job4.setText(add16);

                String add17 = rs.getString("Designation");
                txt_desig4.setText(add17);

                byte[] img = rs.getBytes("Image");
                ImageIcon imageIcon = new ImageIcon(new ImageIcon(img).getImage().getScaledInstance(lbl_img.getWidth(), lbl_img.getHeight(), Image.SCALE_SMOOTH));
                lbl_img.setIcon(imageIcon);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            e.printStackTrace();
        } finally {

            try {

                rs.close();
                pst.close();

            } catch (Exception e) {

            }
        }
    }//GEN-LAST:event_txt_searchKeyReleased

    private void employeeComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_employeeComponentShown
        // TODO add your handling code here:
        int ei=EmployeePayrollSystem.empId;
        txt_emp.setText(String.valueOf(ei));
    }//GEN-LAST:event_employeeComponentShown

    private void searchEmployeeComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_searchEmployeeComponentShown
        // TODO add your handling code here:
        int ei=EmployeePayrollSystem.empId;
        txt_emp4.setText(String.valueOf(ei));
    }//GEN-LAST:event_searchEmployeeComponentShown

    private void allowanceComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_allowanceComponentShown
        // TODO add your handling code here:
        int ei=EmployeePayrollSystem.empId;
        txt_emp2.setText(String.valueOf(ei));
    }//GEN-LAST:event_allowanceComponentShown

    private void updateSalaryComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_updateSalaryComponentShown
        // TODO add your handling code here:
        int ei=EmployeePayrollSystem.empId;
        txt_emp3.setText(String.valueOf(ei));
    }//GEN-LAST:event_updateSalaryComponentShown

    private void deductionComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_deductionComponentShown
        // TODO add your handling code here:
        int ei=EmployeePayrollSystem.empId;
        lbl_emp.setText(String.valueOf(ei));
    }//GEN-LAST:event_deductionComponentShown

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
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel allowance;
    private javax.swing.JButton btnAttachImage;
    private javax.swing.JButton btnSave;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton cmd_delete;
    private javax.swing.JButton cmd_save;
    private javax.swing.JPanel deduction;
    private javax.swing.JPanel employee;
    private javax.swing.JLabel img;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JDesktopPane jDesktopPane3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel119;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel120;
    private javax.swing.JLabel jLabel121;
    private javax.swing.JLabel jLabel122;
    private javax.swing.JLabel jLabel123;
    private javax.swing.JLabel jLabel124;
    private javax.swing.JLabel jLabel125;
    private javax.swing.JLabel jLabel126;
    private javax.swing.JLabel jLabel127;
    private javax.swing.JLabel jLabel128;
    private javax.swing.JLabel jLabel129;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel130;
    private javax.swing.JLabel jLabel131;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JLabel jLabelManu1;
    private javax.swing.JLabel jLabelManu2;
    private javax.swing.JLabel jLabelManu3;
    private javax.swing.JLabel jLabelManu4;
    private javax.swing.JLabel jLabelManu5;
    private javax.swing.JLabel jLabelManu6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel jPanelHome;
    private javax.swing.JPanel jPanelLogoAndName;
    private javax.swing.JPanel jPanelManu;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_emp;
    private javax.swing.JLabel lbl_img;
    private javax.swing.JLabel lbl_sal;
    private javax.swing.JLabel lbl_total;
    private javax.swing.JLabel lbl_total1;
    private javax.swing.JPanel payment;
    private javax.swing.JRadioButton r_amount;
    private javax.swing.JRadioButton r_amount2;
    private javax.swing.JRadioButton r_female;
    private javax.swing.JRadioButton r_male;
    private javax.swing.JRadioButton r_male2;
    private javax.swing.JRadioButton r_percentage;
    private javax.swing.JRadioButton r_percentage1;
    private javax.swing.JPanel searchEmployee;
    private javax.swing.JTable table_allowance;
    private javax.swing.JButton txt_Save;
    private javax.swing.JTextField txt_add2;
    private javax.swing.JTextField txt_add4;
    private javax.swing.JTextField txt_address;
    private javax.swing.JTextField txt_address2;
    private javax.swing.JTextField txt_apt;
    private javax.swing.JTextField txt_bonus;
    private javax.swing.JButton txt_cal;
    private javax.swing.JTextField txt_deduction;
    private javax.swing.JTextField txt_dep;
    private javax.swing.JTextField txt_dep2;
    private javax.swing.JTextField txt_dep3;
    private javax.swing.JTextField txt_dep4;
    private javax.swing.JTextField txt_dept;
    private javax.swing.JTextField txt_dept1;
    private javax.swing.JTextField txt_dept2;
    private javax.swing.JTextField txt_dept3;
    private javax.swing.JTextField txt_desig;
    private javax.swing.JTextField txt_desig2;
    private javax.swing.JTextField txt_desig3;
    private javax.swing.JTextField txt_desig4;
    private javax.swing.JTextField txt_dob;
    private javax.swing.JTextField txt_dob2;
    private javax.swing.JTextField txt_dob3;
    private javax.swing.JTextField txt_dob4;
    private javax.swing.JTextField txt_dob5;
    private javax.swing.JTextField txt_dob6;
    private javax.swing.JTextField txt_doj;
    private javax.swing.JTextField txt_doj2;
    private javax.swing.JTextField txt_doj3;
    private javax.swing.JTextField txt_doj4;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_email2;
    private javax.swing.JLabel txt_emp;
    private javax.swing.JLabel txt_emp2;
    private javax.swing.JLabel txt_emp3;
    private javax.swing.JLabel txt_emp4;
    private javax.swing.JTextField txt_empid;
    private javax.swing.JTextField txt_empid1;
    private javax.swing.JTextField txt_firstname;
    private javax.swing.JTextField txt_firstname2;
    private javax.swing.JTextField txt_firstname3;
    private javax.swing.JTextField txt_firstname4;
    private javax.swing.JTextField txt_firstname5;
    private javax.swing.JTextField txt_firstname6;
    private javax.swing.JTextField txt_hw;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_id2;
    private javax.swing.JTextField txt_id3;
    private javax.swing.JTextField txt_id4;
    private javax.swing.JTextField txt_job;
    private javax.swing.JTextField txt_job2;
    private javax.swing.JTextField txt_job3;
    private javax.swing.JTextField txt_job4;
    private javax.swing.JTextField txt_med;
    private javax.swing.JTextField txt_other;
    private javax.swing.JTextField txt_pc;
    private javax.swing.JTextField txt_pc2;
    private javax.swing.JTextField txt_per;
    private javax.swing.JTextField txt_percentage;
    private javax.swing.JTextField txt_reason;
    private javax.swing.JTextField txt_salary;
    private javax.swing.JTextField txt_salary2;
    private javax.swing.JTextField txt_salary3;
    private javax.swing.JTextField txt_salary4;
    private javax.swing.JTextField txt_salary5;
    private javax.swing.JTextField txt_salary6;
    private javax.swing.JTextField txt_search;
    private javax.swing.JTextField txt_search1;
    private javax.swing.JTextField txt_search2;
    private javax.swing.JTextField txt_search3;
    private javax.swing.JTextField txt_search4;
    private javax.swing.JTextField txt_status;
    private javax.swing.JTextField txt_status2;
    private javax.swing.JTextField txt_status3;
    private javax.swing.JTextField txt_status4;
    private javax.swing.JTextField txt_surname;
    private javax.swing.JTextField txt_surname2;
    private javax.swing.JTextField txt_surname3;
    private javax.swing.JTextField txt_surname4;
    private javax.swing.JTextField txt_surname5;
    private javax.swing.JTextField txt_surname6;
    private javax.swing.JTextField txt_tel;
    private javax.swing.JTextField txt_tel2;
    private javax.swing.JTextField txt_total_overtime;
    private javax.swing.JButton txt_update;
    private javax.swing.JPanel updateSalary;
    // End of variables declaration//GEN-END:variables
}
