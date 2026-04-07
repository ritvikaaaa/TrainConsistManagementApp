import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

// Class representing a Passenger Bogie
class Bogie {
    String name;
    int capacity;

    public Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return name + " : " + capacity + " seats";
    }
}

public class TrainConsistManagementApp {

    public static void main(String[] args) {
        // -------------------------
        // UC7: Sort Bogies by Capacity using Comparator
        // -------------------------
        List<Bogie> passengerBogies = new ArrayList<>();

        // Add bogies with capacities
        passengerBogies.add(new Bogie("Sleeper", 72));
        passengerBogies.add(new Bogie("AC Chair", 120));
        passengerBogies.add(new Bogie("First Class", 54));

        System.out.println("Passenger Bogies before sorting:");
        for (Bogie b : passengerBogies) {
            System.out.println(b);
        }

        // Sort by capacity using Comparator
        passengerBogies.sort(Comparator.comparingInt(b -> b.capacity));

        System.out.println("\nPassenger Bogies sorted by capacity:");
        for (Bogie b : passengerBogies) {
            System.out.println(b);
        }

        // Optional: Sort descending
        passengerBogies.sort(Comparator.comparingInt((Bogie b) -> b.capacity).reversed());

        System.out.println("\nPassenger Bogies sorted by capacity (descending):");
        for (Bogie b : passengerBogies) {
            System.out.println(b);
        }
    }
}