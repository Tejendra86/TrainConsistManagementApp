import java.util.*;

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

public class TrainConsistManagementuc7 {
    public static void main(String[] args) {

        // Step 1: Create List
        List<Bogie> bogieList = new ArrayList<>();

        // Step 2: Add passenger bogies
        bogieList.add(new Bogie("Sleeper", 72));
        bogieList.add(new Bogie("AC Chair", 56));
        bogieList.add(new Bogie("First Class", 24));

        // Step 3: Sort using Comparator (ascending order)
        bogieList.sort(Comparator.comparingInt(b -> b.capacity));

        // Step 4: Display sorted bogies
        System.out.println("Bogies Sorted by Capacity (Ascending):");
        for (Bogie b : bogieList) {
            b.display();
        }

        // Optional: Descending order
        bogieList.sort((b1, b2) -> b2.capacity - b1.capacity);

        System.out.println("\nBogies Sorted by Capacity (Descending):");
        for (Bogie b : bogieList) {
            b.display();
        }
    }
}