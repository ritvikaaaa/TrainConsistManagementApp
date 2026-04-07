import java.util.ArrayList;
import java.util.HashSet;

public class TrainConsistManagementApp {

    public static void main(String[] args) {
        // -------------------------
        // UC2: Passenger Bogies List
        // -------------------------
        ArrayList<String> passengerBogies = new ArrayList<>();

        // Add bogies
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        // Print passenger bogies after insertion
        System.out.println("Passenger Bogies after adding:");
        for (String bogie : passengerBogies) {
            System.out.println(bogie);
        }

        // Remove one bogie (AC Chair)
        passengerBogies.remove("AC Chair");
        System.out.println("\nPassenger Bogies after removing AC Chair:");
        for (String bogie : passengerBogies) {
            System.out.println(bogie);
        }

        // Check if Sleeper exists
        if (passengerBogies.contains("Sleeper")) {
            System.out.println("\nSleeper bogie exists in the train.");
        } else {
            System.out.println("\nSleeper bogie does NOT exist in the train.");
        }

        // Print final passenger bogies
        System.out.println("\nFinal Passenger Bogies in train:");
        for (String bogie : passengerBogies) {
            System.out.println(bogie);
        }

        // -------------------------
        // UC3: Unique Bogie IDs Set
        // -------------------------
        HashSet<String> bogieIDs = new HashSet<>();

        // Add bogie IDs (with duplicates intentionally)
        bogieIDs.add("BG101");
        bogieIDs.add("BG102");
        bogieIDs.add("BG103");
        bogieIDs.add("BG101"); // duplicate
        bogieIDs.add("BG102"); // duplicate

        // Print unique bogie IDs
        System.out.println("\nUnique Bogie IDs in the train:");
        for (String id : bogieIDs) {
            System.out.println(id);
        }
    }
}