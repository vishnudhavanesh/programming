package inheritance;

abstract class vechile{
	int number;
	String brand;
	int amount;
	
	vechile(int number,String brand,int amount){
		this.number=number;
		this.brand=brand;
		this.amount=amount;
		
	}
	abstract void calrent();
	
	
}
class car extends vechile{
	car(){
		super(101,"bmw",2000);
	}
	
void calrent(){
	int days=3;
	int rent=days*amount;
	System.out.println(rent);
}
	
	
}
class bike extends vechile{
	bike(){
		super(103,"bmw",200);
	}

void calrent(){
	int days=100;
	int rent=days*amount;
	System.out.println(rent);
}
}


public class rent {

	public static void main(String[] args) {
		bike obj1=new bike();
		obj1.calrent();
		car obj2=new car();
		obj2.calrent();

	}

}
