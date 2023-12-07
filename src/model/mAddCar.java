package model;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class mAddCar {
    public void addCar(int car_id ,String reg_no, String brand_name, String model_Name, String vehicle_Type, String passengers, Float daily_Charge, String status)
    {
        try
        {
            Statement st = mDBconnection.createDBconnection().createStatement();
            int row_count = st.executeUpdate("INSERT INTO cars VALUES ('"+car_id+"','"+reg_no+"','"+brand_name+"','"+model_Name+"','"+vehicle_Type+"','"+passengers+"','"+daily_Charge+"','"+status+"')");

            if(row_count>0)
            {
                JOptionPane.showMessageDialog(null,"Car Added Successfully!","AddVehicle",JOptionPane.INFORMATION_MESSAGE);
            }
    }
    catch(SQLException e)
    {
        System.err.println(e.getMessage());
    }
    }
}
