package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class mUpdateCarStatus {
    public void updateCarStatus(int car_id, String newStatus) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            // Get a database connection
            connection = mDBconnection.createDBconnection();

            // Define the SQL query to update the status of a car
            String sql = "UPDATE cars SET status = ? WHERE car_id = ?";
            
            // Create a prepared statement
            preparedStatement = connection.prepareStatement(sql);
            
            // Set the new status and car_id as parameters
            preparedStatement.setString(1, newStatus);
            preparedStatement.setInt(2, car_id);
            
            // Execute the update
            int rowsUpdated = preparedStatement.executeUpdate();

            if (rowsUpdated > 0) {
                System.out.println("Car status updated successfully.");
            } else {
                System.out.println("Car with ID " + car_id + " not found.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}

