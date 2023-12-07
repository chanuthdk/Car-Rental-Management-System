package model;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class mRentCar {
    public void rentCar(int rent_id, int vehicle_id, int customer_id, String rent_date, String return_date, float fees) {
        try {
            Statement st = mDBconnection.createDBconnection().createStatement();
            String query = "INSERT INTO carrental (rent_id, vehicle_id, customer_id, rent_date, return_date, fees) " +
                           "VALUES (" + rent_id + ", " + vehicle_id + ", " + customer_id + ", '" + rent_date + "', '" + return_date + "', " + fees + ")";
            int row_count = st.executeUpdate(query);

            if (row_count > 0) {
                JOptionPane.showMessageDialog(null, "Car Rental Added Successfully!", "Add Car Rental", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}
