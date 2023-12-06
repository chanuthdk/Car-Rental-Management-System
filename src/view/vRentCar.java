package view;
import com.mysql.cj.conf.PropertyKey;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import controller.cCarDetailsTable;
import javax.swing.JTable;
import model.mGetCarDetails;
import controller.cUpdateCarStatus;
import controller.cRentCar;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Date;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

public class vRentCar extends javax.swing.JFrame {
    private JTable tbl_avbllcar;
    private cCarDetailsTable controller;


    public vRentCar() {
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
        
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowOpened(WindowEvent e) {
                controller.updateView();
            }
        });controller = new cCarDetailsTable(new mGetCarDetails(), tbl_avblcar);

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
        jLabel14 = new javax.swing.JLabel();
        btn_rent = new javax.swing.JButton();
        txt_rentId = new javax.swing.JTextField();
        txt_vehicleId = new javax.swing.JTextField();
        txt_fees = new javax.swing.JTextField();
        btn_cls = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_avblcar = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        ccb_returnDate = new de.wannawork.jcalendar.JCalendarComboBox();
        ccb_rentDate = new de.wannawork.jcalendar.JCalendarComboBox();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        cmb_status = new javax.swing.JComboBox<>();
        txt_Id = new javax.swing.JTextField();
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
        jLabel2.setText("Rent Car");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Rent Id");

        jLabel14.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Fees");

        btn_rent.setBackground(new java.awt.Color(204, 0, 51));
        btn_rent.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btn_rent.setText("Rent");
        btn_rent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_rentActionPerformed(evt);
            }
        });

        txt_rentId.setBackground(new java.awt.Color(204, 204, 204));
        txt_rentId.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txt_rentId.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        txt_vehicleId.setBackground(new java.awt.Color(204, 204, 204));
        txt_vehicleId.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txt_vehicleId.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        txt_fees.setBackground(new java.awt.Color(204, 204, 204));
        txt_fees.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txt_fees.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        btn_cls.setBackground(new java.awt.Color(204, 0, 51));
        btn_cls.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btn_cls.setText("Clear");
        btn_cls.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clsActionPerformed(evt);
            }
        });

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
        if (tbl_avblcar.getColumnModel().getColumnCount() > 0) {
            tbl_avblcar.getColumnModel().getColumn(0).setResizable(false);
            tbl_avblcar.getColumnModel().getColumn(1).setResizable(false);
            tbl_avblcar.getColumnModel().getColumn(2).setResizable(false);
            tbl_avblcar.getColumnModel().getColumn(3).setResizable(false);
            tbl_avblcar.getColumnModel().getColumn(4).setResizable(false);
            tbl_avblcar.getColumnModel().getColumn(5).setResizable(false);
            tbl_avblcar.getColumnModel().getColumn(6).setResizable(false);
            tbl_avblcar.getColumnModel().getColumn(7).setResizable(false);
        }

        jLabel11.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Customer Id");

        jLabel15.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Rent Date");

        jLabel16.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("Return Date");

        jLabel17.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("Status");

        cmb_status.setBackground(new java.awt.Color(204, 204, 204));
        cmb_status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Booked" }));

        txt_Id.setBackground(new java.awt.Color(204, 204, 204));
        txt_Id.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txt_Id.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(195, 195, 195)
                .addComponent(btn_rent, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100)
                .addComponent(btn_cls, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jLabel3))
                            .addComponent(ccb_rentDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_rentId, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                            .addComponent(cmb_status, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(163, 163, 163)
                                .addComponent(jLabel11)
                                .addGap(83, 83, 83))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txt_vehicleId, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ccb_returnDate, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_fees, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                                    .addComponent(txt_Id))
                                .addGap(29, 29, 29))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(16, 16, 16))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel16)
                .addGap(156, 156, 156)
                .addComponent(jLabel14)
                .addGap(176, 176, 176))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 702, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel17)))
                .addContainerGap(48, Short.MAX_VALUE))
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
                    .addComponent(txt_vehicleId, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_rentId, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Id, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(jLabel16)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel15)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_fees, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ccb_returnDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ccb_rentDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmb_status, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_rent, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cls, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
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
                .addContainerGap(62, Short.MAX_VALUE))
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

    private void btn_rentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_rentActionPerformed
        try {
    int car_id = Integer.parseInt(txt_vehicleId.getText());
    String status = (String) cmb_status.getSelectedItem();
    
    cUpdateCarStatus mupdatec = new cUpdateCarStatus();
    mupdatec.updateCarStatus(car_id, status);
    
    int rent_id = Integer.parseInt(txt_rentId.getText());
    int vehicle_id = Integer.parseInt(txt_vehicleId.getText());
    int customer_id = Integer.parseInt(txt_Id.getText());

    Date rent_date = ccb_rentDate.getDate();
    Date return_date = ccb_returnDate.getDate();
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    String formattedRentDate = dateFormat.format(rent_date);
    String formattedReturnDate = dateFormat.format(return_date);

    float fees = Float.parseFloat(txt_fees.getText());

    cRentCar mrentc = new cRentCar();
    mrentc.rentCar(rent_id, vehicle_id, customer_id, formattedRentDate, formattedReturnDate, fees);
} catch (NumberFormatException e) {
    JOptionPane.showMessageDialog(this, "Please enter valid numeric values.", "Input Error", JOptionPane.ERROR_MESSAGE);
} catch (Exception ex) {
    JOptionPane.showMessageDialog(this, "An error occurred: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
}


    }//GEN-LAST:event_btn_rentActionPerformed

    private void btn_clsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clsActionPerformed
        txt_vehicleId.setText("");
        cmb_status.setSelectedIndex(0); // Set the default selection for the combo box
        txt_rentId.setText("");
        txt_Id.setText("");
        ccb_rentDate.setDate(null); // Clear the date picker
        ccb_returnDate.setDate(null); // Clear the date picker
        txt_fees.setText("");
    }//GEN-LAST:event_btn_clsActionPerformed

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
            java.util.logging.Logger.getLogger(vRentCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vRentCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vRentCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vRentCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vRentCar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cls;
    private javax.swing.JButton btn_rent;
    private de.wannawork.jcalendar.JCalendarComboBox ccb_rentDate;
    private de.wannawork.jcalendar.JCalendarComboBox ccb_returnDate;
    private javax.swing.JComboBox<String> cmb_status;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
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
    private javax.swing.JTable tbl_avblcar;
    private javax.swing.JTextField txt_Id;
    private javax.swing.JTextField txt_fees;
    private javax.swing.JTextField txt_rentId;
    private javax.swing.JTextField txt_vehicleId;
    // End of variables declaration//GEN-END:variables
}
