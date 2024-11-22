 import javax.swing.*;
public class popupinput {
   JFrame f;
    popupinput(){
    f = new JFrame();

    int n1 = Integer.parseInt(JOptionPane.showInputDialog(f,"Enter any Number"));
    JOptionPane.showMessageDialog(f, Integer.toString(n1));
}
public static void main (String[] args)
{
    new popupinput(); 
}
}


