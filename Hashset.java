import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        // 1. Create a HashSet of Strings
        Set<String> fruitSet = new HashSet<>();

        // 2. Add elements using add()
        fruitSet.add("Apple");
        fruitSet.add("Banana");
        fruitSet.add("Orange");

        // 3. Try to add a duplicate element (will be ignored)
        boolean isAdded = fruitSet.add("Apple"); 
        System.out.println("Was second 'Apple' added? " + isAdded); // Outputs: false

        // 4. Check if an item exists using contains()
        if (fruitSet.contains("Banana")) {
            System.out.println("Banana is in the set.");
        }

        // 5. Check the size of the set
        System.out.println("Total elements: " + fruitSet.size());

        // 6. Iterate over the elements (Note: Order is not guaranteed)
        System.out.println("\nIterating through HashSet:");
        for (String fruit : fruitSet) {
            System.out.println("- " + fruit);
        }

        // 7. Remove an element using remove()
        fruitSet.remove("Orange");
        System.out.println("\nAfter removing Orange: " + fruitSet);

        // 8. Clear all elements
        fruitSet.clear();
        System.out.println("Is the set empty now? " + fruitSet.isEmpty());
    }
}
