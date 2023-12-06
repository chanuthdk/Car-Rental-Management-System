package model;

public class CarRental {

    private int rent_id;
    private int vehicle_id;
    private int customer_id;
    private String rent_date;
    private String return_date;
    private float fees;

    public CarRental(int rent_id, int vehicle_id, int customer_id, String rent_date, String return_date, float fees) {
        this.rent_id = rent_id;
        this.vehicle_id = vehicle_id;
        this.customer_id = customer_id;
        this.rent_date = rent_date;
        this.return_date = return_date;
        this.fees = fees;
    }

    public int getRentId() {
        return rent_id;
    }

    public int getVehicleId() {
        return vehicle_id;
    }

    public int getCustomerId() {
        return customer_id;
    }

    public String getRentDate() {
        return rent_date;
    }

    public String getReturnDate() {
        return return_date;
    }

    public float getFees() {
        return fees;
    }
    
}
