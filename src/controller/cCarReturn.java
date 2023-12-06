package controller;

import model.mCarReturn;

public class cCarReturn {
    public void returnCar(int return_id, int vehicle_id, String return_date, float fine) {
        mCarReturn mcarreturn = new mCarReturn();
        mcarreturn.returnCar(return_id, vehicle_id, return_date, fine);
    }
}

