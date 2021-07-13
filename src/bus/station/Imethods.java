/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bus.station;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Raghda
 */
interface Imethods {
    public void saveClients(ArrayList<Client> newarray)throws IOException;
    public boolean searchDrivers(String username, String password) throws FileNotFoundException;
    public boolean searchManagers(String username, String password) throws FileNotFoundException;
    public ArrayList<Trips> showTrips(ArrayList<String> ID) throws FileNotFoundException;
    public boolean searchClients(String username, String password) throws FileNotFoundException;
    public void saveDrivers(ArrayList<Driver> newarray)throws IOException;
    public void saveTrips(ArrayList<Trips> newarray)throws IOException;
    public ArrayList<Trips> cancelTrip(ArrayList<Trips> triplist, String id);
    public void addTrip(Trips newtrip);
    public ArrayList<Trips> searchTrips(String type, String pickup);
    public int assignTrip(String name, String Id);
    public float reserveTrip(int i, String Id);
    public int cancelTripClient(int i, String Id);
    public int editprice(String id,float price);
    public void Signup (String username,String password,String phonenumber);
}
