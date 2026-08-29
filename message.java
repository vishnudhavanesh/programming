package inheritance;

interface notification{
	void sendnotify();
}

class email implements notification{
	public void sendnotify() {
		System.out.println("ït was email");
	}
}
class sms implements notification{
	public void sendnotify() {
		System.out.println("ït was sms");
	}
}
class push implements notification{
	public void sendnotify() {
		System.out.println("ït was push");
	}
}




public class message {
	public static void main(String[] args) {
		sms obj1=new sms();
		obj1.sendnotify();
		email obj2=new email();
		obj2.sendnotify();
		push obj3=new push();
		obj3.sendnotify();

	
	}

}
