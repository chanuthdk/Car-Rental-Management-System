package controller;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.Car;
import model.mGetCarDetails;

public class cCarDetailsTable {
    private mGetCarDetails model;
    private JTable dataTable;

    public cCarDetailsTable(mGetCarDetails model, JTable dataTable) {
        this.model = model;
        this.dataTable = dataTable;
    }

    public void updateView() {
        DefaultTableModel tableModel = (DefaultTableModel) dataTable.getModel();
        tableModel.setRowCount(0); // Clear existing data

        // Retrieve car details from the model
        for (Car car : model.getCarDetails()) {
            // Add car details to the table model
            tableModel.addRow(new Object[] {
                car.getCarId(),
                car.getRegNo(),
                car.getBrandName(),
                car.getModelName(),
                car.getVehicleType(),
                car.getPassengers(),
                car.getDailyCharge(),
                car.getStatus()
            });
        }
    }
}

