package model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class mGetCarDetails {
    public List<Car> getCarDetails() {
        List<Car> carList = new ArrayList<>();
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            connection = mDBconnection.createDBconnection();
            statement = connection.createStatement();
            String sql = "SELECT * FROM cars";
            resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                int car_id = resultSet.getInt("car_id");
                String reg_no = resultSet.getString("reg_no");
                String brand_name = resultSet.getString("brand_name");
                String model_name = resultSet.getString("model_name");
                String vehicle_type = resultSet.getString("vehicle_type");
                String passengers = resultSet.getString("passengers");
                float daily_charge = resultSet.getFloat("daily_charge");
                String status = resultSet.getString("status");

                Car car = new Car(car_id, reg_no, brand_name, model_name, vehicle_type, passengers, daily_charge, status);
                carList.add(car);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (resultSet != null) resultSet.close();
                if (statement != null) statement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return carList;
    }
}
