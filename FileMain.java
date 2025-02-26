import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f=null;
		FileWriter fw=null;
		FileReader fr=null;
		BufferedReader br=null;
		BufferedWriter bw=null;
		Scanner scan=new Scanner(System.in);
		try {
			f=new File("E:\\FileManipulation\\data.txt");
			
			//file writer
			fw=new FileWriter(f,true);//add to the existig txt file
			//fw=new FileWriter(f);// it overwrite the file
			bw=new BufferedWriter(fw);
			while(scan.hasNext())
			{
				String s= scan.nextLine();
				if(s.equalsIgnoreCase("exit"))
					break;
				bw.write(s);
				bw.newLine();
				bw.flush();
			}
			System.out.println("Exited");
			
			//file reader
			fr=new FileReader(f);
			br=new BufferedReader(fr);
			String data=br.readLine();
			while(data!=null)
			{
				System.out.println(data);
				data=br.readLine();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			scan.close();
		}
	}

}
