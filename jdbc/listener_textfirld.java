import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;
class GUI extends JFrame implements ActionListener {
    JButton button;
    JTextField t1, t2;
    GUI()
    {
        setSize(400,400);
        setLayout(new FlowLayout());
        t1 = new JTextField(10);
        add(t1);

        t2 = new JTextField(20);
        add(t2);
        t2.setEditable(false);

        button = new JButton("check");
        add(button);
setVisible(true);

button.addActionListener(this);

public void actionPerformed(ActionEvent e)
{
    try{
        int n= Integer.ParseInt(t1.getText());

        if(n%2==0)
        {
            t2.setText("Even Number");
        }
        else
        {
            t2.setText("odd number");
        }
    }
    catch(NumberFormatException ex){
        t2.setText("unable to check ");

    }
}
    }
    public class listener_textfirld{

        public static void main( String[] args)
        {
            new GUI();
        }
    }
}
