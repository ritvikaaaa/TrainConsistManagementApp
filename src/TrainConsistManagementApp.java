import java.util.LinkedList;

public class TrainConsistManagementApp {

    public static void main(String[] args) {
        // -------------------------
        // UC4: Maintain Ordered Bogie IDs with LinkedList
        // -------------------------
        LinkedList<String> trainConsist = new LinkedList<>();

        // Add bogies in order
        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");

        // Display initial consist
        System.out.println("Initial Train Consist:");
        for (String bogie : trainConsist) {
            System.out.println(bogie);
        }

        // Insert Pantry Car at position 2 (0-based index)
        trainConsist.add(2, "Pantry Car");

        System.out.println("\nAfter inserting Pantry Car at position 2:");
        for (String bogie : trainConsist) {
            System.out.println(bogie);
        }

        // Remove first and last bogie
        trainConsist.removeFirst(); // Engine
        trainConsist.removeLast();  // Guard

        // Display final consist
        System.out.println("\nFinal Train Consist after removing first and last bogies:");
        for (String bogie : trainConsist) {
            System.out.println(bogie);
        }
    }
}