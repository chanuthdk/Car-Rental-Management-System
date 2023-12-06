package model;

public class Car {
    private int car_id;
    private String reg_no;
    private String brand_name;
    private String model_name;
    private String vehicle_type;
    private String passengers;
    private float daily_charge;
    private String status;

    public Car(int car_id, String reg_no, String brand_name, String model_name, String vehicle_type, String passengers, float daily_charge, String status) {
        this.car_id = car_id;
        this.reg_no = reg_no;
        this.brand_name = brand_name;
        this.model_name = model_name;
        this.vehicle_type = vehicle_type;
        this.passengers = passengers;
        this.daily_charge = daily_charge;
        this.status = status;
    }

    public Object getCarId() {
        return car_id;
    }

    public Object getRegNo() {
        return reg_no;
    }

    public Object getBrandName() {
        return brand_name;
    }

    public Object getModelName() {
        return model_name;
    }

    public Object getVehicleType() {
        return vehicle_type;
    }

    public Object getPassengers() {
        return passengers;
    }

    public Object getDailyCharge() {
        return daily_charge;
    }

    public Object getStatus() {
        return status;
    }

    
}

