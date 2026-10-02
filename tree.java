// 1. Define the Node structure
class Node {
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

// 2. Define the Binary Search Tree class
class BinaryTree {
    Node root;

    public BinaryTree() {
        this.root = null;
    }

    // Method to insert a new value
    public void insert(int data) {
        root = insertRecursive(root, data);
    }

    // Helper method to recursively find the right spot to insert
    private Node insertRecursive(Node current, int data) {
        // If the current spot is empty, create the node here
        if (current == null) {
            return new Node(data);
        }

        // If the data is smaller, move down the left subtree
        if (data < current.data) {
            current.left = insertRecursive(current.left, data);
        } 
        // If the data is larger, move down the right subtree
        else if (data > current.data) {
            current.right = insertRecursive(current.right, data);
        }

        return current;
    }

    // Method to perform In-Order Traversal (Left, Root, Right)
    public void inOrder() {
        inOrderRecursive(root);
        System.out.println();
    }

    private void inOrderRecursive(Node current) {
        if (current != null) {
            inOrderRecursive(current.left);       // Go Left
            System.out.print(current.data + " "); // Print Root
            inOrderRecursive(current.right);      // Go Right
        }
    }
}

// 3. Main Class to run the code
public class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        /* Let's build this tree structure:
                 50
               /    \
              30     70
             /  \   /  \
            20  40 60  80
        */
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        System.out.println("In-order traversal (Elements sorted):");
        tree.inOrder(); 
        // Output will be: 20 30 40 50 60 70 80
    }
}
