package inheritance;

interface Payment {

    void makepay(double amount);

    void refund(double amount);
}

class UpiPayment implements Payment {

    public void makepay(double amount) {
        System.out.println(amount + " paid through UPI");
    }

    public void refund(double amount) {
        if (amount > 1000) {
            System.out.println("10 rupee refund");
        }
    }
}

class Credit implements Payment {

    public void makepay(double amount) {
        System.out.println(amount + " paid through Credit Card");
    }

    public void refund(double amount) {
        if (amount > 1000) {
            System.out.println("100 rupee refund");
        }
    }
}

public class payment {

    public static void main(String[] args) {

        Credit obj1 = new Credit();
        obj1.makepay(10000);
        obj1.refund(10000);

        UpiPayment obj2 = new UpiPayment();
        obj2.makepay(5000);
        obj2.refund(5000);
    }
}

