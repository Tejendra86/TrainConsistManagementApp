import java.util.*;
import java.util.stream.Collectors;

class Bogie {
    String name;
    int capacity;

    // Constructor
    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    // Display method
    void display() {
        System.out.println(name + " -> Capacity: " + capacity);
    }
}

public class TrainConsistManagement {
    public static void main(String[] args) {

        // Step 1: Reuse UC7 List
        List<Bogie> bogieList = new ArrayList<>();
        bogieList.add(new Bogie("Sleeper", 72));
        bogieList.add(new Bogie("AC Chair", 56));
        bogieList.add(new Bogie("First Class", 24));

        // Step 2: Apply Stream Filter (capacity > 60)
        List<Bogie> filteredBogies = bogieList.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());

        // Step 3: Display filtered bogies
        System.out.println("Filtered Bogies (Capacity > 60):");
        for (Bogie b : filteredBogies) {
            b.display();
        }

        // Step 4: Show original list (unchanged)
        System.out.println("\nOriginal Bogie List:");
        for (Bogie b : bogieList) {
            b.display();
        }
    }
}