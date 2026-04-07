import java.util.ArrayList;

public class TrainConsistManagementApp {

    public static void main(String[] args) {
        // Step 1: Create an ArrayList for passenger bogies
        ArrayList<String> passengerBogies = new ArrayList<>();

        // Step 2: Add bogies
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        // Step 3: Print the list after insertion
        System.out.println("Passenger Bogies after adding:");
        for (String bogie : passengerBogies) {
            System.out.println(bogie);
        }

        // Step 4: Remove one bogie (AC Chair)
        passengerBogies.remove("AC Chair");
        System.out.println("\nPassenger Bogies after removing AC Chair:");
        for (String bogie : passengerBogies) {
            System.out.println(bogie);
        }

        // Step 5: Check if Sleeper bogie exists
        if (passengerBogies.contains("Sleeper")) {
            System.out.println("\nSleeper bogie exists in the train.");
        } else {
            System.out.println("\nSleeper bogie does NOT exist in the train.");
        }

        // Step 6: Print final list state
        System.out.println("\nFinal Passenger Bogies in train:");
        for (String bogie : passengerBogies) {
            System.out.println(bogie);
        }
    }
}