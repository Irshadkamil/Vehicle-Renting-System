package Vehicle;
import DB.DBConnection;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class Employee extends javax.swing.JFrame {
    public Employee() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
    }
    String un="";
    
    public Employee(String u) {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
        un=u;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        adddri = new javax.swing.JInternalFrame();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jLabel8 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<String>();
        jLabel9 = new javax.swing.JLabel();
        jFormattedTextField2 = new javax.swing.JFormattedTextField();
        jLabel43 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        jComboBox12 = new javax.swing.JComboBox<String>();
        jLabel61 = new javax.swing.JLabel();
        jComboBox13 = new javax.swing.JComboBox<String>();
        jLabel62 = new javax.swing.JLabel();
        jComboBox14 = new javax.swing.JComboBox<String>();
        jLabel63 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jLabel64 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        viewcars = new javax.swing.JInternalFrame();
        jPanel8 = new javax.swing.JPanel();
        jLabel51 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel90 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jComboBox10 = new javax.swing.JComboBox<String>();
        jComboBox11 = new javax.swing.JComboBox<String>();
        cuslist = new javax.swing.JInternalFrame();
        jPanel9 = new javax.swing.JPanel();
        jLabel52 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        changepass = new javax.swing.JInternalFrame();
        jPanel15 = new javax.swing.JPanel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jPasswordField3 = new javax.swing.JPasswordField();
        jPasswordField4 = new javax.swing.JPasswordField();
        jPasswordField5 = new javax.swing.JPasswordField();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        drilist = new javax.swing.JInternalFrame();
        jPanel10 = new javax.swing.JPanel();
        jLabel53 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        moddri = new javax.swing.JInternalFrame();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jLabel66 = new javax.swing.JLabel();
        jFormattedTextField3 = new javax.swing.JFormattedTextField();
        jLabel67 = new javax.swing.JLabel();
        jComboBox15 = new javax.swing.JComboBox<String>();
        jLabel68 = new javax.swing.JLabel();
        jFormattedTextField8 = new javax.swing.JFormattedTextField();
        jLabel69 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jLabel70 = new javax.swing.JLabel();
        jComboBox16 = new javax.swing.JComboBox<String>();
        jLabel11 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        addcus = new javax.swing.JInternalFrame();
        jPanel7 = new javax.swing.JPanel();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        jLabel80 = new javax.swing.JLabel();
        jRadioButton7 = new javax.swing.JRadioButton();
        jRadioButton8 = new javax.swing.JRadioButton();
        jLabel81 = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jLabel82 = new javax.swing.JLabel();
        jFormattedTextField9 = new javax.swing.JFormattedTextField();
        jLabel83 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jFormattedTextField10 = new javax.swing.JFormattedTextField();
        jLabel85 = new javax.swing.JLabel();
        jTextField15 = new javax.swing.JTextField();
        jLabel86 = new javax.swing.JLabel();
        jComboBox20 = new javax.swing.JComboBox<String>();
        jLabel87 = new javax.swing.JLabel();
        jComboBox21 = new javax.swing.JComboBox<String>();
        jLabel88 = new javax.swing.JLabel();
        jComboBox22 = new javax.swing.JComboBox<String>();
        jLabel89 = new javax.swing.JLabel();
        jTextField16 = new javax.swing.JTextField();
        jLabel91 = new javax.swing.JLabel();
        jScrollPane11 = new javax.swing.JScrollPane();
        jTable7 = new javax.swing.JTable();
        jTextField17 = new javax.swing.JTextField();
        jTextField18 = new javax.swing.JTextField();
        jLabel92 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        jTextField19 = new javax.swing.JTextField();
        jLabel94 = new javax.swing.JLabel();
        jTextField20 = new javax.swing.JTextField();
        jLabel95 = new javax.swing.JLabel();
        modcus = new javax.swing.JInternalFrame();
        jPanel4 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jRadioButton9 = new javax.swing.JRadioButton();
        jRadioButton10 = new javax.swing.JRadioButton();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTextArea5 = new javax.swing.JTextArea();
        jLabel73 = new javax.swing.JLabel();
        jFormattedTextField11 = new javax.swing.JFormattedTextField();
        jLabel74 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel97 = new javax.swing.JLabel();
        jLabel98 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        carret = new javax.swing.JInternalFrame();
        jPanel5 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel99 = new javax.swing.JLabel();
        jFormattedTextField12 = new javax.swing.JFormattedTextField();
        jLabel100 = new javax.swing.JLabel();
        jTextField21 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel101 = new javax.swing.JLabel();
        jLabel102 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel103 = new javax.swing.JLabel();
        jFormattedTextField13 = new javax.swing.JFormattedTextField();
        jLabel104 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel105 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jTextField22 = new javax.swing.JTextField();
        jLabel106 = new javax.swing.JLabel();
        jTextField23 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1366, 768));
        setMinimumSize(new java.awt.Dimension(1366, 768));
        setPreferredSize(new java.awt.Dimension(1366, 768));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jDesktopPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        adddri.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        adddri.setClosable(true);
        adddri.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        adddri.setTitle("Add Driver");
        adddri.setVisible(false);
        adddri.addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
                adddriInternalFrameClosing(evt);
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });
        adddri.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Add Driver");
        jLabel6.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 1170, 40));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("CANCEL");
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel7MouseExited(evt);
            }
        });
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 500, 130, 40));

        jLabel15.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("SUBMIT");
        jLabel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel15MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel15MouseExited(evt);
            }
        });
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 500, 130, 40));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel1.setText("Driver Id");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        jTextField1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 340, -1));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel3.setText("Gender");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        jRadioButton1.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jRadioButton1.setText("Male");
        jPanel2.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, -1, -1));

        jRadioButton2.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jRadioButton2.setText("Female");
        jPanel2.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, -1, -1));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel4.setText("Address");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, 340, 80));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel5.setText("D.O.B.");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, -1, -1));

        jFormattedTextField1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jFormattedTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jFormattedTextField1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jPanel2.add(jFormattedTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 380, 340, 30));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel8.setText("Qualification");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, -1, -1));

        jComboBox1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select-----", "High School.Intermediate", "Graduate", "Post-Graduate" }));
        jPanel2.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 450, 300, 30));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel9.setText("Mobile");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 510, -1, -1));

        jFormattedTextField2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jFormattedTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jFormattedTextField2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jPanel2.add(jFormattedTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 500, 330, 30));

        jLabel43.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel43.setText("Name");
        jPanel2.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        jTextField7.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jTextField7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField7.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel2.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 340, -1));

        jLabel44.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel44.setText("Experience");
        jPanel2.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, -1, 20));

        jComboBox12.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jComboBox12.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select-----", "0 year", "1 year", "2 year", "3 year", "4 year", "5 year and above" }));
        jPanel2.add(jComboBox12, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 340, 300, 30));

        jLabel61.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel61.setText("Car Company");
        jPanel2.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 80, -1, 20));

        jComboBox13.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jComboBox13.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select-----", "High School.Intermediate", "Graduate", "Post-Graduate" }));
        jPanel2.add(jComboBox13, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 80, 190, -1));

        jLabel62.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel62.setText("Seating Capacity");
        jPanel2.add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 80, -1, 20));

        jComboBox14.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jComboBox14.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select-----", "2 seater", "5 seater", "7 seater", "8 seater", "15 seater" }));
        jPanel2.add(jComboBox14, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 80, 190, -1));

        jLabel63.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel63.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel63.setText("Cars Available");
        jLabel63.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel63.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel63MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 120, 180, 30));

        jTextField11.setEditable(false);
        jTextField11.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jTextField11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField11.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel2.add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 130, 190, -1));

        jLabel64.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel64.setText("Car Number");
        jPanel2.add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 130, -1, -1));

        jTable5.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jTable5.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable5.setRowHeight(22);
        jTable5.setShowHorizontalLines(false);
        jTable5.setShowVerticalLines(false);
        jTable5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTable5KeyPressed(evt);
            }
        });
        jScrollPane7.setViewportView(jTable5);

        jPanel2.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 180, 650, 300));

        adddri.getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1170, 550));

        jDesktopPane1.add(adddri, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 59, 1170, 580));

        viewcars.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        viewcars.setClosable(true);
        viewcars.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        viewcars.setTitle("View Cars");
        viewcars.setVisible(false);
        viewcars.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 1, 1, new java.awt.Color(51, 153, 255)));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel51.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel51.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel51.setText("View Cars");
        jLabel51.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel8.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 30));

        jScrollPane3.setBorder(null);

        jTable1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable1.setGridColor(new java.awt.Color(0, 102, 102));
        jTable1.setRowHeight(22);
        jTable1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTable1.setShowHorizontalLines(false);
        jTable1.setShowVerticalLines(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable1);

        jPanel8.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 790, 270));

        jLabel90.setBackground(new java.awt.Color(255, 255, 255));
        jLabel90.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel90.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel90.setText("View Available Cars");
        jLabel90.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel90.setOpaque(true);
        jLabel90.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel90MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel90MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel90MouseExited(evt);
            }
        });
        jPanel8.add(jLabel90, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 70, 190, 30));

        jLabel40.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel40.setText("Use As");
        jPanel8.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        jLabel42.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel42.setText("Select Company");
        jPanel8.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        jComboBox10.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jComboBox10.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "Taxi", "Individual Rent" }));
        jPanel8.add(jComboBox10, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 210, 30));

        jComboBox11.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jComboBox11.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "Taxi", "Individual Rent" }));
        jPanel8.add(jComboBox11, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 210, 30));

        viewcars.getContentPane().add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 440));

        jDesktopPane1.add(viewcars, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, 790, 470));

        cuslist.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cuslist.setClosable(true);
        cuslist.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        cuslist.setTitle("Customers List");
        cuslist.setVisible(false);
        cuslist.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 1, 1, new java.awt.Color(51, 153, 255)));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel52.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel52.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel52.setText("List of Customers");
        jLabel52.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel9.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 30));

        jScrollPane4.setBorder(null);

        jTable2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable2.setGridColor(new java.awt.Color(0, 102, 102));
        jTable2.setRowHeight(22);
        jTable2.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTable2.setShowHorizontalLines(false);
        jTable2.setShowVerticalLines(false);
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jTable2);

        jPanel9.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 790, 400));

        cuslist.getContentPane().add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 440));

        jDesktopPane1.add(cuslist, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, 790, 470));

        changepass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        changepass.setClosable(true);
        changepass.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        changepass.setTitle("Change Password");
        changepass.setVisible(false);
        changepass.addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
                changepassInternalFrameClosing(evt);
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });
        changepass.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel15.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 1, 1, new java.awt.Color(0, 0, 0)));
        jPanel15.setPreferredSize(new java.awt.Dimension(607, 320));
        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel54.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(255, 255, 255));
        jLabel54.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel54.setText("Change Password");
        jLabel54.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel15.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3, 2, 610, 40));

        jLabel55.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel55.setText("Current Password  :");
        jPanel15.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));

        jLabel56.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel56.setText("New Password       :");
        jPanel15.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1));

        jLabel57.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel57.setText("Confiirm Password :");
        jPanel15.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, -1, -1));

        jPasswordField3.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jPasswordField3.setForeground(new java.awt.Color(255, 255, 255));
        jPasswordField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPasswordField3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel15.add(jPasswordField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, 330, 30));

        jPasswordField4.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jPasswordField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPasswordField4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel15.add(jPasswordField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, 330, 30));

        jPasswordField5.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jPasswordField5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPasswordField5.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel15.add(jPasswordField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, 330, 30));

        jLabel58.setBackground(new java.awt.Color(255, 255, 255));
        jLabel58.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel58.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel58.setText("CLOSE");
        jLabel58.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel58.setOpaque(true);
        jLabel58.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel58MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel58MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel58MouseExited(evt);
            }
        });
        jPanel15.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 260, 90, 40));

        jLabel59.setBackground(new java.awt.Color(255, 255, 255));
        jLabel59.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel59.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel59.setText("SUBMIT");
        jLabel59.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel59.setOpaque(true);
        jLabel59.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel59MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel59MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel59MouseExited(evt);
            }
        });
        jPanel15.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, 90, 40));

        changepass.getContentPane().add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 320));

        jDesktopPane1.add(changepass, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 80, 610, 350));

        drilist.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        drilist.setClosable(true);
        drilist.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        drilist.setTitle("Drivers List");
        drilist.setVisible(false);
        drilist.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 1, 1, new java.awt.Color(51, 153, 255)));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel53.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel53.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel53.setText("Drivers List");
        jLabel53.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel10.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 30));

        jScrollPane5.setBorder(null);

        jTable3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable3.setGridColor(new java.awt.Color(0, 102, 102));
        jTable3.setRowHeight(22);
        jTable3.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTable3.setShowHorizontalLines(false);
        jTable3.setShowVerticalLines(false);
        jTable3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable3MouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(jTable3);

        jPanel10.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 790, 400));

        drilist.getContentPane().add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 440));

        jDesktopPane1.add(drilist, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, 790, 470));

        moddri.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        moddri.setClosable(true);
        moddri.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        moddri.setTitle("Update/Delete Driver");
        moddri.setVisible(false);
        moddri.addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
                moddriInternalFrameClosing(evt);
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });
        moddri.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Modify Driver");
        jLabel10.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 620, 40));

        jLabel12.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel12.setText("Driver Id");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        jTextField2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel3.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 340, 30));

        jLabel13.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel13.setText("Gender");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        jRadioButton5.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton5.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jRadioButton5.setText("Male");
        jPanel3.add(jRadioButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, -1, -1));

        jRadioButton6.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton6.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jRadioButton6.setText("Female");
        jPanel3.add(jRadioButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, -1, -1));

        jLabel14.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel14.setText("Address");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, -1));

        jTextArea3.setColumns(20);
        jTextArea3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jTextArea3.setRows(5);
        jScrollPane8.setViewportView(jTextArea3);

        jPanel3.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, 340, 80));

        jLabel66.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel66.setText("D.O.B.");
        jPanel3.add(jLabel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, -1, -1));

        jFormattedTextField3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jFormattedTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jFormattedTextField3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jPanel3.add(jFormattedTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 380, 340, 30));

        jLabel67.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel67.setText("Qualification");
        jPanel3.add(jLabel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, -1, -1));

        jComboBox15.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jComboBox15.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select-----", "High School.Intermediate", "Graduate", "Post-Graduate" }));
        jPanel3.add(jComboBox15, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 450, 300, 30));

        jLabel68.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel68.setText("Mobile");
        jPanel3.add(jLabel68, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 510, -1, -1));

        jFormattedTextField8.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jFormattedTextField8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jFormattedTextField8.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jPanel3.add(jFormattedTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 500, 330, 30));

        jLabel69.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel69.setText("Name");
        jPanel3.add(jLabel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        jTextField12.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jTextField12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField12.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel3.add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 340, 30));

        jLabel70.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel70.setText("Experience");
        jPanel3.add(jLabel70, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, -1, 20));

        jComboBox16.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jComboBox16.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select-----", "0 year", "1 year", "2 year", "3 year", "4 year", "5 year and above" }));
        jPanel3.add(jComboBox16, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 340, 300, 30));

        jLabel11.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Search");
        jLabel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 70, 100, 30));

        jLabel65.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel65.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel65.setText("UPDATE");
        jLabel65.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel65.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel65MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 400, 120, 40));

        jLabel75.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel75.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel75.setText("DELETE");
        jLabel75.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel75.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel75MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel75, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 460, 120, 40));

        moddri.getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 550));

        jDesktopPane1.add(moddri, new org.netbeans.lib.awtextra.AbsoluteConstraints(372, 50, 620, 580));

        addcus.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        addcus.setClosable(true);
        addcus.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        addcus.setTitle("Add Customer");
        addcus.setVisible(false);
        addcus.addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
                addcusInternalFrameClosing(evt);
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });
        addcus.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel76.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel76.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel76.setText("Add Customer");
        jLabel76.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel7.add(jLabel76, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 1170, 40));

        jLabel77.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel77.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel77.setText("CANCEL");
        jLabel77.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel77.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel77MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel77MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel77MouseExited(evt);
            }
        });
        jPanel7.add(jLabel77, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 490, 130, 40));

        jLabel78.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel78.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel78.setText("SUBMIT");
        jLabel78.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel78.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel78MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel78MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel78MouseExited(evt);
            }
        });
        jPanel7.add(jLabel78, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 490, 130, 40));

        jLabel79.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel79.setText("Customer Id");
        jPanel7.add(jLabel79, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jTextField14.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jTextField14.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField14.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel7.add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 340, -1));

        jLabel80.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel80.setText("Gender");
        jPanel7.add(jLabel80, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        jRadioButton7.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton7.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jRadioButton7.setText("Male");
        jPanel7.add(jRadioButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, -1, -1));

        jRadioButton8.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton8.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jRadioButton8.setText("Female");
        jPanel7.add(jRadioButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, -1, -1));

        jLabel81.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel81.setText("Address");
        jPanel7.add(jLabel81, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, -1));

        jTextArea4.setColumns(20);
        jTextArea4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jTextArea4.setRows(5);
        jScrollPane10.setViewportView(jTextArea4);

        jPanel7.add(jScrollPane10, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, 340, 80));

        jLabel82.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel82.setText("Book Date");
        jPanel7.add(jLabel82, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, -1, -1));

        jFormattedTextField9.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jFormattedTextField9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jFormattedTextField9.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jPanel7.add(jFormattedTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 380, 310, 30));

        jLabel83.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel83.setText("Renting Days");
        jPanel7.add(jLabel83, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, -1, -1));

        jLabel84.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel84.setText("Mobile");
        jPanel7.add(jLabel84, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 510, -1, -1));

        jFormattedTextField10.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jFormattedTextField10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jFormattedTextField10.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jPanel7.add(jFormattedTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 500, 310, 30));

        jLabel85.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel85.setText("Name");
        jPanel7.add(jLabel85, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        jTextField15.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jTextField15.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField15.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel7.add(jTextField15, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 440, 310, 30));

        jLabel86.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel86.setText("Usage As");
        jPanel7.add(jLabel86, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, -1, 20));

        jComboBox20.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jComboBox20.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select-----", "Taxi", "Individual Rent" }));
        jPanel7.add(jComboBox20, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 340, 300, 30));

        jLabel87.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel87.setText("Car Company");
        jPanel7.add(jLabel87, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 80, -1, 20));

        jComboBox21.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jComboBox21.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select-----", "High School.Intermediate", "Graduate", "Post-Graduate" }));
        jPanel7.add(jComboBox21, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 80, 190, -1));

        jLabel88.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel88.setText("Seating Capacity");
        jPanel7.add(jLabel88, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 80, -1, 20));

        jComboBox22.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jComboBox22.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select-----", "2 seater", "5 seater", "7 seater", "8 seater", "15 seater" }));
        jPanel7.add(jComboBox22, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 80, 190, -1));

        jLabel89.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel89.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel89.setText("Cars Available");
        jLabel89.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel89.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel89MouseClicked(evt);
            }
        });
        jPanel7.add(jLabel89, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 130, 180, 30));

        jTextField16.setEditable(false);
        jTextField16.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jTextField16.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField16.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel7.add(jTextField16, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 130, 120, -1));

        jLabel91.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel91.setText("Car Number");
        jPanel7.add(jLabel91, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 130, -1, -1));

        jTable7.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jTable7.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable7.setRowHeight(22);
        jTable7.setShowHorizontalLines(false);
        jTable7.setShowVerticalLines(false);
        jTable7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTable7KeyPressed(evt);
            }
        });
        jScrollPane11.setViewportView(jTable7);

        jPanel7.add(jScrollPane11, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 180, 650, 240));

        jTextField17.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jTextField17.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField17.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel7.add(jTextField17, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 340, -1));

        jTextField18.setEditable(false);
        jTextField18.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jTextField18.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField18.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel7.add(jTextField18, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 130, 110, -1));

        jLabel92.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel92.setText("Driver Id");
        jPanel7.add(jLabel92, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 130, -1, -1));

        jLabel93.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel93.setText("Rent/Day In Rs.");
        jPanel7.add(jLabel93, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 440, -1, -1));

        jTextField19.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jTextField19.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField19.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jTextField19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField19ActionPerformed(evt);
            }
        });
        jPanel7.add(jTextField19, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 440, 120, -1));

        jLabel94.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel94.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel94.setText("CALCULATE");
        jLabel94.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel94.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel94MouseClicked(evt);
            }
        });
        jPanel7.add(jLabel94, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 430, 120, 40));

        jTextField20.setEditable(false);
        jTextField20.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jTextField20.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField20.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel7.add(jTextField20, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 440, 110, -1));

        jLabel95.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel95.setText("Total Rent (Rs.)");
        jPanel7.add(jLabel95, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 440, -1, -1));

        addcus.getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1170, 550));

        jDesktopPane1.add(addcus, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 59, 1170, 580));

        modcus.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        modcus.setClosable(true);
        modcus.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        modcus.setTitle("Update/Delete Customer");
        modcus.setVisible(false);
        modcus.addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
                modcusInternalFrameClosing(evt);
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });
        modcus.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Modify Customer");
        jLabel16.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 620, 40));

        jLabel17.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel17.setText("Customer Id");
        jPanel4.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jTextField3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel4.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 340, 30));

        jLabel18.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel18.setText("Gender");
        jPanel4.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        jRadioButton9.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton9.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jRadioButton9.setText("Male");
        jPanel4.add(jRadioButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, -1, -1));

        jRadioButton10.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton10.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jRadioButton10.setText("Female");
        jPanel4.add(jRadioButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, -1, -1));

        jLabel19.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel19.setText("Address");
        jPanel4.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, -1));

        jTextArea5.setColumns(20);
        jTextArea5.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jTextArea5.setRows(5);
        jScrollPane9.setViewportView(jTextArea5);

        jPanel4.add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, 340, 80));

        jLabel73.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel73.setText("Mobile");
        jPanel4.add(jLabel73, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, -1, -1));

        jFormattedTextField11.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jFormattedTextField11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jFormattedTextField11.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jPanel4.add(jFormattedTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 360, 330, 30));

        jLabel74.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel74.setText("Name");
        jPanel4.add(jLabel74, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        jTextField13.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jTextField13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField13.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel4.add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 340, 30));

        jLabel20.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Search By Name");
        jLabel20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel20MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 110, 120, 40));

        jLabel97.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel97.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel97.setText("UPDATE");
        jLabel97.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel97.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel97MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel97, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 440, 120, 40));

        jLabel98.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel98.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel98.setText("DELETE");
        jLabel98.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel98.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel98MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel98, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 440, 120, 40));

        jLabel21.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Search By Id");
        jLabel21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel21MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 60, 120, 40));

        modcus.getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 530));

        jDesktopPane1.add(modcus, new org.netbeans.lib.awtextra.AbsoluteConstraints(372, 50, 620, 560));

        carret.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        carret.setClosable(true);
        carret.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        carret.setTitle("Return Car");
        carret.setVisible(false);
        carret.addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
                carretInternalFrameClosing(evt);
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });
        carret.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel22.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("Returning Car");
        jLabel22.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel5.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 620, 40));

        jLabel23.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel23.setText("Customer Id");
        jPanel5.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jTextField4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jTextField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel5.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 340, -1));

        jLabel99.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel99.setText("Car Details");
        jPanel5.add(jLabel99, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, -1, -1));

        jFormattedTextField12.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jFormattedTextField12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jFormattedTextField12.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jPanel5.add(jFormattedTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 370, 340, 30));

        jLabel100.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel100.setText("Name");
        jPanel5.add(jLabel100, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        jTextField21.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jTextField21.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField21.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel5.add(jTextField21, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 340, -1));

        jLabel26.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("Search By Name");
        jLabel26.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel26MouseClicked(evt);
            }
        });
        jPanel5.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 120, 120, 30));

        jLabel101.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel101.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel101.setText("RETURNED");
        jLabel101.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel101.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel101MouseClicked(evt);
            }
        });
        jPanel5.add(jLabel101, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 530, 120, 40));

        jLabel102.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel102.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel102.setText("CANCEL");
        jLabel102.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.add(jLabel102, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 530, 120, 40));

        jLabel27.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("Search By Id");
        jLabel27.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel27MouseClicked(evt);
            }
        });
        jPanel5.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 70, 120, 30));

        jLabel103.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel103.setText("Return Date");
        jPanel5.add(jLabel103, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, -1, -1));

        jFormattedTextField13.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jFormattedTextField13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jFormattedTextField13.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jPanel5.add(jFormattedTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 430, 340, 30));

        jLabel104.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel104.setText("Booking Date");
        jPanel5.add(jLabel104, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, -1, -1));

        jLabel24.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel24.setText("Number");
        jPanel5.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        jLabel105.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel105.setText("Model");
        jPanel5.add(jLabel105, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, -1));

        jTextField5.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jTextField5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField5.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel5.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, 340, -1));

        jTextField22.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jTextField22.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField22.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel5.add(jTextField22, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, 340, -1));

        jLabel106.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel106.setText("Company");
        jPanel5.add(jLabel106, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, -1, -1));

        jTextField23.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jTextField23.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField23.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel5.add(jTextField23, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, 340, -1));

        carret.getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 610));

        jDesktopPane1.add(carret, new org.netbeans.lib.awtextra.AbsoluteConstraints(372, 20, 620, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vehicle/cardes.jpg"))); // NOI18N
        jDesktopPane1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel1.add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 740));

        jMenuBar1.setMinimumSize(new java.awt.Dimension(56, 30));
        jMenuBar1.setPreferredSize(new java.awt.Dimension(56, 33));

        jMenu1.setText("    Driver    ");
        jMenu1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N

        jMenuItem1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jMenuItem1.setText("Add Driver");
        jMenuItem1.setPreferredSize(new java.awt.Dimension(175, 31));
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jMenuItem2.setText("Modify/Delete");
        jMenuItem2.setPreferredSize(new java.awt.Dimension(175, 31));
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jMenuItem3.setText("List of Drivers");
        jMenuItem3.setPreferredSize(new java.awt.Dimension(175, 31));
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("    Customer    ");
        jMenu2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N

        jMenuItem12.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jMenuItem12.setText("Add Customer");
        jMenuItem12.setPreferredSize(new java.awt.Dimension(175, 31));
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem12);

        jMenuItem13.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jMenuItem13.setText("Modify/Delete");
        jMenuItem13.setPreferredSize(new java.awt.Dimension(175, 31));
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem13);

        jMenuItem14.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jMenuItem14.setText("List of Customers");
        jMenuItem14.setPreferredSize(new java.awt.Dimension(175, 31));
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem14);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("    Vehicle    ");
        jMenu3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N

        jMenuItem7.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jMenuItem7.setText("Return Car");
        jMenuItem7.setPreferredSize(new java.awt.Dimension(175, 31));
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem7);

        jMenuItem8.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jMenuItem8.setText("View Cars");
        jMenuItem8.setPreferredSize(new java.awt.Dimension(175, 31));
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem8);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("    Others    ");
        jMenu4.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N

        jMenuItem9.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jMenuItem9.setText("Change Password");
        jMenuItem9.setPreferredSize(new java.awt.Dimension(175, 31));
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem9);

        jMenuItem10.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jMenuItem10.setText("Logout");
        jMenuItem10.setPreferredSize(new java.awt.Dimension(175, 31));
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem10);

        jMenuItem11.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jMenuItem11.setText("Exit");
        jMenuItem11.setPreferredSize(new java.awt.Dimension(175, 31));
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem11);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
try {
            jComboBox13.removeAllItems();
        DBConnection db=new DBConnection();
        jComboBox13.addItem("Select-----");
        db.pstmt=db.con.prepareStatement("select com from company");
        db.rst=db.pstmt.executeQuery();
        while(db.rst.next())
        {
            jComboBox13.addItem(db.rst.getString(1));
        }
        } catch (Exception e) {
        e.printStackTrace();
        }
        adddri.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        moddri.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        try {
        Vector<String> head=new Vector<String>();
        Vector<Vector<String>> data=new Vector<Vector<String>>();
        head.add("ID");
        head.add("Name");
        head.add("Gender");
        head.add("Experience");
        head.add("Qualification");
        head.add("Mobile");
        DBConnection db=new DBConnection();
        db.pstmt=db.con.prepareStatement("select did,name,gender,exp,qual,mob from driver");
        db.rst=db.pstmt.executeQuery();
        while(db.rst.next())
        {
            Vector<String> temp=new Vector<String>();
            temp.add(db.rst.getString(1));
            temp.add(db.rst.getString(2));
            temp.add(db.rst.getString(3));
            temp.add(db.rst.getString(4));
            temp.add(db.rst.getString(5));
            temp.add(db.rst.getString(6));
        data.add(temp);
        }
        jTable3.setModel(new DefaultTableModel(data,head));
        } catch (Exception e) {
        e.printStackTrace();
        }
        drilist.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
carret.setVisible(true);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
try {
            jComboBox10.removeAllItems();
        DBConnection db=new DBConnection();
        jComboBox10.addItem("Select-----");
        db.pstmt=db.con.prepareStatement("select com from company");
        db.rst=db.pstmt.executeQuery();
        while(db.rst.next())
        {
            jComboBox10.addItem(db.rst.getString(1));
        }
        } catch (Exception e) {
        e.printStackTrace();
        }
        viewcars.setVisible(true);
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        changepass.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
         jTextField1.setText("");
         jTextField7.setText("");
         jTextField11.setText("");
         jTextArea1.setText("");
         jFormattedTextField1.setText("");
         jFormattedTextField2.setText("");
         jComboBox12.setSelectedIndex(0);
         jComboBox1.setSelectedIndex(0);
         jComboBox13.setSelectedIndex(0);
         jComboBox14.setSelectedIndex(0);
        adddri.setVisible(false);
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseEntered
        jLabel6.setOpaque(true);
        jLabel6.setBackground(Color.black);
    }//GEN-LAST:event_jLabel7MouseEntered

    private void jLabel7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseExited
        jLabel6.setBackground(Color.white);
        jLabel6.setOpaque(true);
    }//GEN-LAST:event_jLabel7MouseExited

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        try {
        DBConnection db=new DBConnection();
        db.pstmt=db.con.prepareStatement("insert into driver values(?,?,?,?,?,?,?,?,?,?,?,?)");
        db.pstmt.setString(1,jTextField1.getText());
        db.pstmt.setString(2,jTextField7.getText());
        String g="";
        if(jRadioButton1.isSelected());
        {
            g="Male";
        }
        if(jRadioButton2.isSelected());
        {
            g="Female";
        }
        db.pstmt.setString(3,g);
        db.pstmt.setString(4,jTextArea1.getText());
        db.pstmt.setString(5,jComboBox12.getSelectedItem().toString());
        db.pstmt.setString(6,jFormattedTextField1.getText());
        db.pstmt.setString(7,jComboBox1.getSelectedItem().toString());
        db.pstmt.setString(8,jFormattedTextField2.getText());
        db.pstmt.setString(9,jComboBox13.getSelectedItem().toString());
        db.pstmt.setString(10,jComboBox14.getSelectedItem().toString());
        db.pstmt.setString(11,jTextField11.getText());
        db.pstmt.setString(12,jTextField11.getText());//car model
        int i=db.pstmt.executeUpdate();
        if(i>0)
        {
         JOptionPane.showMessageDialog(this,"Insertion Successfully..!");   
         jTextField1.setText("");
         jTextField7.setText("");
         jTextField11.setText("");
         jTextArea1.setText("");
         jFormattedTextField1.setText("");
         jFormattedTextField2.setText("");
         jComboBox12.setSelectedIndex(0);
         jComboBox1.setSelectedIndex(0);
         jComboBox13.setSelectedIndex(0);
         jComboBox14.setSelectedIndex(0);
        }
        } catch (Exception e) {
        e.printStackTrace();
        }
    }//GEN-LAST:event_jLabel15MouseClicked

    private void jLabel15MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseEntered
        jLabel7.setOpaque(true);
        jLabel7.setBackground(Color.black);
        jLabel7.setForeground(Color.white);
    }//GEN-LAST:event_jLabel15MouseEntered

    private void jLabel15MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseExited
        jLabel7.setForeground(Color.black);
        jLabel7.setBackground(Color.white);
        jLabel7.setOpaque(true);
    }//GEN-LAST:event_jLabel15MouseExited

    private void adddriInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_adddriInternalFrameClosing
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField5.setText("");
        adddri.setVisible(false);
    }//GEN-LAST:event_adddriInternalFrameClosing

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

    }//GEN-LAST:event_jTable1MouseClicked

    private void jLabel90MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel90MouseClicked
try {
    String a=jComboBox10.getSelectedItem().toString();
    String b=jComboBox11.getSelectedItem().toString();
    Vector<String> head=new Vector<String>();
        Vector<Vector<String>> data=new Vector<Vector<String>>();
        head.add("Car");
        head.add("Model");
        head.add("Car Number");
        head.add("Use As");
        head.add("Seat");
        head.add("Type");
        DBConnection db=new DBConnection();
        db.pstmt=db.con.prepareStatement("select com,model,carno,useas,seat,type from vehic where com like '%"+a+"%' or useas like '%"+b+"%'");
        db.rst=db.pstmt.executeQuery();
        while(db.rst.next())
        {
            Vector<String> temp=new Vector<String>();
            temp.add(db.rst.getString(1));
            temp.add(db.rst.getString(2));
            temp.add(db.rst.getString(3));
            temp.add(db.rst.getString(4));
            temp.add(db.rst.getString(5));
            temp.add(db.rst.getString(6));
            data.add(temp);
        }
        jTable1.setModel(new DefaultTableModel(data,head));
        } catch (Exception e) {
        e.printStackTrace();
        }
    }//GEN-LAST:event_jLabel90MouseClicked

    private void jLabel90MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel90MouseEntered
        jLabel90.setForeground(Color.white);
        jLabel90.setBackground(Color.black);
    }//GEN-LAST:event_jLabel90MouseEntered

    private void jLabel90MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel90MouseExited
        jLabel90.setForeground(Color.black);
        jLabel90.setBackground(Color.white);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel90MouseExited

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable2MouseClicked

    private void jLabel58MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel58MouseClicked
        jPasswordField3.setText("");        // TODO add your handling code here:
        jPasswordField4.setText("");
        changepass.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel58MouseClicked

    private void jLabel58MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel58MouseEntered

    }//GEN-LAST:event_jLabel58MouseEntered

    private void jLabel58MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel58MouseExited

    }//GEN-LAST:event_jLabel58MouseExited

    private void jLabel59MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel59MouseClicked
String old=new String(jPasswordField4.getPassword());
String new1=new String(jPasswordField5.getPassword());
String con=new String(jPasswordField3.getPassword());
        try {
        DBConnection db=new DBConnection();
        db.pstmt=db.con.prepareStatement("select passw from login where uname='"+un+"'");
        db.rst=db.pstmt.executeQuery();
        if(db.rst.next())
        {
          String pass=db.rst.getString(1);
          if(old.equals(pass))
          {
             if(new1.equals(con))
             {
                 try {
                 DBConnection db1=new DBConnection();
                 db1.pstmt=db1.con.prepareStatement("update login set passw='"+new1+"' where uname='"+un+"'");
                 int k=db1.pstmt.executeUpdate();
                 if(k>0)
                 {
                 JOptionPane.showMessageDialog(this,"New Password Updation Successful..:)");
                 jPasswordField3.setText("");
                 jPasswordField5.setText("");
                 jPasswordField4.setText("");
                 }
                 } catch (Exception e) {
                 e.printStackTrace();
                 }
 
             }
             else
             {
              JOptionPane.showMessageDialog(this,"New Password is Mismatched with Confirm Password..:(");   
             }
          }
          else
          {
              JOptionPane.showMessageDialog(this,"Current Password in incorrect..:(");
          }
        }    
        }catch (Exception e)
        {
        e.printStackTrace();
        }
    }//GEN-LAST:event_jLabel59MouseClicked

    private void jLabel59MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel59MouseEntered

    }//GEN-LAST:event_jLabel59MouseEntered

    private void jLabel59MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel59MouseExited

    }//GEN-LAST:event_jLabel59MouseExited

    private void changepassInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_changepassInternalFrameClosing
        jPasswordField3.setText("");        // TODO add your handling code here:
        jPasswordField4.setText("");
        changepass.setVisible(false);// TODO add your handling code here:        // TODO add your handling code here:
    }//GEN-LAST:event_changepassInternalFrameClosing

    private void jTable3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable3MouseClicked

    private void moddriInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_moddriInternalFrameClosing
        // TODO add your handling code here:
    }//GEN-LAST:event_moddriInternalFrameClosing

    private void jLabel77MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel77MouseClicked
jTextField14.setText("");
         jTextField17.setText("");
         jTextField15.setText("");
         jTextField16.setText("");
         jTextField18.setText("");
         jTextField19.setText("");
         jTextField20.setText("");
         jTextArea4.setText("");
         jFormattedTextField9.setText("");
         jFormattedTextField10.setText("");
         jComboBox20.setSelectedIndex(0);
         jComboBox21.setSelectedIndex(0);
         jComboBox22.setSelectedIndex(0);
         addcus.setVisible(false);
    }//GEN-LAST:event_jLabel77MouseClicked

    private void jLabel77MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel77MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel77MouseEntered

    private void jLabel77MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel77MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel77MouseExited

    private void jLabel78MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel78MouseClicked
        try {
        DBConnection db=new DBConnection();
        db.pstmt=db.con.prepareStatement("insert into customer values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
        db.pstmt.setString(1,jTextField14.getText());
        db.pstmt.setString(2,jTextField17.getText());
        String g="";
        if(jRadioButton7.isSelected());
        {
            g="Male";
        }
        if(jRadioButton8.isSelected());
        {
            g="Female";
        }
        db.pstmt.setString(3,g);
        db.pstmt.setString(4,jTextArea4.getText());
        db.pstmt.setString(5,jComboBox20.getSelectedItem().toString());
        db.pstmt.setString(6,jFormattedTextField9.getText());
        db.pstmt.setString(7,jTextField15.getText());
        db.pstmt.setString(8,jFormattedTextField10.getText());
        db.pstmt.setString(9,jComboBox21.getSelectedItem().toString());
        db.pstmt.setString(10,jComboBox22.getSelectedItem().toString());
        db.pstmt.setString(11,jTextField16.getText());
        db.pstmt.setString(12,jTextField16.getText());//carmo
        db.pstmt.setString(13,jTextField18.getText());
        db.pstmt.setString(14,jTextField19.getText());
        db.pstmt.setString(15,jTextField20.getText());
        int i=db.pstmt.executeUpdate();
        if(i>0)
        {
        JOptionPane.showMessageDialog(this,"Insertion Successfully..!");   
        jTextField14.setText("");
        jTextField17.setText("");
        jTextField15.setText("");
        jTextField16.setText("");
        jTextField18.setText("");
        jTextField19.setText("");
        jTextField20.setText("");
        jTextArea4.setText("");
        jFormattedTextField9.setText("");
        jFormattedTextField10.setText("");
        jComboBox20.setSelectedIndex(0);
        jComboBox21.setSelectedIndex(0);
        jComboBox22.setSelectedIndex(0);
        }
        } catch (Exception e) {
        e.printStackTrace();
        }
    }//GEN-LAST:event_jLabel78MouseClicked

    private void jLabel78MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel78MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel78MouseEntered

    private void jLabel78MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel78MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel78MouseExited

    private void addcusInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_addcusInternalFrameClosing
        // TODO add your handling code here:
    }//GEN-LAST:event_addcusInternalFrameClosing

    private void jTextField19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField19ActionPerformed

    private void modcusInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_modcusInternalFrameClosing
        // TODO add your handling code here:
    }//GEN-LAST:event_modcusInternalFrameClosing

    private void carretInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_carretInternalFrameClosing
        // TODO add your handling code here:
    }//GEN-LAST:event_carretInternalFrameClosing

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
try {
            jComboBox21.removeAllItems();
        DBConnection db=new DBConnection();
        jComboBox21.addItem("Select-----");
        db.pstmt=db.con.prepareStatement("select com from company");
        db.rst=db.pstmt.executeQuery();
        while(db.rst.next())
        {
            jComboBox21.addItem(db.rst.getString(1));
        }
        } catch (Exception e) {
        e.printStackTrace();
        }
        addcus.setVisible(true);
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
modcus.setVisible(true);
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
try {
        Vector<String> head=new Vector<String>();
        Vector<Vector<String>> data=new Vector<Vector<String>>();
        head.add("ID");
        head.add("Name");
        head.add("Gender");
        head.add("Usage");
        head.add("Bookdate");
        head.add("Mobile");
        head.add("Car No");
        head.add("Car Model");
        head.add("Driver");
        head.add("Total Rent");
        DBConnection db=new DBConnection();
        db.pstmt=db.con.prepareStatement("select cid,name,gen,usage,bookdate,mobile,carno,carmo,did,totrent from customer");
        db.rst=db.pstmt.executeQuery();
        while(db.rst.next())
        {
        Vector<String> temp=new Vector<String>();
        temp.add(db.rst.getString(1));
        temp.add(db.rst.getString(2));
        temp.add(db.rst.getString(3));
        temp.add(db.rst.getString(4));
            temp.add(db.rst.getString(5));
            temp.add(db.rst.getString(6));
            temp.add(db.rst.getString(7));
            temp.add(db.rst.getString(8));
            temp.add(db.rst.getString(9));
            temp.add(db.rst.getString(10));
        data.add(temp);
        }
        jTable2.setModel(new DefaultTableModel(data,head));
        } catch (Exception e) {
        e.printStackTrace();
        }
        cuslist.setVisible(true);
    }//GEN-LAST:event_jMenuItem14ActionPerformed

    private void jLabel27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel27MouseClicked
        String a=jTextField4.getText();
        try {
            DBConnection db=new DBConnection();
            db.pstmt=db.con.prepareStatement("select name,carno,carmo,carc,bookdate from customer where cid='"+a+"'");
            db.rst=db.pstmt.executeQuery();
            if(db.rst.next())
            {
            jTextField21.setText(db.rst.getString(1));
            jTextField5.setText(db.rst.getString(2));
            jTextField22.setText(db.rst.getString(3));
            jTextField23.setText(db.rst.getString(4));
            jFormattedTextField12.setText(db.rst.getString(5));
           // jFormattedTextField13.setText("");
            }
            SimpleDateFormat sd=new SimpleDateFormat("dd=MM-yyyy");
            Date d=new Date();
            jFormattedTextField13.setText(sd.format(d));
                 } catch (Exception e) {
        }
    }//GEN-LAST:event_jLabel27MouseClicked

    private void jLabel26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel26MouseClicked
String a=jTextField21.getText();
        try {
            DBConnection db=new DBConnection();
            db.pstmt=db.con.prepareStatement("select cid,carno,carmo,carc,bookdate from customer where cid='"+a+"'");
            db.rst=db.pstmt.executeQuery();
            if(db.rst.next())
            {
            jTextField4.setText(db.rst.getString(1));
            jTextField5.setText(db.rst.getString(2));
            jTextField22.setText(db.rst.getString(3));
            jTextField23.setText(db.rst.getString(4));
            jFormattedTextField12.setText(db.rst.getString(5));
           // jFormattedTextField13.setText("");
            }
            SimpleDateFormat sd=new SimpleDateFormat("dd=MM-yyyy");
            Date d=new Date();
            jFormattedTextField13.setText(sd.format(d));
                 } catch (Exception e) {
        }
    }//GEN-LAST:event_jLabel26MouseClicked

    private void jLabel101MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel101MouseClicked
        try {
        DBConnection db=new DBConnection();
        db.pstmt=db.con.prepareStatement("delete from customer where cid='"+jTextField4.getText()+"'");
        int i=db.pstmt.executeUpdate();
        if(i>0)
        {
           JOptionPane.showMessageDialog(this,"Car Returned Successfully.!");
           jTextField4.setText("");
           jTextField21.setText("");
           jTextField5.setText("");
           jTextField22.setText("");
           jTextField23.setText("");
           jFormattedTextField12.setText("");
           jFormattedTextField13.setText("");
        }
        } catch (Exception e) {
        e.printStackTrace();
        }
    }//GEN-LAST:event_jLabel101MouseClicked

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
int i=JOptionPane.showConfirmDialog(this,"Logout.???","Vehicle Renting System ",JOptionPane.YES_NO_OPTION);
if(i==0)
{
new Login().setVisible(true);   
setVisible(false);
}
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
int i=JOptionPane.showConfirmDialog(this,"Exit.???","Vehicle Renting System",JOptionPane.YES_NO_OPTION);
if(i==0)
{
System.exit(0);
}
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        String a=jTextField2.getText();
        try {
        DBConnection db=new DBConnection();
        db.pstmt=db.con.prepareStatement("select name,gender,addr,exp,dob,qual,mob from driver where did='"+a+"'");
        db.rst=db.pstmt.executeQuery();
        if(db.rst.next())
        {
           jTextField12.setText(db.rst.getString(1)); 
           String g=db.rst.getString(2);
           //5,6
           if(g.equals("Male"))
           {
               jRadioButton5.setSelected(true);
               jRadioButton6.setSelected(false);
           }
           if(g.equals("Female"))
           {
               jRadioButton6.setSelected(true);
               jRadioButton5.setSelected(false);
           }
           jTextArea3.setText(db.rst.getString(3)); 
           //16c
           String b=db.rst.getString(4);
           for(int i=0;i<jComboBox16.getItemCount();i++)
           {
               if(b.equals(jComboBox16.getItemAt(i)))
               {
                   jComboBox16.setSelectedIndex(i);
               }
           }
           jFormattedTextField3.setText(db.rst.getString(5));
           //15c
           String d=db.rst.getString(6);
           for(int i=0;i<jComboBox15.getItemCount();i++)
           {
               if(d.equals(jComboBox15.getItemAt(i)))
               {
                   jComboBox16.setSelectedIndex(i);
               }
           }
        jFormattedTextField8.setText(db.rst.getString(7));
        }
        } catch (Exception e) {
        e.printStackTrace();
        }
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseClicked
String a=jTextField3.getText();
        try {
        DBConnection db=new DBConnection();
        db.pstmt=db.con.prepareStatement("select name,gen,addr,mob where cid='"+a+"'");
        db.rst=db.pstmt.executeQuery();
        if(db.rst.next())
        {
           jTextField13.setText(db.rst.getString(1)); 
           String g=db.rst.getString(2);
           //5,6
           if(g.equals("Male"))
           {
               jRadioButton9.setSelected(true);
               jRadioButton10.setSelected(false);
           }
           if(g.equals("Female"))
           {
               jRadioButton10.setSelected(true);
               jRadioButton9.setSelected(false);
           }
           jTextArea5.setText(db.rst.getString(3)); 
           //16c
           
        jFormattedTextField11.setText(db.rst.getString(4));
        }
        } catch (Exception e) {
        e.printStackTrace();
        }
    }//GEN-LAST:event_jLabel21MouseClicked

    private void jLabel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseClicked
String a=jTextField13.getText();
        try {
        DBConnection db=new DBConnection();
        db.pstmt=db.con.prepareStatement("select cid,gen,addr,mob where name='"+a+"'");
        db.rst=db.pstmt.executeQuery();
        if(db.rst.next())
        {
           jTextField3.setText(db.rst.getString(1)); 
           String g=db.rst.getString(2);
           //5,6
           if(g.equals("Male"))
           {
               jRadioButton9.setSelected(true);
               jRadioButton10.setSelected(false);
           }
           if(g.equals("Female"))
           {
               jRadioButton10.setSelected(true);
               jRadioButton9.setSelected(false);
           }
           jTextArea5.setText(db.rst.getString(3)); 
           //16c
           
        jFormattedTextField11.setText(db.rst.getString(4));
        }
        } catch (Exception e) {
        e.printStackTrace();
        }
    }//GEN-LAST:event_jLabel20MouseClicked

    private void jLabel65MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel65MouseClicked
    try {
        String a=jTextField2.getText();
        DBConnection db=new DBConnection();
        db.pstmt=db.con.prepareStatement("update driver set name=?,gender=?,addr=?,exp=?,dob=?,qual=?,mob=? where did='"+a+"'");
        db.pstmt.setString(1,jTextField12.getText());
        String g="";
        if(jRadioButton5.isSelected());
        {
            g="Male";
        }
        if(jRadioButton6.isSelected());
        {
            g="Female";
        }
        db.pstmt.setString(2,g);
        db.pstmt.setString(3,jTextArea3.getText());
        db.pstmt.setString(4,jComboBox16.getSelectedItem().toString());
        db.pstmt.setString(5,jFormattedTextField3.getText());
        db.pstmt.setString(6,jComboBox15.getSelectedItem().toString());
        db.pstmt.setString(7,jFormattedTextField8.getText());
        int i=db.pstmt.executeUpdate();
        if(i>0)
        {
         JOptionPane.showMessageDialog(this,"Updation Successfully..!");   
         jTextField2.setText("");
         jTextField12.setText("");
         jTextArea3.setText("");
         jFormattedTextField3.setText("");
         jFormattedTextField8.setText("");
         jComboBox16.setSelectedIndex(0);
         jComboBox15.setSelectedIndex(0);
    }
    } catch (Exception e) {
    e.printStackTrace();
    }
    }//GEN-LAST:event_jLabel65MouseClicked

    private void jLabel75MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel75MouseClicked
try {
        String a=jTextField2.getText();
        DBConnection db=new DBConnection();
        db.pstmt=db.con.prepareStatement("delete from driver where did='"+a+"'");
        int i=db.pstmt.executeUpdate();
        if(i>0)
        {
         JOptionPane.showMessageDialog(this,"Deletion Successfully..!");   
         jTextField2.setText("");
         jTextField12.setText("");
         jTextArea3.setText("");
         jFormattedTextField3.setText("");
         jFormattedTextField8.setText("");
         jComboBox16.setSelectedIndex(0);
         jComboBox15.setSelectedIndex(0);
    }
    } catch (Exception e) {
    e.printStackTrace();
    }
    }//GEN-LAST:event_jLabel75MouseClicked

    private void jLabel97MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel97MouseClicked
    try {
        String a=jTextField3.getText();
        DBConnection db=new DBConnection();
        db.pstmt=db.con.prepareStatement("update customer set name=?,gender=?,addr=?,mob=? where cid='"+a+"'");
        db.pstmt.setString(1,jTextField13.getText());
        String g="";
        if(jRadioButton9.isSelected());
        {
            g="Male";
        }
        if(jRadioButton10.isSelected());
        {
            g="Female";
        }
        db.pstmt.setString(2,g);
        db.pstmt.setString(3,jTextArea5.getText());
        db.pstmt.setString(4,jFormattedTextField11.getText());
        
        int i=db.pstmt.executeUpdate();
        if(i>0)
        {
         JOptionPane.showMessageDialog(this,"Updation Successfully..!");   
         jTextField3.setText("");
         jTextField13.setText("");
         jTextArea5.setText("");
         jFormattedTextField11.setText("");
         
    }
    } catch (Exception e) {
    e.printStackTrace();
    }
    }//GEN-LAST:event_jLabel97MouseClicked

    private void jLabel98MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel98MouseClicked
try {
        String a=jTextField3.getText();
        DBConnection db=new DBConnection();
        db.pstmt=db.con.prepareStatement("dalete from customer where cid='"+a+"'");
        
        int i=db.pstmt.executeUpdate();
        if(i>0)
        {
         JOptionPane.showMessageDialog(this,"Deletion Successfully..!");   
         jTextField3.setText("");
         jTextField13.setText("");
         jTextArea5.setText("");
         jFormattedTextField11.setText("");
         }
    } catch (Exception e) {
    e.printStackTrace();
    }
    }//GEN-LAST:event_jLabel98MouseClicked

    private void jLabel63MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel63MouseClicked
try {
    String a=jComboBox13.getSelectedItem().toString();
    String b=jComboBox14.getSelectedItem().toString();
    Vector<String> head=new Vector<String>();
        Vector<Vector<String>> data=new Vector<Vector<String>>();
        head.add("Car");
        head.add("Model");
        head.add("Car Number");
        head.add("Use As");
        head.add("Seat");
        head.add("Type");
        DBConnection db=new DBConnection();
        db.pstmt=db.con.prepareStatement("select com,model,carno,useas,seat,type from vehic where com like '%"+a+"%' or seat like '%"+b+"%'");
        db.rst=db.pstmt.executeQuery();
        while(db.rst.next())
        {
            Vector<String> temp=new Vector<String>();
            temp.add(db.rst.getString(1));
            temp.add(db.rst.getString(2));
            temp.add(db.rst.getString(3));
            temp.add(db.rst.getString(4));
            temp.add(db.rst.getString(5));
            temp.add(db.rst.getString(6));
            data.add(temp);
        }
        jTable5.setModel(new DefaultTableModel(data,head));
        } catch (Exception e) {
        e.printStackTrace();
        }
    }//GEN-LAST:event_jLabel63MouseClicked

    private void jTable5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable5KeyPressed
if(evt.getKeyCode()==KeyEvent.VK_ENTER)
{
jTextField11.setText(jTable5.getValueAt(jTable5.getSelectedRow(),2).toString());    
}
    }//GEN-LAST:event_jTable5KeyPressed

    private void jLabel89MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel89MouseClicked
try {
    String a=jComboBox21.getSelectedItem().toString();
    String b=jComboBox22.getSelectedItem().toString();
    Vector<String> head=new Vector<String>();
        Vector<Vector<String>> data=new Vector<Vector<String>>();
        head.add("Car");
        head.add("Model");
        head.add("Car Number");
        head.add("Use As");
        head.add("Seat");
        head.add("Rent");
        DBConnection db=new DBConnection();
        db.pstmt=db.con.prepareStatement("select com,model,carno,useas,seat,rent from vehic where com like '%"+a+"%' or seat like '%"+b+"%'");
        db.rst=db.pstmt.executeQuery();
        while(db.rst.next())
        {
            Vector<String> temp=new Vector<String>();
            temp.add(db.rst.getString(1));
            temp.add(db.rst.getString(2));
            temp.add(db.rst.getString(3));
            temp.add(db.rst.getString(4));
            temp.add(db.rst.getString(5));
            temp.add(db.rst.getString(6));
            data.add(temp);
        }
        jTable7.setModel(new DefaultTableModel(data,head));
        } catch (Exception e) {
        e.printStackTrace();
        }    
    }//GEN-LAST:event_jLabel89MouseClicked

    private void jTable7KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable7KeyPressed
if(evt.getKeyCode()==KeyEvent.VK_ENTER)
{
    String a=jTable7.getValueAt(jTable7.getSelectedRow(),2).toString();
jTextField16.setText(a);
    String b=jTable7.getValueAt(jTable7.getSelectedRow(),5).toString();
jTextField19.setText(b);
    try {
    DBConnection db=new DBConnection();    
    db.pstmt=db.con.prepareStatement("select did from driver where carno='"+a+"'");
    db.rst=db.pstmt.executeQuery();
    if(db.rst.next())
    {
        jTextField18.setText(db.rst.getString(1));
    }
    } catch (Exception e) {
    e.printStackTrace();
    }

}
    }//GEN-LAST:event_jTable7KeyPressed

    private void jLabel94MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel94MouseClicked
double a=Double.parseDouble(jTextField15.getText());
double b=Double.parseDouble(jTextField19.getText());
jTextField20.setText(String.valueOf(a*b));
    }//GEN-LAST:event_jLabel94MouseClicked

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
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Employee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JInternalFrame addcus;
    private javax.swing.JInternalFrame adddri;
    private javax.swing.JInternalFrame carret;
    private javax.swing.JInternalFrame changepass;
    private javax.swing.JInternalFrame cuslist;
    private javax.swing.JInternalFrame drilist;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox10;
    private javax.swing.JComboBox<String> jComboBox11;
    private javax.swing.JComboBox<String> jComboBox12;
    private javax.swing.JComboBox<String> jComboBox13;
    private javax.swing.JComboBox<String> jComboBox14;
    private javax.swing.JComboBox<String> jComboBox15;
    private javax.swing.JComboBox<String> jComboBox16;
    private javax.swing.JComboBox<String> jComboBox20;
    private javax.swing.JComboBox<String> jComboBox21;
    private javax.swing.JComboBox<String> jComboBox22;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JFormattedTextField jFormattedTextField10;
    private javax.swing.JFormattedTextField jFormattedTextField11;
    private javax.swing.JFormattedTextField jFormattedTextField12;
    private javax.swing.JFormattedTextField jFormattedTextField13;
    private javax.swing.JFormattedTextField jFormattedTextField2;
    private javax.swing.JFormattedTextField jFormattedTextField3;
    private javax.swing.JFormattedTextField jFormattedTextField8;
    private javax.swing.JFormattedTextField jFormattedTextField9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
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
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
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
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPasswordField jPasswordField3;
    private javax.swing.JPasswordField jPasswordField4;
    private javax.swing.JPasswordField jPasswordField5;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton10;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JRadioButton jRadioButton9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable5;
    private javax.swing.JTable jTable7;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextArea jTextArea5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JInternalFrame modcus;
    private javax.swing.JInternalFrame moddri;
    private javax.swing.JInternalFrame viewcars;
    // End of variables declaration//GEN-END:variables
}
