package controller;

import model.mRentCar;

public class cRentCar {
    public void rentCar(int rent_id, int vehicle_id, int customer_id, String rent_date, String return_date, float fees) {
        mRentCar mrentc = new mRentCar();
        mrentc.rentCar(rent_id, vehicle_id, customer_id, rent_date, return_date, fees);
    }
}


