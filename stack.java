import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        // Create an empty Stack of Strings
        Stack<String> stack = new Stack<>();

        // 1. push() - Add elements to the top of the stack
        stack.push("Apple");
        stack.push("Banana");
        stack.push("Cherry");
        System.out.println("Current Stack: " + stack); // Output: [Apple, Banana, Cherry]

        // 2. peek() - Look at the top element without removing it
        String topElement = stack.peek();
        System.out.println("Top Element (peek): " + topElement); // Output: Cherry

        // 3. pop() - Remove and return the top element
        String removedElement = stack.pop();
        System.out.println("Popped Element: " + removedElement); // Output: Cherry
        System.out.println("Stack after pop: " + stack); // Output: [Apple, Banana]

        // 4. empty() - Check if the stack is empty
        boolean isEmpty = stack.empty();
        System.out.println("Is stack empty?: " + isEmpty); // Output: false

        // 5. search() - Find the 1-based position from the top
        int position = stack.search("Apple");
        System.out.println("Position of 'Apple' from top: " + position); // Output: 2
    }
}
