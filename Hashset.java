import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
    public static void main(String[] args) {
        // 1. Initialize a HashSet of Strings
        HashSet<String> programmingLanguages = new HashSet<>();

        // 2. Add elements using the add() method
        programmingLanguages.add("Java");
        programmingLanguages.add("Python");
        programmingLanguages.add("JavaScript");
        programmingLanguages.add("C++");

        // 3. Attempt to add a duplicate element
        // This will return 'false' and will be ignored because sets only allow unique items.
        boolean isAdded = programmingLanguages.add("Java"); 
        System.out.println("Was duplicate 'Java' added? " + isAdded); // Output: false

        // 4. Print the entire HashSet
        // Note: The output order will likely differ from the insertion order.
        System.out.println("Initial HashSet: " + programmingLanguages);

        // 5. Check if an item exists using contains()
        if (programmingLanguages.contains("Python")) {
            System.out.println("Python is in the set.");
        }

        // 6. Remove an item using remove()
        programmingLanguages.remove("C++");
        System.out.println("After removing C++: " + programmingLanguages);

        // 7. Get the total count of unique items using size()
        System.out.println("Total elements in set: " + programmingLanguages.size());

        // 8. Iterate over the HashSet using a For-Each loop
        System.out.println("\n--- Iterating using For-Each Loop ---");
        for (String language : programmingLanguages) {
            System.out.println(language);
        }

        // 9. Clear all elements from the set
        programmingLanguages.clear();
        System.out.println("Is the set empty now? " + programmingLanguages.isEmpty());
    }
}
