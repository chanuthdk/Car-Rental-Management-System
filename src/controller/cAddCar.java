package controller;
import model.mAddCar;

public class cAddCar {
    public void addCar(int car_id ,String reg_no, String brand_name, String model_Name, String vehicle_Type, String passengers, Float daily_Charge, String status)
    {
        mAddCar maddc = new mAddCar();
        maddc.addCar(car_id, reg_no, brand_name, model_Name, vehicle_Type, passengers, daily_Charge, status);
    }   
}
