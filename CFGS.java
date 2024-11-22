// Import the File clas
// Import this class for handling errors
import java.io.FileReader;
import java.io.FileWriter;
import java.io.*;
// Import the Scanner class to read content from text files

class GFGS {
	public static void main(String[] args)
	{
		try {
FileReader fr = new FileReader("myfile.txt");
FileWriter fw = new FileWriter("abc.txt");
BufferedReader br = new BufferedReader(fr);


String str;
while ((str=br.readLine())!=null)
	{
	fw.write(str);
}

fw.close();
fr.close();
System.out.println("Copied Successfully");


		}catch(Exception e)
		{
System.out.println(e);
		}
	}
}
