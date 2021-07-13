/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bus.station;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Raghda
 */

public class BusStation {
    
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) throws FileNotFoundException {
     Load l=new Load();
     l.readFromFileManagers();
     l.readFromFileTrips();
     l.readFromFileClient();
     l.readFromFileDriver();
     BusStationMethods m=new BusStationMethods();
     m.setL(l);
     Rayar r = new Rayar();
     r.setVisible(true);
     r.setM(m);
     //TripsJFrame j=new TripsJFrame();
     //j.setVisible(true);
    }
   
}