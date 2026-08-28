package programming;
import java.util.Scanner;

public class main {

    int add(int a, int b) {
        return a - b; // or a + b depending on intent
    }

    int sub(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();

        // Create an instance of the class
        main obj = new main();

        // Call the methods and print results
        int sumResult = obj.add(a, b);
        int subResult = obj.sub(a, b);

        System.out.println("Addition: " + sumResult);
        System.out.println("Subtraction: " + subResult);

        scan.close();
    }
}
