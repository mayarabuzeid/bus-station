/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bus.station;

/**
 *
 * @author Raghda
 */
public class Trips {
    private String pickup;
    private String dropoff;
    private String Tpickup;
    private String Tdropoff;
    private String vehicle;
    private String ticketType;
    private String stop;
    private float ticketprice;
    private int Tnumber;  
    private String ID;
    private String TripType;

    public String getTripType() {
        return TripType;
    }

    public void setTripType(String TripType) {
        this.TripType = TripType;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }
  
    public String getPickup() {
        return pickup;
    }

    public void setPickup(String pickup) {
        this.pickup = pickup;
    }

    public String getDropoff() {
        return dropoff;
    }

    public void setDropoff(String dropoff) {
        this.dropoff = dropoff;
    }

    public String getTpickup() {
        return Tpickup;
    }

    public void setTpickup(String Tpickup) {
        this.Tpickup = Tpickup;
    }

    public String getTdropoff() {
        return Tdropoff;
    }

    public void setTdropoff(String Tdropoff) {
        this.Tdropoff = Tdropoff;
    }

    public String getVehicle() {
        return vehicle;
    }

    public void setVehicle(String vehicle) {
        this.vehicle = vehicle;
    }

    public String getTicketType() {
        return ticketType;
    }

    public void setTicketType(String ticketType) {
        this.ticketType = ticketType;
    }

    public String getStop() {
        return stop;
    }

    public void setStop(String stop) {
        this.stop = stop;
    }

    public float getTicketprice() {
        return ticketprice;
    }

    public void setTicketprice(float ticketprice) {
        this.ticketprice = ticketprice;
    }

    public int getTnumber() {
        return Tnumber;
    }

    public void setTnumber(int Tnumber) {
        this.Tnumber = Tnumber;
    }

    
    
}
