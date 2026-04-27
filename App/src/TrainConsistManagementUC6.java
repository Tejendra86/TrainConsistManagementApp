import java.util.HashMap;
import java.util.Map;

public class TrainConsistManagementAppUC6 {

    public static void main(String[] args) {

        // Step 1: Create a HashMap to store bogie-capacity mapping
        HashMap<String, Integer> bogieCapacityMap = new HashMap<>();

        // Step 2: Insert bogie names with their capacities
        bogieCapacityMap.put("Sleeper", 72);
        bogieCapacityMap.put("AC Chair", 60);
        bogieCapacityMap.put("First Class", 24);
        bogieCapacityMap.put("Goods Rectangular", 100);
        bogieCapacityMap.put("Goods Cylindrical", 80);

        // Step 3: Display the bogie-capacity mapping
        System.out.println("=== Train Consist: Bogie Capacity Details ===");

        // Step 4: Iterate using entrySet()
        for (Map.Entry<String, Integer> entry : bogieCapacityMap.entrySet()) {
            String bogieName = entry.getKey();
            Integer capacity = entry.getValue();

            System.out.println("Bogie: " + bogieName + " | Capacity: " + capacity);
        }

        // Step 5: Program continues
        System.out.println("\nMapping completed successfully.");
    }
}