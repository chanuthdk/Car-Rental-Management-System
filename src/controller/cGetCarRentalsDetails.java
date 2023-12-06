package controller;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.CarRental;
import model.mGetCarRentalsDetails;

public class cGetCarRentalsDetails {
    private mGetCarRentalsDetails model;
    private JTable dataTable;

    public cGetCarRentalsDetails(mGetCarRentalsDetails model, JTable dataTable) {
        this.model = model;
        this.dataTable = dataTable;
    }

    public void updateView() {
        DefaultTableModel tableModel = (DefaultTableModel) dataTable.getModel();
        tableModel.setRowCount(0); // Clear existing data

        // Retrieve car rental details from the model
        for (model.CarRental carRental : model.getCarRentalsDetails()) {
            // Add car rental details to the table model
            tableModel.addRow(new Object[] {
                carRental.getRentId(),
                carRental.getVehicleId(),
                carRental.getCustomerId(),
                carRental.getRentDate(),
                carRental.getReturnDate(),
                carRental.getFees()
            });
        }
    }
}

