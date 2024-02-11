package TravelAgencyMgmt;
import java.util.*;
public class Passenger {
    int Passenger_ID;
    String Pass_name;
    String Pass_Number;
    double Passenger_Type;
    double balance;
    ArrayList<String> signedUpActivities = new ArrayList<>();

    public void signUpForActivity(String activityName, double activityCost) {
        if (Passenger_Type == 1) { // Standard Pass
            if (balance >= activityCost) {
                signedUpActivities.add(activityName);
                balance -= activityCost;
                System.out.println("Passenger '" + Pass_name + "' signed up for activity '" + activityName);
            } else {
                System.out.println("Insufficient funds, Cannot sign up for activity");
            }
        } else if (Passenger_Type == 2) { // Gold Passenger
            double discountedAmount = 0.1 * activityCost; 
            double discountedCost = activityCost - discountedAmount;
            if (balance >= discountedCost) {
                signedUpActivities.add(activityName);
                balance -= discountedCost;
                System.out.println("Passenger '" + Pass_name + "' signed up for activity '" + activityName);
            } else {
                System.out.println("Insufficient funds. Cannot sign up for activity");
            }
        } else if (Passenger_Type == 3) { // Premium Passenger
            signedUpActivities.add(activityName);
            System.out.println("Passenger '" + Pass_name + "' signed up for activity '" + activityName + "' for free.");
        } else {
            System.out.println("Invalid passenger type.");
        }
    }

    public double getBalance() {
        return balance;
    }

    public void printDetails() {
        System.out.println("Passenger Details for " + Pass_name + "':");
        System.out.println("Passenger ID: " + Passenger_ID);
        System.out.println("Passenger Number: " + Pass_Number);
        System.out.println("Passenger Type: $" + Passenger_Type);
        System.out.println("Balance: $" + balance);
        System.out.println("Signed Up Activities:");
        for (String activity : signedUpActivities) {
            System.out.println(activity);
        }
    }
}
