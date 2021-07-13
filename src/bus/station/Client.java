/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bus.station;

import java.util.ArrayList;

/**
 *
 * @author Raghda
 */
public class Client extends People{
    private ArrayList<String> ID ;
    private int  noOfTrips;
@Override
    public String getUsername(){
    
   String name= super.getUsername();
    return name;
    }
    public ArrayList<String> getID() {
        return ID;
    }

    public void setID(ArrayList<String> ID) {
        this.ID = ID;
    }
    
    

    public int getNoOfTrips() {
        return noOfTrips;
    }

    public void setNoOfTrips(int noOfTrips) {
        this.noOfTrips = noOfTrips;
    }
}
