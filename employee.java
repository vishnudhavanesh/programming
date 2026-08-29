package inheritance;

public class employee {

    String name;
    int id;
    int salary;

    employee(String name, int id, int salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    void display() {
        System.out.println("name"+":"+name);
        System.out.println("id"+":"+id);
        System.out.println("salaary"+":"+salary);
    }

    static class manager extends employee {

        manager() {
            super("vish", 101, 200000);
        }
    }
    static class developer extends employee{
    	developer(){
    		super("vishali",102,200000);
    	}
    }

    public static void main(String[] args) {

        manager obj1 = new manager();

        obj1.display();
        developer obj2 = new developer();

        obj2.display();

    }
}
