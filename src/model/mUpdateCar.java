package model;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class mUpdateCar {
    public void updateCar(int car_id, String reg_no, String brand_name, String model_Name, String vehicle_Type, String passengers, Float daily_Charge, String status) {
        try {
            Connection connection = mDBconnection.createDBconnection();
            
            String sql = "UPDATE cars SET reg_no=?, brand_name=?, model_Name=?, vehicle_Type=?, passengers=?, daily_Charge=?, status=? WHERE car_id=?";
            
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, reg_no);
            preparedStatement.setString(2, brand_name);
            preparedStatement.setString(3, model_Name);
            preparedStatement.setString(4, vehicle_Type);
            preparedStatement.setString(5, passengers);
            preparedStatement.setFloat(6, daily_Charge);
            preparedStatement.setString(7, status);
            preparedStatement.setInt(8, car_id);
            
            int row_count = preparedStatement.executeUpdate();

            if (row_count > 0) {
                JOptionPane.showMessageDialog(null, "Car Updated Successfully!", "Update Vehicle", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "No records were updated.", "Update Vehicle", JOptionPane.WARNING_MESSAGE);
            }
            
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}

