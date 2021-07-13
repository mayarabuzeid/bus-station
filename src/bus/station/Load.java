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
public class Load {
     ArrayList<Managers> m =new ArrayList<Managers>();
      ArrayList<Trips> t =new ArrayList<Trips>();
     void readFromFileManagers() throws FileNotFoundException{
      File f = new File("managers.txt");
      Scanner sc= new Scanner(f);
      while(sc.hasNext()){
          String manager=sc.nextLine();
          String[] info=manager.split(",");
          String username=info[0];
          String password=info[1];
          String no=info[2];
          Managers man=new Managers();
          man.setUsername(username);
          man.setPassword(password);
          man.setPhonenumber(no);
           m.add(man);
      }
      
}
     void readFromFileTrips() throws FileNotFoundException{
      File f = new File("trips.txt");
      Scanner sc= new Scanner(f);
      while(sc.hasNext()){
          String tr=sc.nextLine();
          String[] info=tr.split(",");
          String pickup=info[0];
          String dropoff=info[1];
          String tpickup=info[2];
          String tdropoff=info[3];
          String vehicle=info[4];
          String ticketType=info[5];
          String stop=info[6];
          float tprice=Float.parseFloat(info[7]);
          int tnumber=Integer.parseInt(info[8]);
          String id=info[9];
          String trType=info[10];
          Trips trip=new Trips();
          trip.setPickup(pickup);
          trip.setDropoff(dropoff);
          trip.setTpickup(tpickup);
          trip.setTdropoff(tdropoff);
          trip.setVehicle(vehicle);
          trip.setTicketprice(tprice);
          trip.setTnumber(tnumber);
          trip.setStop(stop);
          trip.setTicketType(ticketType);
          trip.setID(id);
          trip.setTripType(trType);
          t.add(trip);
      }
     
}
      ArrayList<Client> c =new ArrayList<Client>();
     void readFromFileClient() throws FileNotFoundException{
     c.clear();
         File f = new File("client.txt");
      Scanner sc= new Scanner(f);
      while(sc.hasNext()){
          String client=sc.nextLine();
          String[] info=client.split(",");
          String username=info[0];
          String password=info[1];
          String no=info[2];
          int noOfTrips=Integer.parseInt(info[3]);
          ArrayList<String> id =new ArrayList<String>();
          if (noOfTrips>0){
            int x=4;
            while(x<=(3+ noOfTrips)){
                id.add(info[x]);
                    x++;
                   
            }
         
          
         }  
          
          Client person =new Client();
          person.setUsername(username);
          person.setPassword(password);
          person.setPhonenumber(no);
          person.setNoOfTrips(noOfTrips);
          person.setID(id);
           c.add(person);   
      
      }     
      
}
     ArrayList<Driver> d =new ArrayList<Driver>();
     void readFromFileDriver() throws FileNotFoundException{
      File f = new File("driver.txt");
      Scanner sc= new Scanner(f);
      while(sc.hasNext()){
          String driver=sc.nextLine();
          String[] info=driver.split(",");
          String username=info[0];
          String password=info[1];
          String no=info[2];
          int noOfTrips=Integer.parseInt(info[3]);
          ArrayList<String> TripsId=new ArrayList<String>();
          if (noOfTrips>0){
            int x=4;
            while(x<=(3+ noOfTrips)){
                TripsId.add(info[x]);
                    x++;
            } 
          }
            
          Driver driv=new Driver();
          driv.setUsername(username);
          driv.setPassword(password);
          driv.setPhonenumber(no);
          driv.setNoOfTrips(noOfTrips);
          driv.setID(TripsId);
           d.add(driv);
       
      }
      }
}