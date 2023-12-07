package controller;
import model.mUpdateCar;

public class cUpdateCar {
    public void updateCar(int car_id, String reg_no, String brand_name, String model_Name, String vehicle_Type, String passengers, Float daily_Charge, String status) {
        mUpdateCar mupdatec = new mUpdateCar();
        mupdatec.updateCar(car_id, reg_no, brand_name, model_Name, vehicle_Type, passengers, daily_Charge, status);
    }
}

