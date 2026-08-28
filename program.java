package programm;

class Student {
    int rollNo;
    String name;
    int marks;

    Student(int rollNo, String name, int marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    void display() {
        System.out.println(rollNo + " " + name + " " + marks);
    }
}

class BankAccount {
    int accountNo;
    String holderName;
    double balance;

    BankAccount(int accountNo, String holderName, double balance) {
        this.accountNo = accountNo;
        this.holderName = holderName;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        if (amount <= balance)
            balance -= amount;
        else
            System.out.println("Insufficient Balance");
    }

    void display() {
        System.out.println(accountNo + " " + holderName + " " + balance);
    }
}

class Product {
    int productId;
    String productName;
    double price;

    Product(int productId, String productName, double price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }

    void display() {
        System.out.println(productId + " " + productName + " " + price);
    }
}

class Employee {
    int employeeId;
    String name;
    double basicSalary;

    Employee(int employeeId, String name, double basicSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.basicSalary = basicSalary;
    }

    void displaySalary() {
        double hra = basicSalary * 0.20;
        double da = basicSalary * 0.10;
        double gross = basicSalary + hra + da;

        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("HRA: " + hra);
        System.out.println("DA: " + da);
        System.out.println("Gross Salary: " + gross);
    }
}

public class program {

    public static void main(String[] args) {

        // Student Object Array
        Student[] students = new Student[5];

        students[0] = new Student(101, "Arun", 85);
        students[1] = new Student(102, "Bala", 92);
        students[2] = new Student(103, "Kumar", 76);
        students[3] = new Student(104, "Ravi", 95);
        students[4] = new Student(105, "Siva", 88);

        // Search
        int searchRoll = 103;

        System.out.println("SEARCH RESULT:");

        for (Student s : students) {
            if (s.rollNo == searchRoll) {
                s.display();
            }
        }

        // Descending order
        for (int i = 0; i < students.length - 1; i++) {
            for (int j = i + 1; j < students.length; j++) {

                if (students[i].marks < students[j].marks) {
                    Student temp = students[i];
                    students[i] = students[j];
                    students[j] = temp;
                }
            }
        }

        System.out.println("\nDESCENDING ORDER:");

        for (Student s : students) {
            s.display();
        }

        // Highest marks
        System.out.println("\nHIGHEST MARKS:");

        students[0].display();

        // Bank Account
        System.out.println("\nBANK ACCOUNT:");

        BankAccount account =
                new BankAccount(1001, "Arun", 5000);

        account.deposit(2000);
        account.withdraw(1000);
        account.display();

        // Product
        System.out.println("\nPRODUCT:");

        Product product =
                new Product(1, "Laptop", 55000);

        product.display();

        // Employee Salary
        System.out.println("\nEMPLOYEE SALARY:");

        Employee employee =
                new Employee(201, "Ravi", 30000);

        employee.displaySalary();
    }
}
