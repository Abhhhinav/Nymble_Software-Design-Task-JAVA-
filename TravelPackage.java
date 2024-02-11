package TravelAgencyMgmt;
import java.util.*;
public class TravelPackage {

     int Travel_id;
     String Package_name;
     int Passenger_Capacity;
     String List_Destination;
     ArrayList<String> itinerary = new ArrayList<>();
     ArrayList<String> passengerList = new ArrayList<>();

    public void addDestination() { //adding destination to itinerary
        Scanner sc = new Scanner(System.in);
        System.out.println("Travel Package name : "+Package_name );
        System.out.println("Add the Destiantion");
        String destination  = sc.nextLine();
        itinerary.add(destination);
        sc.close();
    }

    public String findDestination(String destinationName) { //dummy function just to find name
        for (String destination : itinerary) {
            if (destination.equals(destinationName)) {
                return destination;
            }
        }
        return null;
    }
    public boolean removeDestination(String destinationToRemove) { //delete destination
        return itinerary.remove(destinationToRemove);
    }

    public ArrayList<String> getPassengerList() {
        System.out.println("Passenger_Capacity"+ passengerList.size());//total number
        return new ArrayList<>(passengerList);
    }
}