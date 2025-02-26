
import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodClass method=new MethodClass();
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a String:");
		String string=scan.nextLine();
		String str=method.capitalizeFirstLetter(string);
		System.out.println(str);
		scan.close();
	}
}
