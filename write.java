package readandwrite;
import java.io.FileWriter;
import java.io.BufferedWriter;


public class write {
	public static void main(String[] args) {
		
		
		try{
			FileWriter fw=new FileWriter("input.txt");
			//fw.append("helooooo");
			//fw.write("hi this is vishnu overrwriting");
			//fw.close();
			//System.out.println("sucess");
			BufferedWriter bw=new BufferedWriter(fw);
			bw.write("iam vishnu");
			bw.newLine();
			bw.write("he is my friend");
			bw.close();
			System.out.println("succk");
		
		}
		catch(Exception e) {
			
		}
		
	}

}
