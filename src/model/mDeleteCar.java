package model;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class mDeleteCar {
    public void deleteCar(int car_id) {
        try {
            Statement st = mDBconnection.createDBconnection().createStatement();
            int row_count = st.executeUpdate("DELETE FROM cars WHERE car_id = " + car_id);

            if (row_count > 0) {
                JOptionPane.showMessageDialog(null, "Car Deleted Successfully!", "Delete Vehicle", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Car with ID " + car_id + " not found.", "Delete Vehicle", JOptionPane.WARNING_MESSAGE);
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}
