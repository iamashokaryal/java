import java.net.*;
import java.util.*;
import java.io.*;
public class sqclient {
    public static void main(String[] args) {
int port = 5555;
String host = "127.0.0.1";

try{
System.out.println("Requesting.......");
    Socket s = new Socket(host,port);
    System.out.println("connected Successfully with server.");
    DataInputStream din = new DataInputStream(s.getInputStream());
        
    DataOutputStream dout = new DataOutputStream(s.getOutputStream());
Scanner br = new Scanner(System.in);
int num;
System.out.println("Enter the number:");
num = br.nextInt();
dout.writeInt(num);

int result = din.readInt();
System.out.println("The squre number is:" + result);

dout.close();
din.close();

s.close();
}
catch(Exception e){
    System.out.println(e);

}

}
}
