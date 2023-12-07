package view;
import model.mGetCarDetails;
import controller.cCarDetailsTable;
import javax.swing.JTable;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import controller.cGetCarRentalsDetails;
import model.mGetCarRentalsDetails;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JRDesignQuery;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;


public class vDashboard extends javax.swing.JFrame {
    private JTable tbl_avbllcar;
    private cCarDetailsTable controller;
    private JTable tbl_carrentall;
    private cGetCarRentalsDetails controllerr;

    public vDashboard() {
        initComponents();
            newaddcar.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e) 
            {
                dispose();
                vAddCar addCarForm = new vAddCar();       
                addCarForm.setVisible(true);
            }
            });            
            newdash.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e) 
            {
                dispose();
                vDashboard dashboard = new vDashboard();       
                dashboard.setVisible(true);
            }
            });
            newupdatecar.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e) 
            {
                dispose();
                vUpdateCar updateCar = new vUpdateCar();       
                updateCar.setVisible(true);
            }
            });
            newdeletecar.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e) 
            {
                dispose();
                vDeleteCar deleteCar = new vDeleteCar();       
                deleteCar.setVisible(true);
            }
            });
            newrentcar.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e) 
            {
                dispose();
                vRentCar rentCar = new vRentCar();       
                rentCar.setVisible(true);
            }
            });
            newreturncar.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e) 
            {
                dispose();
                vReturnCar returnCar = new vReturnCar();       
                returnCar.setVisible(true);
            }
            });

        controller = new cCarDetailsTable(new mGetCarDetails(), tbl_avblcar);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowOpened(WindowEvent e) {
                controller.updateView();
            }
        });
        controllerr = new cGetCarRentalsDetails(new mGetCarRentalsDetails(), tbl_carrentals);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowOpened(WindowEvent e) {
                controllerr.updateView();
            }
        });
    }

    Connection con;
    PreparedStatement pst;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_avblcar = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl_carrentals = new javax.swing.JTable();
        btn_getReport = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        newdash = new javax.swing.JLabel();
        newaddcar = new javax.swing.JLabel();
        newupdatecar = new javax.swing.JLabel();
        newdeletecar = new javax.swing.JLabel();
        newrentcar = new javax.swing.JLabel();
        newreturncar = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Ongoing Rentals");

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Admin Dashboard");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Available Cars");

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        tbl_avblcar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Car Id", "Reg no", "Brand", "Model", "Type", "Passengers", "Daily_charge", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbl_avblcar);

        jScrollPane3.setBackground(new java.awt.Color(255, 255, 255));

        tbl_carrentals.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Rent ID", "Vehicle ID", "Customer ID", "Rent Date", "Return Date", "Fees"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tbl_carrentals);

        btn_getReport.setBackground(new java.awt.Color(204, 0, 51));
        btn_getReport.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btn_getReport.setText("Get Report");
        btn_getReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_getReportActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_getReport, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 702, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 702, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_getReport)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(204, 0, 51));

        newdash.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        newdash.setForeground(new java.awt.Color(255, 255, 255));
        newdash.setText("Dashboard");

        newaddcar.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        newaddcar.setForeground(new java.awt.Color(255, 255, 255));
        newaddcar.setText("Add Car");

        newupdatecar.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        newupdatecar.setForeground(new java.awt.Color(255, 255, 255));
        newupdatecar.setText("Update Car");

        newdeletecar.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        newdeletecar.setForeground(new java.awt.Color(255, 255, 255));
        newdeletecar.setText("Delete Car");

        newrentcar.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        newrentcar.setForeground(new java.awt.Color(255, 255, 255));
        newrentcar.setText("Rent Car");

        newreturncar.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        newreturncar.setForeground(new java.awt.Color(255, 255, 255));
        newreturncar.setText("Return Car");

        jLabel12.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Logout");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(newreturncar)
                            .addComponent(newrentcar)
                            .addComponent(newdeletecar)
                            .addComponent(newupdatecar)
                            .addComponent(newdash)
                            .addComponent(newaddcar)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel12)))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(newdash)
                .addGap(18, 18, 18)
                .addComponent(newaddcar)
                .addGap(18, 18, 18)
                .addComponent(newupdatecar)
                .addGap(18, 18, 18)
                .addComponent(newdeletecar)
                .addGap(18, 18, 18)
                .addComponent(newrentcar)
                .addGap(18, 18, 18)
                .addComponent(newreturncar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_getReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_getReportActionPerformed
       try {
            // TODO add your handling code here:
           
            con = DriverManager.getConnection("jdbc:mysql://localhost/carrental","root","");
            JasperDesign jdesign = JRXmlLoader.load("C:\\Users\\cheve\\Documents\\NetBeansProjects\\CarRental\\src\\view\\report1.jrxml");
            String query ="SELECT * FROM userlogin";
            
            JRDesignQuery updateQuery = new JRDesignQuery();
            updateQuery.setText(query);
            
            JasperReport jreport = JasperCompileManager.compileReport(jdesign);
            JasperPrint jprint = JasperFillManager.fillReport(jreport, null,con);
            
            JasperViewer.viewReport(jprint);
            
        
        } catch (JRException ex) {
            JOptionPane.showMessageDialog(null,"Error"+ex.getMessage(), "ss", HEIGHT);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,"Erro55r"+ex.getMessage(), "ss", HEIGHT);
        }
    }//GEN-LAST:event_btn_getReportActionPerformed

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
            java.util.logging.Logger.getLogger(vDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_getReport;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel newaddcar;
    private javax.swing.JLabel newdash;
    private javax.swing.JLabel newdeletecar;
    private javax.swing.JLabel newrentcar;
    private javax.swing.JLabel newreturncar;
    private javax.swing.JLabel newupdatecar;
    private javax.swing.JTable tbl_avblcar;
    private javax.swing.JTable tbl_carrentals;
    // End of variables declaration//GEN-END:variables
}
