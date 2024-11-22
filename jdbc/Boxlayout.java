import java.awt.*;    
import javax.swing.*;    
    
public class Boxlayout{
Boxlayout()
{
JFrame f = new JFrame();

    JButton b1 = new JButton("Button 1");
    JButton b2 = new JButton("Button 2");
    JButton b3 = new JButton("Button 3");
    JButton b4 = new JButton("Long named Button 4");
    JButton b5 = new JButton("5");

    f.setSize(400,400);
f.add(b1);
f.add(b2);
f.add(b3);
f.add(b4);
f.add(b5);

f.setLayout(new BoxLayout(f.getContentPane(), BoxLayout.Y_AXIS));

f.setVisible(true);

}
public static void main(String[] args)
{
    new Boxlayout();
}
}