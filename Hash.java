import java.util.Hashtable;
import java.util.Map;

public class BuiltInHashtableExample {
    public static void main(String[] args) {
        // 1. Initialize a Hashtable with Integer keys and String values
        Hashtable<Integer, String> employeeTable = new Hashtable<>();

        // 2. Add elements using put()
        employeeTable.put(101, "Alice");
        employeeTable.put(102, "Bob");
        employeeTable.put(103, "Charlie");

        // Note: Attempting to insert null key or value throws NullPointerException
        // employeeTable.put(null, "Error"); 

        // 3. Retrieve an element using get()
        String employeeName = employeeTable.get(102);
        System.out.println("Employee with ID 102: " + employeeName);

        // 4. Update an element by reusing the same key
        employeeTable.put(101, "Alice Smith");

        // 5. Remove an element using remove()
        employeeTable.remove(103);

        // 6. Iterate through the Hashtable using entrySet()
        System.out.println("\n--- Current Employee Directory ---");
        for (Map.Entry<Integer, String> entry : employeeTable.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }
    }
}
