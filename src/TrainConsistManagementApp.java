import java.util.HashMap;
import java.util.Map;

public class TrainConsistManagementApp {

    public static void main(String[] args) {
        // -------------------------
        // UC6: Map Bogie to Capacity using HashMap
        // -------------------------
        HashMap<String, Integer> bogieCapacity = new HashMap<>();

        // Insert bogie capacities
        bogieCapacity.put("Sleeper", 72);      // 72 seats
        bogieCapacity.put("AC Chair", 120);   // 120 seats
        bogieCapacity.put("First Class", 54); // 54 seats

        // Display bogie capacities
        System.out.println("Bogie Capacities:");
        for (Map.Entry<String, Integer> entry : bogieCapacity.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue() + " seats");
        }

        // Optional: lookup capacity of a specific bogie
        String bogieToCheck = "AC Chair";
        if (bogieCapacity.containsKey(bogieToCheck)) {
            System.out.println("\nCapacity of " + bogieToCheck + " bogie is " +
                    bogieCapacity.get(bogieToCheck) + " seats.");
        }
    }
}