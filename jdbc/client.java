import java.net.*;
import java.util.*;
import java.io.*;
public class client {
    public static void main(String[] args)
    {
   int port = 5555;
   String host = "127.0.0.1";
   try{
   System.out.println("Requesting..........");
    Socket s = new Socket(host, port);
System.out.println("Connection built successfully.");
DataInputStream dis = new DataInputStream(s.getInputStream());
DataOutputStream dous = new DataOutputStream(s.getOutputStream());
Scanner br = new Scanner(System.in);
String ServerMsg= "", ClientMsg="";
while(!ServerMsg.equals("stop"))
{
     System.out.println("Your Message:");
    ClientMsg = br.nextLine();
dous.writeUTF(ClientMsg);
dous.flush();
        ServerMsg= dis.readUTF();
    System.out.println("ServerMsg:" +ServerMsg);
}
br.close();
dis.close();
dous.close();
s.close();
    }
    catch(Exception e){
        System.out.println(e);
    }

   }
    }

