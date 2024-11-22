import java.awt.*;    
import javax.swing.*;    
    
public class GridLayoutExample  
{    
   
  
// constructor  
GridLayoutExample()  
{    
JFrame f= new JFrame();    
  
// creating 9 buttons  
JButton btn1 = new JButton("1");    
JButton btn2 = new JButton("2");    
JButton btn3 = new JButton("3");    
JButton btn4 = new JButton("4");    
JButton btn5 = new JButton("5");    
JButton btn6 = new JButton("6");    
JButton btn7 = new JButton("7");    
JButton btn8 = new JButton("8");    
JButton btn9 = new JButton("9");    
    
// adding buttons to the frame  
// since, we are using the parameterless constructor, therfore;   
// the number of columns is equal to the number of buttons we   
// are adding to the frame. The row count remains one. 

f.add(btn1); f.add(btn2); f.add(btn3);  
f.add(btn4); f.add(btn5); f.add(btn6);  
f.add(btn7); f.add(btn8); f.add(btn9);    
  
// setting the grid layout using the parameterless constructor    
f.setLayout(new GridLayout());    
  
  
f.setSize(300, 300);    
f.setVisible(true);    
}  
  
// main method  
public static void main(String argvs[])   
{    
new GridLayoutExample();    
}    
} 