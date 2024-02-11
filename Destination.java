package TravelAgencyMgmt;
import java.util.*;
public class Destination {
    int destID;
    String destName;
    ArrayList<String> activityList = new ArrayList<>();

    public void addActivity(String activity) {
        activityList.add(activity);
        System.out.println("Activity which is added is : " + activity );
    }

    public void removeActivity(String Remove) {
        if (activityList.remove(Remove)) {
            System.out.println("Activity removed from " + Remove + "destination '" + destName + "'.");
        } else {
            System.out.println("Activity not found");
        }
    }

    public void printActivityList() {
        System.out.println("Activities are " + destName + ":");
        for (String activity : activityList) {
            System.out.println(activity);
        }
    }
}
