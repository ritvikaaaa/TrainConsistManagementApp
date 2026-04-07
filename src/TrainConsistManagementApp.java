import java.util.LinkedHashSet;

public class TrainConsistManagementApp {

    public static void main(String[] args) {
        // -------------------------
        // UC5: Preserve insertion order of bogies using LinkedHashSet
        // -------------------------
        LinkedHashSet<String> trainFormation = new LinkedHashSet<>();

        // Attach bogies
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        // Attempt to attach duplicate bogie
        trainFormation.add("Sleeper"); // duplicate, will be ignored

        // Display the final train formation
        System.out.println("Final Train Formation (Insertion Order Preserved, Duplicates Ignored):");
        for (String bogie : trainFormation) {
            System.out.println(bogie);
        }
    }
}