import java.net.*;
import java.util.*;
import java.io.*;
public class server {
    public static void main(String[] args)
    {
   int port = 5555;
try{
   ServerSocket ss = new ServerSocket(port);
   System.out.println("Server is connected at port :" +port);
Socket s = ss.accept();
System.out.println("Client Coneected Successfully.");
DataInputStream dis = new DataInputStream(s.getInputStream());
DataOutputStream dous = new DataOutputStream(s.getOutputStream());
Scanner br = new Scanner(System.in);
String ClientMsg="", ServerMsg= "";
while(!ClientMsg.equals("stop")){
ClientMsg = dis.readUTF();
System.out.println("From Client :" + ClientMsg);
System.out.println("Send Reply:");
ServerMsg = br.nextLine();
dous.writeUTF(ServerMsg);
dous.flush();



}
br.close();
dis.close();
dous.close();
ss.close();
s.close();

    }
    catch(Exception e){
        System.out.println(e);
    }
}
}
