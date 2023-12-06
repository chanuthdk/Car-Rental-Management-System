package model;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class mCarReturn {
    public void returnCar(int return_id, int vehicle_id, String return_date, float fine) {
        try {
            Statement st = mDBconnection.createDBconnection().createStatement();
            String query = "INSERT INTO carreturn (return_id, vehicle_id, return_date, fine) " +
                           "VALUES (" + return_id + ", " + vehicle_id + ", '" + return_date + "', " + fine + ")";
            int row_count = st.executeUpdate(query);

            if (row_count > 0) {
                JOptionPane.showMessageDialog(null, "Car Return Added Successfully!", "Add Car Return", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}
