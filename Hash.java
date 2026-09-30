import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        // 1. Create a HashSet (Best practice uses the Set interface reference)
        Set<String> brands = new HashSet<>();

        // 2. Add elements using add()
        brands.add("Apple");
        brands.add("Samsung");
        brands.add("Google");

        // Adding a duplicate item (This will be ignored)
        brands.add("Apple");

        // 3. Check if an item exists using contains()
        if (brands.contains("Google")) {
            System.out.println("Google is in the set.");
        }

        // 4. Check the size of the set
        System.out.println("Total elements: " + brands.size());

        // 5. Remove an element using remove()
        brands.remove("Samsung");

        // 6. Iterate through the set using an enhanced for-loop
        System.out.println("Remaining items in the set:");
        for (String brand : brands) {
            System.out.println(brand);
        }

        // 7. Clear all items
        brands.clear();
        System.out.println("Is the set empty? " + brands.isEmpty());
    }
}
