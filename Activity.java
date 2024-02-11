package TravelAgencyMgmt;
import java.util.*;
public class Activity {
    int Activity_ID;
    String Act_Name;
    String description;
    double Act_Cost;
    int Act_Capacity;
    ArrayList<String> signUpPass = new ArrayList<>();

    public void signPassengerUp(String passengerName) {
        if (signUpPass.size() < Act_Capacity) {
            signUpPass.add(passengerName);
            System.out.println("Passenger '" + passengerName + "' signed up for activity '" + Act_Name);
        } else {
            System.out.println("Activity is full , Cannot sign up additional passengers");
        }
    }

    public double getAvailableSpaces() {
        return Act_Cost - signUpPass.size();
    }

    public void printDetails() {
        System.out.println("Activity Details for '" + Act_Name + "':");
        System.out.println("Activity ID: " + Activity_ID);
        System.out.println("Description: " + description);
        System.out.println("Cost: $" + Act_Cost);
        System.out.println("Capacity: " + Act_Capacity);
        System.out.println("Available Spaces: " + getAvailableSpaces());
        System.out.println("Signed Up Passengers:");
        for (String passenger : signUpPass) {
            System.out.println("- " + passenger);
        }
    }
}
