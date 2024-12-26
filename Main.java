import java.io.File;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		File m = new File("suraj.txt");
		// creating file
		try{
		m.createNewFile();
		}
		catch (Exception e){
		    System.out.println("Unable to print...!");
		}
		
	}
}
