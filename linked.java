// 1. Define what a single Node looks like
class Node {
    int data;     // Stores the value
    Node next;    // Points to the next node in the chain (null if last)

    // Constructor to create a new node
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// 2. Define the Linked List management class
class CustomLinkedList {
    Node head; // The very first node in the list

    // Method to add a node to the end of the list
    public void insert(int data) {
        Node newNode = new Node(data);

        // If the list is empty, make the new node the head
        if (head == null) {
            head = newNode;
            return;
        }

        // Otherwise, traverse to the end of the list
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }

        // Link the last node to our new node
        current.next = newNode;
    }

    // Method to print out all the values in the list
    public void display() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next; // Move to the next node
        }
        System.out.println("null");
    }
}

// 3. Execution Driver Code
public class Main {
    public static void main(String[] args) {
        CustomLinkedList list = new CustomLinkedList();

        // Insert elements
        list.insert(10);
        list.insert(20);
        list.insert(30);

        // Display elements: Output will be 10 -> 20 -> 30 -> null
        list.display();
    }
}
