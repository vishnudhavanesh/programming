package inheritance;

abstract class Shap{

    double length;
    double breadth;
    double radius;

    Shap(double length, double breadth, double radius) {
        this.length = length;
        this.breadth = breadth;
        this.radius = radius;
    }

    abstract void display();
}

class Circle extends Shap {

    Circle() {
        super(0, 0, 2.9);
    }

    @Override
    void display() {
        double result = 3.14 * radius * radius;
        System.out.println("Circle Area: " + result);
    }
}

class Rectangle extends Shap {

    Rectangle() {
        super(2, 20, 0);
    }

    @Override
    void display() {
        double result = length * breadth;
        System.out.println("Rectangle Area: " + result);
    }
}

public class shape {

    public static void main(String[] args) {

        Circle obj1 = new Circle();
        obj1.display();

        Rectangle obj2 = new Rectangle();
        obj2.display();
    }
}
