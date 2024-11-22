import javax.swing.*;
import java.awt.*;
import java.applet.*;
class barchart extends Applet{
int n =3;
String[] label;
int[] value;

 public void init()
 {
	 setBackground(Color.pink);

     try{

        label = new String[]{"Java","C","C++"};
        value = new int[]{40,50,60};

     }
     catch(Exception e)
     {
        e.printStackTrace();

     }
    }
     public void paint(Graphics g)
     {
        for(int i =0; i<this.n; i++)
        {
            g.setColor(Color.black);
            g.drawString(label[i], 20, i*50+30);
             g.setColor(Color.red);
             g.fillRect(50, i*50+10, value[i], 40);
        }
     }
	
}

/*
<applet code = "barchart.class" width="600" height = "600">
</applet>
 */