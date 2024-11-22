import java.io.*;
import java.awt.*;
 import java.awt.event.*;
import java.awt.image.*;
import javax.imageio.ImageIO;
import java.applet.*;
public class imp extends Applet implements MouseMotionListener, ActionListener{

BufferedImage img;
JButton btn;
public void init(){
img = new BufferedImage(getWidth().getHeight().BufferedImage.TYPE_INT_RGB); setLayout(new BorderLayout());
btn= new JButton("save");
btn.addActionListener(this); // to keep the button on the bottom
add(btn, BorderLayout.SOUTH):
addMouseMotionListener(this);
setVisible(true);
}
public void actionPerformed(ActionEvent e){
// when the button is clicked this code will save whatever is in the panel into a jpeg file; so these lines of codes are important //
try{
ImageIO.write(img, "jpeg", new File("mypic.jpeg"));
}catch(Exception ev){
System.out.println(ev.getMessage());
}
public void mouseDragged(MouseEvent e){
// this code will let you draw when you drag the mouse //
}
Graphics g=img.createGraphics():
g.setColor(Color.RED):
g.fillOval(e.getX(), e.getY(), 10, 10);
public void mouseMoved(MouseEvent e){}
}
}