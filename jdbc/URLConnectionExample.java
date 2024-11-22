// Java Program to demonstrate URLConnection class

// Importing input output classes
import java.io.*;
// Importing java.net package
// consisting of all network classes
import java.net.*;

// Main class
// URLConnectionExample
public class URLConnectionExample {

	// Main driver method
	public static void main(String[] args) 
	{
		// Try block to check for exceptions
		try {

			// Creating an object of URL class

			// Custom input URL is passed as an argument
			URL u = new URL("aryalashok.com.np");

			// Creating an object of URLConnection class to
			// communicate between application and URL
			URLConnection urlconnect = u.openConnection();

			// Creating an object of InputStream class
			// for our application streams to be read
			InputStream stream = urlconnect.getInputStream();

			// Declaring an integer variable
			int i;

			// Till the time URL is being read
			while ((i = stream.read()) != -1) {

				// Continue printing the stream
				System.out.print((char)i);
			}
		}

		// Catch block to handle the exception
		catch (Exception e) {

			// Print the exception on the console
			System.out.println(e);
		}
	}
}
