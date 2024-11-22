
import java.net.*;
import java.io.*;
import java.util.*;
public class ThirdClientExample {
public static void main(String[] args) {
String host = "127.0.0.1";
int PORT = 5555;
try {
System.out.println("Requesting ........");
Socket thirdSocket = new Socket(host,PORT);
System.out.println("Server Connected......");
DataOutputStream douts = new DataOutputStream(thirdSocket.getOutputStream());
DataInputStream dins = new DataInputStream(thirdSocket.getInputStream());
Scanner br = new Scanner(System.in);
String request_server="",receive_server="";
while(!request_server.equals("stop")){
request_server = br.nextLine();
douts.writeUTF(request_server);
douts.flush();
receive_server = dins.readUTF();
System.out.println("From server:"+receive_server);
}
br.close();
dins.close();
douts.close();
thirdSocket.close();
} catch (Exception e) {
System.out.println(e);
}
}
}