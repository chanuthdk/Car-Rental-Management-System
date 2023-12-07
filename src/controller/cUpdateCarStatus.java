package controller;
import model.mUpdateCarStatus;

public class cUpdateCarStatus {
    public void updateCarStatus(int car_id, String status) {
        mUpdateCarStatus mupdatec = new mUpdateCarStatus();
        mupdatec.updateCarStatus(car_id, status);
    }
}

