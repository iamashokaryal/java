import java.io.*;
import java.net.*;
public class urlconnectionpractice {
    public static void main(String[] args)
    {
        try{
            
            URL u = new URL("https://www.facebook.com");
            URLConnection conn = u.openConnection();
            InputStream s = conn.getInputStream();
            int i;

            while((i=s.read())!=-1){
                System.out.println((char)i);

            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
