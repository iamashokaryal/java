import java.net.*;
import java.io.*;
public class sqserver {
    public static void main(String[] args)
    {

        int port = 5555;
        try{

            ServerSocket ss = new ServerSocket(port);
            Socket s = ss.accept();
            System.out.println("Client Connect to this server successfully.");

            DataInputStream din = new DataInputStream(s.getInputStream());
        
           DataOutputStream dout = new DataOutputStream(s.getOutputStream());
int num = din.readInt();

int result = num* num;

dout.writeInt(result);
dout.close();
din.close();
ss.close();
s.close();

        }
        catch(Exception e){
            System.out.println(e);
        
        }
    }
}
