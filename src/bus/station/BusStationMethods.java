/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bus.station;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author Raghda
 */
public class BusStationMethods implements Imethods{

    Load l;

    public Load getL() {
        return l;
    }

    public void setL(Load l) {
        this.l = l;
    }
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;

    }

    public boolean searchDrivers(String username, String password) throws FileNotFoundException {
        boolean flag = false;
    //l.readFromFileDriver();
        for (int i = 0; i < l.d.size(); i++) {
            if (l.d.get(i).getUsername().equals(username)) {
                if (l.d.get(i).getPassword().equals(password)) {
                    flag = true;
                    x = i;
                    break;
                }
            }
        }
        return flag;
    }

    public boolean searchManagers(String username, String password) throws FileNotFoundException {
        boolean flag = false;
   // l.readFromFileManagers();
        for (int i = 0; i < l.m.size(); i++) {
            if (l.m.get(i).getUsername().equalsIgnoreCase(username)) {
                if (l.m.get(i).getPassword().equalsIgnoreCase(password)) {
                    flag = true;
                    x = i;
                    break;
                }
            }
        }
        return flag;
    }

    public boolean searchClients(String username, String password) throws FileNotFoundException {
        boolean flag = false;
    //l.readFromFileClient();
        for (int i = 0; i < l.c.size(); i++) {
            if (l.c.get(i).getUsername().equals(username)) {
                if (l.c.get(i).getPassword().equals(password)) {
                    flag = true;
                    x = i;
                    break;
                }
            }
        }
        return flag;
    }

    public ArrayList<Trips> showTrips(ArrayList<String> ID) throws FileNotFoundException {
//l.readFromFileTrips();
//int z=0;
        ArrayList<Trips> tr = new ArrayList<Trips>();
//tr=null;
        for (int i = 0; i < ID.size(); i++) {
    //System.out.println(ID.get(i));
            // System.out.println(l.t.size());
            for (int j = 0; j < l.t.size(); j++) {//System.out.println("henaa");
                //System.out.println(l.t.get(j).getID());
                if (l.t.get(j).getID().equals(ID.get(i))) {
                    tr.add(l.t.get(j));
           // System.out.println(tr.get(0).getPickup());
                    //z++;
                    break;
                }

            }

        }
        return tr;
    }
    
    public void saveClients(ArrayList<Client> newarray)
            throws IOException {
        FileWriter fileWriter = new FileWriter("client.txt");
        PrintWriter printWriter = new PrintWriter(fileWriter);
        for (int i = 0; i < newarray.size(); i++) {
            printWriter.print(newarray.get(i).getUsername());
            printWriter.print(",");
            printWriter.print(newarray.get(i).getPassword());
            printWriter.print(",");
            printWriter.print(newarray.get(i).getPhonenumber());
            printWriter.print(",");
            printWriter.print(newarray.get(i).getNoOfTrips());
            if (newarray.get(i).getNoOfTrips() > 0) {
                int j = 0;
                printWriter.print(",");
                while (j < newarray.get(i).getNoOfTrips()) {
                    //l.readFromFileClient();
                    printWriter.print(newarray.get(i).getID().get(j));
                    if (j != newarray.get(i).getNoOfTrips() - 1) {
                        printWriter.print(",");
                    }

                    j++;
                }

            }
            printWriter.println();
        }
        printWriter.close();
    }

    public void saveDrivers(ArrayList<Driver> newarray)
            throws IOException {
        FileWriter fileWriter = new FileWriter("driver.txt");
        PrintWriter printWriter = new PrintWriter(fileWriter);
        for (int i = 0; i < newarray.size(); i++) {
            printWriter.print(newarray.get(i).getUsername());
            printWriter.print(",");
            printWriter.print(newarray.get(i).getPassword());
            printWriter.print(",");
            printWriter.print(newarray.get(i).getPhonenumber());
            printWriter.print(",");
            printWriter.print(newarray.get(i).getNoOfTrips());
            if (newarray.get(i).getNoOfTrips() > 0) {
                int j = 0;
                printWriter.print(",");
                while (j < newarray.get(i).getNoOfTrips()) {
                    //l.readFromFileClient();
                    printWriter.print(newarray.get(i).getID().get(j));
                    if (j != newarray.get(i).getNoOfTrips() - 1) {
                        printWriter.print(",");
                    }

                    j++;
                }

            }
            printWriter.println();
        }
        printWriter.close();
    }

    public void saveTrips(ArrayList<Trips> newarray)
            throws IOException {
        FileWriter fileWriter = new FileWriter("trips.txt");
        PrintWriter printWriter = new PrintWriter(fileWriter);
        for (int i = 0; i < newarray.size(); i++) {
            printWriter.print(newarray.get(i).getPickup());
            printWriter.print(",");
            printWriter.print(newarray.get(i).getDropoff());
            printWriter.print(",");
            printWriter.print(newarray.get(i).getTpickup());
            printWriter.print(",");
            printWriter.print(newarray.get(i).getTdropoff());
            printWriter.print(",");
            printWriter.print(newarray.get(i).getVehicle());
            printWriter.print(",");
            printWriter.print(newarray.get(i).getTicketType());
            printWriter.print(",");
            printWriter.print(newarray.get(i).getStop());
            printWriter.print(",");
            printWriter.print(newarray.get(i).getTicketprice());
            printWriter.print(",");
            printWriter.print(newarray.get(i).getTnumber());
            printWriter.print(",");
            printWriter.print(newarray.get(i).getID());
            printWriter.print(",");
            printWriter.print(newarray.get(i).getTripType());
            printWriter.println();
        }
        printWriter.close();
    }

    public ArrayList<Trips> cancelTrip(ArrayList<Trips> triplist, String id) {

        for (int j = 0; j < triplist.size(); j++) {

            if (triplist.get(j).getID().equals(id)) {
                triplist.remove(j);
                break;
            }
        }
        for(int i=0;i<l.c.size();i++)
        {
            for(int h=0;h<l.c.get(i).getID().size();h++)
        {
            if(l.c.get(i).getID().get(h).equals(id)){
                l.c.get(i).getID().remove(h);
                int  z=l.c.get(i).getNoOfTrips();
                      l.c.get(i).setNoOfTrips(z-1);
                      
                  }
            
            
             }
        
        
        }
        for(int i=0;i<l.d.size();i++)
        {for(int h=0;h<l.d.get(i).getID().size();h++)
        {if(l.d.get(i).getID().get(h).equals(id)){
            l.d.get(i).getID().remove(h);
      int  z=l.d.get(i).getNoOfTrips();
        l.d.get(i).setNoOfTrips(z-1);
        
        
        
        }
            
            
        }
        
        
        }
        
        return triplist;
    }

    public void addTrip(Trips newtrip) {
        Trips tr = new Trips();
        tr.setPickup(newtrip.getPickup());
        tr.setDropoff(newtrip.getDropoff());
        tr.setTpickup(newtrip.getTpickup());
        tr.setTdropoff(newtrip.getTdropoff());
        tr.setVehicle(newtrip.getVehicle());
        tr.setTicketType(newtrip.getTicketType());
        tr.setStop(newtrip.getStop());
        tr.setTicketprice(newtrip.getTicketprice());
        tr.setTnumber(newtrip.getTnumber());
        tr.setID(newtrip.getID());
        tr.setTripType(newtrip.getTripType());
        l.t.add(tr);

    }

    public ArrayList<Trips> searchTrips(String type, String pickup) {
        ArrayList<Trips> tr = new ArrayList<Trips>();

        for (int i = 0; i < l.t.size(); i++) {
            if (l.t.get(i).getTripType().equals(type)) {
                if (l.t.get(i).getPickup().equals(pickup)) {
                    tr.add(l.t.get(i));
                }

            }
        }
        return tr;
    }

    public int assignTrip(String name, String Id) {
        int z = 0;
        for (int j = 0; j < l.t.size(); j++) {
            if (l.t.get(j).getID().equals(Id)) {
                for (int i = 0; i < l.d.size(); i++) {
                    if (l.d.get(i).getUsername().equals(name)) {
                        l.d.get(i).getID().add(Id);
                        int x = l.d.get(i).getNoOfTrips();
                        l.d.get(i).setNoOfTrips(x + 1);
                        z = 1;
                    }

                }
            }
        }
        return z;
    }

    public float reserveTrip(int i, String Id) {
        float price = 0;
        for (int j = 0; j < l.t.size(); j++) {
            if (l.t.get(j).getID().equals(Id)) {
                if (l.t.get(j).getTnumber() > 0) {
                    int y = l.t.get(j).getTnumber();
                    l.t.get(j).setTnumber(y - 1);
                    l.c.get(x).getID().add(Id);
                    int z = l.c.get(x).getNoOfTrips();
                    l.c.get(x).setNoOfTrips(z + 1);
                    price = l.t.get(j).getTicketprice();
                    break;
                }
            }
        }
        return price;
    }

    public int cancelTripClient(int i, String Id) {
        int z = 0;
        for (int j = 0; j < l.c.get(i).getID().size(); j++) {
            System.out.println(l.c.get(i).getNoOfTrips());
            if (l.c.get(i).getID().get(j).equals(Id)) {
                l.c.get(i).getID().remove(j);
                int x = l.c.get(i).getNoOfTrips();
                l.c.get(i).setNoOfTrips(x - 1);
                //System.out.println(l.c.get(i).getNoOfTrips());
                z = 1;
                for (int y = 0; y < l.t.size(); y++) {
                    if (l.t.get(y).getID().equals(Id)) {
                        int tick = l.t.get(y).getTnumber();
                        l.t.get(y).setTnumber(tick + 1);
                        break;
                    }

                }
            }
        }

        return z;
    }
    public int editprice(String id,float price){
        int x=0;
        for(int i=0;i<l.t.size();i++){
            if(l.t.get(i).getID().equals(id)){
               if(price>0)
               {l.t.get(i).setTicketprice(price);
            
                x=1;}
            }
        
        
        
        
        }
            
    return x;
    }
   public void Signup (String username,String password,String phonenumber) 
   {       
   Client f=new Client();
   f.setUsername(username);
   f.setPassword(password);
   f.setPhonenumber(phonenumber);
   f.setNoOfTrips(0);
   l.c.add(f);
   }

  
 
}
