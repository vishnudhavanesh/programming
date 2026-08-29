package readandwrite;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class read {

	public static void main(String[] args) {
		try {
			FileReader fr=new FileReader("outputt.txt");
			int c =fr.read();
			while(c != -1) {
				System.out.println((char)c);
				c=fr.read();
			}
			fr.close();
			
			
		}
		catch(Exception e) {

	}
	}

}
