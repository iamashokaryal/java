import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
class GUI extends JFrame implements ActionListener {
      JTextField t1,t2;
      JButton b;
    GUI(){
setSize(400,800);
setLayout(null);

        t1 = new JTextField();
        t1.setBounds(90,50,150,30);
        add(t1);
        t2 = new JTextField();
          add(t2);
        t2.setBounds(90,100,150,30);
        
        b= new JButton("Check");
         add(b);
                 b.setBounds(90,150,150,30);
        setVisible(true);
        b.addActionListener(this);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public void actionPerformed(ActionEvent e)
    {

        try{
            int n = Integer.parseInt(t1.getText());
            if (n%2 == 0){
                t2.setText("Even number");

            }
            else

            {
                t2.setText("Odd Number");

            }
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }
    }
}

    public class a{
    
    public static void main(String[] args)
    {
        new GUI();
    }

}