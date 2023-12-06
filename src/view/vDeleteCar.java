package view;
import controller.cCarDetailsTable;
import controller.cDeleteCar;
import model.mGetCarDetails;
import controller.cUpdateCarStatus;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;
import javax.swing.JTable;


public class vDeleteCar extends javax.swing.JFrame {
    private JTable tbl_avbllcar;
    private cCarDetailsTable controller;

    public vDeleteCar() {
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btn_delete = new javax.swing.JButton();
        txt_carId = new javax.swing.JTextField();
        btn_cls = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_avblcar = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        lbldashboard = new javax.swing.JLabel();
        lbladdcar = new javax.swing.JLabel();
        lblupdatecar = new javax.swing.JLabel();
        lbldeletecar = new javax.swing.JLabel();
        lblrentcar = new javax.swing.JLabel();
        lblreturncar = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("dashboard"); // NOI18N

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Delete Cars");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Car Id");

        btn_delete.setBackground(new java.awt.Color(204, 0, 51));
        btn_delete.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btn_delete.setText("Delete");
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });

        txt_carId.setBackground(new java.awt.Color(204, 204, 204));
        txt_carId.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txt_carId.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(135, 135, 135)
                .addComponent(btn_cls, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(190, 190, 190))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(340, 340, 340)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(255, 255, 255)
                        .addComponent(txt_carId, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 702, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel2)
                .addGap(30, 30, 30)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_carId, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_cls, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(80, 80, 80))
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
                .addContainerGap(74, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 241, Short.MAX_VALUE)
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

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        try {
    int car_Id = Integer.parseInt(txt_carId.getText());

    if (car_Id <= 0) {
        JOptionPane.showMessageDialog(this, "Car ID must be a positive integer.", "Validation Error", JOptionPane.ERROR_MESSAGE);
        return; // Exit the method if validation fails
    }

    cDeleteCar mdeletec = new cDeleteCar();
    mdeletec.deleteCar(car_Id);

    JOptionPane.showMessageDialog(this, "Car deleted successfully.", "Car Deletion", JOptionPane.INFORMATION_MESSAGE);
} catch (NumberFormatException e) {
    JOptionPane.showMessageDialog(this, "Invalid Car ID format. Please enter a valid integer.", "Validation Error", JOptionPane.ERROR_MESSAGE);
} catch (Exception e) {
    JOptionPane.showMessageDialog(this, "An error occurred while deleting the car.", "Error", JOptionPane.ERROR_MESSAGE);
}

    }//GEN-LAST:event_btn_deleteActionPerformed

    private void btn_clsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clsActionPerformed
        txt_carId.setText("");
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
            java.util.logging.Logger.getLogger(vDeleteCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vDeleteCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vDeleteCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vDeleteCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vDeleteCar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cls;
    private javax.swing.JButton btn_delete;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JTextField txt_carId;
    // End of variables declaration//GEN-END:variables
}
