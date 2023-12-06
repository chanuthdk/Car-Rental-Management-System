package view;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import controller.cGetCarRentalsDetails;
import javax.swing.JTable;
import model.mGetCarRentalsDetails;
import controller.cUpdateCarStatus;
import controller.cCarReturn;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Date;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

public class vReturnCar extends javax.swing.JFrame {

    private JTable tbl_carrentall;
    private cGetCarRentalsDetails controller;
    public vReturnCar() {
        initComponents();
        jLabel10.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
            dispose();
            vLogin loginForm = new vLogin();
            loginForm.setVisible(true);
        }
    });
        lbladdcar.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e) 
            {
                dispose();
                vAddCar addCarForm = new vAddCar();       
                addCarForm.setVisible(true);
            }
            });
            lbldashboard.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e) 
            {
                dispose();
                vDashboard dashboard = new vDashboard();       
                dashboard.setVisible(true);
            }
            });
            lblupdatecar.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e) 
            {
                dispose();
                vUpdateCar updateCar = new vUpdateCar();       
                updateCar.setVisible(true);
            }
            });
            lbldeletecar.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e) 
            {
                dispose();
                vDeleteCar deleteCar = new vDeleteCar();       
                deleteCar.setVisible(true);
            }
            });
            lblrentcar.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e) 
            {
                dispose();
                vRentCar rentCar = new vRentCar();       
                rentCar.setVisible(true);
            }
            });
            lblreturncar.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e) 
            {
                dispose();
                vReturnCar returnCar = new vReturnCar();       
                returnCar.setVisible(true);
            }
            });
        
        controller = new cGetCarRentalsDetails(new mGetCarRentalsDetails(), tbl_carrentals);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowOpened(WindowEvent e) {
                controller.updateView();
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        btn_return = new javax.swing.JButton();
        txt_returnid = new javax.swing.JTextField();
        txt_vehicleid = new javax.swing.JTextField();
        txt_delay = new javax.swing.JTextField();
        txt_fine = new javax.swing.JTextField();
        btn_cls = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_carrentals = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        ccb_returndate = new de.wannawork.jcalendar.JCalendarComboBox();
        cmb_status = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lbldashboard = new javax.swing.JLabel();
        lbladdcar = new javax.swing.JLabel();
        lblupdatecar = new javax.swing.JLabel();
        lbldeletecar = new javax.swing.JLabel();
        lblrentcar = new javax.swing.JLabel();
        lblreturncar = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Vehicle ID");

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Return Cars");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Return Id");

        jLabel11.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Delay");

        jLabel12.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Status");

        jLabel13.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Fine");

        btn_return.setBackground(new java.awt.Color(204, 0, 51));
        btn_return.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btn_return.setText("Return");
        btn_return.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_returnActionPerformed(evt);
            }
        });

        txt_returnid.setBackground(new java.awt.Color(204, 204, 204));
        txt_returnid.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txt_returnid.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        txt_vehicleid.setBackground(new java.awt.Color(204, 204, 204));
        txt_vehicleid.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txt_vehicleid.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        txt_delay.setBackground(new java.awt.Color(204, 204, 204));
        txt_delay.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txt_delay.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        txt_fine.setBackground(new java.awt.Color(204, 204, 204));
        txt_fine.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txt_fine.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        btn_cls.setBackground(new java.awt.Color(204, 0, 51));
        btn_cls.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btn_cls.setText("Clear");
        btn_cls.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clsActionPerformed(evt);
            }
        });

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

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
        jScrollPane1.setViewportView(tbl_carrentals);
        if (tbl_carrentals.getColumnModel().getColumnCount() > 0) {
            tbl_carrentals.getColumnModel().getColumn(0).setResizable(false);
            tbl_carrentals.getColumnModel().getColumn(1).setResizable(false);
            tbl_carrentals.getColumnModel().getColumn(2).setResizable(false);
            tbl_carrentals.getColumnModel().getColumn(3).setResizable(false);
            tbl_carrentals.getColumnModel().getColumn(4).setResizable(false);
            tbl_carrentals.getColumnModel().getColumn(5).setResizable(false);
        }

        jLabel14.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Return Date");

        cmb_status.setBackground(new java.awt.Color(204, 204, 204));
        cmb_status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Available" }));

        jLabel15.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Ongoing Car Rentals");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jLabel3)
                                .addGap(196, 196, 196)
                                .addComponent(jLabel1)
                                .addGap(170, 170, 170)
                                .addComponent(jLabel11)))
                        .addContainerGap(188, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 702, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_returnid, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                                    .addComponent(cmb_status, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(34, 34, 34)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_vehicleid, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                                    .addComponent(ccb_returndate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(28, 28, 28)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txt_delay, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_fine, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 45, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jLabel12)
                        .addGap(212, 212, 212)
                        .addComponent(jLabel14)
                        .addGap(162, 162, 162)
                        .addComponent(jLabel13))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(btn_return, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(241, 241, 241)
                        .addComponent(btn_cls, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(314, 314, 314)
                .addComponent(jLabel15)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_vehicleid, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_returnid, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_delay, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel14)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ccb_returndate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_fine, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmb_status, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_return, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cls, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44))
        );

        jPanel2.setBackground(new java.awt.Color(204, 0, 51));

        lbldashboard.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lbldashboard.setForeground(new java.awt.Color(255, 255, 255));
        lbldashboard.setText("Dashboard");

        lbladdcar.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lbladdcar.setForeground(new java.awt.Color(255, 255, 255));
        lbladdcar.setText("Add Car");

        lblupdatecar.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lblupdatecar.setForeground(new java.awt.Color(255, 255, 255));
        lblupdatecar.setText("Update Car");

        lbldeletecar.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lbldeletecar.setForeground(new java.awt.Color(255, 255, 255));
        lbldeletecar.setText("Delete Car");

        lblrentcar.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lblrentcar.setForeground(new java.awt.Color(255, 255, 255));
        lblrentcar.setText("Rent Car");

        lblreturncar.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lblreturncar.setForeground(new java.awt.Color(255, 255, 255));
        lblreturncar.setText("Return Car");

        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Logout");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblreturncar)
                            .addComponent(lblrentcar)
                            .addComponent(lbldeletecar)
                            .addComponent(lblupdatecar)
                            .addComponent(lbldashboard)
                            .addComponent(lbladdcar)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel10)))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(lbldashboard)
                .addGap(18, 18, 18)
                .addComponent(lbladdcar)
                .addGap(18, 18, 18)
                .addComponent(lblupdatecar)
                .addGap(18, 18, 18)
                .addComponent(lbldeletecar)
                .addGap(18, 18, 18)
                .addComponent(lblrentcar)
                .addGap(18, 18, 18)
                .addComponent(lblreturncar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_returnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_returnActionPerformed
        try {
    int car_id = Integer.parseInt(txt_vehicleid.getText());
    String status = (String) cmb_status.getSelectedItem();

    cUpdateCarStatus mupdatec = new cUpdateCarStatus();
    mupdatec.updateCarStatus(car_id, status);

    int return_id = Integer.parseInt(txt_returnid.getText());
    int vehicle_id = Integer.parseInt(txt_vehicleid.getText());
    
    // Validate return date
    Date return_date = ccb_returndate.getDate();
    if (return_date == null) {
        JOptionPane.showMessageDialog(this, "Please select a valid return date.", "Validation Error", JOptionPane.ERROR_MESSAGE);
        return; // Stop processing if the date is invalid
    }
    
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    String formattedReturnDate = dateFormat.format(return_date);
    
    float fine = Float.parseFloat(txt_fine.getText());
    
    cCarReturn mcarreturn = new cCarReturn();
    mcarreturn.returnCar(return_id, vehicle_id, formattedReturnDate, fine);
} catch (NumberFormatException e) {
    JOptionPane.showMessageDialog(this, "Please enter valid numeric values.", "Validation Error", JOptionPane.ERROR_MESSAGE);
} catch (Exception e) {
    JOptionPane.showMessageDialog(this, "An error occurred: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
}


    }//GEN-LAST:event_btn_returnActionPerformed

    private void btn_clsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clsActionPerformed
        txt_vehicleid.setText("");
        cmb_status.setSelectedIndex(0);
        txt_returnid.setText("");
        txt_fine.setText("");
        ccb_returndate.setDate(null);
    }//GEN-LAST:event_btn_clsActionPerformed

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
            java.util.logging.Logger.getLogger(vReturnCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vReturnCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vReturnCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vReturnCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vReturnCar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cls;
    private javax.swing.JButton btn_return;
    private de.wannawork.jcalendar.JCalendarComboBox ccb_returndate;
    private javax.swing.JComboBox<String> cmb_status;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbladdcar;
    private javax.swing.JLabel lbldashboard;
    private javax.swing.JLabel lbldeletecar;
    private javax.swing.JLabel lblrentcar;
    private javax.swing.JLabel lblreturncar;
    private javax.swing.JLabel lblupdatecar;
    private javax.swing.JTable tbl_carrentals;
    private javax.swing.JTextField txt_delay;
    private javax.swing.JTextField txt_fine;
    private javax.swing.JTextField txt_returnid;
    private javax.swing.JTextField txt_vehicleid;
    // End of variables declaration//GEN-END:variables
}
