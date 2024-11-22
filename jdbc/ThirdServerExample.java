import java.net.*;
import java.io.*;
import java.util.*;
public class ThirdServerExample {
public static void main(String[] args) {
int PORT = 5555;
try{
ServerSocket thirdServer = new ServerSocket(PORT);
System.out.println("Server running at port "+PORT);
Socket thirdSocket = thirdServer.accept();
DataInputStream dins = new DataInputStream(thirdSocket.getInputStream());
DataOutputStream dos = new DataOutputStream(thirdSocket.getOutputStream());
Scanner br = new Scanner(System.in);
String receive_client="", send_response="";
while(!receive_client.equals("stop")){
receive_client = dins.readUTF();
System.out.println("From client:"+receive_client);
System.out.println("Send Reply:");
send_response = br.nextLine();
dos.writeUTF(send_response);
dos.flush();
}
br.close();
dos.close();
dins.close();
thirdServer.close();
}catch(Exception e){
System.out.println(e);
}
}
}