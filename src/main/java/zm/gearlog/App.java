// Member 5: FAITH SAMUKONGA - Main Application // 2410278
package zm.gearlog;

import zm.gearlog.model.*;
import java.util.*;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Gear> inventory = new ArrayList<>();
        
        // Sample data
        inventory.add(new Tent("4-Person Tent", "TENT-001", 30.0, 2));
        inventory.add(new Tent("2-Person Tent", "TENT-002", 20.0, 1));
        
        System.out.println("=== GearLog - Camping Gear Rental ===");
        for (Gear g : inventory) {
            System.out.println(g.getName() + " - K" + g.calculateRentalCost() + " for " + g.getRentalDays() + " days");
        }
        
        System.out.println("\nSystem ready!");
        sc.close();
    }
}
